import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of rows?");
		int rows = scanner.nextInt();
		System.out.println("# of blocks is "+triangle(rows));

	}
	
	private static int triangle(int rows) {
		
		if(rows<=1)
			return rows;
		else
			return rows + triangle(rows-1);
		
	}

}
