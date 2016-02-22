package com.mes.face;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Socket {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			list.add("第" +( i + 1) + "次说我爱你~~");
		}
		/*System.out.println("使用Iterator进行输出：");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("使用foreach进行输出：");
		for (String result : list) {
			System.out.println(result);
		}
		System.out.println("使用toString进行输出：");
		System.out.println(list);*/
		
	}
}