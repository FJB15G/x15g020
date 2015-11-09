package jp.ac.chibafjb.x15g020.kd116;

public class Test116 
{

	public static void main(String[] args) 
	{
		
		String i [];
		i = new String[4];
		i[1] = "あいうえお　あいうえお　あいうえお";
		i[2] = "かきくけこ　かきくけこ　かきくけこ";
		i[3] = "さしすせそ　さしすせそ　さしすせそ";
		
		for(int d = 1;d<=2;d++)
		{
			for(int a = 1;a<=3;a++)
			{
				for(int c = 1;c<=1;c++)
				{
					System.out.println(i[a]);
				}

			}
		}	
	}
}