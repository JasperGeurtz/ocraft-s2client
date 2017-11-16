package com.github.ocraft.s2client.protocol.request;

import SC2APIProtocol.Sc2Api;
import com.github.ocraft.s2client.protocol.BuilderSyntax;
import com.github.ocraft.s2client.protocol.Strings;
import com.github.ocraft.s2client.protocol.syntax.request.RequestDataSyntax;

import static java.util.Arrays.stream;

public final class RequestData extends Request {

    private static final long serialVersionUID = -6188023493268720867L;

    private final boolean ability;
    private final boolean unitType;
    private final boolean upgrade;
    private final boolean buff;
    private final boolean effect;

    public enum Type {
        ABILITIES, BUFFS, UPGRADES, EFFECTS, UNITS
    }

    public static final class Builder implements BuilderSyntax<RequestData>, RequestDataSyntax {

        private boolean ability;
        private boolean unitType;
        private boolean upgrade;
        private boolean buff;
        private boolean effect;

        @Override
        public BuilderSyntax<RequestData> of(Type... types) {
            stream(types).forEach(type -> {
                switch (type) {
                    case BUFFS:
                        this.buff = true;
                        break;
                    case UNITS:
                        this.unitType = true;
                        break;
                    case EFFECTS:
                        this.effect = true;
                        break;
                    case UPGRADES:
                        this.upgrade = true;
                        break;
                    case ABILITIES:
                        this.ability = true;
                        break;
                    default:
                        throw new AssertionError("unknown data type: " + type);
                }
            });
            return this;
        }

        @Override
        public RequestData build() {
            return new RequestData(this);
        }
    }

    private RequestData(Builder builder) {
        ability = builder.ability;
        unitType = builder.unitType;
        upgrade = builder.upgrade;
        buff = builder.buff;
        effect = builder.effect;
    }

    public static RequestDataSyntax data() {
        return new Builder();
    }

    @Override
    public Sc2Api.Request toSc2Api() {
        return Sc2Api.Request.newBuilder()
                .setData(Sc2Api.RequestData.newBuilder()
                        .setAbilityId(ability)
                        .setBuffId(buff)
                        .setEffectId(effect)
                        .setUnitTypeId(unitType)
                        .setUpgradeId(upgrade)
                        .build())
                .build();
    }

    public boolean isAbility() {
        return ability;
    }

    public boolean isUnitType() {
        return unitType;
    }

    public boolean isUpgrade() {
        return upgrade;
    }

    public boolean isBuff() {
        return buff;
    }

    public boolean isEffect() {
        return effect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestData that = (RequestData) o;

        return ability == that.ability &&
                unitType == that.unitType &&
                upgrade == that.upgrade &&
                buff == that.buff &&
                effect == that.effect;
    }

    @Override
    public int hashCode() {
        int result = (ability ? 1 : 0);
        result = 31 * result + (unitType ? 1 : 0);
        result = 31 * result + (upgrade ? 1 : 0);
        result = 31 * result + (buff ? 1 : 0);
        result = 31 * result + (effect ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return Strings.toJson(this);
    }
}