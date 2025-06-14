package com.lpaxxa.superapp.entity.bionemany;

import jakarta.persistence.*;

@Entity
@Table(name="Student")
public class Student {
    @Id
    @Column(name = "Id", columnDefinition = "CHAR(10)") // mã chuyên ngành 2 kí tự
    private String id;
    @Column(name = "name", columnDefinition = "NVARCHAR(80)", nullable = false)
    private String name;

    @Column(name = "Yob", nullable = false)
    private int yob;
    @Column(name = "Gpa")
    private double gpa;

    //hàm này giúp kết nối bên kia mappedBy = "major"
    @ManyToOne
    @JoinColumn(name = "MajorId") // tên cột FK ở bên table Student
    //JoinColumn: chỉ có 1 trong 2 thằng giữ
    private Major major;
    //có chỗ nào để gán major cho 1 sv cụ thể, bạn tham gia vào Major nào
    //hoặc đưa vào qu constructor hoặc hàm set() truyền thống
    public void setMajor(Major obj) {
        this.major = obj;
    }
    // HÀM GET MAJOR ĐỂ NÓI CHUYỆN VỚI NHAU KIỂU: MÀY HỌC CHUYÊN NGÀNH GÌ ?
    public Major getMajor() {
        return major;
    }


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
    //in đẹp trai
        return String.format("| %8s | %20s | %4d | %4.1f |\n", id, name, yob, gpa);
//        return "Student{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", yob=" + yob +
//                ", gpa=" + gpa +
//                '}';
    }
}
