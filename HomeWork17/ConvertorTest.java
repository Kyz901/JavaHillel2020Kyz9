package HomeWork17;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

import static org.junit.Assert.*;

public class ConvertorTest {


    @Test
    public void convertJsonToYamlTest(){
        String filePath = "C://testJson.json";
        Convertor.convert(filePath);
        Yaml yaml = new Yaml();
        String expectedString = Convertor.readToString(Convertor.getRootOfFile(filePath)+"ConvertedFromJson.yaml");
        Map<Object, Object> expectedMap = yaml.load(expectedString);




        assertNotNull(expectedMap);
        assertEquals(5, expectedMap.size());
        assertTrue(expectedMap.containsKey("name"));
        assertTrue(expectedMap.containsKey("java"));
        assertTrue(expectedMap.containsKey("age"));
        assertTrue(expectedMap.containsKey("permission"));
        assertTrue(expectedMap.containsKey("identifiers"));
        assertEquals("C://", Convertor.getRootOfFile(filePath));



     }
     @Test
    public void convertYamlToJson(){
        String filePath = "C://testYaml.yaml";
         Convertor.convert(filePath);
         Gson gson = new GsonBuilder().setPrettyPrinting().create();
         String expectedString = Convertor.readToString(Convertor.getRootOfFile(filePath)+"ConvertedFromYaml.json");
         Map<Object, Object> expectedMap = gson.fromJson(expectedString, Map.class);

         assertNotNull(expectedMap);
         assertEquals(1, expectedMap.size());
         assertTrue(expectedMap.containsKey("users"));
         assertEquals("C://", Convertor.getRootOfFile(filePath));
     }

}
