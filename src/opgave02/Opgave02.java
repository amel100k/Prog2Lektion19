package opgave02;

import opgave02.models.*;
import opgave02.models.products.Beer;
import opgave02.models.products.PepsiMax;

public class Opgave02 {
    public static void main(String[] args) {
        Customer student = new Customer(new StudentDiscount());
        Customer worker = new Customer(new WorkerDiscount());
        Customer normal = new Customer(new NormalDiscount());
        student.placeOrder(new Order(2, new Beer()));
        student.placeOrder(new Order(1, new PepsiMax()));
        student.placeOrder(new Order(3, new Beer()));
        worker.placeOrder(new Order(10, new Beer()));
        normal.placeOrder(new Order(10, new Beer()));
        student.getBarTab().Print();
        worker.getBarTab().Print();
        normal.getBarTab().Print();
    }
}
