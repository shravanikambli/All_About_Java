package ex30_Collection_Framework.CF4_Map;
import java.util.*;

public class Lab7_Real_ex {
    public static void main(String[] args) {

        // Storing environment-specific configurations
        Map<String,String> envConfig = new HashMap<>();
        envConfig.put("production", "https://prod.api.com");
        envConfig.put("staging", "https://staging.api.com");

        System.out.println("Environment Configurations:");
        System.out.println(envConfig);

        // Storing credentials
        Map<String,String> credentials = new HashMap<>();
        credentials.put("admin","admin123");
        credentials.put("user","user123");
        credentials.put("user2",null);

        System.out.println("\nCredentials:");
        System.out.println(credentials);

        // HashMap with initial capacity
        Map<String,String> map = new HashMap<>(10);

        map.put("k1","v1");
        map.put("k2","v2");

        System.out.println("\nCustom Map with initial capacity 10:");
        System.out.println(map);
    }
}
