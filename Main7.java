import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main7 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		ArrayList<String> strings = new ArrayList<String>(4);
		
		for(int i = 0 ; i< 2 ;i++){
			String s = br.readLine();
			strings.add(s);
		}
		
		for(String num : strings){
			int x = Integer.parseInt(num);
			List<StringBuilder> msg = getMessage(x);
			for(StringBuilder s : msg){
				System.out.println(s.toString());
			}
		}
	}

	private static List<StringBuilder> getMessage(int x) {
		ArrayList<StringBuilder> res = new ArrayList<StringBuilder>(x);
		
		if(x > 1){
			List<StringBuilder> sub = getMessage(x - 1);
			for(StringBuilder s : sub){
				s.insert(0, " ");
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i = 1; i< x  ; i++)
				sb.append(x).append(" ");
			sb.append(x);
			
			res.addAll(sub);
			res.add(sb);
			return res ;
		}else{
			res.add(new StringBuilder(x + ""));
			return res ;
		}
	}

}
