package opgave02.models;

public class WorkerDiscount implements Discount{
    @Override
    public double CalculateDiscount(Order order) {
        return (int) (order.getTotalPrice() - order.getTotalPrice() * 0.1);
    }
}
