package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<Integer, List<Map<String, String>>> begNoJam = new HashMap<Integer, List<Map<String, String>>>();
		List<Map<String, String>> begNo = new ArrayList<Map<String, String>>();
		Map<String, String> beg = new HashMap<String, String>();
		
		String anHae = "�� ��";
		String noJam = "����";
		
		beg.put("���", anHae);
		beg.put("�ֳĸ�", noJam);
		
		begNo.add(beg);

		for (int i = 0; i < 1000; i++) {
			begNoJam.put(i, begNo);
		}
		
		System.out.println(begNoJam);
		
	}
}
