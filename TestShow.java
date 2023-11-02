import java.util.Random;
public class TestShow
{
    public static void main(String[] args) {
        DealOrNoDeal test = new DealOrNoDeal();
        Random generator = new Random();
        
        test.gameStarts(1000);
        System.out.println("Wins when you swapped: " + test.getCountSwaps());
        System.out.println("Wins when you did not swap: " + test.getCountNoSwaps());
    }
}
