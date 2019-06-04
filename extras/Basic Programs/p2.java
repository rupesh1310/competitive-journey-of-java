// Even odd program in java is java program to print even and odd numbers from array.



public class p2
{
	public static void main(String[] args) {
       int a[]={1,2,5,6,3,2};  
      System.out.println("Odd Numbers:");  
      for(int i=0;i<a.length;i++){  
if(a[i]%2!=0){  
System.out.println(a[i]);  
}  
}  
System.out.println("Even Numbers:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2==0){  
System.out.println(a[i]);  
}  
} 
       	}
}