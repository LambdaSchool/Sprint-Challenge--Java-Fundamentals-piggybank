public class Penny extends PiggyBank{
    private int total;
    private double worth = 0.01;
    private String name = "Penny";

    public Penny(int total) {
        this.total += total;
    }

    public Penny() {
        this.total += 1;
    }

    public int getTotal() { return total; }

    @Override
    public double getWorth() { return worth; }

    @Override
    public String getName() { return name; }
}