package com.lpaxxa.fap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lpaxxa.fap.entity.Employee;
import com.lpaxxa.fap.entity.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Student s1 = new Student("SE1", "An Nguyen", 2004, 8.6);
        System.out.println(s1.toString());
        System.out.println(s1);//gọi thầm tên em toString

        //ta xài các hàm tự generate trong class Employee
        Employee e1 = new Employee("E1", "Bình Lê", 2000, 10_000_000);// _ phân cách phần ngàn trong code
        System.out.println(e1.toString());
        System.out.println(e1);//gọi thầm tên em toString

        //TA SẼ CHƠI VỚI THƯ VIỆN JACKSON, LÀ BỘ THƯ VIỆN
        //GIÚP TA LÀM VIỆC VỚI JSON THEO 2 CHIỀU
        //TỪ OBJECT -> CHUỖI JSON
        // TỪ CHUỖI JSON -> OBJECT TRONG CODE

        ObjectMapper mapper = new ObjectMapper();
        String e1Json = mapper.writeValueAsString(e1);
        //mapper là 1 object có khả năng biến đổi info đang có trong 1 obj khác thành 1 String gọi là JSON
        System.out.println(e1Json);//chuỗi json đó em

        //từ json thành object
        String e2Json = """
                {"id":"E1","name":"Cường Võ","yob":2004,"salary":1000000}"""; //raw string (2 nháy đôi), chuỗi nguyên bản, có sao để vậy
        Employee e2 = mapper.readValue(e2Json, Employee.class);
        System.out.println("E2 từ JSON thành object: \n" + e2.toString());
    }
}