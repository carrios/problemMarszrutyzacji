/**
 * Created by carrios on 01.04.15.
 */
public class Warehouse extends Place {
    int numberOfVehicles=0;
    int vehicleCapacity;
    public Warehouse(int placeNumber, int x, int y,int numberOfVehicles, int vehicleCapacity) {
        this.numberOfVehicles = numberOfVehicles;
        this.placeNumber=placeNumber;
        this.x=x;
        this.y=y;
        this.vehicleCapacity=vehicleCapacity;

    }

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public int getVehicleCapacity() {
        return vehicleCapacity;
    }

    public void setVehicleCapacity(int vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }
}
