import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> studenci = new LinkedHashMap<>();
        studenci.put("Tomasz", 2002);
        studenci.put("Janek", 1996);
        studenci.put("Paweł", 1995);
        studenci.put("To", 2000);
        studenci.put("Masz", 1999);

        System.out.println(studenci);
        studenci.put("Tomasz", 1999);
        System.out.println(studenci);
        studenci.replace("Halina", 1074);
        System.out.println(studenci);

        wysiwetlWPetli(studenci);
    }

    public static void wysiwetlWPetli(Map<String, Integer> map){
        for (String imie: map.keySet()) {
            System.out.println("Key: " + imie +" Value: " + map.get(imie));
        }
    }
}
