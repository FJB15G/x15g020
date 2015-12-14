package jp.ac.chibafjb.x15g020.kd144;

import java.util.Scanner;

public class Test01{
	public static void main(String[] args){
		Scanner X = new Scanner(System.in);
		
		System.out.println("住所の入力");
		String v1 = X.next(); 
		System.out.println("氏名の入力");
		String v2 = X.next();
		System.out.println("電話番号の入力");
		int v3 = X.nextInt(); 
		
	System.out.format("住所：%s\n氏名%s\n電話番号%d\n",v1,v2,v3);
		X.close();
	}
}