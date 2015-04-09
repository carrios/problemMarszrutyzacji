import java.util.List;

/**
 * Created by carrios on 01.04.15.
 */
public class Vehicle {
    int vehicleNumber=0;
    int capacity;
    int cargo=0;
    List<Integer> points;

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public Vehicle(){

    }
    public Vehicle(int vehicleNumber,int capacity){
        this.vehicleNumber=vehicleNumber;
        this.capacity=capacity;
        setFull();
    }
    public void setFull(){
        cargo=capacity;
    }
    public boolean isEmpty(){
        return cargo==0;
    }
}
