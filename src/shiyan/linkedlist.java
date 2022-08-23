package shiyan;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> sites = new LinkedList<>();
		sites.add("tengxun");
		sites.add("baidu");
		sites.add("wangyi");
		sites.add("xinlang");
		int len = sites.size();
		System.out.println(len);
		for(int i = 0; i < len; i++) {
			System.out.println(sites.get(i));
		}
		System.out.println(sites);
	}

}
