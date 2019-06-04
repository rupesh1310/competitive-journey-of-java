// Word count program in java
import java.util.Scanner;
public class p11
{
	 static int Main(String string)  
        {  
          int count=0;  
      
            char ch[]= new char[string.length()];     
            for(int i=0;i<string.length();i++)  
            {  
                ch[i]= string.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
            }  
            return count;  
        }  
      public static void main(String[] args) {  
          String string ="    Technical Seek Word count";  
         System.out.println("Total words in string "+"= "+ Main(string) + " words.");   
    } 
}