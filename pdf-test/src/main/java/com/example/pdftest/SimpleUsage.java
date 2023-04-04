package com.example.pdftest;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author licocon
 */
public class SimpleUsage {
    public static void main(String[] args) throws Exception {

        try (OutputStream os = Files.newOutputStream(Paths.get("/Users/licocon/Downloads/out.pdf"))) {
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.useFastMode();
            builder.withUri("file://////Users/licocon/study/some-demo/pdf-test/src/main/resources/123.html");
            builder.toStream(os);
            builder.run();
        }
    }
    @GetMapping("/test")
    public void test(){

    }
}