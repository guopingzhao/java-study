package top.zgpv_02;
public class StringDemo {
    public static void main(String[] args) {
        String str = new String();
        System.out.println(str.length());
        System.out.println("---------------------");

        byte[] bys = {97, 98, 99, 100, 101};
        String bysStr = new String(bys);
        System.out.println(bysStr);
        System.out.println("---------------------");
        System.out.println(new String(bys, 0, 2));
        System.out.println("---------------------");
        char[] chars = {'a', 'b', 'c', 'e'};
        System.out.println(new String(chars, 2, 1));
        System.out.println("---------------------");
        System.out.println(new String(chars));
    }
}
