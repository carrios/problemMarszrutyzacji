import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class DataExtractorTest extends TestCase {
    String dir="/home/carrios/test.txt";
    File file=new File(dir);
    DataExtractor dataExtractor =new DataExtractor();



    public void testExtractInformation() throws IOException {

        }

    public void testExtractInformationWithStreamTokenizer(){
        ArrayList<Integer> result= dataExtractor.extractRawDataFromFile(file);
        assertEquals(50,result.get(0).intValue());
        assertEquals(5,result.get(1).intValue());
        System.out.println(result.size());
    }
}