package Recursion;
import java.util.Scanner;

public class Sigma {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		System.out.println(Sigma(j));
		

	}
	public static int Sigma(int i) {
		if(i==0) {
			return 0;
		}
		else {
			return i+Sigma(i-1);
		}
	}

}
