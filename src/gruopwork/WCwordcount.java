package gruopwork;
import java.util.*;
public class WCwordcount{
	ArrayList<String> input = new ArrayList<String>();
	Map<String,Integer> map = new HashMap<String,Integer>();
	List<Map.Entry<String, Integer>> list = new ArrayList<>();
	public void count(){
		for(String p:input){
			if(map.get(p) == null){
				map.put(p,1);
			}
			else{
				int tmpCount = map.get(p) + 1;
				map.remove(p);
				map.put(p,tmpCount);
			}
		}
		for(Map.Entry<String, Integer> entry : map.entrySet()){
             list.add(entry); 
        }

        list.sort(new Comparator<Map.Entry<String, Integer>>(){
              @Override
               public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue()-o1.getValue();} 
        }); 
        
        for(Map.Entry<String, Integer> entry: list){
              System.out.println(entry);
        }

	}
	
	public void setInput(ArrayList<String> i){
		this.input = i;
	}

}