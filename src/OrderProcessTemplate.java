public abstract class OrderProcessTemplate {

    public abstract void doSelect();

    public abstract void doPayment();

    public void doDelivery(){}

    public final void processOrder(boolean isGift)
    {
        System.out.println("Order received");
        doSelect();
        doPayment();
        if (isGift) {
            System.out.println("Gift wrap successful");
        }else{
            System.out.println("No gift wrap required");
        }
        doDelivery();
    }
}