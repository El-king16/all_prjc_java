package Exam;

public class Order {
    private static int idCounter = 1;
    private final int orderId;
    private String status;

    public Order() {
        this.orderId = idCounter++;
        this.status = "Создан";
    }

    public int getOrderId() {
        return orderId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "[id: " + orderId + "], [" + status + "]";
    }
}


