package patternprograms;

public class LetterR {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((j==1) || (i==1&&j<=4) || (j==5&&i>=2&&i<=3) || (i==4&&j<=4) || (i==5&&j==3) || (i==6&&j==4) || (i==7&&j==5))                                                                          
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
