package com.lpaxxa.superapp.entity.unimany;

import com.lpaxxa.superapp.infra.JPAUtil;
import jakarta.persistence.EntityManager;

public class MainUniMany {
    public static void main(String[] args) {
createMajorsStudents();
    }
    public static void createMajorsStudents() {
        Major seMajor = new Major("SE", "SOFTWARE ENGINEERING");
       // Major gdMajor = new Major("GD", "GRAPHIC DESIGN");
        Student se1 = new Student("SE100", "An Nguyen", 2004, 8.6);
        Student se2 = new Student("SE101", "Binh Le", 2004, 8.7);

        se1.setMajor(seMajor);
        se2.setMajor(seMajor);
        EntityManager em = JPAUtil.getEnityManager();
        em.getTransaction().begin();
        em.persist(seMajor);// CASCASDE HOK ĐC DO MAJOR Ô ĐƠN KO CHỨA LIST SV
        em.persist(se1); // Mỗi SV có FK MajorId
        em.persist(se2);
        em.getTransaction().commit();
        em.close();
    }
    public static void printStudentsFromMajor() {
        // Implementation for printing students from a major
    }
}
