package pl.poj.lab5.zad4;

public class FiveArg {
    private String first_arg;
    private String second_arg;
    private int third_arg;
    private double fourth_arg;
    private boolean fifth_arg;

    public FiveArg(String first_arg, String second_arg, int third_arg, double fourth_arg, boolean fifth_arg) {
        this.first_arg = first_arg;
        this.second_arg = second_arg;
        this.third_arg = third_arg;
        this.fourth_arg = fourth_arg;
        this.fifth_arg = fifth_arg;
    }

    public String toString(){
        return "First argument: " + first_arg
                + "\nSecond argument: " + second_arg
                + "\nThird argument: " + third_arg
                + "\nFourth argument: " + fourth_arg
                + "\nFifth argument: " + fifth_arg;
    }
}
