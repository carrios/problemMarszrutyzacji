import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by carrios on 01.04.15.
 */
public class DataExtractor {
    int warehousesNumber;
    int clientsNumber;
    int vehiclesNumberForWarehouse;
    int capacityNumber;






    public ArrayList<Integer> extractRawDataFromFile(File file){
        Reader r = null;
        ArrayList<Integer> result=new ArrayList<Integer>();
        try {
            r = new BufferedReader(new FileReader(file));

        StreamTokenizer st = new StreamTokenizer(r);
        while(st.nextToken()!=st.TT_EOF){
            if( st.ttype==StreamTokenizer.TT_NUMBER)
            result.add(Integer.valueOf((int) st.nval));

        }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return result;
    }

    public void extractDescriptionData(List<Integer> list){
        clientsNumber=list.get(0);
        warehousesNumber=list.get(1);
        vehiclesNumberForWarehouse =list.get(2);
        capacityNumber=list.get(3);

    }

    public List<Warehouse> extractWarehouses(List<Integer> list){
        ArrayList<Integer> sublist= (ArrayList<Integer>) list.subList(clientsNumber+4,list.size());
        ArrayList<Warehouse> result=new ArrayList<Warehouse>();
        for(int i=2;i<sublist.size();i+=3)
            result.add(new Warehouse(sublist.get(i-2),
                    sublist.get(i-1),
                    sublist.get(i),
                    vehiclesNumberForWarehouse,
                    capacityNumber
            ));
        return result;
    }
    public List<Client> extractClients(List<Integer> list){
        ArrayList<Integer> sublist= (ArrayList<Integer>) list.subList(4,clientsNumber+4);
        ArrayList<Client> result =new ArrayList<Client>();
        for(int i=3;i<sublist.size();i+=4)
            result.add(new Client(sublist.get(i-3),
                    sublist.get(i-2),
                    sublist.get(i-1),
                    sublist.get(i)));
        return result;
    }
}
