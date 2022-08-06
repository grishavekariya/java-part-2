/* ID: 21CE153
 NAME: Grisha Vekariya
 AIM: Develop a Program that illustrate method overloading concept.
*/
import java.util.*;
public class pr_5
{ 
void sum(int a, int b) 
{ 
    int s = a + b; 
    System.out.println("Sum of two numbers: " +s); 
} 
void sum(int a, int b, int c) 
{ 
    int t = a + b + c; 
    System.out.println("Sum of three numbers: " +t); 
} 
public static void main(String[] args) 
{ 
    pr_5 a= new pr_5(); 
    a.sum(10, 20); 
    a.sum(10,20,30); 
} 
}

    

