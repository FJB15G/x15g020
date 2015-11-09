package jp.ac.chibafjb.x15g020.kd115;

public class Test115 
{

	public static void main(String[] args) 
	{
		
		String i [];
		i = new String[4];
		i[1] = "あいうえお　あいうえお　あいうえお";
		i[2] = "かきくけこ　かきくけこ　かきくけこ";
		i[3] = "さしすせそ　さしすせそ　さしすせそ";
		
		
		for(int a = 1;a<=3;a++)
		{
			for(int c = 1;c<=2;c++)
			{
				System.out.println(i[a]);
			}

		}

	}

}
