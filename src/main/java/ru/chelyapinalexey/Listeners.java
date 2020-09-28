package ru.chelyapinalexey;

import ru.chelyapinalexey.gameArea.GameMenu;
import ru.chelyapinalexey.gameArea.MainMenu;
import ru.chelyapinalexey.gameArea.PlayingField;
import ru.chelyapinalexey.characters.Character;

import java.awt.event.*;

public class Listeners implements MouseListener, KeyListener, MouseMotionListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W) {
            Character.up = true;
        }
        if (key == KeyEvent.VK_S) {
            Character.down = true;
        }
        if (key == KeyEvent.VK_A) {
            Character.left = true;
        }
        if (key == KeyEvent.VK_D) {
            Character.right = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W) {
            Character.up = false;
        }
        if (key == KeyEvent.VK_S) {
            Character.down = false;
        }
        if (key == KeyEvent.VK_A) {
            Character.left = false;
        }
        if (key == KeyEvent.VK_D) {
            Character.right = false;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            if (Panel.state == Panel.STATES.MENU) {
                MainMenu.click = true;
            }
            if (Panel.state == Panel.STATES.MENUPLAYERS) {
                GameMenu.click = true;
            }
            if (Panel.state == Panel.STATES.PLAYDAY || Panel.state == Panel.STATES.PLAYNIGHT ||
                    Panel.state == Panel.STATES.PLAYMORNING || Panel.state == Panel.STATES.PLAYEVENING) {

                PlayingField.click = true;
            }
        }
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            if (Panel.state == Panel.STATES.MENU) {
                MainMenu.click = false;
            }
            if (Panel.state == Panel.STATES.MENUPLAYERS) {
                GameMenu.click = false;
            }
            if (Panel.state == Panel.STATES.PLAYDAY || Panel.state == Panel.STATES.PLAYNIGHT ||
                    Panel.state == Panel.STATES.PLAYMORNING || Panel.state == Panel.STATES.PLAYEVENING) {

                PlayingField.click = false;
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Panel.mouseX = e.getX();
        Panel.mouseY = e.getY();
    }
}
