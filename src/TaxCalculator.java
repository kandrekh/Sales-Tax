import java.text.NumberFormat;

public class TaxCalculator {
    private double purchaseAmount;;
    private static final NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

    public TaxCalculator(){}
    public TaxCalculator( double purchaseAmount ){this.purchaseAmount = purchaseAmount;}

    public double getPurchaseAmount() {return purchaseAmount;}
    public void setPurchaseAmount(double purchaseAmount) {this.purchaseAmount = purchaseAmount;}

    public double calculateStateSalesTax(){
        final  double  STATE_TAX = 0.04;
        double stateSalesTax;
        return  stateSalesTax = purchaseAmount * STATE_TAX;
    }
    public double calculateCountySalesTax(){
        final  double  COUNTY_TAX = 0.02;
        double countySalesTax;
        return countySalesTax = purchaseAmount * COUNTY_TAX;
    }
    public double totalSaleTax(){
        return this.calculateCountySalesTax() + this.calculateStateSalesTax();
    }
    public double totalSales(){
        return this.totalSaleTax()+purchaseAmount;
    }

}
