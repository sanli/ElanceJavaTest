import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Not End with 5
public class Main {
	public static void main(String[] args) {
		for(int i = 258; i<= 393; i++){
			if(i % 10 != 5)
				System.out.println(i);
		}
	}
}
