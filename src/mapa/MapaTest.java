package mapa;

import java.util.HashMap;
import java.util.Map;

public class MapaTest {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(1,"basia");
        students.put(2,"tomek");
        students.put(3,"basia");
        System.out.println(students.get(2));

        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("basia"));
        System.out.println(students.size());
        students.remove(1);
        System.out.println(students.get(1));
    }
}
