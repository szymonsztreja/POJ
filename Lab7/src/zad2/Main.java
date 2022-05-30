package zad2;

public class Main {
    public static void main(String[] args) {
        Games.XboxGame xboxGame = new Games.XboxGame();
        Games.PlaystationGame playstationGame = new Games.PlaystationGame();
        Xbox xbox = new Xbox();
        Playstation playstation = new Playstation();
        xbox.playGame(xboxGame);
        playstation.playGame(playstationGame);
    }
}
