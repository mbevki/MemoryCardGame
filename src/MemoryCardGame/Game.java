package MemoryCardGame;

import java.util.Scanner;

public class Game{
    private int choice = 0;
    public static Scanner scan = new Scanner(System.in);

    public Game() {
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public static Scanner getScan() {
        return scan;
    }
    public static void setScan(Scanner scan) {
        Game.scan = scan;
    }
////////////////////////////////////////////////////////////////////////////////////////
    public void loadingScreen(String loadText)throws InterruptedException{

        ConsoleLoad consoleHelper = new ConsoleLoad();
        for (int i = 0; i < 20; i++) {
            consoleHelper.animate(i + "", loadText);
            //simulate a piece of task
            Thread.sleep(150);
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public void showRules(){
        System.out.println("\n\n\n**Welcome to Memory Card Game**");
        System.out.println("- Rules:\n\t> you have to find matching pairs of a characters");
        System.out.println("\t> if the characters are matching then face them up");
        System.out.println("\t> if the characters aren't matching then face them down again");
    }
    public void showMenu(){
//        chose 1 for default game 4x4
//            chose 2 for custom matrix
//                chose 3 for exit
        System.out.println("- Menu:");
        System.out.println("\t> || Enter 1 || Default matrix (4x4)");
        System.out.println("\t> || Enter 2 || Custom matrix ");
        System.out.println("\t> || Enter 3 || Exit!");
        System.out.print("\t> You chose: ");
        int inputChoice = checkInput(1, 3);
        System.out.println("You chose option: " + inputChoice);
    }
    public int checkInput(int min, int max){
        int input;
        do{
//          Validation that input is a number
            while(!scan.hasNextInt()){
                System.out.print("**That's not a number! Pleas enter a number: ");
                scan.next();
            }

            input = scan.nextInt();
            if(input < min || input > max){
                System.out.print("\t>> Enter a number between (" + min +" - "+ max +"): ");
            }
        }while(input < min || input > max);
        this.choice = input;
        return input;
    }

    public void choiceDefault() throws InterruptedException{
//        DefaultGame newDefault = new DefaultGame(4 , 4);
//        newDefault.start();
        CustomGame newDefault = new CustomGame(4,4);
        newDefault.start();
        Thread.sleep(5000);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public void choiceTwo() throws InterruptedException{
        int row = parameters("Row");
        int col = parameters("Column");
        CustomGame newCustom = new CustomGame(row, col);
        newCustom.start();
        Thread.sleep(5000);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public int parameters(String type){
        int input = 0;
        System.out.print("Enter how many (event number / maximum value is 10):\n\t> " + type + "s do you want: ");
        while(true){
            input = checkInput(1,10);
            if(input%2 != 0)
                System.out.print("**Not good. Enter a Even Number: ");
            else
                break;
        }

        return input;
    }
}
