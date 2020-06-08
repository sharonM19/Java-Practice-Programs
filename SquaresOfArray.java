import java.io.BufferedReader;
import java.io.InputStream;
import java.util.Scanner;

public class SquaresOfArray {

	public static void main(String[] args) {
		
    Scanner s = new Scanner(System.in);
    
    int size = s.nextInt();
    
    int[] num = new int[size];
    
    for(int i=0;i<= size-1;i++) {
    	num[i] = s.nextInt();
    }
    
    // before the squares 
    for(int j=0;j<= size-1;j++) {
    	System.out.println("array values-->"+num[j]);
    }
    
    int[] squareArr = new int[size];
    
    // after the squares 
    for(int j=0;j<= size-1;j++) {
    	num[j] = num[j]*num[j];
    	System.out.println("array square values-->"+num[j]);
    }
    
    
	}

}
