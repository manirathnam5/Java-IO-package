import java.io.*;

class FileOutputStreamExample1{


public static void main(String[] arg){


try{

FileOutputStream  fout = new FileOutputStream("E:\\Sandbox\\test.txt");

fout.write(90);
fout.close();
System.out.println("Success");

}

catch(Exception e){
System.out.println(e);
}


}
}