/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg2;

/**
 *
 * @author ohank
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nilaiAndroid = 10;
          String wajah = "cantik";
          String asal = "malang";
          
          System.out.println("Bagaimana menurutmu....?");
           char nilaiAndroidhuruf;
          if (nilaiAndroid >=85){
             nilaiAndroidhuruf= 'A';
          } 
          else if (nilaiAndroid >=75){
             nilaiAndroidhuruf= 'B';
          }
          
          else if (nilaiAndroid >=65){
              nilaiAndroidhuruf = 'C';
          }
          
          else if (nilaiAndroid >=55){
              nilaiAndroidhuruf = 'D';
          }
          
          else {
              nilaiAndroidhuruf ='E';
          }
          
            if (nilaiAndroidhuruf == 'A' && wajah == "cantik" && asal == "malang"){
                System.out.println("Mau banget");
            }
            
            else if (nilaiAndroidhuruf == 'A' || nilaiAndroidhuruf == 'c' && wajah == "cantik" && asal == "malang"){
                System.out.println("Ya dah");
            }
            
            else if (asal == "malang"){
                System.out.println("Saya pikir-pikir");
            }
            
            else {
                System.out.println("Tidak lah");
            }
    }
    
}
