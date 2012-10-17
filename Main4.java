import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main4 {

	public static Pattern[] patters = new Pattern[] {
			Pattern.compile("[A-Z]+"), Pattern.compile("[0-9]+"),
			Pattern.compile("[@#*=]+"), Pattern.compile("[\\s]+") 
			};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String[] names = new String[4];
		
		for(int i = 0 ; i< 4 ;i++){
			names[i] = br.readLine();
		}
		
		
		for(String name : names){
			if(name.length() >=5  && isValide(name, patters[0] ) && isValide(name, patters[1]) && isValide(name, patters[2]) &&
					!isValide(name, patters[3])){
				System.out.println("PASS");
			}else{
				System.out.println("FAIL");
			}		
		}

	}

	private static boolean isValide(String name, Pattern pa) {
		Matcher m = pa.matcher(name);
		boolean r = m.find();
		return r ;
	}

}
