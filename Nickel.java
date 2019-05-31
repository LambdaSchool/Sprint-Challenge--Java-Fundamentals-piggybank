public class Nickel extends PiggyBank {
    private int total;
    private double worth = 0.05;
    private String name = "Nickel";

    public Nickel(int total) {
        this.total += total;
    }

    public Nickel() {
        this.total += 1;
    }

    public int getTotal() { return total; }

    @Override
    public double getWorth() { return worth; }

    @Override
    public String getName() { return name; }
}