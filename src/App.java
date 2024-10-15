import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
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

                      
            while ((line = reader.readLine()) != null) {
                ProcessBuilder pb = new ProcessBuilder("java", "src/net/salesianos/replacer/Replacer.java", line);
                processBuilders.add(pb);
                outputFiles.add(new File("./files/outputs/output_" + lineNumber + ".txt"));
                lineNumber++;
            }

            List<Process> processes = new ArrayList<>();
            for (ProcessBuilder pb : processBuilders) {
                processes.add(pb.start());
            }

               for (int i = 0; i < processes.size(); i++) {
                Process process = processes.get(i);
                process.waitFor();
                BufferedReader processReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFiles.get(i)));
                String processLine;
                while ((processLine = processReader.readLine()) != null) {
                    writer.write(processLine);
                    finalWriter.write(processLine);
                    finalWriter.newLine();
                    writer.newLine();
                }
                writer.close();
                processReader.close();
            }

            finalWriter.close();
            reader.close();


        

       } catch (Exception e) {
        
       } 
    }
}
