public class CoinTester
{
    public static void main(String[] args) {

       // Create your program here
       Coins piggy = new Coins(3, 2, 1, 4);
       piggy.bankCount();
       piggy.bankValue();
       piggy.addQuarter();
       piggy.addQuarter();
       piggy.addDime();
       piggy.addPenny();
       piggy.addPenny();
       piggy.addPenny();
       piggy.bankCount();
       piggy.bankValue();
    }
}