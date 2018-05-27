package top.zgpv_12;

import java.util.Objects;

/**
 * The type Student.
 */

public class Student implements Comparable {
    private String name;
    private Integer age;

    /**
     * Instantiates a new Student.
     */
    public Student() {
    }

    /**
     * Instantiates a new Student.
     *
     * @param age the age
     */
    public Student(Integer age) {

        this.age = age;
    }

    /**
     * Instantiates a new Student.
     *
     * @param name the name
     */
    public Student(String name) {

        this.name = name;
    }

    /**
     * Instantiates a new Student.
     *
     * @param name the name
     * @param age  the age
     */
    public Student(String name, Integer age) {

        this.name = name;
        this.age = age;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {

        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Show name.
     */
    public void showName() {
        System.out.println(name);
    }

    /**
     * Show age.
     */
    public void showAge() {
        System.out.println(age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {

        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) &&
                Objects.equals(getAge(), student.getAge());
    }

    @Override
    public int compareTo(Object o) {

        Student s = (Student) o;
        return this.age - s.age;
    }
}
