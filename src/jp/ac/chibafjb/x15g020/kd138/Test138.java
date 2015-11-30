package jp.ac.chibafjb.x15g020.kd138;

public class Test138 {

	public static void main(String[] args) {
		int[] a = {1,2,3,0,0};
		
		a[3] =a[0];
		a[4] =a[1];
		a[0] =a[2];
		
		
		System.out.println(a[4]);
		System.out.println(a[0]);
		System.out.println(a[3]);
		
	}

}
