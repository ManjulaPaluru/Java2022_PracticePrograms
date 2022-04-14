package JavanterviewPrograms;

import java.io.*;
import java.util.Scanner;

public class ReadDataInToFile {

    public static void main(String[] args) throws IOException,FileNotFoundException {

        //Approach 1: using Filereader and bufferreader class:

       FileReader fr=new FileReader("/Users/mpaluru/Desktop/Testing/Text.txt");
       BufferedReader br = new BufferedReader(fr);
       String str;
      while((str=br.readLine())!=null)
        {
          System.out.println(str);
      }

//Approach 2: using File and Scanner classes for reading data from text file
        System.out.println("+++++++++++++++++++++++++++++++++++++++=");
            File file= new File("/Users/mpaluru/Desktop/Testing/Text.txt");
            Scanner sc= new Scanner(file);
            //loop start
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }


        //Approach 3: using   File and scanner class with delimiter method
        System.out.println("+++++++++++++++++++++++++++++++++++++++=");
        File file1 = new File("/Users/mpaluru/Desktop/Testing/Text.txt");
        Scanner sc1=  new Scanner(file1);

        sc1.useDelimiter("\\Z");// this one is matching each and every line in the text file
        System.out.println(sc1.next());

    }
}
