package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 10035 - Primary Arithmetic
 * 
 * 
 * Problem B: Primary Arithmetic
 Children are taught to add multi-digit numbers from right-to-left one digit at a time. Many find the "carry" operation - in which a 1 is
 carried from one digit position to be added to the next - to be a significant challenge. Your job is to count the number of carry 
 operations for each of a set of addition problems so that educators may assess their difficulty.
 Input
 Each line of input contains two unsigned integers less than 10 digits. The last line of input contains 0 0.
 Output
 For each line of input except the last you should compute and print the number of carry operations that would result from adding 
 the two numbers, in the format shown below.
 Sample Input
 123 456
 555 555
 123 594
 0 0
 Sample Output
 No carry operation.
 3 carry operations.
 1 carry operation.
 * 
 */
public class PrimaryArithmetic {

	public static void run() throws IOException {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		String input = sc.readLine();

		while (!input.equals("0 0")) {

			String[] values = input.split(" ");

			int cOverCount = 0;
			if (values[0].length() <= values[1].length()) {

				char[] numbA = values[0].toCharArray();
				char[] numbB = values[1].toCharArray();

				int cOver = 0;
				int numbBEnd = numbB.length - 1;

				for (int i = numbA.length - 1; i > -1; i--, numbBEnd--) {

					int x = (int) numbA[i] - (int) '0' + (int) numbB[numbBEnd]
							- (int) '0' + cOver;

					if (x > 9 && i == 0
							&& numbBEnd > 0) {
						
						cOverCount++;
						cOver = 1;

						int[] nVals = new int[numbBEnd];

						for (int j = nVals.length-1; j >= 0; j--) {

						 x = nVals[j]  +  numbB[j]- (int) '0'  + cOver;
							if (x > 9) {
								cOver = 1;
								cOverCount++;
							} else {
								x=0;
								break;
							}
						}x=0;

					}

					if (x > 9) {
						cOver = 1;
						cOverCount++;
					} else {
						cOver = 0;
					}
				}

			}

			if (values[0].length() > values[1].length()) {

				char[] numbA = values[0].toCharArray();
				char[] numbB = values[1].toCharArray();

				int cOver = 0;
				int numbAEnd = numbA.length - 1;

				for (int i = numbB.length - 1; i >= 0; i--, numbAEnd--) {

					int x = (int) numbB[i] - (int) '0' + (int) numbA[numbAEnd]
							- (int) '0' + cOver;

					if (x > 9 && i == 0 && numbAEnd > 0) {
						
						cOverCount++;
						cOver = 1;


						int[] nVals = new int[numbAEnd];

						for (int j = nVals.length-1; j >= 0; j--) {

						 x = nVals[j]  +  numbA[j] - (int) '0'+ cOver;
							if (x > 9) {
								cOver = 1;
								cOverCount++;
							} else {
								x=0;
								break;
							}
						}
						x=0;

					}

					if (x > 9) {
						cOver = 1;
						cOverCount++;
					} else {
						cOver = 0;
					}
				}

			}

			switch (cOverCount) {

			case 0:
				System.out.println("No carry operation.");
				break;

			case 1:
				System.out.println("1 carry operation.");
				break;

			default:
				System.out.println(cOverCount + " carry operations.");

			}

			input = sc.readLine();

		}

	}

}