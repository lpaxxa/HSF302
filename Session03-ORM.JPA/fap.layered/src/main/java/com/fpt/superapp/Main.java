package com.fpt.superapp;

import com.fpt.superapp.entity.Student;
import com.fpt.superapp.service.StudentService;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //insert 2 sinh viên, sau đó show tất cả
      //  Student anh = new Student("SE10", "An Nguyễn", 2006, 8.6);
//Nhờ service giúp
        StudentService studentService = new StudentService();
//        studentService.insertStudent(anh);
//        // đưa obj trực tiếp thay vì dùng biến lẻ
//        studentService.insertStudent(new Student("SE11", "Bình Lê", 2006, 8.7));
//        //Show ALL
        List<Student> result = studentService.getStudent();;
        //TRẢ VỀ LIST TA CẦN DÙNG VÒNG LẶP ĐỂ IN RA
        //CÓ HỂ IN BẰNG FOR TRUYỀN THỐNG, HOẶC BIÊU THỨC LAMBDA
        System.out.println("List of Students:");
        result.forEach(x -> System.out.println(x)); //gọi thầm tên em

        //CẬP NHẬT BẠN BÌNH LÊ SE2 ĐIỂM 10
       // Student binh10 = new Student("SE11", "Bình Lê", 2007, 10.0);
      //  studentService.updateStudent(binh10);

        //Lấy từ DB
      //  Student binhDB = studentService.getStudent("SE11");
     //   System.out.println("Updated Student BINHDB: " + binhDB);

        Student han = new Student("SE14", "Han Nguyễn", 2006, 8.6, "Hoi An");
        Student longg = new Student("SE15", "Long Nguyễn", 2006, 8.6, "Hoi An");
        Student trong = new Student("SE16", "Trong Nguyễn", 2006, 8.6, "TPHCM");
//        studentService.insertStudent(han);
//        studentService.insertStudent(longg);
//        studentService.insertStudent(trong);
          studentService.searchByNameOrAddress("trong", "TPHCM")
                .forEach(x -> System.out.println("Search Result: " + x));

    }
}

