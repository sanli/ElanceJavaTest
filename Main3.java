import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] sarr = s.split(",");
		
		System.out.println(getSumOfString(sarr[0]) - getSumOfString(sarr[1]));
	}

	private static int getSumOfString(String string) {
		byte[] bytes = string.getBytes();
		int sum = 0 ;
		for(byte b : bytes){
			sum += b;
		}
		return sum;
	}
	

}
