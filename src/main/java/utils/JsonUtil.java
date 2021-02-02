package utils;

import com.google.gson.Gson;

import java.io.*;

public class JsonUtil {

    public static String getStringJsonFromFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader json = new BufferedReader(new FileReader(String.format("src/main/resources/%s",fileName)))) {
            String line = json.readLine();
            while (line != null) {
                sb.append(line);
                line = json.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }




    public static <T> T getFromJsonOrNull(String pathToJsonFile, Class<T> classOfT) {
        try {
            FileReader reader = new FileReader(String.format("src/main/resources/%s", pathToJsonFile));
            return new Gson().fromJson(reader, classOfT);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T getObjectFromJsonString(String jsonString, Class<T> className) {
        return new Gson().fromJson(jsonString, className);
    }
}
