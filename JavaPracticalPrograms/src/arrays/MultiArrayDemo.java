package arrays;

public class MultiArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr = {
							{1,2,3,4},
							{5,6,7,8}
						};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println(arr[i][j]);
			}
			
		}
	}
}