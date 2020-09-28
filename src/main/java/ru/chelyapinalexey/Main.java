package ru.chelyapinalexey;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Тамагочи");

        frame.setSize(700, 400);
        frame.setLocationRelativeTo(null);
        frame.add(new Panel());
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
