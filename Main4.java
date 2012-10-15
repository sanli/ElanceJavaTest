import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main4 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		ArrayList<String> names = new ArrayList<String>(4);
		
		for(int i = 0 ; i< 4 ;i++){
			String s = br.readLine();
			names.add(s);
		}
		
		for(String name : names){
			if(isValide(name, "[A-Z]+") && isValide(name, "[0-9]+") && isValide(name,"[@#*=]+") &&
					isValide(name, "[^\\s]+")){
				System.out.println("PASS");
			}else{
				System.out.println("FAIL");
			}		
		}

	}

	// check the regex
	private static boolean isValide(String name, String string) {
		Pattern pa =  Pattern.compile(string);
		Matcher m = pa.matcher(name);
		boolean r = m.find();
		return r ;
	}

}
