package com.lpaxxa.spring.noioc;

public class MainNoIoC {
    public static void main(String[] args) {
        //CHỦ ĐỘNG NEW DEPENDENCY, TỤ QUẢN LÍ NÓ
        PdfGenerator pdfGenerator = new PdfGenerator();
        pdfGenerator.generateFile("202500612000001.pdf");
        //MAIN LÀ NƠI CHỨA OBJ DEPENDENCY, NÓ CÒN GỌI LÀ CONTAINER

    }
}
