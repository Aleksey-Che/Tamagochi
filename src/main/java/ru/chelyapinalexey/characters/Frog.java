package ru.chelyapinalexey.characters;

import ru.chelyapinalexey.states.State;

import javax.swing.*;
import java.awt.*;

public class Frog extends Character {

    @Override
    public void animationLeft() {
        Character.listLeft.add("src/main/resources/frog/pitLeft.png");
        Character.listLeft.add("src/main/resources/frog/pitOnHead.png");
        Character.listLeft.add("src/main/resources/frog/pitRight.png");
        Character.listLeft.add("src/main/resources/frog/pit.png");

        count++;

        if (count >= Character.listLeft.size()) count = 0;
        try {
            Thread.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        image = new ImageIcon(Character.listLeft.get(count)).getImage();
    }

    @Override
    public void animationRight() {
        Character.listRight.add("src/main/resources/frog/pitRight.png");
        Character.listRight.add("src/main/resources/frog/pitOnHead.png");
        Character.listRight.add("src/main/resources/frog/pitLeft.png");
        Character.listRight.add("src/main/resources/frog/pit.png");

        count++;

        if (count >= Character.listRight.size()) count = 0;
        try {
            Thread.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        image = new ImageIcon(Character.listRight.get(count)).getImage();
    }

    @Override
    public void animationUp() {
        image = new ImageIcon("src/main/resources/frog/pitUp.png").getImage();
    }

    @Override
    public void animationDown() {
        image = new ImageIcon("src/main/resources/frog/pitDown.png").getImage();
    }

    @Override
    public Image getImage() {
        State.checkInfoState();

        if (State.isPetLive() && State.isPetEat()) {
            image = new ImageIcon("src/main/resources/frog/pit.png").getImage();
        }

        if (!State.isPetEat()) {
            image = new ImageIcon("src/main/resources/frog/pitSadness.png").getImage();
        }

        if (!State.isPetLive()) {
            image = new ImageIcon("src/main/resources/frog/rip.png").getImage();
        }

        return image;
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawImage(image, (int) getX(), (int) getY(), null);
    }
}
