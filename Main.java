import java.util.ArrayList;

public class Main {

    public static void coins(ArrayList<PiggyBank> coins) {
        for (PiggyBank c : coins) {
            if (c.getName().equals("Dollar"))
                System.out.println("$" + c.getTotal());
            else
                System.out.println(c.getTotal() + " " + c.getName());
        }
    }
    public static void tot(ArrayList<PiggyBank> coins) {
        double tot = 0;
        for (PiggyBank c : coins) tot += c.getTotal() * c.getWorth();
        System.out.println(tot);
    }

        public static void main (String[]args) {
            ArrayList<PiggyBank> piggyBank = new ArrayList<>();
            piggyBank.add(new Quarter());
            piggyBank.add(new Dime());
            piggyBank.add(new Dollar(5));
            piggyBank.add(new Nickel(3));
            piggyBank.add(new Dime(7));
            piggyBank.add(new Dollar());
            piggyBank.add(new Penny(10));

            coins(piggyBank);
            tot(piggyBank);

        }
    }