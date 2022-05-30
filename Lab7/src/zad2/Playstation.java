package zad2;

public class Playstation extends GameConsole{
    @Override
    public void playGame(Games.Game game) {
        if(game.getGameType().equals("Plejak")){
            System.out.println("Playing playstation");
        }
        else {
            System.out.println("Cannot load disk!");
        }
    }
}
