import java.io.*;
import java.util.*;

class StudentRecord {
    String name, subject;
    int marks;

    StudentRecord(String name, String subject, int marks) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }
}

public class _1_Student_Performance_Analyzer {
    public static void main(String[] args) {
        List<StudentRecord> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                list.add(new StudentRecord(parts[0], parts[1], Integer.parseInt(parts[2])));
            }

            Map<String, Integer> totalMarks = new HashMap<>();
            Map<String, Integer> subjectCount = new HashMap<>();
            Map<String, StudentRecord> topperPerSubject = new HashMap<>();

            for (StudentRecord r : list) {
                totalMarks.put(r.name, totalMarks.getOrDefault(r.name, 0) + r.marks);
                subjectCount.put(r.name, subjectCount.getOrDefault(r.name, 0) + 1);

                topperPerSubject.compute(r.subject, (k, v) -> (v == null || r.marks > v.marks) ? r : v);
            }

            String overallTopper = "";
            int maxMarks = 0;

            BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt"));
            bw.write("----- STUDENT REPORT -----\n");

            for (String name : totalMarks.keySet()) {
                int total = totalMarks.get(name);
                double avg = (double) total / subjectCount.get(name);
                bw.write(name + ": Total = " + total + ", Average = " + avg + "\n");

                if (total > maxMarks) {
                    maxMarks = total;
                    overallTopper = name;
                }
            }

            bw.write("\nSubject Toppers:\n");
            for (String sub : topperPerSubject.keySet()) {
                StudentRecord r = topperPerSubject.get(sub);
                bw.write(sub + ": " + r.name + " (" + r.marks + ")\n");
            }

            bw.write("\nOverall Topper: " + overallTopper);
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}