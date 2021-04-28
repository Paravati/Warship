package com.company;

import java.io.IOException;

public class Main {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static void main(String[] args) {
        String[][] gameboard = initBoard(11, 11);
        ShipmentInitialization shipmentInitialization = new ShipmentInitialization();
        drawBoard(gameboard);
        ShipmentInitialization.begin(gameboard);
        clearScreen();
        drawBoard(gameboard);
    }

    public static void clearScreen(){
        try {

            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd", "/c",
                        "cls").inheritIO().start().waitFor();
                Runtime.getRuntime().exec("cls");
            }
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

    public static String[][] initBoard(int x, int y){
        String[][] gameMap = new String[x][y];
        int firstAsciiCharacter = 65;  //65 is first ascii char
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++) {
                gameMap[i][j] = Character.toString((char) firstAsciiCharacter+j) + (i+1);
            }
        }
        return gameMap;
    }
//    public static String[][] initBoard(int x, int y){
//        String[][] gameMap = new String[x][y];
//        for(int i=0; i<x; i++){
//            for(int j=0; j<y; j++) {
//                gameMap[i][j] = "| ~ ";
//            }
//        }
//
//        return gameMap;
//    }

    public static void drawBoard(String[][] gameMap){
        int firstAsciiChar = 65;
        for(int i=0; i<gameMap.length; i++){
            if(i==0){
                for(int j=0; j<gameMap[i].length; j++){
                    if (j==0){
                        System.out.print("     ");
                    }
                    String str = Character.toString((char) firstAsciiChar+j);
                    System.out.print("  " + str + " ");
                }
                System.out.println();
            }
            for(int j=0; j<gameMap[i].length; j++){
                if(j==0){
                    if(i+1<10){
                        System.out.print("  " + (i+1) + "  ");
                    }else{
                        System.out.print("  " + (i+1) + " ");
                    }
                }
//                System.out.print(gameMap[i][j]);
                if (gameMap[i][j].equals("N")){
                    System.out.print("|OOO");
                }else{
                    System.out.print("| ~ ");
                }
            }
            System.out.println("|");
        }
    }
}
