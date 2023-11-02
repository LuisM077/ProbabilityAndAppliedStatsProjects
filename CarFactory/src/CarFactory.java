import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.io.File;
import java.util.Scanner;

public class CarFactory
{
    private String fileName = "carOutput.csv";
    public void constructCar(int size) throws FileNotFoundException{
        
        PrintWriter out = new PrintWriter(fileName);
        out.println("CarType      Year  Color  Miles");
        
        Random generator = new Random();
        String carType;
        int year;
        String color;
        int miles;
        int i = 0;
        
        String carType1 = "Sedan";
        String carType2 = "SUV";
        String carType3 = "Hatchback";
        String carType4 = "Convertible";
        
        String color1 = "Red";
        String color2 = "Blue";
        String color3 = "White";
        String color4 = "Black";
        
        while(i < size) {
            int typeGen = 1 + generator.nextInt(4);
            if(typeGen == 1) {
                carType = "Sedan";
            }
            else if(typeGen == 2) {
                carType = "SUV";
            }
            else if(typeGen == 3) {
                carType = "Hatchback";
            }
            else {
                carType = "Convertible";
            }
        
            year = 1990 + generator.nextInt(33);
        
            int colorGen = 1 + generator.nextInt(4);
            if(colorGen == 1) {
                color = "Red";
            }
            else if(colorGen == 2) {
                color = "Blue";
            }
            else if(colorGen == 3) {
                color = "White";
            }
            else {
                color = "Black";
            }
        
            miles = generator.nextInt(250001);
        
        
            Car car = new Car(carType, year, color, miles);
            out.printf("%-12s %d  %-6s %d\n",car.getCarType(),car.getYear(),car.getColor(), car.getMiles()); 
            i++;
        }
        out.close();
    }
    
    public void readFile() throws FileNotFoundException {
        File inputFile = new File(fileName);
        Scanner scnr = new Scanner(inputFile);
        
        while(scnr.hasNextLine()) {
            System.out.println(scnr.nextLine());
        }
        scnr.close();
    }
    
}
