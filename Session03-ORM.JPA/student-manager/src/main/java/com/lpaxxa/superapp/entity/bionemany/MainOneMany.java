package com.lpaxxa.superapp.entity.bionemany;


import com.lpaxxa.superapp.infra.JPAUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class MainOneMany {
    public static void main(String[] args) {
       // createMajorStudents();
        printStudentsFromMajor();

    }
    public static void printStudentsFromMajor() {
        //đừng quên ông sếp Entity cngs cấp sẵn hàm find() theo PK
        //hoặc tự viết câu lệnh JPQL, truyền vào em.createQuery()
        EntityManager em = JPAUtil.getEnityManager();
        Major major = em.find(Major.class, "SE"); // tìm chuyên ngành SE
        System.out.println( major);
        //ngầu: n toàn bộ sinh viên mà ko cần join sql
        //vì Major chứa List<Student>
        List<Student> stuList = major.getStudents();
        stuList.forEach(x -> System.out.print(x.toString()));

        //2 sv An va Binh returns
        em.close();
    }
    public static void createMajorStudents() {
        Major se = new Major("SE", "SOFTWARE ENGINEERING | KỸ THUẬT PHẦN MỀM");
        Major gd = new Major("GD", "GRAPHIC DESIGN | THIẾT KẾ ĐỒ HỌA");
        Student an = new Student("SE1000", "An Nguyen", 2004, 8.6);
        Student binh = new Student("SE1001", "Binh Le", 2004, 8.7);
        Student cuong = new Student("GD1000", "Cuong Vo", 2004, 8.8);
        se.addStudent(an);
        se.addStudent(binh);
        gd.addStudent(cuong);

        //ram xong ròi, db hoy
        EntityManager em = JPAUtil.getEnityManager();
        em.getTransaction().begin();
        em.persist(se); //se có list sinh viên bên trong
        em.persist(gd); //gd có list sinh viên bên trong
        // khi major xuống table, thì sv ăn theo luôn
        // 1 xuống, n xuống luôn -> ĐỔ DOMINO CASCADE
        em.getTransaction().commit();
        em.close();
    }
}
