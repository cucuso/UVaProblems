package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 
 * 11172 - Relational Operator
 * 
 * Some operators checks about the relationship between two values and these operators are called 
 * relational operators. Given two numerical values your job is just to find out the relationship 
 * between them that is (i) First one is greater than the second (ii) First one is less than the second
 *  or (iii) First and second one is equal.

 Input
 First line of the input file is an integer t (t<15) which denotes how many sets of inputs are there. 
 Each of the next t lines contain two integers a and b (|a|,|b|<1000000001). 

 Output
 For each line of input produce one line of output. This line contains any one of the relational 
 operators “>”, “<” or “=”, which indicates the relation that is appropriate for the given two numbers.
 * 
 */

public class ProblemH {

	public static void run() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer sets = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(sets.nextToken()); // # of sets

		for (int i = 0; i < s; i++) {

			String[] n = br.readLine().split(" ");

			if (n[0].equals(n[1]))
				System.out.println("=");

			if (Integer.parseInt(n[0]) < Integer.parseInt(n[1]))
				System.out.println("<");

			if (Integer.parseInt(n[0]) > Integer.parseInt(n[1]))
				System.out.println(">");
		}
	}

}
