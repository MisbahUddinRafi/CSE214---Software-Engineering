package factory_method_dp.document_editor;

public class Main {

    public static void main(String[] args) {

        DocumentCreator creator;

        creator = new PDFCreator();
        creator.processDocument("CSE205 Notes.pdf");

        creator = new WordDocumentCreator();
        creator.processDocument("Assignment.docx");

        creator = new TextDocumentCreator();
        creator.processDocument("README.txt");
    }
}