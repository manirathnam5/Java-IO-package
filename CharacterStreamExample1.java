import java.io.*;

class CharacterStreamExample1{
	

	public static void main(String[] arg) throws IOException{


    char[] array = {'H','e','l','l','o'};

		try{
			CharArrayReader  cis = new CharArrayReader(array);
            System.out.println("The character reader from reader");
            int charRead;

while ((charRead=cis.read())!=-1) {  
                System.out.print((char)charRead+",");  
            }  
            
		}
          
		catch(Exception io){
            	System.out.println(io.getMessage());
            }
     
	}
}