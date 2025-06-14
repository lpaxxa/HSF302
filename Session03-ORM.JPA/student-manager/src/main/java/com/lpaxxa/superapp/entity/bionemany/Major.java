package com.lpaxxa.superapp.entity.bionemany;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Major")
public class Major {
    @Id
    @Column(name = "Id", columnDefinition = "CHAR(2)") // mã chuyên ngành 2 kí tự
    private String id;
    @Column(name = "name", columnDefinition = "NVARCHAR(80)")
    private String name;

    //mảo nào đó thì có 1 danh sách SV thuộc về. 1 Major có nhiều sv
    //cascade = ALL: nếu major bị xóa, thì tất cả sv thuộc về major này cũng sẽ bị xóa,
    // nếu major bị sửa, thì tất cả sv thuộc về major này cũng sẽ bị sửa
    //fetch = FetchType.EAGER: mỗi lần gọi major lên, sẽ tự động gọi cả danh sách sv thuộc về major này
    @OneToMany( mappedBy = "major", cascade = CascadeType.ALL, fetch= FetchType.EAGER)
    private List<Student> stuList = new ArrayList<>();

    // TA CẦN HÀM ADD 1 SV VÀO DANH SÁCH CỦA CHUYÊN NGÀNH
    // TA CŨNG CẦN HÀM REMOVE 1 SV KHỎI DANH SÁCH, SV ĐỔI NGÀNH
    // TA THAO TÁC TRÊN stulist.add(), stuList.remove() code dùng hàm của JDk ArrayList
    public void addStudent(Student obj) {
        stuList.add(obj);
        obj.setMajor(this);// cực kì quan trọng, 2 chiều đó em
        //stulist đã có sv rồi, 5 bạn lận
        //nhưng mỗi sv obj phải tự vỗ ngực: tui thuộc về chuyên ngành

    }
    public void removeStudent(Student obj) {
        stuList.remove(obj);// NẾU RA KHỎI NHÓM MAJOR
        obj.setMajor(null);//THÌ CHÍNH MÌNH OBJ SINH VIÊN CX SẼ CẮT LUÔN INFO CHUYÊN NGÀNH!!!!
    }
    //câu hỏi: hãy cho tôi danh sách sinh viên của chuyên ngành này!!!
    //HÀM GET() TRUYỀN THỐNG, TỰ VIẾT HOẶC GENERATE TỰ DỘNG
    public List<Student> getStudents() {
        return stuList;
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
        //in đẹp trai
        return String.format("| %2s | %-50s |\n", id, name);
//        return "Major{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                '}';
    }
}
