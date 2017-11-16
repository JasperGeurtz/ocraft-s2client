package com.github.ocraft.s2client.protocol.response;

import com.github.ocraft.s2client.protocol.game.GameStatus;
import com.github.ocraft.s2client.protocol.unit.UnitInfo;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static com.github.ocraft.s2client.protocol.Constants.nothing;
import static com.github.ocraft.s2client.protocol.Fixtures.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class ResponseObservationTest {

    @Test
    void throwsExceptionWhenSc2ApiResponseDoesNotHaveObservation() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> ResponseObservation.from(nothing()))
                .withMessage("provided argument doesn't have observation response");

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> ResponseObservation.from(aSc2ApiResponse().build()))
                .withMessage("provided argument doesn't have observation response");
    }

    @Test
    void convertsSc2ApiResponseObservationToResponseObservation() {
        ResponseObservation responseObservation = ResponseObservation.from(sc2ApiResponseWithObservation());

        assertThatResponseIsInValidState(responseObservation);
        assertThatAllFieldsAreConverted(responseObservation);
    }

    private void assertThatResponseIsInValidState(ResponseObservation responseObservation) {
        assertThat(responseObservation).as("converted response observation").isNotNull();
        assertThat(responseObservation.getType()).as("type of observation response")
                .isEqualTo(ResponseType.OBSERVATION);
        assertThat(responseObservation.getStatus()).as("status of observation response").isEqualTo(GameStatus.IN_GAME);
    }

    private void assertThatAllFieldsAreConverted(ResponseObservation responseObservation) {
        assertThat(responseObservation.getActions()).as("response observation: actions").isNotEmpty();
        assertThat(responseObservation.getActionErrors()).as("response observation: action errors").isNotEmpty();
        assertThat(responseObservation.getObservation()).as("response observation: observation").isNotNull();
        assertThat(responseObservation.getPlayerResults()).as("response observation: player results").isNotEmpty();
        assertThat(responseObservation.getChat()).as("response observation: chat").isNotEmpty();
    }

    @Test
    void throwsExceptionWhenObservationDoesNotExist() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> ResponseObservation.from(emptySc2ApiResponseObservation()))
                .withMessage("observation is required");
    }

    @Test
    void hasEmptyListsWhenSc2ApiResponseObservationIsEmpty() {
        ResponseObservation responseObservation = ResponseObservation.from(sc2ApiResponseObservationWithEmptyLists());
        assertThat(responseObservation.getActions()).as("response observation: actions").isEmpty();
        assertThat(responseObservation.getActionErrors()).as("response observation: action errors").isEmpty();
        assertThat(responseObservation.getPlayerResults()).as("response observation: player results").isEmpty();
        assertThat(responseObservation.getChat()).as("response observation: chat").isEmpty();
    }

    @Test
    void fulfillsEqualsContract() {
        EqualsVerifier.forClass(ResponseObservation.class)
                .withIgnoredFields("nanoTime")
                .withNonnullFields("type", "status", "actions", "actionErrors", "observation", "playerResults", "chat")
                .withRedefinedSuperclass()
                .withPrefabValues(UnitInfo.class, UnitInfo.from(sc2ApiUnitInfoAddOn()), UnitInfo.from(sc2ApiUnitInfo()))
                .verify();
    }

}