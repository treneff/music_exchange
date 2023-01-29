import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Bag bag;

    Guitar guitar;

    HashMap<ISell, Integer> stock;
    @Before
    public void before(){
        bag = new Bag(5.0, 15.0, "A bag");
        guitar = new Guitar(150,250,"A guitar",IntrumentType.STRINGS,"Brown","Wood");
        stock = new HashMap<>();
        shop = new Shop(stock);
    }

    @Test
    public void shopHasStock(){
        assertEquals(0, shop.getStock());
    }

    @Test
    public void canAddStockItem(){
        shop.addStockItem(bag,2);
        assertEquals(2, shop.getItemQuantity(bag));
    }

    @Test
    public void canReduceItemQuantity(){
        shop.addStockItem(bag,2);
        shop.reduceItem(bag,1);
        assertEquals(1, shop.getItemQuantity(bag));
    }

    @Test
    public void cannotReduceItemQuantity(){
        shop.addStockItem(bag,2);
        shop.reduceItem(bag,3);
        assertEquals(2, shop.getItemQuantity(bag));
    }

    @Test
    public void canGetProfit(){
        shop.addStockItem(bag,2);
        shop.addStockItem(guitar,1);
        assertEquals(120, shop.getProfitPrediction());
    }
}
