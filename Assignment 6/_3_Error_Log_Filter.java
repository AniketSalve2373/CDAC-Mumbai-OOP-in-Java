import java.io.*;

public class _3_Error_Log_Filter {
    public static void main(String[] args) {
        int errorCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("system.log"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("error.log"))) {

            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains("ERROR")) {
                    bw.write(line + "\n");
                    errorCount++;
                }
            }

            System.out.println("Total Errors: " + errorCount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}