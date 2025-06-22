package ecommerce;

import java.util.Date;

public class Order {
    private String orderId;
    private Cart cart;
    private Date orderDate;
    private String status;

    public Order(String orderId, Cart cart) {
        this.orderId = orderId;
        this.cart = cart;
        this.orderDate = new Date();
        this.status = "Pending";
    }

    // Getters and setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", cart=" + cart +
                ", orderDate=" + orderDate +
                ", status='" + status + '\'' +
                '}';
    }
}
