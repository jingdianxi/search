package com.jingdianxi.search;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ȡ���ı�������");
		Text text = new Text();
		text.read("test.txt");
		System.out.println("������Ҫ���ҵĵ��ʣ�����-1�˳�");
		Scanner scanner = new Scanner(System.in);
		String tar = scanner.nextLine();
		if (!tar.equals("-1")) {
			Searcher searcher = new Searcher();
			searcher.search(text, tar);
		}
		scanner.close();
	}

}
