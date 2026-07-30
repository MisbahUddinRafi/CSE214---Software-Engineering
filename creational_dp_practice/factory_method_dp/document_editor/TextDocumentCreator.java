package factory_method_dp.document_editor; 

public class TextDocumentCreator extends DocumentCreator {

    @Override 
    public Document createDocument(String name) {
        return new TextDocument(name); 
    }
}