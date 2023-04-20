package main;

import java.util.Scanner;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Exit "x" button
        window.setResizable(false);
        window.setTitle("2D Game Test");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();
        window.setLocationRelativeTo(null);


        window.setLocationRelativeTo(null);
        window.setVisible(true);
        gamePanel.startGameThread();

    }


}
