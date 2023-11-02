import java.util.Random;

public class DealOrNoDeal
{
    private int goodPrize;
    private int goat1;
    private int goat2;
    int countSwaps = 0; //count of wins when player swaps
    int countNoSwaps = 0; //count of wins when player does not swap
    
    public DealOrNoDeal() {
        
    }
    
    public void gameStarts(int runs) {
        int choice;
        int swapChoice;
        int i = 0;
        Random generator = new Random();
        
        goodPrize = 1;
        goat1 = 2;
        goat2 = 3;
    
        
        
        /*
        for(int i = 1; i < 10000; i++) {
            choice = 1 + generator.nextInt(3);
            if(choice == 2) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;*/
        
        
        while(i < runs) {
            boolean doorChoice = false;
            while(doorChoice == false) {
                choice = 1 + generator.nextInt(3);
                //remove g1 or g2
                if(choice == goodPrize) {
                    //Swap?
                    swapChoice = generator.nextInt(2); //1=yes, 0=no
                    if(swapChoice == 1) {
                        System.out.println("You swapped doors and lost.");
                        doorChoice = true;
                    }
                    else {
                        System.out.println("You did not swap and won!");
                        countNoSwaps++;
                        doorChoice = true;
                    }
                }
                else {
                    //Swap?
                    swapChoice = generator.nextInt(2);
                    if(swapChoice == 1) {
                        System.out.println("You swapped and won!");
                        countSwaps++;
                        doorChoice = true;
                    }
                    else {
                        System.out.println("You did not swap and lost.");
                        doorChoice = true;
                    }
                }
            }
            i++;
        }
    }
    
    public int getCountSwaps() {
        return countSwaps;
    }
    
    public int getCountNoSwaps() {
        return countNoSwaps;
    }
}
