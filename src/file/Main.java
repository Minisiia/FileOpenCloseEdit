package file;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {  // варіант із try...catch у 4 завданні
        File file = new File("SimpleText.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("I'm so sleepy");
        bw.flush();
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = "";
        int temp;
        for (; ; ) {
            temp = br.read();
            if (temp == -1) break;
            s += (char) temp;
        }
        System.out.println("Text from " + file.getName());
        System.out.println(s);
        br.close();
    }
}
