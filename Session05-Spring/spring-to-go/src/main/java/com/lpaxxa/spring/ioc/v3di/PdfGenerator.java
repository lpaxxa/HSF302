package com.lpaxxa.spring.ioc.v3di;

import org.springframework.stereotype.Component;

@Component

public class PdfGenerator {
    public void generateFile(String fileName){
        System.out.println("V3 DI-> PDF file " + fileName + "PDF generated successfully");
    }
}
