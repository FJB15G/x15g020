package jp.ac.chibafjb.x15g020.kd151;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner X = new Scanner(System.in);
		System.out.println("ａの入力");
		int a = X.nextInt();
		System.out.println("ｂの入力");
		int b = X.nextInt();
		double w = 0;
		X.close();
		
		w=a+b;
		System.out.format("%s + %s = %s\n",a,b,w=a+b);
		
		System.out.format("%s - %s = %s\n",a,b,w=a-b);
		
		System.out.format("%s * %s = %s\n",a,b,w=a*b);
		
		System.out.format("%s / %s = %s\n",a,b,w=a/b);

		
	}

}






//int n = 3;
//int x[] = ne%s int[3];
//int y[] = ne%s int[n];