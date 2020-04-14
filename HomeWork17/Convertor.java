package HomeWork17;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Stream;

public class Convertor {
    static Map<String, Object> jsonMap;
    static Map<String, Object> yamlMap;

    public static void convert(String filePath){

        if(getExtension(filePath).equals("yaml")){

        Yaml yaml = new Yaml();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String yamlStr = readToString(filePath);
        yamlMap = yaml.load(yamlStr);
        String finalTextYaml = gson.toJson(yamlMap);
        writeToFile("C://ConvertedFromYaml.json",finalTextYaml);

        } else if (getExtension(filePath).equals("json")){

        Yaml yaml = new Yaml();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        StringWriter writer = new StringWriter();
        String json = readToString(filePath);
        jsonMap = gson.fromJson(json, Map.class);
        yaml.dump(jsonMap,writer);
        String finalTextJson = writer.toString();
        writeToFile("C://ConvertedFromJson.yaml",finalTextJson);

         } else {
        System.err.println("Wrong extension");
        }


        System.out.println("CORRECT CONVERT");
    }


    public static String getExtension(String filename) {
        String extension = "";

        int i = filename.lastIndexOf('.');
        if (i > 0) {
            extension = filename.substring(i+1);
        }
        return extension;
    }

    public static String readToString(String path)
    {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines( Paths.get(path), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }

        public static void writeToFile(String filepaths,String text){
        BufferedWriter writer = null;
        try{

            writer = new BufferedWriter(new FileWriter(filepaths));
            writer.write(text);




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
