package line_comparison_problem;

import java.util.Scanner;

public class LineComparison {
	static void distance(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
	{
		float a,b;
        a = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
        b = (float) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2) * 1.0);
        
        if (Float.compare(a, b) == 0)
        {
            System.out.println(("Both lines are equal"));
        }
        else if (Float.compare(a, b) < 0) {
            System.out.println(("Both lines are less"));
        }
        else if (Float.compare(a, b) > 0) {
            System.out.println(("Both lines are greater"));
        }
        else {
            System.out.println("Both are not equal");
        }
	}

	public static void main(String[] args) {
		int x1, y1, x2, y2, x3, y3, x4, y4;
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x1 and y1:");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("Enter the value of x2 and y2:");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
      
        System.out.print("Enter the value of x3 and y3:");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.print("Enter the value of x4 and y4:");
        x4 = sc.nextInt();
        y4 = sc.nextInt();
        distance(x1, y1, x2, y2, x3, y3, x4, y4);

	}
}