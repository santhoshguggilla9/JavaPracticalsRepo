package readVal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadValues {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int age;
		String name;

//		InputStreamReader isr= new InputStreamReader(System.in);
//		BufferedReader br =new BufferedReader(isr);

		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter your age:");
		//age= Integer.parseInt(br.readLine());
		age= sc.nextInt();
		
		//name=br.readLine();
		sc.nextLine();
		System.out.println("Enter ur Name:");
		name=sc.nextLine();
		
		System.out.println("your name:" + name);
		System.out.println("your age: " + age);

		sc.close();
		
	}

}
