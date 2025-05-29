package com.fpt.superapp.repository;

import com.fpt.superapp.entity.Student;
import com.fpt.superapp.util.JPAUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class StudentRepo {
    //CLASS NÀY CHƠI VỚI FACTORYY, ENTITY_MÂNGER CHUYÊN THẦU VIỆC LÀM VIỆC TRỰC TIẾP VỚI TABLE, ĐẨY DATA XUỐNG TABLE, LẤY DATA TỪ TABLE ĐEM VÀO RAM, NÓ CHỈ CHƠI VỚI TABLE STUDENT, KO QUAN TÂM TABLE KHÁC
    //MỖI CLASS CHỈ TẬP TRUNG 1 LOẠI VIỆC ( BÀI NÀY LÀ CHỈ LÀM STUDENT)
    //ĐÓ LÀ NGUYÊN LÍ CHỮ S TRONG CỤM CHỮ SOLID
    //SINGLE RESPONSIBILITY -> ĐƠN TRÁCH NHIỆM, KO ÔM ĐỒM
    // BẠN CHỈ THẤY CLASS NÀY CÓ CÁC HÀM CRUD TABLE STUDENT!!!
    //TÊN HÀM ĐẶT NGẮN GỌN, VÌ NÓ GẦN CÂU LỆNH SL: INSERT, UPDATE...
    //GỢI Ý: save() update() remove() find() findById() getAll()
    //thường hàm sẽ nhận obj Student vào và cất xuống DB

    public void save(Student obj) {
        // cần sếp Manage từ Util. Nhớ là sửa xóa thay đổi DB phải có transaction để theo dõi,để còn undo sau này!!!
        EntityManager em = JPAUtil.getEnityManager();
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();

    }
    public List<Student> findAll() {
        EntityManager em = JPAUtil.getEnityManager();
        return em.createQuery(" FROM Student", Student.class).getResultList();
    }

    //HÀM XÓA VÀ SỬA
    //SỬA: NHẬN VÀO OBJ, TA ĐÈ LÊN OBJ DANG CÓ - MERGE
    //TABLE CÓ KEY 1, 3, 5
    // TA NHẬN VÀO KEY 4, THÌ THÊM DÒNG MỚI 4
    // NHẬN VÀO KEY 1, UPDATE DÒNG KEY 1, ĐỔ NGANG HẾT
    //XÓA: NHẬN VÀO KEY LÀ ĐỦ
    public void update(Student obj) {
        EntityManager em = JPAUtil.getEnityManager();
        em.getTransaction().begin();
        em.merge(obj); //cập nhật obj
        em.getTransaction().commit();
    }
    public void delete(Student obj) {
        EntityManager em = JPAUtil.getEnityManager();
        em.getTransaction().begin();
        em.remove(obj);
        em.getTransaction().commit();
    }

    public void deleteById(String obj) {
        EntityManager em = JPAUtil.getEnityManager();
        em.getTransaction().begin();
        Student x = em.find(Student.class, obj); //tìm theo id
        em.remove(obj);
        em.getTransaction().commit();
    }

    public Student findById(String id) {
        EntityManager em = JPAUtil.getEnityManager();
        return em.find(Student.class, id); //tìm theo id
    }


}
