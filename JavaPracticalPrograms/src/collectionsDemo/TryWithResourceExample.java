package collectionsDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourceExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int i;
		int j;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
		
			i= Integer.parseInt(br.readLine());
			j= Integer.parseInt(br.readLine());
			
			System.out.println("i val:" +i);
			System.out.println("j val:" +j);
					
		}
	}
}
