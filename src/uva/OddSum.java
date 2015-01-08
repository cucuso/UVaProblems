package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 10783 - Odd Sum 
 * 
 * 
 * Odd Sum 
 Given a range [a, b], you are to find the summation of all the odd integers in this range. For example, 
 the summation of all the odd integers in the range [3, 9] is 3 + 5 + 7 + 9 = 24.
 Input

 There can be at multiple test cases. The first line of input gives you the number of test cases, T ( 1$ \le$T$ \le$100). 
 Then T test cases follow. Each test case consists of 2 integers a and b ( 0$ \le$a$ \le$b$ \le$100) in two separate lines.
 Output

 For each test case you are to print one line of output - the serial number of the test case followed by the summation of 
 the odd integers in the range [a, b].
 Sample Input

 2
 1
 5
 3
 5
 Sample Output

 Case 1: 9
 Case 2: 8

 * 
 */
public class OddSum {

	public static void run() throws IOException {

		Scanner br = new Scanner(System.in);

		Integer cases = br.nextInt();
		br.nextLine();

		for (int i = 0; i < cases; i++) {

			Integer a = br.nextInt();
			br.nextLine();
			Integer b = br.nextInt();

			int count = 0;

			for (int j = a; j <= b; j++) {

				if (j % 2 != 0)
					count += j;

			}
			System.out.printf("Case %s: %s\n", i + 1, count);
		

		}

	}

}
