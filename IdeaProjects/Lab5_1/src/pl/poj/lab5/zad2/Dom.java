package pl.poj.lab5.zad2;

public class Dom {
    private String ulica;
    private double powDomu;
    private double powOgrodu;
    private int liczbaPieter;
    private boolean czyZamieszkany;

    public Dom(String ulica, double powDomu, double powOgrodu, int liczbaPieter, boolean czyZamieszkany) {
        this.ulica = ulica;
        this.powDomu = powDomu;
        this.powOgrodu = powOgrodu;
        this.liczbaPieter = liczbaPieter;
        this.czyZamieszkany = czyZamieszkany;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "ulica='" + ulica + '\'' +
                ", powDomu=" + powDomu +
                ", powOgrodu=" + powOgrodu +
                ", liczbaPieter=" + liczbaPieter +
                ", czyZamieszkany=" + czyZamieszkany +
                '}';
    }
}
