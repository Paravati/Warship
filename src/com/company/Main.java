package com.company;

public class Main {

    public static void main(String[] args) {
        ShipmentInitialization shipmentInitialization = new ShipmentInitialization();
        String[][] gameboard = initBoard(11, 11);
        drawBoard(gameboard);
//        ship.putShip();
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
        String[] notationHorizontal = new String[gameMap.length];
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
                System.out.print(gameMap[i][j]);
            }
            System.out.println("|");
        }
    }
}
