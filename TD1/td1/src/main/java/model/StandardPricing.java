package model;

public class StandardPricing implements PriceCode{
    private double fixedPrice, daysOfPackage, extraPrice;

    public StandardPricing(double fixedPrice, double daysOfPackage, double extraPrice){
        this.fixedPrice = fixedPrice;
        this.daysOfPackage = daysOfPackage;
        this.extraPrice = extraPrice;
    }

    @Override
    public double getAmount(int days) {
        double val = fixedPrice;
        if (days>daysOfPackage)
        {
            val += (days - daysOfPackage) * extraPrice;
        }
        return val;
    }

    @Override
    public int getRenterPoints(int days) {
        return 1;
    }

    @Override
    public PriceCode clone() {
        PriceCode tmp = null;
        try{
            tmp = (PriceCode) super.clone(); // le super fait un clone de Object donc bit par bit
        } catch (CloneNotSupportedException e){
            System.out.println("Clonage impossible.");
            System.exit(-1);
        }
        return tmp;
    }
}
