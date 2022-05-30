package zad2;

public class Games {
    public abstract static class Game {
        public abstract String getGameType();

    }

    public static class PlaystationGame extends Game {

        @Override
        public String getGameType() {
            return "Plejak";
        }
    }

    public static class XboxGame extends Game {

        @Override
        public String getGameType() {
            return "Xbox";
        }
    }
}
