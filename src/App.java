import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       try {
        File inputFile = new File("./files/contenido.txt");
                File outputFile = new File("./files/output.txt");
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter finalWriter = new BufferedWriter(new FileWriter(outputFile));
                String line;
                int lineNumber = 1;
                List<ProcessBuilder> processBuilders = new ArrayList<>();
                List<File> outputFiles = new ArrayList<>();

       } catch (Exception e) {
        
       } 
    }
}
