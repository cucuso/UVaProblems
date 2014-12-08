package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *Everybody sit down in a circle. Ok. Listen to me carefully.

``Woooooo, you scwewy wabbit!''

Now, could someone tell me how many words I just said?

Input and Output

Input to your program will consist of a series of lines, each line containing multiple words (at least one). A ``word'' is 
defined as a consecutive sequence of letters (upper and/or lower case).

Your program should output a word count for each line of input. Each word count should be printed on a separate line.

Sample Input

Meep Meep!
I tot I taw a putty tat.
I did! I did! I did taw a putty tat.
Shsssssssssh ... I am hunting wabbits. Heh Heh Heh Heh ...
Sample Output

2
7
10
9
 * 
 * 
 */

public class Kindergarten {
	
	
	public static void run() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		while(str!= null){
			
			String[] words = str.split("[[A-aZ-z]]+");
			System.out.println(words.length-1);
			
			str = br.readLine();
			
		}
		
		
	}

}
