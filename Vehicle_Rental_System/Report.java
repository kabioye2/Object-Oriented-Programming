package Assignment2.Q2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Report {

    public static void printToConsole(Reportable reportable) {

        System.out.print(reportable.generateReport());
    }
    
    public static void persistToCSV(Reportable reportable, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));
        writer.write(reportable.generateReport());
        writer.close();
    }
    
}
