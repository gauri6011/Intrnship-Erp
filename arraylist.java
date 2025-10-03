import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("abc");
        names.add("xyz");
        names.add("abc");

        System.out.println("ArrayList: " + names);
        System.out.println("First element: " + names.get(0));

        for (String n : names) {
            System.out.println(n);
        }
    }
}

