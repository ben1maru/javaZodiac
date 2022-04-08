/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zodiacs;


import java.io.File;
import java.util.Scanner;



/**
 *
 * @author admin
 */
public  class FileReader {
    
  
    public static String readFile(String name){
     try {
         
          String zodiac = "";
             File text = new File(name);
             System.out.println(text.exists());
            Scanner sc = new Scanner(text);
         
            while (sc.hasNextLine()) {
               zodiac += sc.nextLine() + "\n";
      
            }
              sc.close();
            return zodiac;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     return " ";
    }
}
        

