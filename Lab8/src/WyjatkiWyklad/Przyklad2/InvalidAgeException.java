package WyjatkiWyklad.Przyklad2;

public class InvalidAgeException extends RuntimeException  {
    @Override
    public String getMessage(){
         return "Podano niewłaściwy rok.";
    }
}
