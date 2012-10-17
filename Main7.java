import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		ArrayList<String> strings = new ArrayList<String>(4);
		
		for(int i = 0 ; i< 3 ;i++){
			String s = br.readLine();
			strings.add(s);
		}
		
		for(String num : strings){
			int x = Integer.parseInt(num);
			for(int i = 1; i<= x; i++){
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j< x - i ; j++){
					sb.append(" ");
				}
				printLine(i,sb);
				System.out.println(sb.toString());
			}
		}
	}

	private static void printLine(int line, StringBuilder sb) {
		for(int i = 1 ; i< line ; i++){
			sb.append(line).append(" ");
		}
		sb.append(line);
	}

}
