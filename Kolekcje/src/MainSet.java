import java.util.*;

public class MainSet {
    public static void main(String[] args) {
        Set<String> imiona = new TreeSet<>(List.of("Ala", "Ala","Bogdan", "Janusz", "Chujonides", "Prącion"));
        imiona.add("Prącior");
        System.out.println("####Foreach :");
        for (String imie:imiona) {
            System.out.println(imie);
        }

        System.out.println("####Iterator");
        Iterator<String> i = imiona.iterator();
        while ( i.hasNext()){
            System.out.println(i.next());
        }
    }

}
