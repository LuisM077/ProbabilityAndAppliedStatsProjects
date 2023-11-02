
public class Car
{
    private String carType;
    private int year;
    private String color;
    private int miles;
    
    public Car(String inputCarType, int inputYear, String inputColor, int inputMiles) {
        carType = inputCarType;
        year = inputYear;
        color = inputColor;
        miles = inputMiles;
    }
    
    public String getCarType() {
        return carType;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public int getMiles() {
        return miles;
    }
    
    public void setCarType(String inputCarType) {
        carType = inputCarType;
    }
    public void setYear(int inputYear) {
        year = inputYear;
    }
    public void setColor(String inputColor) {
        color = inputColor;
    }
    public void setMiles(int inputMiles) {
        miles = inputMiles;
    }
    
    
}
