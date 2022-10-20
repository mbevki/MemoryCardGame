package MGV;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static String[][] board = new String[4][4];
    public static String[][] boardValue = new String[4][4];

    public static void main(String[] args) {

//        Array with "#"
//        String[][] board = new String[4][4];
        drawBoard();
//        for(int i = 0; i<4; i++){
//            for(int j = 0; j<4; j++){
//                board[i][j]="#";
//            }
//        }
//        Array with random value
//        String[][] boardValue = new String[4][4];
        drawValue();
//        Random random = new Random();
//        ArrayList<String> numbers = new ArrayList<>();
//        numbers.add("1");
//        numbers.add("2");
//        numbers.add("3");
//        numbers.add("4");
//        numbers.add("5");
//        numbers.add("6");
//        numbers.add("7");
//        numbers.add("8");
//        numbers.add("1");
//        numbers.add("2");
//        numbers.add("3");
//        numbers.add("4");
//        numbers.add("5");
//        numbers.add("6");
//        numbers.add("7");
//        numbers.add("8");
//
//
//        for(int i = 0; i<4; i++){
//            for(int j = 0; j<4; j++){
//                int tmp = random.nextInt(numbers.size());
//                boardValue[i][j] = numbers.get(tmp);
//                numbers.remove(tmp);
//            }
//        }

//        Print Table with random value
//        for(int i = 0; i<4; i++){
//            for(int j = 0; j<4; j++){
//                System.out.print(boardValue[i][j] + " ");
//            }
//            System.out.println();
//        }
        startGame();
//        int count = 0;
//        int row = 0, col = 0;
//        int row2 = 0, col2 = 0;
//        do {
//            //Printing table #
//            for(int i = 0; i<4; i++){
//                for(int j = 0; j<4; j++){
//                    System.out.print(board[i][j] + " ");
//                }
//                System.out.println();
//            }
//
//            System.out.println("First letter:");
//            System.out.print("\t> Chose row (1-4): ");
//            row = userInput(row);
////            do{
////                row = scan.nextInt();
////                if(row < 1 || row > 4){
////                    System.out.print("\t>> Enter a number between (1-4): ");
////                }
////            }while(row < 1 || row > 4);
//
//            System.out.print("\t> Chose column (1-4): ");
//            col = userInput(col);
////            do{
////                col = scan.nextInt();
////                if(col < 1 || col > 4){
////                    System.out.print("\t>> Enter a number between (1-4): ");
////                }
////            }while(col < 1 || col > 4);
//
//
//            System.out.println("\t>> You have chosen number -> " + boardValue[row-1][col-1]);
//
//            for (int i = 0; i < 4; i++) {
//                for (int j = 0; j < 4; j++) {
//                    if (i == row - 1 && j == col - 1) {
//                        System.out.print(boardValue[i][j] + " ");
//                    } else {
//                        System.out.print(board[i][j] + " ");
//                    }
//                }
//                System.out.println();
//            }
//
//            System.out.println("Second letter:");
//            System.out.print("\t> Choose row (1-4): ");
//            row2 = userInput(row2);
////            do{
////                row2 = scan.nextInt();
////                if(row2 < 1 || row2 > 4){
////                    System.out.print("\t>> Enter a number between (1-4): ");
////                }
////            }while(row2 < 1 || row2 > 4);
//            System.out.print("\t> Choose column (1-4): ");
//            col2 = userInput(col2);
////            do{
////                col2 = scan.nextInt();
////                if(col2 < 1 || col2 > 4){
////                    System.out.print("\t>> Enter a number between (1-4): ");
////                }
////            }while(col2 < 1 || col2 > 4);
//
//            System.out.println("\t>> You have chosen number -> " + boardValue[row2-1][col2-1]);
//
//            for (int i = 0; i < 4; i++) {
//                for (int j = 0; j < 4; j++) {
//                    if (i == row - 1 && j == col - 1 || i == row2 - 1 && j == col2 - 1) {
//                        System.out.print(boardValue[i][j] + " ");
//                    } else {
//                        System.out.print(board[i][j] + " ");
//                    }
//                }
//                System.out.println();
//            }
//
//            if (boardValue[row - 1][col - 1].equals(boardValue[row2 - 1][col2 - 1])) {
//                board[row - 1][col - 1] = boardValue[row - 1][col - 1];
//                board[row2 - 1][col2 - 1] = boardValue[row - 1][col - 1];
//                System.out.println("You have a match!! Number: " + boardValue[row-1][col-1]);
//                count++;
//            }else {
//                System.out.println("Noo match....Try again.");
//            }
//            System.out.println("-------------------------------------------------------");
//        }while(count < 7);

//        Finished the game
        endGame();
//        System.out.println("******** GAME FINISHED! ********");
//        scan.close();
//        for(int i = 0; i<4; i++){
//            for(int j = 0; j<4; j++){
//                System.out.print(boardValue[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
    public static void drawBoard(){
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                board[i][j]="#";
            }
        }
    }
    public static void drawValue(){
        Random random = new Random();
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");
        numbers.add("7");
        numbers.add("8");
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");
        numbers.add("7");
        numbers.add("8");


        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                int randomNum = random.nextInt(numbers.size());
                boardValue[i][j] = numbers.get(randomNum);
                numbers.remove(randomNum);
            }
        }
    }
    public static void startGame(){
        int count = 0;
        int row = 0, col = 0;
        int row2 = 0, col2 = 0;
        do {
            //Printing table #
            do {
                for(int i = 0; i<4; i++){
                    for(int j = 0; j<4; j++){
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println("First position:");
                do {
                    System.out.print("\t> Chose row (1-4): ");
                    row = userInput(row);
//            do{
//                row = scan.nextInt();
//                if(row < 1 || row > 4){
//                    System.out.print("\t>> Enter a number between (1-4): ");
//                }
//            }while(row < 1 || row > 4);

                    System.out.print("\t> Chose column (1-4): ");
                    col = userInput(col);

                    if (!board[row - 1][col - 1].equals("#")) {
                        System.out.println("-------------------------------------------------------");
                        System.out.println("**You already chose that position!! Try again...");
                        System.out.println("-------------------------------------------------------");
                    }
                } while (!board[row - 1][col - 1].equals("#"));
//            do{
//                col = scan.nextInt();
//                if(col < 1 || col > 4){
//                    System.out.print("\t>> Enter a number between (1-4): ");
//                }
//            }while(col < 1 || col > 4);


                System.out.println("\t>> You have chosen number -> " + boardValue[row - 1][col - 1]);

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (i == row - 1 && j == col - 1) {
                            System.out.print(boardValue[i][j] + " ");
                        } else {
                            System.out.print(board[i][j] + " ");
                        }
                    }
                    System.out.println();
                }

                System.out.println("Second position:");

                System.out.print("\t> Choose row (1-4): ");
                row2 = userInput(row2);

//            do{
//                row2 = scan.nextInt();
//                if(row2 < 1 || row2 > 4){
//                    System.out.print("\t>> Enter a number between (1-4): ");
//                }
//            }while(row2 < 1 || row2 > 4);
                System.out.print("\t> Choose column (1-4): ");
                col2 = userInput(col2);
//            do{
//                col2 = scan.nextInt();
//                if(col2 < 1 || col2 > 4){
//                    System.out.print("\t>> Enter a number between (1-4): ");
//                }
//            }while(col2 < 1 || col2 > 4);

                System.out.println("\t>> You have chosen number -> " + boardValue[row2 - 1][col2 - 1]);

                if(row == row2 && col == col2) {
                    System.out.println("-------------------------------------------------------");
                    System.out.println("**First and Second position must be different!! Try again...");
                    System.out.println("-------------------------------------------------------");
                }
            }while(row == row2 && col == col2);

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (i == row - 1 && j == col - 1 || i == row2 - 1 && j == col2 - 1) {
                            System.out.print(boardValue[i][j] + " ");
                        } else {
                            System.out.print(board[i][j] + " ");
                        }
                    }
                    System.out.println();
                }

            if (boardValue[row - 1][col - 1].equals(boardValue[row2 - 1][col2 - 1])) {
                board[row - 1][col - 1] = boardValue[row - 1][col - 1];
                board[row2 - 1][col2 - 1] = boardValue[row - 1][col - 1];
                System.out.println("You have a match!! Number: " + boardValue[row-1][col-1]);
                count++;
            }else {
                System.out.println("Noo match....Try again.");
            }
            System.out.println("-------------------------------------------------------");
        }while(count < 7);
    }

    public static int userInput(int input){
        do{
            input = scan.nextInt();
            if(input < 1 || input > 4){
                System.out.print("\t>> Enter a number between (1-4): ");
            }
        }while(input < 1 || input > 4);

        return input;
    }
    public static void endGame(){
        System.out.println("******** GAME FINISHED! ********");
        scan.close();
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                System.out.print(boardValue[i][j] + " ");
            }
            System.out.println();
        }
    }
}