package com.lpaxxa.spring.ioc.v3di;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    //xài dêpndency và chích vào qua constructor
    private PdfGenerator pdfGenerator;
    public OrderService(PdfGenerator pdfGenerator) {
        this.pdfGenerator = pdfGenerator;
    }

    //xài dependencyy đc new và đưa vào từ ngoài, IoC container bên Main
    public void generateFile(String fileName){
        pdfGenerator.generateFile(fileName);
    }
}
