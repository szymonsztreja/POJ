package zad3;

import java.io.IOException;

public class Zadanie3 {
    public static void main(String[] args) {
        try {
            wyjatek();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("test");
    }

    public static void wyjatek() throws IOException {
        throw new IOException("Błąd belmondziarza!");
    }
}
