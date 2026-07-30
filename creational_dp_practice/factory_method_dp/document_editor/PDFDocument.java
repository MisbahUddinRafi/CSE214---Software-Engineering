package factory_method_dp.document_editor;

public class PDFDocument implements Document {
    private String name; 

    public PDFDocument(String name) {
        this.name = name; 
    }

    @Override
    public void close() {
        System.out.println("Closing PDF Document: " + name);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + name);
    } 
    
}
