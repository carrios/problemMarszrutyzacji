import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by carrios on 01.04.15.
 */
public class VehicleRouting {

    File inputFile;
    File outputFile;
    ArrayList<Warehouse> warehouses;
    List<Client> clients;

    public VehicleRouting(){

    }

    public VehicleRouting(File inputFile, File outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;

    }

    public File getInputFile() {
        return inputFile;
    }

    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }


    public File getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(File outputFile) {
        this.outputFile = outputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = new File(inputFile);
    }



    public void setOutputFile(String outputFile) {
        this.outputFile = new File(outputFile);
    }



/*
    public List<Warehouse> getWarehousesFromFile(File file){

    }

*/
}
