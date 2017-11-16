package com.github.ocraft.s2client.protocol.response;

import SC2APIProtocol.Sc2Api;
import com.github.ocraft.s2client.protocol.Strings;
import com.github.ocraft.s2client.protocol.game.GameStatus;

import java.util.Optional;

import static com.github.ocraft.s2client.protocol.Constants.nothing;
import static com.github.ocraft.s2client.protocol.DataExtractor.tryGet;
import static com.github.ocraft.s2client.protocol.Preconditions.isSet;
import static com.github.ocraft.s2client.protocol.Preconditions.require;

public final class ResponseRestartGame extends Response {

    private static final long serialVersionUID = 829806526850686822L;

    private final Error error;
    private final String errorDetails;

    public enum Error {
        LAUNCH_ERROR;

        public static Error from(Sc2Api.ResponseRestartGame.Error sc2ApiResponseRestartGameError) {
            require("sc2api response restart game error", sc2ApiResponseRestartGameError);
            switch (sc2ApiResponseRestartGameError) {
                case LaunchError:
                    return LAUNCH_ERROR;
                default:
                    throw new AssertionError("unknown response restart game error: " + sc2ApiResponseRestartGameError);
            }
        }
    }

    private ResponseRestartGame(Sc2Api.ResponseRestartGame sc2ApiResponseRestartGame, Sc2Api.Status sc2ApiStatus) {
        super(ResponseType.RESTART_GAME, GameStatus.from(sc2ApiStatus));

        this.error = tryGet(
                Sc2Api.ResponseRestartGame::getError, Sc2Api.ResponseRestartGame::hasError
        ).apply(sc2ApiResponseRestartGame).map(ResponseRestartGame.Error::from).orElse(nothing());

        this.errorDetails = tryGet(
                Sc2Api.ResponseRestartGame::getErrorDetails, Sc2Api.ResponseRestartGame::hasErrorDetails
        ).apply(sc2ApiResponseRestartGame).orElse(nothing());
    }

    public static ResponseRestartGame from(Sc2Api.Response sc2ApiResponse) {
        if (!hasRestartGameResponse(sc2ApiResponse)) {
            throw new IllegalArgumentException("provided argument doesn't have restart game response");
        }
        return new ResponseRestartGame(sc2ApiResponse.getRestartGame(), sc2ApiResponse.getStatus());
    }

    private static boolean hasRestartGameResponse(Sc2Api.Response sc2ApiResponse) {
        return isSet(sc2ApiResponse) && sc2ApiResponse.hasRestartGame();
    }

    public Optional<Error> getError() {
        return Optional.ofNullable(error);
    }

    public Optional<String> getErrorDetails() {
        return Optional.ofNullable(errorDetails);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResponseRestartGame)) return false;
        if (!super.equals(o)) return false;

        ResponseRestartGame that = (ResponseRestartGame) o;

        return that.canEqual(this) &&
                error == that.error &&
                (errorDetails != null ? errorDetails.equals(that.errorDetails) : that.errorDetails == null);
    }

    @Override
    public boolean canEqual(Object other) {
        return other instanceof ResponseRestartGame;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (error != null ? error.hashCode() : 0);
        result = 31 * result + (errorDetails != null ? errorDetails.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return Strings.toJson(this);
    }
}
