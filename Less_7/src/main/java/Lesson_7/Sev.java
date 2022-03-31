package Lesson_7;
import java.io.*;

class AppData {

    public String[] header = new String[4];
    public int[][] data = new int[4][4];

    public void read (){
        try {
            BufferedReader pw = new BufferedReader(new FileReader("Test.csv"));
            String str;
            for (int i = 1; i<=4; i++){
                System.out.println(str=pw.readLine());
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write() {
        try {
            PrintWriter pw = new PrintWriter("Test.csv");
            StringBuilder builder = new StringBuilder();
            for (int i = 1; i <= 3; i++) {
                header[i]= "Value " + i +"; ";
                builder.append("Value " + i);
                builder.append(";");
            }
            builder.append('\n');
            for (int i = 1; i <= 3; i++){
                for (int j = 1; j <= 3; j++){
                    data [i][j]=((i+j)*100);
                    builder.append((i+j)*100);
                    builder.append(";");
                }
                builder.append('\n');
            }
            pw.write(builder.toString());
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

public class Sev {
    public static void main(String[] args) {
        AppData n1 = new AppData();
        n1.write();
        n1.read();
    }
}