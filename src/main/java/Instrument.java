public abstract class Instrument extends StockItem implements IPlay{

  private IntrumentType instrumentType;
  private String color;
  private String material;

    public Instrument(double purchasePrice, double salePrice, String description, IntrumentType instrumentType, String color, String material) {
        super(purchasePrice, salePrice, description);
        this.instrumentType = instrumentType;
        this.color = color;
        this.material = material;
    }

    @Override
    public String play() {
        return "I am playing";
    }

    public IntrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
