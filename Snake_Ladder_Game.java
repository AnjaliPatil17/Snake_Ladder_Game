package com.BridgeLabez.Snake_Ladder;

public class Snake_Ladder_Game {
    public static void main(String[] args) {
        int diceRoll = 0;
        int current_position = 0;
        int max_position = 100;

        System.out.println("Welcome to Snake and Ladder Game!");
        System.out.println("Current position :" + current_position);
        diceRoll = (int) ((Math.random() * 6) + 1);
        System.out.println("Dice Number :" + diceRoll);

    }
}
