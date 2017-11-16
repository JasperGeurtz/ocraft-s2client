package com.github.ocraft.s2client.protocol.spatial;

import SC2APIProtocol.Common;
import com.github.ocraft.s2client.protocol.Sc2ApiSerializable;
import com.github.ocraft.s2client.protocol.Strings;

import static com.github.ocraft.s2client.protocol.DataExtractor.tryGet;
import static com.github.ocraft.s2client.protocol.Errors.required;
import static com.github.ocraft.s2client.protocol.Preconditions.between;
import static com.github.ocraft.s2client.protocol.Preconditions.require;

public final class Point2d implements Sc2ApiSerializable<Common.Point2D> {

    private static final long serialVersionUID = 3294505281879775593L;

    private static final float MIN_COORD = 0.0f;
    private static final float MAX_COORD = 255.0f;

    private final float x;
    private final float y;

    private Point2d(Common.Point2D sc2ApiPoint2d) {
        this.x = tryGet(Common.Point2D::getX, Common.Point2D::hasX).apply(sc2ApiPoint2d).orElseThrow(required("x"));
        this.y = tryGet(Common.Point2D::getY, Common.Point2D::hasY).apply(sc2ApiPoint2d).orElseThrow(required("y"));

        validate();
    }

    private void validate() {
        between("point 2d [x]", x, MIN_COORD, MAX_COORD);
        between("point 2d [y]", y, MIN_COORD, MAX_COORD);
    }

    private Point2d(float x, float y) {
        this.x = x;
        this.y = y;

        validate();
    }

    public static Point2d of(float x, float y) {
        return new Point2d(x, y);
    }

    public static Point2d from(Common.Point2D sc2ApiPoint2d) {
        require("sc2api point2d", sc2ApiPoint2d);
        return new Point2d(sc2ApiPoint2d);
    }

    @Override
    public Common.Point2D toSc2Api() {
        return Common.Point2D.newBuilder().setX(x).setY(y).build();
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point2d point2d = (Point2d) o;

        return Float.compare(point2d.x, x) == 0 && Float.compare(point2d.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result = (x != +0.0f ? Float.floatToIntBits(x) : 0);
        result = 31 * result + (y != +0.0f ? Float.floatToIntBits(y) : 0);
        return result;
    }

    @Override
    public String toString() {
        return Strings.toJson(this);
    }

}
