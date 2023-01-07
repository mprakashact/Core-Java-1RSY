package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyDemo 
{
    public static void main(String[] args) 
    {
      try
      {
        InputStream input=new FileInputStream("C:\\Users\\Prakash M\\Desktop"); // FileInputStream();
        OutputStream output= new FileOutputStream("C:\\Users\\Prakash M\\Desktop");
        int content=input.read();
         while(content !=-1)
         {
            output.write(content);
            content=input.read();
         }
         output.flush();
      }
      catch (FileNotFoundException e) {e.printStackTrace();} 
      catch (IOException e) {e.printStackTrace();}
    }
}