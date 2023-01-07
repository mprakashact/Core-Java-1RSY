package InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileFolderDemo 
{
    public static void main(String[] args) throws IOException 
    {
    /**-----------------------------------------------------------------**/
        // File file=new File("C:\\Users\\Prakash M\\Desktop\\Raja\\Rani\\Manthiri");
        // boolean present=file.exists();
        // System.out.println("Folder prsent: "+present);

        // if(present==false)
        //  file.mkdirs();

        // present=file.exists();
        // System.out.println("Folder prsent: "+present);
    /**-----------------------------------------------------------------**/
    // File file=new File("C:\\Users\\Prakash M\\Desktop\\Raja\\test.txt");

    // boolean present=file.exists();
    // if(present==false)
    //     try {
    //         boolean created=file.createNewFile();
    //         System.out.println("File Created: "+created);
    //     } catch (IOException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
                // }
     /**-----------------------------------------------------------------**/
    //  File file=new File("C:\\Users\\Prakash M\\Desktop\\Raja\\test.txt");
    //  file.delete();
     
    //  boolean present=file.exists();
    //  System.out.println("File prsent: "+present);
    //  /**-----------------------------------------------------------------**/
    //  File file=new File("C:\\Users\\Prakash M\\Desktop\\Raja\\test.txt");
    //  file.createNewFile();
    //  File newName=new File("C:\\Users\\Prakash M\\Desktop\\Raja\\hakunamatata.txt");
    //  boolean renameSuccess=file.renameTo(newName);
    //  System.out.println("renameSuccess: "+renameSuccess);

    //  //File name:
    //  System.out.println("File Name: "+newName.getName());
    //  System.out.println(file.canExecute()); 
    //  System.out.println(file.canRead()); 
    //  System.out.println(file.canWrite()); 
    /**-----------------------------------------------------------------**/
    // File file=new File("C:\\Users\\Prakash M\\Desktop");
    // String[] listOfFilesFolders = file.list();
    // // for(int i=0; i<listOfFilesFolders.length; i++)
    // //  System.out.println(listOfFilesFolders[i]);
    // for(String s:listOfFilesFolders)
    //  System.out.println(s);
    /**-----------------------------------------------------------------**/
    // File file=new File("C:\\Users\\Prakash M\\Desktop");
    // File[] fileFolderList=file.listFiles();
    // for (File f: fileFolderList)
    //  if(f.isDirectory())
    //   System.out.println(f);
    /**-----------------------------------------------------------------**/
    // File file=new File("C:\\Users\\Prakash M\\Desktop\\Raja");
    // File[] fileFoldeArrary=file.listFiles();
    // for(File f:fileFoldeArrary)
    // //  System.out.println(f);
    // {
    // if(f.isFile())
    //  {
    //  String fileName=f.getName();
    //  int lastDot=fileName.lastIndexOf(".");
    //  String extension=fileName.substring(lastDot+1);
    //  if(extension.equals("txt"))
    //  f.delete();
    // //   if(f.length()>5000)
    // //     System.out.println(fileName+"Size :"+f.length());
    //  }
    /**-----------------------------------------------------------------**/
    // File file=new File("C:\\Users\\Prakash M\\Desktop\\Raja\\abc.txt");
    // try
    // {
    //     file.createNewFile();
    //     FileWriter writer=new FileWriter(file);
    //     writer.write(65);
    //     writer.write(" How are You");
    
    //     writer.flush();
    //     writer.close();

    //     FileReader fileReader=new FileReader(file);
    //     char[] ch=new char[(int)file.length()];
    //     System.out.println(ch.length);
    //     fileReader.read(ch);
        
    //     for(char ch1: ch)
    //      System.out.print(ch1);

    //     // int output = fileReader.read();
        
    //     // while(output!=-1)
    //     //  {
    //     //     System.out.print((char)output);
    //     //     output=fileReader.read();
    //     //  }
    // }
    // catch(IOException e){e.printStackTrace();}
    // /**-----------------------------------------------------------------**/
    File file=new File("C:\\Users\\Prakash M\\Desktop\\Raja\\abc.txt");

    FileWriter fWriter;
    try
     {
        // fWriter=new FileWriter(file, true);
        // BufferedWriter bWriter = new BufferedWriter(fWriter);
        // bWriter.write("Tamil");
        // bWriter.newLine();   
        // bWriter.write("English");
        // bWriter.newLine();   
        // bWriter.write("Mathematics");
        // bWriter.flush();
        // bWriter.close();

        FileReader fReader=new FileReader(file);
        BufferedReader bReader=new BufferedReader(fReader);
        String line=bReader.readLine();
        int lineCount=0;
        int sentenceCount=0;
        int wordCount=0;
        int charCount=0;

        while(line!=null)
        {
            String[] sentence=line.split("[.]");
            sentenceCount = sentenceCount+sentence.length;
            String[] words=line.split(" ");
            wordCount=wordCount+words.length;
            System.out.println(line);
            charCount=charCount+line.length();
            lineCount++;

            line=bReader.readLine();
        }

        System.out.println("No. of lines "+lineCount);
        System.out.println("No. of sentences "+sentenceCount);
        System.out.println("No. of words "+wordCount);
        System.out.println("No. of charcters "+charCount);

     }
    catch (IOException e)
     {
        e.printStackTrace();
     }
    }
}