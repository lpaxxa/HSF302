package com.lpaxxa.superapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        try {

            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=HSF302;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "12345";
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, user, pass);
            System.out.println("Connect to DB successfully");

            //BẮT ĐẦU LẤY DATA TỪ TABLE, THÔNG QUA SỰ QUẢN LÍ CỦA BIẾN CONN
            String query = "SELECT * FROM subject";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();//thực thi câu quẻy và trả về obj và
            //chưá toàn bộ các dòng của table, ta tự lấy từng dòng của table, ta tự lấy từng dòng, lấy từng cột !!! KHỔ CỰC
            //TA PHAI NHỚ CẢ TÊN CỘT CỦA TABLE THÌ MỚI LẤY ĐC DATA
            // VÌ CÓ NHIỀU DÒNG, TA PHẢI LÀM RESULT SET
            while (rs.next()) { //duyệt qua từng dòng
                String code = rs.getString("code"); //lấy từng tên cột của mỗi dòng
                String name = rs.getString("name");
                int credit = rs.getInt("credits");
                int hours = rs.getInt("studyhours");
               // System.out.println( code + "| " + name +"| "  + credit +"| "  + hours + "| " );


                System.out.printf("|%10s|%-40s|%2d|%4d|\n", code, name, credit, hours);
            }
            conn.close();//đóng kết nối


        } catch (Exception ex) {
            ex.printStackTrace();
        }

        }
    }
