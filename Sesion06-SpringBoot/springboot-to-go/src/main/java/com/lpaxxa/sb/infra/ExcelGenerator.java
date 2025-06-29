package com.lpaxxa.sb.infra;

//@Component //- ko new tự động thì có thể tự new qua @Bean
public class ExcelGenerator {
    //thỏa nguyên lí SRP - Single Responsibility Principle
    //tui chỉ giỏi làm 1 việc !!!
    public void generateExcel(String fileName) {
      //TODO: logic code geenerate excel file
        //giả code để chạy đc việc khác, gọi là MOCK
        System.out.println("Generating Excel file: " + fileName + ".xlsx has been generated successfully.");
    }
}
