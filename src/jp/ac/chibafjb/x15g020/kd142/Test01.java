package jp.ac.chibafjb.x15g020.kd142;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		
		System.out.println("整数ａの入力 ");
		int v1 = a.nextInt();
		System.out.println("整数ｂの入力");
		int v2 = a.nextInt();

		a.close();

		System.out.format("%d+%d=%d\n",v1,v2,v1+v2);
		System.out.format("%d-%d=%d\n",v1,v2,v1-v2);
		System.out.format("%d*%d=%d\n",v1,v2,v1*v2);
		System.out.format("%d/%d=%d\n",v1,v2,v1/v2);
	}

}
