package Minsk.Samost.R.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
            String separator = File.separator;
            String path = separator+"Users"+separator+"vekto"+separator+"Desktop"+separator+"1 2.txt";
            File file = new File(path);
            Scanner sc = new Scanner(file);
            //String input = sc.nextLine();
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }

    }
