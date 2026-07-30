package factory_method_dp.document_editor;

public abstract class DocumentCreator {
    protected Document document; 

    abstract Document createDocument(String name); 
    
    public void processDocument(String name) {
        Document d = createDocument(name); 
        d.open(); 
        d.close();
    }
}
