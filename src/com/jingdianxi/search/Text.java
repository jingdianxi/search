package com.jingdianxi.search;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
	
	private List<String> textlist = new ArrayList<String>();

	public List<String> getTextlist() {
		return textlist;
	}

	public void read(String filename) {
		File file = new File(filename);
		FileReader fileIn = null;
		BufferedReader in = null;
		if (file.exists()) {
			if (!filename.endsWith(".txt")) {
				System.out.println("文件格式错误");
				return;
			}
			try {
				fileIn = new FileReader(file);
				in = new BufferedReader(fileIn);
				while(true){
					String msg = in.readLine();
					if(msg == null){
						break;
					}else{
						// 字符串正则替换方法，去除文本标点
						String regEx = "[\\p{P}*]";
						// 编译正则表达式
						Pattern pattern = Pattern.compile(regEx);
						Matcher matcher = pattern.matcher(msg);
						msg = matcher.replaceAll(" ");
						textlist.add(msg);
						System.out.println(msg);
					}
				}
			} catch (Exception exception) {
				// TODO Auto-generated catch block
				exception.printStackTrace();
			} finally {
				try {
					fileIn.close();
				} catch (Exception exception) {
					// TODO Auto-generated catch block
					exception.printStackTrace();
				}
				try {
					in.close();
				} catch (Exception exception) {
					// TODO Auto-generated catch block
					exception.printStackTrace();
				}
			}
		} else {
			System.out.println("文件不存在");
		}
	}
}
