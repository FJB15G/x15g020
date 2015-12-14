package jp.ac.chibafjb.x15g020.kd141;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);//インスタンス化
		System.out.println("整数を１つ入力してください。");
		System.out.format("あなたの入力した数は %d です。",a.nextInt());
		a.close();
	}

}
