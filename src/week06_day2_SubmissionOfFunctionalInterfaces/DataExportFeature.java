package week06_day2_SubmissionOfFunctionalInterfaces;

interface DataExporter {
    void export(String data);

    default void exportToJSON(String data) {
        System.out.println("Exporting to JSON: {\"data\":\"" + data + "\"}");
    }
}

class CSVExporter implements DataExporter {
    public void export(String data) { System.out.println("Exporting to CSV: " + data); }
}

class PDFExporter implements DataExporter {
    public void export(String data) { System.out.println("Exporting to PDF: " + data); }
}

public class DataExportFeature {
    public static void main(String[] args) {
        DataExporter csv = new CSVExporter();
        DataExporter pdf = new PDFExporter();
        csv.export("Report");
        pdf.export("Invoice");
        csv.exportToJSON("Report");
    }
}
