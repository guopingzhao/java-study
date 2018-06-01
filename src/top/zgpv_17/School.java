package top.zgpv_17;

public class School {
    private static School school = new School();
    private School() {}

    public static School getSchool() {
        return school;
    }

    public void study() {
        System.out.println("study");
    }
}
