import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int[] names = new int[2];
		
		for(int i = 0 ; i< 2 ;i++){
			names[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println(getDist(names[0])); 
		System.out.println(getDist(names[1]));
	}

	public static int CO = 10 ; // (36 * 1000) / 3600 ;
	private static int getDist(int v1) {
		return CO * v1  + 5 * v1 * v1 / 2 ;
	}
}
