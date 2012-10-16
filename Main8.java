import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		ArrayList<String> strings = new ArrayList<String>(4);
		
		for(int i = 0 ; i< 4 ;i++){
			String s = br.readLine();
			strings.add(s);
		}
		
		for(String step : strings){
			int istep = Integer.parseInt(step);
			
			int y = istep % 3 ;
			int res = (istep / 3) * 35 + (y >= 1 ? 20 : 0) + (y >= 2 ? 10 : 0) ;
			System.out.println(res);
		}
	}

}
