package com.lpaxxa.superapp.entity.unione;

import com.lpaxxa.superapp.infra.JPAUtil;
import jakarta.persistence.EntityManager;

public class MainUniOne {
    public static void main(String[] args) {
        //createMajorsStudents();
        printStudentsFromMajor();

    }

    public static void createMajorsStudents(){

        Major seMajor = new Major("SE","SOFTWARE ENGINEERING");
        Major gdMajor = new Major("GD","GRAPHIC DESIGN");

        Student se1 = new Student("SE100", "An Nguyen",2004,8.6);
        Student se2 = new Student("SE101", "Binh Le",2004,8.7);
        Student gd1 = new Student("SE102", " Cuong Vo",2004,8.6);
        Student gd2 = new Student("SE103", "Dung Pham",2004,8.7);

        //SE CÓ 2 SINH VIÊN
        seMajor.addStudent(se1); //vẫn RAM, vẫn OOP
        seMajor.addStudent(se2);
        //GD CÓ 22 SINH VIÊN
        gdMajor.addStudent(gd1);
        gdMajor.addStudent(gd2);
        EntityManager em = JPAUtil.getEnityManager();
       em.getTransaction().begin();
       em.persist(seMajor); //MAJOR có sẵn list sinh viên bên trong
       em.persist(gdMajor); // major xuống table, thì sv ăn theo luôn
                            // 1 xuống, n xuống luôn -> ĐỔ DOMINO CASCADE
        em.getTransaction().commit();
        em.close();


    }

    public static void printStudentsFromMajor(){
        EntityManager em = JPAUtil.getEnityManager();
        Major major = em.find(Major.class, "SE");// tìm chuyên ngành SE
        System.out.println("List of students of SE major");
        major.getStudents().forEach(x -> System.out.println(x));
        //2 sv An va Binh returns


        em.close();
    }

}
