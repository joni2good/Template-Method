public class StoreOrder extends OrderProcessTemplate {

    @Override
    public void doSelect()
    {
        System.out.println("\nShopping in the mall, with StoreOrder: \n");
        System.out.println("Customer chooses the item from shelf.");
    }

    @Override
    public void doPayment()
    {
        System.out.println("Pays at counter through cash/POS");
    }
} 