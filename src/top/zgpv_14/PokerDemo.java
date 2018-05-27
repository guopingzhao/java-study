package top.zgpv_14;

import java.util.*;

public class PokerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        HashMap<Integer, String> arrayHashMap = new HashMap<>();
        initPoker(array, arrayHashMap);

        System.out.println("你玩扑克吗？ y/n");
        String choose = sc.nextLine();

        while (choose.equalsIgnoreCase("y")) {
            play(array, arrayHashMap);
            System.out.println("你继续玩扑克吗？ y/n");
            choose = sc.nextLine();
        }
    }

    public static void play(ArrayList<Integer> array, HashMap<Integer, String> arrayHashMap) {
        Collections.shuffle(array);

        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();
        TreeSet<Integer> c = new TreeSet<>();
        TreeSet<Integer> d = new TreeSet<>(array.subList(array.size() - 3, array.size()));

        sendPoker(array, a, b, c);

        lookPoker("a", a, arrayHashMap);
        lookPoker("b", b, arrayHashMap);
        lookPoker("c", c, arrayHashMap);
        lookPoker("d", d, arrayHashMap);
    }

    public static void initPoker(ArrayList<Integer> array, HashMap<Integer, String> arrayHashMap) {
        int index = 0;
        String[] colors = {"♠️", "♥️", "♣️", "♦️"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String n : numbers) {
            for (String c : colors) {
                array.add(index);
                arrayHashMap.put(index, c + n);
                index++;
            }
        }

        array.add(index);
        arrayHashMap.put(index++, "小王");
        array.add(index);
        arrayHashMap.put(index++, "大王");
    }

    public static void sendPoker(ArrayList<Integer> array, TreeSet<Integer> a, TreeSet<Integer> b, TreeSet<Integer> c) {
        for (int i = 0; i < array.size() - 3; i++) {
            if (i % 3 == 0) {
                a.add(array.get(i));
            } else if (i % 3 == 1) {
                b.add(array.get(i));
            } else {
                c.add(array.get(i));
            }
        }
    }

    public static void lookPoker(String name, TreeSet<Integer> pokers, HashMap<Integer, String> arrayHashMap) {
        ArrayList<String> myPokers = new ArrayList<>();

        for (Integer i : pokers) {
            myPokers.add(arrayHashMap.get(i));
        }

        System.out.println(name + "! 你的牌是：");
        System.out.println(myPokers);
    }
}
