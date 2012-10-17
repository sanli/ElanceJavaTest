import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		HashMap<String, Integer> score = new HashMap<String, Integer>(10);
		
		for(int i = 0 ; i< 10 ;i++){
			String s = br.readLine();
			String[] sarray = s.split("-");
			String id = sarray[0];
			int sc = Integer.parseInt(sarray[1]);
			
			if(score.containsKey(id)){
				if(score.get(id) < sc)
					score.put(id, sc);
			}else{
				score.put(id, sc);
			}
		}
		
		ArrayList<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(score.entrySet()) ;
		Collections.sort(list, new Comparator< Entry<String,Integer> >(){

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return - o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		for(Entry<String,Integer> entry : list){
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
		
	}

}
