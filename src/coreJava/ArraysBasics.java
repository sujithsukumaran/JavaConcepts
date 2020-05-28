package coreJava;

public class ArraysBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c[] = {1,2,3,4,5};
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
			if(c[i]==3)
			{
				System.out.println("3 is at the position "+i+" of this array");
				break;
			}
		}
		
		//Multidimensional array
		int multi[][] = {{4,0,3},{4,5,1},{7,8,9}};
		int minimum = multi[0][0]; 
		int maximum;
		int minimumcolumn = 0;
		for (int a=0; a<3; a++)
		{
			System.out.println("New Row");
			for (int b=0;b<3;b++)
			{
				System.out.println(multi[a][b]);
				if (minimum>multi[a][b])
				{
					minimum = multi[a][b];
				    minimumcolumn=b;
				}
                
			}
			
		}
		maximum=multi[0][minimumcolumn];
		for(int n=0;n<3;n++)
		{
			if(maximum<multi[n][minimumcolumn])
			{
				maximum=multi[n][minimumcolumn];
			}
		}
		System.out.println("Maximum value in the column of the minimum number is "+maximum);
		System.out.println("Minimum value of this array is "+minimum);

	}

}
