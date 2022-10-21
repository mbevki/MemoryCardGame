package MemoryCardGame;

public class Main {
    public static void main(String[] args)throws InterruptedException{

        Game newGame = new Game();
        newGame.loadingScreen("LOADING");
        newGame.showRules();
        do{
            newGame.showMenu();
            if(newGame.getChoice()==3){
                System.out.println("Thank you for playing....\n****EXITING THE GAME****");
                newGame.loadingScreen("EXITING");
            }
            else if(newGame.getChoice()==1){
                newGame.choiceDefault();
            }else if(newGame.getChoice()==2){
                newGame.choiceTwo();
            }
        }while(newGame.getChoice()!=3);

    }
}

