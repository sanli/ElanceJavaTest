import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;


public class Main6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String[] strings = new String[2];
		
		for(int i = 0 ; i< 2 ;i++){
			strings[i] = br.readLine();;
		}
		
		String[] week={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		Calendar ca = Calendar.getInstance();
		for(String str : strings){
			String[] t = str.split("-");
			int y = Integer.parseInt(t[0]);
			int m = Integer.parseInt(t[1]);
			
			ca.set(Calendar.YEAR, y);
			ca.set(Calendar.MONTH, m );
			ca.set(Calendar.DAY_OF_MONTH, 28);
			
			System.out.println(week[ca.get(Calendar.DAY_OF_WEEK) - 1]);
		}
	}

}
