package com.lpaxxa.fap.entity;

public class Student {
    private String id;
    private String name;
    private int yob;
    private double gpa;

    //để map xuống table ta cần tạo những điều sau: constructor rỗng, constructor full tham số, getter,setter,toString
    //phải chuột//generate

    //ĐOẠN CODE QUAN TRỌNG, BẮT BUỘC PHẢI LÀM, NHƯNG NHÀM CHÁN, BOILER-PLATE

    public Student() {
    }
    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", yob=" + yob +
                ", gpa=" + gpa +
                '}';
    }
}
