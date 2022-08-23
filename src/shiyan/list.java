package shiyan;

import java.util.ArrayList;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> sites = new ArrayList<>();
		sites.add("abc");
		sites.add("boc");
		sites.add("baidu");
		sites.add("ali");
		int len = sites.size();
		System.out.println(len);
		for(String s : sites) {
			System.out.println(s);
		}
		System.out.println(sites.get(1));
		sites.remove(len-1);
	}

}
