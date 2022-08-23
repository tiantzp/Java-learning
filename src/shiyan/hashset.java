package shiyan;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> sets = new HashSet<>();
		sets.add("taobao");
		sets.add("weixin");
		sets.add("jingdoing");
		sets.add("xiaomi");
		int i = sets.size();
		System.out.println(i);
		for(String s : sets) {
			System.out.println(s);
		}
		sets.remove("weixin");
		int j = sets.size();
		System.out.println(j);
		System.out.println(sets);
	}

}
