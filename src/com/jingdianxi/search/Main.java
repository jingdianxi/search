package com.jingdianxi.search;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("读取的文本内容是");
		Text text = new Text();
		text.read("test.txt");
		System.out.println("请输入要查找的单词，输入-1退出");
		Scanner scanner = new Scanner(System.in);
		String tar = scanner.nextLine();
		if (!tar.equals("-1")) {
			Searcher searcher = new Searcher();
			searcher.search(text, tar);
		}
		scanner.close();
	}

}
