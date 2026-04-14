import java.io.*;
import java.util.*;

class WordCounterThread extends Thread {
    List<String> lines;
    int count = 0;

    WordCounterThread(List<String> lines) {
        this.lines = lines;
    }

    public void run() {
        for (String line : lines) {
            count += line.split("\\s+").length;
        }
    }
}

public class _4_MultiThreaded_Word_Counter {
    public static void main(String[] args) throws Exception {
        List<String> allLines = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            allLines.add(line);
        }
        br.close();

        int n = 3; // threads
        int chunkSize = allLines.size() / n;

        List<WordCounterThread> threads = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = i * chunkSize;
            int end = (i == n - 1) ? allLines.size() : start + chunkSize;

            WordCounterThread t = new WordCounterThread(allLines.subList(start, end));
            threads.add(t);
            t.start();
        }

        int total = 0;
        for (WordCounterThread t : threads) {
            t.join();
            total += t.count;
        }

        System.out.println("Total Words: " + total);
    }
}