import java.util.Scanner;

public class Switch{  
    public static void main(String [] args){  
   int password = 9;
System.out.println("enter your new password");
try (Scanner scanner = new Scanner(System.in)) {
    password=scanner.nextInt();
}
switch(password){
case 1:
System.out.println("your pass word is very weak");//case1 out put
break;//break statement
case 2:
System.out.println("your pass word is almost very weak");//case2 output
break;//break statement
case 3:
System.out.println("your pass word is weak");//case3 output
break;//break statement
case 4:
System.out.println("your pass word require to add one digit");
break;//break statement
case 5:
System.out.println("your pass word is almost strong");
break;//break statement
case 6:
System.out.println("your pass word is strong");
break;//break statement
    }//end of switch case
    }}  