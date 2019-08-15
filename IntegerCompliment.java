import java.util.Scanner;

public class IntegerCompliment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Take input as decimal 
		Scanner input = new Scanner(System.in);
		int decVal = input.nextInt();
		
		// convert into binary 
		String strValue = "";
		while(decVal>0) {
			
			int a = decVal%2;
			strValue = a + strValue;
			decVal = decVal/2;
			
		}
		
		System.out.println("Binary value of integer is"+ strValue);
		
		//compliment the binary value 
	     String temp = "";
	     int base = 2;
	     
	     for(char c: strValue.toCharArray()){
		   if(c == '1'){
			  temp += "0";
			}
			else{
			   temp += "1";
			}
		   }
	     
		  int complement = Integer.parseInt(temp, base);
		   
		  System.out.println("Compliment of Integer Value is "+ complement);

			  
	}
		
		
		
		
		
		

	}


