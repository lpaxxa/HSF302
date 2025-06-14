package com.lpaxxa.superapp.entity.unimany;

import com.lpaxxa.superapp.entity.unimany.Major;
import jakarta.persistence.*;
import lombok.*;

//@Entity
//@Table(name = "Student")
//@Data
//
//@NoArgsConstructor

public class Student {
    @Id
    @Column(name = "Id", columnDefinition = "VARCHAR(50)")//  mã chuyên ngành 2 kí tự
    private String id;
    @Column(name = "Name", columnDefinition = "NVARCHAR(50)", nullable = false)
    private String name;
    @Column(name = "Yob", nullable = false)
    private int yob;
    @Column(name = "Gpa")
    private double gpa;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }


    //mối quan hệ: 1 SV thuộc 1 chuyên ngành
    @ManyToOne(fetch = FetchType.LAZY)// mỗi lần gọi sv lên, ko cần gọi cả họ major
    @JoinColumn(name = "MajorId") // tên cột FK ở bên table Student
    private Major major;

    //GET SET DEER BIEETS SV THUỘC CHUYÊN NGÀNH NÀO; BEEN KIA THÌ ADD SV VÀO CHUYÊN NGÀNH; XÓA SV KHỎI CHUYÊN NGÀNH
    // public Major getMajor() {
    // public setMajor()

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

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", yob=" + yob +
                ", gpa=" + gpa +
                ", major=" + major.getName() +
                '}';
    }
}

