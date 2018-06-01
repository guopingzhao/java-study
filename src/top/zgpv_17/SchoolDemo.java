package top.zgpv_17;

/**
 * 单例模式.
 */
public class SchoolDemo {
    public static void main(String[] args) {
        School school = School.getSchool();
        School school2 = School.getSchool();
        System.out.println(school == school2);

        school.study();

        System.out.println("==============");

        Student student = Student.getStudent();
        Student student2 = Student.getStudent();

        System.out.println(student == student2);

        student.study();
    }
}
