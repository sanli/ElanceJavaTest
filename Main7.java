import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int[] v = new int[4];
		
		for(int i = 0 ; i< 3 ;i++){
			v[i] =  Integer.parseInt(br.readLine());
		}
		
		for(int x : v){
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
