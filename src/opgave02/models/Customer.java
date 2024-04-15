package opgave02.models;

import opgave02.models.products.Beer;

public class Customer {
    private BarTab tab;
    private Billing billing;
    private Discount discount;

    public Customer(Discount discount) {
        this.discount = discount;
        this.tab = new BarTab();
    }

    public void placeOrder(Order order) {
        int ajustedPrice = 0;
        ajustedPrice = (int) discount.CalculateDiscount(order);
        tab.addItem(new BarTabItem(order, ajustedPrice));
    }

    private int CalculateStudentPrice(Order order) {
        if (order.getProduct() instanceof Beer beer) {
            return order.getTotalPrice() - order.getCount() * 5;
        }
        return order.getTotalPrice();
    }
    private int CalculateWorkerPrice(Order order){
        return (int) (order.getTotalPrice() - order.getTotalPrice() * 0.1);
    }

    private int CalculateNormalPrice(Order order) {
        return order.getTotalPrice();
    }

    public BarTab getBarTab() {
        return tab;
    }
}
