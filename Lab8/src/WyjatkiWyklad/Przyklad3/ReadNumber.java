package WyjatkiWyklad.Przyklad3;

import java.io.*;

public class ReadNumber {
    public static void main(String[] args) {
        System.out.println(getNumber(new File("liczba.txt")));
    }

    public static Integer getNumber(File file){
        FileInputStream fileInputStream = null;
        Integer number = null;
        BufferedReader bufferedReader;
        try{
            fileInputStream = new FileInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = bufferedReader.readLine();
            return Integer.parseInt(line);
        } catch (FileNotFoundException e){
            System.out.println("Nie ma pliku o nazwie "+file.getPath());
        } catch (IOException e){
            System.out.println("Błąd wejscia/wyjscia. Spróbuj ponownie.");
        } catch (NumberFormatException e ){
            System.out.println("Nieprawidłowa liczba w pliku "+file.getName());
        }
        return number;
    }
}
