package zad1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean incorrectInput = true;
        int firstInt = 0;
        int secondInt = 0;
        while (incorrectInput) {
            System.out.println("Enter first number!");
            String first = scanner.nextLine();
            System.out.println("Enter second number!");
            String second = scanner.nextLine();
            try {
                firstInt = Integer.parseInt(first);
                secondInt = Integer.parseInt(second);
                incorrectInput = false;
            } catch (NumberFormatException e) {
                System.out.printf("Error, %s\n", e.getMessage());
            }
        }
        String chooseOperation = null;
        viewMenu();
        while (true) {
            System.out.println("Wybierz działanie: ");
            chooseOperation = scanner.next().substring(0,1);
            try {
                chooseOperation = getOneLetterInput(chooseOperation);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Błąd: " + e.getMessage());
            }
        }
        Menu(chooseOperation, firstInt, secondInt);
    }
    public static String getOneLetterInput(String chooseOperation){
        Pattern pattern = Pattern.compile("^(A|a|B|b|C|c|D|d)$");
        Matcher matcher = pattern.matcher(chooseOperation);
        while( matcher.find() ){
            return matcher.group();
        }
        return null;
    }

    public static void viewMenu(){
        System.out.println("a. (+) dodawanie\n" +
                "b. (-) odejmowanie\n" +
                "c. (*) mnożenie\n" +
                "d. (/) dzielenie");
    }

    public static void Menu(String chooseOperation, int first, int second){
        switch (chooseOperation){
            case "a":
                System.out.println(Operation.add(first, second));
                break;
            case "b":
                System.out.println(Operation.sub(first, second));
                break;
            case "c":
                System.out.println(Operation.mul(first, second));
                break;
            case "d":
                System.out.println(Operation.div(first, second));
                break;

        }
    }
}


