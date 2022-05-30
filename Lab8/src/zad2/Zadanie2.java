package zad2;

public class Zadanie2 {
    public static void main(String[] args) {
        try{
            wyjatek();
        } catch (RuntimeException e){
            System.out.println("Bład!" + e.getMessage());
        }
    }

    public static void wyjatek() throws RuntimeException{
        throw new RuntimeException("Runtimeexeption wyjątek!");
    }
}
