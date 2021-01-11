package task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Task1 {
    public static void main(String[] args) throws Exception{

        File f = new File("text.txt");

        FileWriter fw = new FileWriter(f);
        fw.write("Hello world!");
        fw.close();

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String s;
        while((s = br.readLine())!=null){
            System.out.println(s);
        }
        fr.close();

    }
}
