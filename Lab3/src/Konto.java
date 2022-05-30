public class Konto {
    private int id;
    private double bilans;

    public Konto(int id, double bilans) {
        this.id = id;
        this.bilans = bilans;
    }

    public double getBilans() {
        return bilans;
    }

    public void withdraw(double wez_hajs){
        if((bilans - wez_hajs) > 0)
        bilans -= wez_hajs;
        else{
            System.out.println("Nie masz wystarczającej ilości środków na koncie!\n");
        }
    }

    public void deposit(double daj_hajs){
        bilans += daj_hajs;
    }
}
