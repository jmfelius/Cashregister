import org.junit.Test;

import static org.junit.Assert.*;

public class CashRegisterTest {
    private CashRegister cash = new CashRegister();
    @Test
    public void initTest()
    {

        assertEquals(0,cash.computeTotal(),0.0001);
        assertEquals(0, cash.getCount());
    }

    @Test
    public void eersteProductToegevoegd()
    {
        cash.addItem(10);
        assertEquals(10,cash.computeTotal(),0.0001);
        assertEquals(1,cash.getCount());
        cash.addItem(20);
        assertEquals(30,cash.computeTotal(),0.0001);
        assertEquals(2,cash.getCount());
        cash.addItem(20);
        assertEquals(50,cash.computeTotal(),0.0001);
        assertEquals(3,cash.getCount());
        cash.addItem(60);
        assertEquals(99,cash.computeTotal(),0.0001);
        assertEquals(4,cash.getCount());
        cash.clear();
        assertEquals(0, cash.getCount());
        assertEquals(0, cash.getCount());
    }

    @Test
    public void clear() {
    }
}