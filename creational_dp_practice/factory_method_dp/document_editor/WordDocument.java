package factory_method_dp.document_editor;

public class WordDocument implements Document {
    private String name; 

    public WordDocument(String name) {
        this.name = name; 
    }

    @Override
    public void close() {
        System.out.println("Closing Word Document: " + name);
    }

    @Override
    public void open() {
        System.out.println("Opening Word Document: " + name);
    } 
}
