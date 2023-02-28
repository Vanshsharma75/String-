package aerrr;
import java.lang.String;
import java.util.Scanner;

public class Ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("{......................................}"+"\n");
		System.out.print("enter the string 1 = ");
		Scanner a=new Scanner(System.in);
		String str=a.next();
		System.out.print("{......................................}"+"\n");
		System.out.print("enter a string 2 = ");
		Scanner b=new Scanner(System.in);
		String str1=b.next();
		System.out.print("select an option by entering a number"+"\n");
		System.out.print("1. String to lower case "+"\n");
		System.out.print("2. String to Upper case "+"\n");
		System.out.print("3. String comparision of the String "+"\n");
		System.out.print("4. index of String "+"\n");
		System.out.print("5. Replacing the String "+"\n");
		System.out.print("6. replacing full name "+"\n");
		System.out.print("7. value of two String "+"\n");
		System.out.print("enter the option = ");
		Scanner c=new Scanner(System.in);
		int option=c.nextInt();
		System.out.print("enter option is = "+option+"\n");
		switch(option)
		{
		case 1:
		{
			System.out.print("{......................................}"+"\n");
			System.out.println("lower case of string 1 is = "+str.toLowerCase());
		 System.out.println("Lower case if the String 2 is = "+str1.toLowerCase());  
		 System.out.print("{......................................}");
		}
			break;
			case 2:
			{
				System.out.print("{......................................}"+"\n");
				System.out.println("Upper case of the String = "+str.toUpperCase());
				System.out.println("Upper Case of the String 2 = "+str1.toUpperCase());
				System.out.print("{......................................}");
			}	
			break;
			case 3:
			{
				System.out.print("{......................................}"+"\n");
				System.out.print("Comparision of the String is =  "+str.compareTo(str1)+"\n");
				System.out.print("{......................................}");
			}
		break;
			case 4:
			{
				System.out.print("{......................................}"+"\n");
				System.out.println("your String 1 is = "+str);
				System.out.println("your String 2 is = "+str1);
				System.out.print("enter your char for which you want to know the index = ");
				Scanner d=new Scanner(System.in);
				String input1=d.next();
				System.out.print("your entered character is = "+input1+"\n");
				int f=str.indexOf(input1);
				System.out.print("index of the character is "+f+"\n");
				System.out.print("enter your char for which you want to know the index = ");
				String input2=d.next();
				System.out.print("your entered character is = "+input2+"\n");
				int g=str1.indexOf(input2);
				System.out.println("index of the character is "+g);
				System.out.print("{......................................}");
			}
			break;
			case 5:
			{
				System.out.print("{......................................}"+"\n");
				System.out.println("your String 1 is = "+str);
				System.out.println("your String 2 is = "+str1);
				System.out.println("replacing string character ");
				Scanner e=new Scanner(System.in);
				System.out.print("Enter the old chararacter in string 1 which you want to replace = ");
				String old=e.next();
				System.out.print("enter the new character in string 1 which you want to replace = ");
				String nn=e.next();
				System.out.print("After replaced string is = "+str.replace(old,nn)+"\n");
				System.out.print("Enter the old chararacter in string 2 which you want to replace = ");
				String oo=e.next();
				System.out.print("Enter the old chararacter in string 2 which you want to replace = ");
				String n1=e.next();
				System.out.print("after replaced string is = "+str1.replace(old,nn)+"\n");
				System.out.print("{.................................................}");
			}
			break;
			case 6:
			{
			System.out.print("{......................................}"+"\n");
				System.out.println("your String 1 is = "+str);
				System.out.println("your String 2 is = "+str1);
				System.out.println("replacing stri g character ");
				Scanner ee=new Scanner(System.in);
				System.out.print("Enter the old word in string 1 which you want to replace = ");
				String old=ee.next();
				System.out.print("enter the new word in string 1 which you want to replace = ");
				String nn=ee.next();
				System.out.print("After replaced string is = "+str.replace(old,nn)+"\n");
				System.out.print("Enter the old word in string 2 which you want to replace = ");
				String oo=ee.next();
				System.out.print("Enter the old word in string 2 which you want to replace = ");
				String n1=ee.next();
				System.out.print("after replaced string is = "+str1.replace(old,nn)+"\n");
				System.out.print("{......................................}");
			}	
			break;
			case 7:
			{
				System.out.print("{......................................}"+"\n");
				System.out.println("value of String");
				String s4=String.valueOf(str);
				String s5=String.valueOf(str1);
				System.out.println("the addition value of the String is = "+"❤️❤️"+s4+"❤️❤️"+s5+"❤️❤️");
			}
			break;
			default:
			{
				System.out.print("{......................................}"+"\n");
				System.out.println("{ Invalid Choice }");
				System.out.print("{......................................}"+"\n");
			}		
			}
	}
}
