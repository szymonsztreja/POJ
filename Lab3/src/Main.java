import java.util.Scanner;


public class Main {
    public static int menu() {
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *                 MENU                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. check balance");
        System.out.println("     2. withdraw");
        System.out.println("     3. deposit");
        System.out.println("     4. exit");

        Scanner in = new Scanner(System.in);
        int w = in.nextInt();

        return w;
    }

    public static void main(String[] args) {
        Konto konto1 = new Konto(1, 100);
        Konto konto2 = new Konto(2, 100);
        Konto konto3 = new Konto(3, 100);
        Konto konto4 = new Konto(4, 100);
        Konto konto5 = new Konto(5, 100);
        Konto[] tablica_kont = {konto1, konto2, konto3, konto4, konto5};
        Scanner scan = new Scanner(System.in);

        int wybor = menu();

        while (wybor != 4) {
            switch (wybor) {
                case 1:
                    System.out.println("1: check balance");
                    konto1.getBilans();
                    break;
                case 2:
                    System.out.println("2: withdraw");
                    System.out.println("How much do you want to withdraw?");
                    int wezhajs = scan.nextInt();
                    konto1.withdraw(wezhajs);
                    break;
                case 3:
                    System.out.println("3: deposit");
                    System.out.println("How much do you want to deposit?");
                    int dajhajs = scan.nextInt();
                    konto1.deposit(dajhajs);
                    break;
                case 4:
                    System.out.println("4: exit");
                    break;
            }
        }
    }
}
