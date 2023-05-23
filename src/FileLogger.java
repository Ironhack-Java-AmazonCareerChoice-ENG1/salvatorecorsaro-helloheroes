import java.io.*;
import java.time.ZonedDateTime;
import java.util.Random;

public class FileLogger {
    public static void main(String[] args) throws IOException, InterruptedException {
//        loggerDemo();
        readerDemo();

    }

    private static void readerDemo() throws IOException {
        File textFile = new File("latin_text.txt");
        BufferedReader reader = new BufferedReader(new FileReader(textFile));
        String line;

        System.out.println("Start of the reading");
        System.out.println("=================== \n");
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
        System.out.println("\n=================== ");
        System.out.println("End of the reading");
        reader.close();
    }

    private static void loggerDemo() throws IOException, InterruptedException {
        File file = new File("logs.txt");
//        System.out.println(file.exists());
//        System.out.println(file.createNewFile());
//        System.out.println(file.exists());
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        for(int i = 0; i < 5; i++){
            String log = ZonedDateTime.now() + " - code has been executed\n"; // time + some string
            writer.write(log);
            System.out.println("Data has been logged!");
            Random random = new Random();
            Thread.sleep(random.nextLong(1, 7) * 100);
        }
        writer.close();
    }
}
