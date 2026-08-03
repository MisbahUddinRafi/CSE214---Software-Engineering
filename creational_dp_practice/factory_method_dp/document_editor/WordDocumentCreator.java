package creational_dp_practice.factory_method_dp.document_editor;

public class WordDocumentCreator extends DocumentCreator {
    
    @Override 
    public Document createDocument(String name) {
        return new WordDocument(name); 
    }
}
