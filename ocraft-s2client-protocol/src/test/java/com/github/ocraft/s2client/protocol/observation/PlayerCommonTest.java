package com.github.ocraft.s2client.protocol.observation;

import SC2APIProtocol.Sc2Api;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static com.github.ocraft.s2client.protocol.Constants.nothing;
import static com.github.ocraft.s2client.protocol.Fixtures.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class PlayerCommonTest {

    @Test
    void throwsExceptionWhenSc2ApiPlayerCommonIsNull() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> PlayerCommon.from(nothing()))
                .withMessage("sc2api player common is required");
    }

    @Test
    void convertsAllFieldsFromSc2ApiPlayerCommon() {
        assertThatAllFieldsAreConverted(PlayerCommon.from(sc2ApiPlayerCommon()));
    }

    private void assertThatAllFieldsAreConverted(PlayerCommon playerCommon) {
        assertThat(playerCommon.getPlayerId()).as("player common: player id").isEqualTo(PLAYER_ID);
        assertThat(playerCommon.getMinerals()).as("player common: minerals").isEqualTo(MINERALS);
        assertThat(playerCommon.getVespene()).as("player common: vespene").isEqualTo(VESPENE);
        assertThat(playerCommon.getFoodCap()).as("player common: food cap").isEqualTo(FOOD_CAP);
        assertThat(playerCommon.getFoodUsed()).as("player common: food used").isEqualTo(FOOD_USED);
        assertThat(playerCommon.getFoodArmy()).as("player common: food army").isEqualTo(FOOD_ARMY);
        assertThat(playerCommon.getFoodWorkers()).as("player common: food workers").isEqualTo(FOOD_WORKERS);
        assertThat(playerCommon.getIdleWorkerCount()).as("player common: idle worker count")
                .isEqualTo(IDLE_WORKER_COUNT);
        assertThat(playerCommon.getArmyCount()).as("player common: army count").isEqualTo(ARMY_COUNT);
        assertThat(playerCommon.getWarpGateCount()).as("player common: warp gate count").hasValue(WARP_GATE_COUNT);
        assertThat(playerCommon.getLarvaCount()).as("player common: larva count").hasValue(LARVA_COUNT);
    }

    @Test
    void throwsExceptionWhenPlayerIdIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> PlayerCommon.from(without(
                        () -> sc2ApiPlayerCommon().toBuilder(),
                        Sc2Api.PlayerCommon.Builder::clearPlayerId).build()))
                .withMessage("player id is required");
    }

    @Test
    void throwsExceptionWhenMineralsIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> PlayerCommon.from(without(
                        () -> sc2ApiPlayerCommon().toBuilder(),
                        Sc2Api.PlayerCommon.Builder::clearMinerals).build()))
                .withMessage("minerals is required");
    }

    @Test
    void throwsExceptionWhenVespeneIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> PlayerCommon.from(without(
                        () -> sc2ApiPlayerCommon().toBuilder(),
                        Sc2Api.PlayerCommon.Builder::clearVespene).build()))
                .withMessage("vespene is required");
    }

    @Test
    void throwsExceptionWhenFoodCapIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> PlayerCommon.from(without(
                        () -> sc2ApiPlayerCommon().toBuilder(),
                        Sc2Api.PlayerCommon.Builder::clearFoodCap).build()))
                .withMessage("food cap is required");
    }

    @Test
    void throwsExceptionWhenFoodUsedIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> PlayerCommon.from(without(
                        () -> sc2ApiPlayerCommon().toBuilder(),
                        Sc2Api.PlayerCommon.Builder::clearFoodUsed).build()))
                .withMessage("food used is required");
    }

    @Test
    void throwsExceptionWhenFoodArmyIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> PlayerCommon.from(without(
                        () -> sc2ApiPlayerCommon().toBuilder(),
                        Sc2Api.PlayerCommon.Builder::clearFoodArmy).build()))
                .withMessage("food army is required");
    }

    @Test
    void throwsExceptionWhenFoodWorkersIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> PlayerCommon.from(without(
                        () -> sc2ApiPlayerCommon().toBuilder(),
                        Sc2Api.PlayerCommon.Builder::clearFoodWorkers).build()))
                .withMessage("food workers is required");
    }

    @Test
    void throwsExceptionWhenIdleWorkerCountIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> PlayerCommon.from(without(
                        () -> sc2ApiPlayerCommon().toBuilder(),
                        Sc2Api.PlayerCommon.Builder::clearIdleWorkerCount).build()))
                .withMessage("idle worker count is required");
    }

    @Test
    void throwsExceptionWhenArmyCountIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> PlayerCommon.from(without(
                        () -> sc2ApiPlayerCommon().toBuilder(),
                        Sc2Api.PlayerCommon.Builder::clearArmyCount).build()))
                .withMessage("army count is required");
    }

    @Test
    void fulfillsEqualsContract() {
        EqualsVerifier.forClass(PlayerCommon.class).verify();
    }

}