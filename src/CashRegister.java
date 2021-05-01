public class CashRegister {

    /*Om de uiteindelijke prijs van een bestelling te berekenen heb je een subtotal nodig */
    private double total;

    /* om de korting te berekenen moet je het aantal producten bijhouden */
    private int count;

    public CashRegister()
    {
    clear();
    }
    /* Voegt een product toe met prijs price*/
    public void addItem(double price)
    {
    total += price;
    count ++;
    }
    /* berekent de price  van een bestelling incl korting*/
    public double computeTotal()
    {
        if (total > 100.0 && count >=3)
        {
            return  total * 0.9;
        }
        else {
            return total;
        }

    }
    /* KasRegister wordt geinitialiseert voor de volgemnde klant*/
    public void clear()
    {
    count = 0;
    total = 0.0;
    }


    public int getCount()
    {
        return count;
    }
}
