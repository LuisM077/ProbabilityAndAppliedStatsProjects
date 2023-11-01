
public class Combinations extends Factorial
{
    double n;
    double r;

    public Combinations() {
        
    }
    public Combinations(double userN, double userR) {
        n = userN;
        r = userR;
    }
    
    public double getR(){
        return r;
    }
    public void setR(double userR){
        r = userR;
    }
    public double combination(double n, double r) {
        double result = factorial(n) / (factorial(r) * factorial(n-r));
        return result;
    }
    
}
