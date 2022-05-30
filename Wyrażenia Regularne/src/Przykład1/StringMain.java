package Przykład1;

import java.util.Locale;

public class StringMain {
    public static void main(String[] args) {
        String tekst = "Ala Ma KOta";
        System.out.println(chaining(tekst));
        System.out.println(tekst );

        System.out.println("Builder: ");
        System.out.println(builder(tekst));

    }

    public static String chaining(String text){
        return text.toLowerCase(Locale.ROOT)
                .substring(7,10)
                .concat(" ")
                .concat(text.substring(4,7))
                .concat(text.substring(0,3).replace('a', 'e'))
                .concat(" ")
                .repeat(3)
                .trim()
                .concat(".");
    }

    public static String builder(String text){
        StringBuilder builder = new StringBuilder(text);
        builder.append(".");
        builder.append("\nHello World\n ");
        for (int i = 0; i < 3; i++){
            builder.append(text);
            builder.append("\n");
        }
        return builder.toString();

    }
}
