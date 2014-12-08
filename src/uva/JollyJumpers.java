package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/*
 *10038 - Jolly Jumpers
 *
 *
 * Problem E: Jolly Jumpers
 A sequence of n > 0 integers is called a jolly jumper if the absolute values of the difference between successive elements 
 take on all the values 1 through n-1. For instance,
 1 4 2 3
 is a jolly jumper, because the absolutes differences are 3, 2, and 1 respectively. The definition implies that any sequence of
 a single integer is a jolly jumper. You are to write a program to determine whether or not each of a number of sequences is a jolly jumper.
 Input
 Each line of input contains an integer n <= 3000 followed by n integers representing the sequence.
 Output
 For each line of input, generate a line of output saying "Jolly" or "Not jolly".
 Sample Input
 4 1 4 2 3
 5 1 4 2 -1 6
 Sample Output
 Jolly
 Not jolly
 * 
 */
public class JollyJumpers {

	public static void run() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();

		while (line != null) {

			
			String[] v = line.split(" ");

		
			Set<Integer> hs = new HashSet<>();
			Set<Integer> hs2 = new HashSet<>();

			for (int i = 1; i < v.length; i++) {

				hs.add(i);
			}

			for (int i = 1; i < v.length-1; i++) {

				hs2.add(Math.abs(Integer.parseInt(v[i]) - Integer.parseInt(v[i + 1])));
			}
			
			hs2.add(Integer.parseInt(v[0]));

			//

			/*
			 * 
			 * for (int i = 1; i < v.length - 1; i++) {
			 * 
			 * if (count == -1){ count = Math.abs(Integer.parseInt(v[i]) -
			 * Integer.parseInt(v[i + 1])); continue; } if (count -
			 * Math.abs(Integer.parseInt(v[i]) - Integer.parseInt(v[i + 1])) ==
			 * 1||count - Math.abs(Integer.parseInt(v[i]) - Integer.parseInt(v[i
			 * + 1])) == 0) { count = Math.abs(Integer.parseInt(v[i]) -
			 * Integer.parseInt(v[i + 1])); continue; } else {
			 * 
			 * System.out.println("Not jolly"); jol = false; break; }
			 * 
			 * 
			 * }
			 */

			if (hs.equals(hs2)){
				System.out.println("Jolly");
			}else{System.out.println("Not jolly");}
			
			line = br.readLine();
			
		}

	}

}