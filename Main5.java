import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main5 {

	public static Pattern p = Pattern.compile("[A-Z]\\S*\\b");
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String[] strings = new String[3];
		
		for(int i = 0 ; i< 3 ;i++){
			strings[i]= br.readLine();
		}
		
		for (String str : strings) {
			Matcher m = p.matcher(str);
			while(m.find()){
				System.out.println(m.group());
			}
		}
	}

}
