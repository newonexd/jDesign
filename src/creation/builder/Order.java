package creation.builder;

public class Order {
    private int No;
    private String userInfo;
    private String product;
    private int price;
    private String OrderName;
    private String createDate;
    private String address;

    private Order(int No, String userInfo, String product, int price, String OrderName, String createDate,
            String address) {
        this.No = No;
        this.userInfo = userInfo;
        this.product = product;
        this.price = price;
        this.OrderName = OrderName;
        this.createDate = createDate;
        this.address = address;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("OrderInfo:  \n");
        sb.append("  No: "+this.No).append("\n");
        sb.append("  userInfo: "+this.userInfo).append("\n");
        sb.append("  product: "+this.product).append("\n");
        sb.append("  price: "+this.price).append("\n");
        sb.append("  OrderName: "+this.OrderName).append("\n");
        sb.append("  createDate: "+this.createDate).append("\n");
        sb.append("  address: "+this.address).append("\n");
        return sb.toString();
    }

    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    public static class OrderBuilder {
        private int No;
        private String userInfo;
        private String product;
        private int price;
        private String OrderName;
        private String createDate;
        private String address;

        private OrderBuilder(){}

        public OrderBuilder No(int No){
            this.No = No;
            return this;
        }
        public OrderBuilder userInfo(String userInfo){
            this.userInfo = userInfo;
            return this;
        }
        public OrderBuilder product(String product){
            this.product = product;
            return this;
        }
        public OrderBuilder price(int price){
            this.price = price;
            return this;
        }
        public OrderBuilder OrderName(String OrderName){
            this.OrderName = OrderName;
            return this;
        }
        public OrderBuilder createDate(String createDate){
            this.createDate = createDate;
            return this;
        }
        public OrderBuilder address(String address){
            this.address = address;
            return this;
        }

        public Order builder() throws Exception {
            if("".equals(userInfo)){
                throw new Exception("用户信息为空!");
            }
            if(price<=0){
                throw new Exception("订单价格错误!");
            }
            return new Order(No, userInfo, product, price, OrderName, createDate, address);
        }
    }
    
}