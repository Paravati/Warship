package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class ShipmentInitialization {
    public static void begin(String[][] board){
        System.out.print("Hello!\nWe need to install your ships. Please insert place for first Cruiser: ");
        Scanner input = new Scanner(System.in);
        String cruiser_1 = input.next();
        System.out.println("This is location for 1st cruiser: " + cruiser_1);
        putShip(board, cruiser_1, 0, typesOfShip.CRUISER);
    }

    public static void putShip(String[][] board, String firstField, int direction, typesOfShip type){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[j][i].equals(firstField)){
                    board[j][i] = "N"; // this is ship symbol - only for this moment
                    System.out.println("Locked localisations: " + (j-1) + (i));
                }
            }
        }
    }

    public static void defineLengthOfTheShip(typesOfShip type){
        if (type == typesOfShip.CRUISER){
        }
    }
}
