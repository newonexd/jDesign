package creation.builder;

public class Main {
    public static void main(String[] args) throws Exception {
        Order order = Order.builder()
                            .No(1)
                            .OrderName("Order")
                            .address("China")
                            .createDate("2020")
                            .price(20)
                            .product("computer")
                            .userInfo("xd")
                            .builder();
        System.out.println(order.toString());
    }
}