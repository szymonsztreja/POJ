package zad5;

public class InsufficientFundsException extends Exception{

    @Override
    public String getMessage(){
        return " Not sufficient funds!";
    }
}
