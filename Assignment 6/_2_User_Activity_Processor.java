import java.io.*;
import java.util.*;

public class _2_User_Activity_Processor {
    public static void main(String[] args) {
        Map<String, Integer> activityCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("activity.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String user = parts[0];

                activityCount.put(user, activityCount.getOrDefault(user, 0) + 1);
            }

            String maxUser = "";
            int max = 0;

            for (String user : activityCount.keySet()) {
                if (activityCount.get(user) > max) {
                    max = activityCount.get(user);
                    maxUser = user;
                }
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter("activity_summary.txt"));
            for (String user : activityCount.keySet()) {
                bw.write(user + " -> " + activityCount.get(user) + "\n");
            }

            bw.write("\nMost Active User: " + maxUser);
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}