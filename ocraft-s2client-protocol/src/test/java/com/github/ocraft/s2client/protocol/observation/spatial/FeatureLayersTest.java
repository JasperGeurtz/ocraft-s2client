package com.github.ocraft.s2client.protocol.observation.spatial;

import SC2APIProtocol.Spatial;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static com.github.ocraft.s2client.protocol.Constants.nothing;
import static com.github.ocraft.s2client.protocol.Fixtures.sc2ApiFeatureLayers;
import static com.github.ocraft.s2client.protocol.Fixtures.without;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class FeatureLayersTest {

    @Test
    void throwsExceptionWhenSc2ApiFeatureLayersIsNull() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(nothing()))
                .withMessage("sc2api feature layers is required");
    }

    @Test
    void convertsAllFieldsFromSc2ApiFeatureLayers() {
        assertThatAllFieldsAreConverted(FeatureLayers.from(sc2ApiFeatureLayers()));
    }

    private void assertThatAllFieldsAreConverted(FeatureLayers featureLayers) {
        assertThat(featureLayers.getHeightMap()).as("feature layers: height map").isNotNull();
        assertThat(featureLayers.getVisibilityMap()).as("feature layers: visibility map").isNotNull();
        assertThat(featureLayers.getCreep()).as("feature layers: creep").isNotNull();
        assertThat(featureLayers.getPower()).as("feature layers: power").isNotNull();
        assertThat(featureLayers.getPlayerId()).as("feature layers: player id").isNotNull();
        assertThat(featureLayers.getUnitType()).as("feature layers: unit type").isNotNull();
        assertThat(featureLayers.getSelected()).as("feature layers: selected").isNotNull();
        assertThat(featureLayers.getUnitHitPoints()).as("feature layers: unit hit points").isNotNull();
        assertThat(featureLayers.getUnitHitPointsRatio()).as("feature layers: unit hit points ratio").isNotNull();
        assertThat(featureLayers.getUnitEnergy()).as("feature layers: unit energy").isNotNull();
        assertThat(featureLayers.getUnitEnergyRatio()).as("feature layers: unit energy ratio").isNotEmpty();
        assertThat(featureLayers.getUnitShields()).as("feature layers: unit shields").isNotNull();
        assertThat(featureLayers.getUnitShieldsRatio()).as("feature layers: unit shields ratio").isNotEmpty();
        assertThat(featureLayers.getPlayerRelative()).as("feature layers: player relative").isNotNull();
        assertThat(featureLayers.getUnitDensityAa()).as("feature layers: unit density aa").isNotNull();
        assertThat(featureLayers.getUnitDensity()).as("feature layers: unit density").isNotNull();
        assertThat(featureLayers.getEffects()).as("feature layers: effects").isNotEmpty();
    }

    @Test
    void throwsExceptionWhenHeightMapIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(without(
                        () -> sc2ApiFeatureLayers().toBuilder(),
                        Spatial.FeatureLayers.Builder::clearHeightMap).build()))
                .withMessage("height map is required");
    }

    @Test
    void throwsExceptionWhenVisibilityMapIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(without(
                        () -> sc2ApiFeatureLayers().toBuilder(),
                        Spatial.FeatureLayers.Builder::clearVisibilityMap).build()))
                .withMessage("visibility map is required");
    }

    @Test
    void throwsExceptionWhenCreepIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(without(
                        () -> sc2ApiFeatureLayers().toBuilder(),
                        Spatial.FeatureLayers.Builder::clearCreep).build()))
                .withMessage("creep is required");
    }

    @Test
    void throwsExceptionWhenPowerIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(without(
                        () -> sc2ApiFeatureLayers().toBuilder(),
                        Spatial.FeatureLayers.Builder::clearPower).build()))
                .withMessage("power is required");
    }

    @Test
    void throwsExceptionWhenPlayerIdIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(without(
                        () -> sc2ApiFeatureLayers().toBuilder(),
                        Spatial.FeatureLayers.Builder::clearPlayerId).build()))
                .withMessage("player id is required");
    }

    @Test
    void throwsExceptionWhenUnitTypeIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(without(
                        () -> sc2ApiFeatureLayers().toBuilder(),
                        Spatial.FeatureLayers.Builder::clearUnitType).build()))
                .withMessage("unit type is required");
    }

    @Test
    void throwsExceptionWhenSelectedIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(without(
                        () -> sc2ApiFeatureLayers().toBuilder(),
                        Spatial.FeatureLayers.Builder::clearSelected).build()))
                .withMessage("selected is required");
    }

    @Test
    void throwsExceptionWhenUnitHitPointsIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(without(
                        () -> sc2ApiFeatureLayers().toBuilder(),
                        Spatial.FeatureLayers.Builder::clearUnitHitPoints).build()))
                .withMessage("unit hit points is required");
    }

    @Test
    void throwsExceptionWhenUnitHitPointsRatioIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(without(
                        () -> sc2ApiFeatureLayers().toBuilder(),
                        Spatial.FeatureLayers.Builder::clearUnitHitPointsRatio).build()))
                .withMessage("unit hit points ratio is required");
    }

    @Test
    void throwsExceptionWhenUnitEnergyIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(without(
                        () -> sc2ApiFeatureLayers().toBuilder(),
                        Spatial.FeatureLayers.Builder::clearUnitEnergy).build()))
                .withMessage("unit energy is required");
    }

    @Test
    void throwsExceptionWhenUnitShieldsIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(without(
                        () -> sc2ApiFeatureLayers().toBuilder(),
                        Spatial.FeatureLayers.Builder::clearUnitShields).build()))
                .withMessage("unit shields is required");
    }

    @Test
    void throwsExceptionWhenPlayerRelativeIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(without(
                        () -> sc2ApiFeatureLayers().toBuilder(),
                        Spatial.FeatureLayers.Builder::clearPlayerRelative).build()))
                .withMessage("player relative is required");
    }

    @Test
    void throwsExceptionWhenUnitDensityAaIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(without(
                        () -> sc2ApiFeatureLayers().toBuilder(),
                        Spatial.FeatureLayers.Builder::clearUnitDensityAa).build()))
                .withMessage("unit density aa is required");
    }

    @Test
    void throwsExceptionWhenUnitDensityIsNotProvided() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FeatureLayers.from(without(
                        () -> sc2ApiFeatureLayers().toBuilder(),
                        Spatial.FeatureLayers.Builder::clearUnitDensity).build()))
                .withMessage("unit density is required");
    }

    @Test
    void fulfillsEqualsContract() {
        EqualsVerifier
                .forClass(FeatureLayers.class)
                .withNonnullFields("heightMap", "visibilityMap", "creep", "power", "playerId", "unitType", "selected",
                        "unitHitPoints", "unitHitPointsRatio", "unitEnergy", "unitShields", "playerRelative",
                        "unitDensityAa", "unitDensity")
                .verify();
    }

}