/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author frizz
 */
public class Order {
    private int order_id, length, width, height;
    private User user;
    private boolean shipped;

    public Order(int length, int width, int height, User user, boolean shipped) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.user = user;
        this.shipped = shipped;
    }

    public Order(int order_id, int length, int width, int height, User user, boolean shipped) {
        this.order_id = order_id;
        this.length = length;
        this.width = width;
        this.height = height;
        this.user = user;
        this.shipped = shipped;
    }

    public int getOrder_id() {
        return order_id;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public User getUser() {
        return user;
    }

    public boolean isShipped() {
        return shipped;
    }

    public void setShipped(boolean shipped) {
        this.shipped = shipped;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    @Override
    public String toString() {
        return "Order{" + "order_id=" + order_id + ", length=" + length + ", width=" + width + ", height=" + height + ", user=" + user + ", shipped=" + shipped + '}';
    }
    
}
