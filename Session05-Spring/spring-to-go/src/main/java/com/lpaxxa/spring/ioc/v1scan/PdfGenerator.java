package com.lpaxxa.spring.ioc.v1scan;

import org.springframework.stereotype.Component;

@Component
public class PdfGenerator {
    public void generateFile(String fileName){
        System.out.println("V1 -> PDF file " + fileName + "PDF generated successfully");
    }
}
