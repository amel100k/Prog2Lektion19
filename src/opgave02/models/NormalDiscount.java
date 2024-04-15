package opgave02.models;

public class NormalDiscount implements Discount{
    @Override
    public double CalculateDiscount(Order order) {
        return order.getTotalPrice();
    }
}
