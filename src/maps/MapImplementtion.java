package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapImplementtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Naresh", 10);
		map.put("Rakesh", 20);
		map.put("Lee", 99);
		map.put("John", 80);
		
		Set<String> keySet = map.keySet();
		System.out.println("Keys:-"+keySet);
		
		Collection<Integer> values = map.values();
		System.out.println("Values:-"+values);
		
		for (String key : keySet) {
			System.out.println("Keys:-"+key+" Value:-"+map.get(key));
			
		}
	}

}
