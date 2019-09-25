import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MyList {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();
            list.add("Vasya");
            list.add("Fedya");
            list.add("Vasya");
            list.add("John");
            list.add("Sasha");
            list.add("Kate");
            list.add("Bob");
            list.add("John");
            list.add("John");
            list.add("Alex");
        System.out.println(list);
    }
}