package com.fpt.superapp.service;

import com.fpt.superapp.entity.Student;
import com.fpt.superapp.repository.StudentRepo;

import java.util.List;

public class StudentService {
    //MÔ HÌNH HOẠT ĐỘNG
    //ƯEB/UI -----SERVICE ------REPO -----UTIL -----TABLE
    //L1           L2           L3
    //3-LAYER ARCHITECTURE
    //THẰNG NÀY SẼ CẦN REPO ĐỂ SAVE OBJ XUỐNG DB, HOẶC LẤY DATA TỪ DB BIẾN THÀNH OBJ ĐEM LÊN THẰNG NÀY
    //NEW REPO THOẢI MÁI KO SỢ GÌ CẢ, PHẦN FACTORY BỊ CHE KÍN Ở TẦNG REPO RỒI, UTIL
    private StudentRepo studentRepo = new StudentRepo();

    //cHỨA CÁC HÀM CRUD STUDENT NHƯNG Ở GÓC ĐỘ THÂN QUEN USER/GUI
    //TÊN HÀM ĐẸP HƠN, RÕ NGHĨA HƠN
    public void insertStudent(Student obj) {
        studentRepo.save(obj); //chuyền banh cho repo lo

    }
    public List<Student> getStudent() {
        return studentRepo.findAll();
    }

    public Student getStudent(String id) {
        return studentRepo.findById(id);
    }

    public void deleteStudent(String id) {
        //xóa theo id
        studentRepo.deleteById(id);
    }

    public void updateStudent(Student obj) {
        studentRepo.update(obj);
    }
}
