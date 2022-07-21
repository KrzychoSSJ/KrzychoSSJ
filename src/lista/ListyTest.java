package lista;

import java.util.*;

public class ListyTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("pawel");
        names.add("kasia");
        names.add("goku");

        System.out.println(names.get(2));
        System.out.println(names.indexOf("pawel"));
        System.out.println(names.contains("gou"));
        System.out.println(names.isEmpty());
        System.out.println(names.size());

        for (String name : names) {
            System.out.println(names);
        }
    }
}
