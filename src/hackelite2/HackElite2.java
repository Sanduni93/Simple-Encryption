
package hackelite2;

import java.util.Scanner;


public class HackElite2 {

    //decrypt with the key
    public static void main(String[] args) {
        String message, encryptedMessage = "";
       int key;
        char ch;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Message:");
           message = scn.nextLine();
  
       
        
        System.out.println("Enter key: ");
         key = scn.nextInt();
 
       
         if(message.length()<100){
            
            for(int i = 0; i < message.length(); ++i){
            ch = message.charAt(i);
            
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + key);
                
                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }
                
                encryptedMessage += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + key);
                
                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }
                
                encryptedMessage += ch;
            }
            else {
                encryptedMessage += ch;
            }
        }
        
        System.out.println("Encrypted Message = " + encryptedMessage);


            
            
        }
        
        
        
    }
    
}
