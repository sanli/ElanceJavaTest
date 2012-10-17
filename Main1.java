import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		ArrayList<String> names = new ArrayList<String>(4);
		
		for(int i = 0 ; i< 2 ;i++){
			String s = br.readLine();
			names.add(s);
		}
		
		System.out.println(getDist(Integer.parseInt(names.get(0)))); 
		System.out.println(getDist(Integer.parseInt(names.get(1))));
	}

	private static int getDist(int v1) {
		return (36 * 1000) / 3600 * v1  + 5 * v1 * v1 / 2 ;
	}
	
}
