package com.github.hanyaeger.tutorial.entities.swordfish;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import javafx.scene.paint.Color;

public class HitBox extends RectangleEntity implements Collider {
    int width;
    int height;
    public HitBox(final Coordinate2D initialPosition, int width, int height) {
        super(initialPosition);
        this.width = width;
        this.height = height;
        setWidth(width);
        setHeight(height);
//        setFill(Color.TRANSPARENT);

        setFill(Color.DARKRED);
    }
}
