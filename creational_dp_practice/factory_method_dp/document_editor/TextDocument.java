package factory_method_dp.document_editor;

public class TextDocument implements Document {
    private String name;

    public TextDocument(String name) {
        this.name = name;
    }

    @Override
    public void close() {
        System.out.println("Closing Text Document: " + name);
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + name);        
    } 

    

}
