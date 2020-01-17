import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		String str1;
		for(int y=0;y<T;y++)
		{
		    str1=sc.nextLine();
		    char ch[]=new char[str1.length()];
		    for(int i=0;i<str1.length();i++)
		    {
		        ch[i]=str1.charAt(i);
		    }
		    
		    int l=ch.length;
		    if(l==10)
		    { int i=0;
		        
		               if(ch[i]==7||ch[i]==8||ch[i]==9)
		               {
		                  System.out.println("Valid");
		               }
		               else
		               {
		                  System.out.println("Invalid") ; 
		               }
		              
		           
		        }
		    else if(l==11)
		    {
		     int  i=0;
		           if(ch[i]==0)
		           {  i++;
		               if(ch[i]==7||ch[i]==8||ch[i]==9)
		               {
		                  System.out.println("Valid");
		               }
		               else
		               {
		                  System.out.println("Invalid");  
		               }
		              
		           }
		            
		    }
		    else if(l==12)
		    {
		     int i=0;

		           if(ch[i]==9)
		           {  i++;
		             if(ch[i]==1)
		             {
		                 i++;
		               if(ch[i]==7||ch[i]==8||ch[i]==9)
		               {
		                  System.out.println("Valid");
		               }
		               else
		               {
		                  System.out.println("Invalid") ; 
		               }
		              
		           }
		            
		        
		    }
		}
		    else
		    {
		        System.out.println("Invalid");
		    }
	
	}
}
}