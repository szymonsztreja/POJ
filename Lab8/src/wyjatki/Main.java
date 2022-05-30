package wyjatki;

public class  Main {
    public static void main(String[] args) {
        //Błędy - problem ze sprzętem
        // zalogować błąd

        // Jawne błędy - obsługa wyjątku

        // Niejawne wyjątki - nie wiadomo co
        try {
            int a = 100/0;                      //shift alt ^;
        }catch(ArithmeticException e) {       //obiekt wyjątku e
            System.out.printf("Bład %s \n" , e.getMessage());
        }finally {
            System.out.println("koniec");
        }
            System.out.println("hello");

    }
}
