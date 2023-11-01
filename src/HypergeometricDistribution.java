
public class HypergeometricDistribution extends Combinations
{
    double bigN;
    double n;
    double r;
    double y;
    
    public HypergeometricDistribution() {
        
    }
    
    public double getBigN(){
        return bigN;
    }
    public void setBigN(double userBigN) {
        bigN = userBigN;
    }
    public double getY() {
        return y;
    }
    public void setY(double userY) {
        y = userY;
    }
    /*
        N is total
        n is selected
        y is what we want
        r is total of what we want
    */
    public double hypergeometric(double bigN, double n, double r, double y){
        double distributionResult;
        distributionResult = (combination(r,y) * combination (bigN-r, n - y)) / combination(bigN,n);
        return distributionResult;
    }
}
