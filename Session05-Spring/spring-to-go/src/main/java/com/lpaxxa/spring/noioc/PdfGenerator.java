package com.lpaxxa.spring.noioc;

//thằng này đóng vai dependency đc dùng ở OrderService class
// class xử lý đơn hàng, class ContractService xử lí hợp đồng
// thằng này phaiir đc new và đc chích vào!!!
public class PdfGenerator {
    // code phức tạp, dùng thêm dêpndency khác trên mvnrepository.com để generate ra pdf

    //và có hàm chính generate()
    public void generateFile(String fileName){
        System.out.println("PDF file " + fileName + "PDF generated successfully");
    }
}
