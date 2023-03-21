package com.github.hanyaeger.tutorial.entities.swordfish;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;

import java.util.Random;

public class SwordFish extends DynamicCompositeEntity implements SceneBorderCrossingWatcher {
    /**
     * Create a new {@code DynamicCompositeEntity} on the given {@code initialLocation}.
     *
     * @param initialLocation the initial position at which this {@link DynamicCompositeEntity} should be placed
     */
    public SwordFish(Coordinate2D initialLocation) {
        super(initialLocation);
//        setMotion(2, 270d);
    }

    @Override
    protected void setupEntities() {
        HitBox hitBox = new HitBox(new Coordinate2D(0,40), 60, 2);
        addEntity(hitBox);

        HitBox hitBox2 = new HitBox(new Coordinate2D(60,20), 120, 40);
        addEntity(hitBox2);

        HitBox hitBox3 = new HitBox(new Coordinate2D(180,15), 40, 55);
        addEntity(hitBox3);

        SwordfishSprite swordFishSprite = new SwordfishSprite(new Coordinate2D(0, 0));
        addEntity(swordFishSprite);
    }
    @Override
    public void notifyBoundaryCrossing(SceneBorder border){
        setAnchorLocationX(getSceneWidth());
        setAnchorLocationY(new Random().nextInt((int) getSceneHeight()- 81));
    }
}
