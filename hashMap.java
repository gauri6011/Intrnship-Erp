import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> devices = new HashMap<>();

        devices.put(1, "Laptop");
        devices.put(2, "Mobile");
        devices.put(3, "Tablet");

        System.out.println(devices);
        System.out.println("Device at key 2: " + devices.get(2));
    }
}

