/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch156_b6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.DeflaterInputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.InflaterOutputStream;

/**
 *
 * @author Hi-XV
 */
public class Batch156_B6 {
    public static byte[] increaseArray(byte[] arrTemp){
    byte[ ] temp =arrTemp;
    arrTemp = new byte[arrTemp.length +1];
    for(int i= 0; i< temp.length;i++){
        arrTemp[i] = temp[i];
    }return arrTemp;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
//------------ Nén file     -----------------------------------------------------

//       FileOutputStream fos = null;
//        try {
//            File file = new File("C://Users//Hi-XV//Desktop/BaiTap4.txt");
//            FileInputStream fis = new FileInputStream(file);
//            DeflaterInputStream dis = new DeflaterInputStream(fis);
//            
//            byte[] input = new byte[0];
//            int index = -1;
//            int iread = 0;
//            while((iread = dis.read()) != -1){
//                input = increaseArray(input);
//                //nens kieeur byte cho bien iread
//                input[++index] = (byte)iread;
//            }
//           // fos = new FileOutputStream("F://Java_Batch156/fileCompressed.txt");
//            fos = new FileOutputStream("C://Users//Hi-X//Desktop/fileCompressed.txt");
//            fos.write(input,0,input.length);
//            fos.close();
//            System.out.println("File size after compression: " + input.length);
//        } catch (Exception e) {
//        }


// -----------   Nén file cách 2    -------------------------------------------

            try {
            File fileIn = new File("F://Java_Batch156/File.txt");
            FileInputSteam finRead = new FileInputSteam(fileIn);
            File fileOut = new File("F://Java_Batch156/fileCompressed2.txt");
            FileOutputStream foutWrite =new FileOutputStream(fileOut);
            
            DeflaterOutputStream defWrite = new DeflaterOutputStream(foutWrite);
                
            int bread = 0;
            while ((bread = finRead.read()) != -1){
            defWrite.write(bread);
            }
            defWrite.close();
            finRead.close();
            System.out.println("File size after compression " + fileOut.length());
        } 
            catch (Exception e) {
        }


//  ---------- Lấy ra từng phần của đường dẫn   ---------------------------------------

//        String p = "F://Java_Batch156/File.txt";
//        Path path = Paths.get(p);
//        System.out.println("Path is: " +path.toString());
//        System.out.println("Name isa: " +path.getFileName());
//        System.out.println("Root isa: " +path.getRoot());
//        System.out.println("Parent isa: " +path.getParent());
          

// ------------    Giải nén file    ----------------------------------------------
//            FileOutputStream fos = null;
//            try {
//            File file = new File("F://Java_Batch156/fileCompressed.txt");
//            FileInputStream fis = new FileInputStream(file);
//            InflaterInputStream dis = new InflaterInputStream(fis);
//                
//            byte[ ] input = new byte[0];
//            int index = -1;
//            int iRead = 0;
//            while((iRead = dis.read()) != -1){
//                input = increaseArray(input);
//                input[++index ] = (byte)iRead;
//                
//            }
//            fos = new FileOutputStream("F://Java_Batch156/fileDecompressed.txt");
//            fos.write(input,0,input.length);
//            fos.close();
//            
//                System.out.println("File size after decompressed " + input.length);
//            
//        } catch (Exception e) {
//        }
        

//-------------  Giải nén file cách 2 ---------------------------------------------

//            try {
//            File file = new File("F://Java_Batch156/fileCompressed.txt");
//            FileInputStream finRead = new FileInputStream(file);
//            File fileOut = new File("F://Java_Batch156/fileDecompressed2.txt");
//            FileOutputStream foutWrite = new FileOutputStream(fileOut);
//            
//            InflaterOutputStream   defWrite   = new InflaterOutputStream(foutWrite);
//            
//             int bread = 0;
//            while ((bread = finRead.read()) != -1){
//            defWrite.write(bread);
//            }
//            
//             defWrite.close();
//            finRead.close();
//            System.out.println("File size after compression " + fileOut.length());
//            
//        } catch (Exception e) {
//        }

        
//----------------   Copy 1 file vào 1 thư mục    ---------------------------------

//            try {
//                File source = new File("F://Java_Batch156/File.txt");
//                File dest = new File("F://Java_Batch156/Java2_B5/File.txt");
//                Files.copy(source.toPath(), dest.toPath());
//        } catch (Exception e) {
//        }

//----------------   Copy 1 file vào 1 thư mục    ---------------------------------
//
//            try {
//                File source = new File("F://Java_Batch156/File.txt");
//                File dest = new File("F://Java_Batch156/Java2_B5/File.txt");
//                Files.move(source.toPath(), dest.toPath());
//        } catch (Exception e) {
//        }
    }
    
}
