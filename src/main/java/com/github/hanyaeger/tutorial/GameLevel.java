package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.entities.Hanny;
//import com.github.hanyaeger.tutorial.entities.Swordfish;
import com.github.hanyaeger.tutorial.entities.swordfish.SwordFish;
import com.github.hanyaeger.tutorial.entities.text.HealthText;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.security.PrivateKey;

public class GameLevel extends DynamicScene{
    Waterworld waterworld;

    public GameLevel (Waterworld waterworld) {
        this.waterworld = waterworld;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/waterworld.mp3");
        setBackgroundImage("backgrounds/background2.jpg");
    }

    @Override
    public void setupEntities() {
        SwordFish swordfish = new SwordFish(new Coordinate2D(getWidth() / 2, getHeight() / 2));
        addEntity(swordfish);

        HealthText healthText= new HealthText(new Coordinate2D(getWidth() / 2, getHeight() / 2));
        addEntity(healthText);

        Hanny hanny = new Hanny(new Coordinate2D(getWidth() / 10, getHeight() / 10), healthText, waterworld);
        addEntity(hanny);
    }


}
