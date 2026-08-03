package creational_dp_practice.factory_method_dp.document_editor;

public class PDFCreator extends DocumentCreator {
    
    @Override
    public Document createDocument(String name) {
        return new PDFDocument(name); 
    }
}
