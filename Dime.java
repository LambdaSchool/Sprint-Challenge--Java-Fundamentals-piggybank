public class Dime extends PiggyBank{
    private int total;
    private double worth = 0.1;
    private String name = "Dime";

    public Dime(int total) {
        this.total += total;
    }

    public Dime() {
        this.total += 1;
    }

    public int getTotal() { return total; }

    @Override
    public double getWorth() { return worth; }

    @Override
    public String getName() { return name; }
}
