import java.util.HashMap;

public class Shop {
    private HashMap<ISell,Integer> stock;

    public Shop(HashMap<ISell, Integer> stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock.size();
    }

    public void addStockItem(ISell stockItem,int quantity){
        if( this.stock.get(stockItem) == null){
            stock.put(stockItem, quantity);
        }
        else stock.put(stockItem,stock.get(stockItem) + quantity);
    }

    public String reduceItem(ISell stockItem,int quantity){
        if( this.stock.get(stockItem) < quantity){
            return "Not enough Stock";
        }
        else {stock.put(stockItem,stock.get(stockItem) - quantity);
        return "Item will be right there";}
    }

    public int getItemQuantity(ISell itemToFind) {
        return stock.get(itemToFind);
    }

    public int getProfitPrediction() {
        int profitToReturn = 0;
        for (ISell key : stock.keySet()) {
            profitToReturn += key.MarkUp() * stock.get(key);
        }
        return profitToReturn;
    }
}
