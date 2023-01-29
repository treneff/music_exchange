public abstract class StockItem implements ISell{
    private double purchasePrice;
    private double salePrice;

    private String description;

    public StockItem(double purchasePrice, double salePrice, String description) {
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.description = description;
    }

    @Override
    public double MarkUp() {
        return salePrice - purchasePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
