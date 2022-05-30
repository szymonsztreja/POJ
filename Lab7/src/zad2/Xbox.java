package zad2;

public class Xbox extends GameConsole{
    @Override
    public void playGame(Games.Game game) {
        if(game.getGameType().equals("Xbox")){
            System.out.println("Xbox game is being played on Xbox");
        }
        else {
            System.out.println("Game isnt comaptible with this console");
        }
    }
}
