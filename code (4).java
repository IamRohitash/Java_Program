/*package whatever //do not write package name here */

import java.io.*;
class promate{
    public static void main(String args[]){
       byte b=42;
       char c='a';
       short s=1024;
       int i=5000;
       float f=5.67f;
       double d=.1234;
       double result=(f*d)+(i/c)-(d*s);
       System.out.println((f*d)+" + "+(i/c)+" - "+(d*s));
       System.out.println("result="+result);
    }
    
}

