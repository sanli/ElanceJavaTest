import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Main3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] sarr = s.split(",");
		
		int sum1 = getSumOfString(sarr[0]);
		int sum2 = getSumOfString(sarr[1]);
		
		System.out.println(sum1 - sum2);
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
