import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int[] v = new int[4];
		
		for(int i = 0 ; i< 4 ;i++){
			v[i] =  Integer.parseInt(br.readLine());
		}
		
		for(int istep : v){
			int y = istep % 3 ;
			int res = (istep / 3) * 35 + (y >= 1 ? 20 : 0) + (y >= 2 ? 10 : 0) ;
			System.out.println(res);
		}
	}

}
