import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;


public class Main9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		ArrayList<String> strings = new ArrayList<String>(4);
		
		for(int i = 0 ; i< 2 ;i++){
			String s = br.readLine();
			strings.add(s);
		}
		
		String[] c1 = strings.get(0).split(",");
		HashSet<String> set1 = new HashSet<String>(c1.length * 2);
		for(String s : c1) set1.add(s);
		
		String[] c2 = strings.get(1).split(",");
		int count = 0 ;
		for(String s : c2){
			if(set1.contains(s))
				count ++ ;
		}
		System.out.println(count);
	}

}
