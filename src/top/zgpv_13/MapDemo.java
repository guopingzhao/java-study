package top.zgpv_13;

import top.zgpv_12.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 没有的都返回null
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("test", 2); //null
        Integer i = map.put("test", 3); //2
        System.out.println(i);

        map.put("a", 4);
        map.put("b", 5);
        map.put("c", 6);
        map.put("d", 7);

        System.out.println(map);

        map.remove("a");

        System.out.println(map);

//        map.clear();
//        System.out.println(map);

        System.out.println(map.get("a"));

        Set<String> s = map.keySet();

        for (String k : s) {
            System.out.println(map.get(k));
        }

        Set<Map.Entry<String, Integer>> ss = map.entrySet();

        for (Map.Entry o : ss) {
            System.out.println(o.getKey() + "----" + o.getValue());

        }

        System.out.println(ss);

        System.out.println("------------------------");


        HashMap<Student, String> hm = new HashMap<>();

        hm.put(new Student("a", 1), "a");
        hm.put(new Student("a", 1), "a");

        System.out.println(hm);

    }
}
