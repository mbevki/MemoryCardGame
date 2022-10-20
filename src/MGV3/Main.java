package MGV3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
        public static Scanner scan = new Scanner(System.in);
        public static int row, col;
        public static String[][] board = new String[20][20];
        public static String[][] boardValue = new String[20][20];

        public static void main(String[] args) {
            System.out.println("Version 3");

            System.out.print("Enter how many:\n\t> Rows do you want: ");
            row = userInput();
            System.out.print("\t> Columns do you want: ");
            col = userInput();

//            String[][] board = new String[row][col];

            System.out.println("row " + row + " col " + col);


//     Drawing a array with '#'
            drawBoard();
//     Draw Value Board with random positions
            drawValue();
            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    System.out.print(boardValue[i][j] + " ");
                }
                System.out.println();
            }
//     User input about position and checking parameters
            startGame();
//     Ending
            endGame();

       }
        public static void drawBoard(){
            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    board[i][j]="#";
                }
            }
        }
        public static void drawValue(){
            Random random = new Random();
            ArrayList<String> character = new ArrayList<>();

            for(int i = 0; i < 2; i++){
                char c = 'A';
                for(int j = 0; j < (row*col)/2; j++){
                    character.add(String.valueOf(c));
                    c++;
                }
            }
            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    int randomNum = random.nextInt(character.size());
                    boardValue[i][j] = character.get(randomNum);
                    character.remove(randomNum);
                }
            }
        }

        public static void startGame(){
            int correctGuess = 0;
            int inputRow1 = 0, inputCol1 = 0;
            int inputRow2 = 0, inputCol2 = 0;

            while (correctGuess < 7){
//          Printing normal table with '#' or when the table is Updated
                do{
                    printBoard();

                    System.out.println("First position:");
                    do{
                        System.out.print("\t> Chose row (1-4): ");
                        inputRow1 = userInput();
                        System.out.print("\t> Chose column (1-4): ");
                        inputCol1 = userInput();
                        if (!board[inputRow1 - 1][inputCol1 - 1].equals("#")) {
                            System.out.println("-------------------------------------------------------");
                            System.out.println("**You already chose that position!! Try again...");
                            System.out.println("-------------------------------------------------------");
                        }
                    }while (!board[inputRow1 - 1][inputCol1 - 1].equals("#"));

                    System.out.println("\t>> You have chosen number -> " + boardValue[inputRow1 - 1][inputCol1 - 1]);

                    printBoardWithInput(inputRow1, inputCol1);

                    System.out.println("Second position:");
                    do{
                        System.out.print("\t> Chose row (1-4): ");
                        inputRow2 = userInput();
                        System.out.print("\t> Chose column (1-4): ");
                        inputCol2 = userInput();
                        if (!board[inputRow2 - 1][inputCol2 - 1].equals("#")) {
                            System.out.println("-------------------------------------------------------");
                            System.out.println("**You already chose that position!! Try again...");
                            System.out.println("-------------------------------------------------------");
                        }
                    }while (!board[inputRow2 - 1][inputCol2 - 1].equals("#"));

                    System.out.println("\t>> You have chosen number -> " + boardValue[inputRow2 - 1][inputCol2 - 1]);

                    if(inputRow1 == inputCol1 && inputCol1 == inputCol2) {
                        System.out.println("-------------------------------------------------------");
                        System.out.println("**First and Second position must be different!! Try again...");
                        System.out.println("-------------------------------------------------------");
                    }
                }while(inputRow1 == inputRow2 && inputCol1 == inputCol2);

                printBoardWithInputSecond(inputRow1, inputCol1, inputRow2, inputCol2);
                correctGuess = checkIsMatching(inputRow1, inputCol1, inputRow2, inputCol2, correctGuess);
            }
        }
        public static void printBoard(){
            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
        public static int userInput(){
            int input;
            do{
//          Validation that input is a number
                while(!scan.hasNextInt()){
                    System.out.print("**That's not a number! Pleas enter a number: ");
                    scan.next();
                }

                input = scan.nextInt();
                if(input < 1 || input > 4){
                    System.out.print("\t>> Enter a number between (1-4): ");
                }
            }while(input < 1 || input > 4);

            return input;
        }
        public static void printBoardWithInput(int row, int col){
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i == row - 1 && j == col - 1) {
                        System.out.print(boardValue[i][j] + " ");
                    } else {
                        System.out.print(board[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
        public static void printBoardWithInputSecond(int row1, int col1, int row2, int col2){
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i == row1 - 1 && j == col1 - 1 || i == row2 - 1 && j == col2 - 1) {
                        System.out.print(boardValue[i][j] + " ");
                    } else {
                        System.out.print(board[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
        public static int checkIsMatching(int row1, int col1, int row2, int col2, int count){
            if (boardValue[row1 - 1][col1 - 1].equals(boardValue[row2 - 1][col2 - 1])) {
                board[row1 - 1][col1 - 1] = boardValue[row1 - 1][col1 - 1];
                board[row2 - 1][col2 - 1] = boardValue[row1 - 1][col1 - 1];
                System.out.println("You have a match!! Number: " + boardValue[row1-1][col1-1]);
                count++;
            }else {
                System.out.println("Noo match....Try again.");
            }
            System.out.println("-------------------------------------------------------");
            return count;
        }
        public static void endGame(){
            System.out.println("******** GAME FINISHED! ********");
            scan.close();
            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    System.out.print(boardValue[i][j] + " ");
                }
                System.out.println();
            }
        }
}
