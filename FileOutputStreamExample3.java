import java.io.*;

class FileOutputStreamExample3 {

    public static void main(String[] arg ){

    try{

        FileOutputStream  fout = new FileOutputStream("E:\\Sandbox\\test.txt");

        String str = "Welcome to programming";

        byte[] bytes = str.getBytes();

        fout.write(bytes);

        fout.close();

        System.out.println("Success");
    }

    catch(Exception e  ){
        System.out.println("Please check the path");
    }

    } 


      }