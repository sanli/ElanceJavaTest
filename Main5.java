import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		ArrayList<String> strings = new ArrayList<String>(3);
		
		for(int i = 0 ; i< 3 ;i++){
			String s = br.readLine();
			strings.add(s);
		}
		
		for (String str : strings) {
			Pattern p = Pattern.compile("[A-Z]\\S*\\b");
			Matcher m = p.matcher(str);
			while(m.find()){
				System.out.println(m.group());
			}
		}
	}

}
