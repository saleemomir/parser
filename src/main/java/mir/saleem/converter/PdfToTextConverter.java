package mir.saleem.converter;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class PdfToTextConverter extends Converter<String>{
    @Override
    public String convert(File f) {
        if(f == null || !f.canRead() || !f.exists()){
            System.out.println("Invalid file");
            return null;
        }
        String parsedText;
        PDFParser parser = null;
        try {
            parser = new PDFParser(new RandomAccessFile(f, "r"));
            parser.parse();

            COSDocument cosDoc = parser.getDocument();
            PDFTextStripper pdfStripper = new PDFTextStripper();
            PDDocument pdDoc = new PDDocument(cosDoc);
            parsedText = pdfStripper.getText(pdDoc);

            return parsedText;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
