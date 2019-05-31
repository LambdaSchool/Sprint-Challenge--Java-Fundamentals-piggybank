public class Quarter extends PiggyBank {
    private int total;
    private double worth = 0.25;
    private String name = "Quarter";

    public Quarter(int total) {
        this.total += total;
    }

    public Quarter() {
        this.total += 1;
    }

    public int getTotal() { return total; }

    @Override
    public double getWorth() { return worth; }

    @Override
    public String getName() { return name; }
}