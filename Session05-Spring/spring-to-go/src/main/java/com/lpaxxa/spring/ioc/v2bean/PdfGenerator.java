package com.lpaxxa.spring.ioc.v2bean;

//ko @ ở đây, thf phải @ chỗ khác để new giúp...
public class PdfGenerator {
    public void generateFile(String fileName){
        System.out.println("V2-> PDF file " + fileName + "PDF generated successfully");
    }
}
