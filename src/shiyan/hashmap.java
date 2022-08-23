package shiyan;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> maps = new HashMap<Integer, String>();
		maps.put(1, "zijie");
		maps.put(2, "meituan");
		maps.put(3, "ali");
		maps.put(4, "tengxun");
		maps.remove(1);
		System.out.println(maps.get(1));
		for(Integer i : maps.keySet()) {
			System.out.println(maps.get(i));
		}
		for(String s:maps.values()) {
			System.out.println(s);
		}
	}

}
