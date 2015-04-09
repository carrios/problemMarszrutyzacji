/**
 * Created by carrios on 01.04.15.
 */
public class Client extends Place {
    int order;
    boolean orderCompleted=false;

    public Client(int placeNumber,int x,int y, int order) {
        this.order = order;
        this.placeNumber=placeNumber;
        this.x=x;
        this.y=y;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isOrderCompleted() {
        return orderCompleted;
    }

    public void setOrderCompleted(boolean orderCompleted) {
        this.orderCompleted = orderCompleted;
    }
}
