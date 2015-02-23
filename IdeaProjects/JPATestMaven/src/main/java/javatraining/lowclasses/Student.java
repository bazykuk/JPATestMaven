package javatraining.lowclasses;

/**
 * Created by NAW on 18.02.15.
 */
public class Student {

    private String name;
    private int age;
    private SexMF sex;

    public void setNameStudent(String name) {
        this.name = name;
    }

    public void setAgeStudent(int age) {
        this.age = age;
    }

    public void setSexStudent(SexMF sex) {
        this.sex = sex;
    }


    public String getName() {
        return name;
    }

    public SexMF getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public enum SexMF {MALE, FEMALE}
}