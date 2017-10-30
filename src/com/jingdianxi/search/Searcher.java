package com.jingdianxi.search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Searcher {

	// �����ѯ���
	private Map<Integer, String> map = new HashMap<Integer, String>();

	public void search(Text text, String tar) {
		int count = 0;
		int index = 0;
		// ͳ��ÿ�г��ִ���
		for (String line : text.getTextlist()) {
			List<String> words = Arrays.asList(line.split(" "));
			for (String word : words) {
				if (word.equals(tar)) {
					count++;
					map.put(index + 1, line);
				}
			}
			index++;
		}
		System.out.println(tar + "������" + count + "��");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Line" + entry.getKey() + ":" + entry.getValue());
		}
	}
}
