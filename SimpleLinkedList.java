import java.util.*;

public class SimpleLinkedList {
    public static void main(String[] args) {
        LinkedList<String> devices = new LinkedList<>();

        devices.add("Laptop");
        devices.add("Mobile");
        devices.add("Tablet");
        System.out.println("Devices: " + devices);

        devices.addFirst("Smartwatch");
        devices.addLast("Desktop");
        System.out.println("After addFirst and addLast: " + devices);

        devices.remove("Mobile");
        System.out.println("After removing Mobile: " + devices);

        System.out.println("Iterating devices:");
        for (String d : devices) {
            System.out.println(d);
        }
    }
}

