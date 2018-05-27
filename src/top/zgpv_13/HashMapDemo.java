package top.zgpv_13;

import top.zgpv_12.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, Integer>> hm = new HashMap<>();

        HashMap<String, Integer> jc = new HashMap<>();

        jc.put("jc1", 20);
        jc.put("jc2", 22);

        HashMap<String, Integer> je = new HashMap<>();

        jc.put("je1", 20);
        jc.put("je2", 22);

        hm.put("jc", jc);
        hm.put("je", je);

        System.out.println(hm);

        hm.forEach((k, v) -> v.forEach((a, b) -> {
            System.out.println(a + ": " + b);
        }));

        Integer compute = jc.compute("je1", (k, v) -> v + 10);

        System.out.println(compute + jc.toString());

        System.out.println("=====================");

        for (Map.Entry<String, HashMap<String, Integer>> j : hm.entrySet()) {
            for (Map.Entry<String, Integer> e : j.getValue().entrySet()) {
                System.out.println(e.getKey() + ": " + e.getValue());
            }
        }

        System.out.println("=====================");

        for (String k : hm.keySet()) {
            HashMap<String, Integer> h = hm.get(k);
            for (String kk : h.keySet()) {
                System.out.println(kk + ": " + h.get(kk));
            }
        }


        System.out.println("=====================");

        ArrayList<HashMap<String, Student>> arr = new ArrayList<>();

        HashMap<String, Student> h1 = new HashMap<>();

        h1.put("ah1", new Student("zhang", 20));

        HashMap<String, Student> h2 = new HashMap<>();

        h2.put("ah2", new Student("li", 22));

        arr.add(h1);
        arr.add(h2);

        for (HashMap<String, Student> h : arr) {
            for (String k : h.keySet()) {
                System.out.println(k + ": " + h.get(k));
            }
        }

    }
}
