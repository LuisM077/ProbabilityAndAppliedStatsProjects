
public class NegativeBinomialPD extends Combinations
{
    private double p;
    private double q;
    
    public NegativeBinomialPD() {
        
    }
    
    public double getP() {
        return p;
    }
    public double getQ() {
        return q;
    }
    
    public void setP(double userP){
        p = userP;
    }
    public void setQ(double userQ) {
        q = userQ;
    }
    
    public double negativeBinomialP(double y, double r, double p, double q) {
        double nbDistribution;

        nbDistribution = combination(y-1, r-1) * Math.pow(p,r) * Math.pow(q,y-r);
        return nbDistribution;
    }
}
