package com.lpaxxa.superapp.entity.unione;


//1  CHUYÊN NGÀNH CÓ NHIỀU SINH VIÊN - 1 TO M, ONE TO MANY

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
//Non-3NF là phụ thuộc bắc cầu, nếu join student and major - studentid->majorId->description
// ưu điểm: lấy dữ liệu dễ và lẹ
//cón: ảnh hưởng đến tính nhất quán của dữ liệu, description của major thay đổi, thì phải cập nhật lại tất cả student có major đó, hoặc cái thay đổi sẽ không giống những cái khác

//@Entity
//@Table(name = "Major")
public class Major {

    @Id
    @Column(name="Id", columnDefinition = "CHAR(2)")//  mã chuyên ngành 2 kí tự
    private String id;
    @Column(name = "Name", columnDefinition = "NVARCHAR(50)",nullable = false)
    private String name;

    //ÁNH XẠ LẠI MỐI QUAN HỆ 1 - N, 1 MAJOR CÓ NHIỀU SINH VIÊN, NHÌN ĐUNGS VẾ NÀY
    //THÌ GỌI LÀ UNI-DIRECTIONAL RELATIONSHIP, MỐI QUAN HỆ DỌC THEO 1 CHIỀU

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)  // dính đến DB, tạo khóa ngoại đấy em! FK bên Student
    @JoinColumn(name = "MajorId")// tên cột FK ở bên table Student
    private List<Student> students = new ArrayList<>();

    //students.add() đc viết ở đâu????
    //NGUYÊN LÝ S TRONG SOLID: SINGLE RESPONSIBILITY
    //CHÍNH MAJOR NÊN HÀM ADD STUDENT() CHUYÊN NGÀNH CÓ THÊM SV
    // 3 CÁCH VIẾT
    //1.students TRỞ THÀNH PUBLIC students.add(....) --- vi phạm nguyên lý encapsulation
    //2. THÊM 1 HÀM GET trả về students() giống như  getYob()
    //cách này ổn về get() nhưng cho nguyên list, ta có thể xóa, sort... ko tốt
    //3. TẠO HÀM ADD(), USER BÊN NGOÀI .addStudent(obj){
    //students.add(obj)

    //new Students oử đâu ko cần biết, đưa vùng ram đó vào student list
    public void addStudent(Student obj) {
        students.add(obj);
    }
    //getStudentList() để xem 1 chuyên ngành có đúng nhiều sv hay không
    //y chang getYob() return Yob
    public List<Student> getStudents() {
        return students;
    }



    public Major() {
    }

    public Major(String id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Major{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
