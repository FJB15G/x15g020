package jp.ac.chibafjb.x15g020.kd165;

import java.util.Scanner;

class Bakusui{
	public void bakusui(){
		int nemuke = 0;
		int yosiko = 3;
//		String TC = "川島";
		Scanner sin = new Scanner(System.in);
		for(;nemuke < yosiko;){
			for(;;){
				System.out.println("爆睡Zzz");
				System.out.println("誰か来た");
				int name = sin.nextInt();
				if(name == 445)
					break;
				else
					System.out.println("気のせいだった");
			}
			nemuke = nemuke + 1;
			if(nemuke <2)
				System.out.println("しかし寝た");
		}
		System.out.print("エビ覚醒！！");
	}

}

public class Test {

	public static void main(String[] args) {
		int m = 3;
		int a[] = new int[m];
		int b[] = new int[m];
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		for (int i = m - 1; i >= 0; i--) {
			b[i] = a[i];
			System.out.println(b[i]);	
		}
		Bakusui ebi = new Bakusui();
			ebi.bakusui();
	}

}
