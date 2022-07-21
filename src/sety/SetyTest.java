package sety;

import java.util.HashSet;
import java.util.Set;

public class SetyTest {
    public static void main(String[] args) {
        Set<String> owoce = new HashSet<>();
        owoce.add("jablko");
        owoce.add("banan");
        owoce.add("jablko");

        System.out.println(owoce.contains("jablko"));
        System.out.println(owoce.size());
        System.out.println(owoce.isEmpty());

        Set<String> dbz = new HashSet<>();
        dbz.add("goku");
        dbz.add("vegeta");

        dbz.addAll(owoce);
        System.out.println(dbz.size());

        for (String wszystko: dbz)
            System.out.println(dbz);
    }
}
