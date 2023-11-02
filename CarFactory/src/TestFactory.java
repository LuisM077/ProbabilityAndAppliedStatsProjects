import java.io.FileNotFoundException;
public class TestFactory
{
    public static void main(String[] args) throws FileNotFoundException{
        CarFactory test = new CarFactory();
        
        test.constructCar(1000);
        
        test.readFile();
    }
}
