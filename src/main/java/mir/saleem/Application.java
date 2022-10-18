package mir.saleem;

import mir.saleem.converter.PdfToTextConverter;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application Started");
        new Application().start();
        System.out.println("Application Stopped");
    }

    public void start(){
        PdfToTextConverter pdfToTextConverter = new PdfToTextConverter();
        pdfToTextConverter.convert(new File("C:\\Programming-Stuff\\Unix commands.pdf"));
    }
}
