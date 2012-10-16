import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;


public class Main6 {

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
		
		for(String str : strings){
			String[] t = str.split("-");
			int y = Integer.parseInt(t[0]);
			int m = Integer.parseInt(t[1]);
			
			Calendar ca = Calendar.getInstance();
			ca.set(Calendar.YEAR, y);
			ca.set(Calendar.MONTH, m );
			ca.set(Calendar.DAY_OF_MONTH, 28);
			String x = ca.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US ) ;
			System.out.println(x.toUpperCase());
		}

	}

}
