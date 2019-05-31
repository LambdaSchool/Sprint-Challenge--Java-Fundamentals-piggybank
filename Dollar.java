public class Dollar extends PiggyBank{
    private int total;
    private double worth = 1;
    private String name = "Dollar";

    public Dollar(int total) {
        this.total += total;
    }

    public Dollar() {
        this.total += 1;
    }

    public int getTotal() { return total; }

    @Override
    public double getWorth() { return worth; }

    @Override
    public String getName() { return name; }
}
