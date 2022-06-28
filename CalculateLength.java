package line_comparison_problem;

import java.util.Scanner;

public class CalculateLength {
	static double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
	}

	public static void main(String[] args) {

		int x1, y1, x2, y2;
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x1 and y1:");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("Enter the value of x2 and y2:");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.print("Length of the line is:");
		System.out.println(Math.round(distance(x1, y1, x2, y2)*100000.0)/100000.0);
	}
}
