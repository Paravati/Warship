package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        String[][] gameboard = initBoard(8, 8);
        drawBoard(gameboard);
    }
    
    public static String[][] initBoard(int x, int y){
        String[][] gameMap = new String[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++) {
                gameMap[i][j] = "| ~ ";
            }
        }
        
        return gameMap;
    }

    public static void drawBoard(String[][] gameMap){
        for(int i=0; i<gameMap.length; i++){
            for(int j=0; j<gameMap[i].length; j++){
                System.out.print(gameMap[i][j]);
            }
            System.out.println("|");
        }
    }
}
