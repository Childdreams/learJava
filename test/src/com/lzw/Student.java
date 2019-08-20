package com.lzw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Student {
	public static void main(String[] args) {
		String content[] = {"好久不见","最近好吗","常联系"};
		File file = new File("word.txt");
		
		try {
			FileWriter fW = new FileWriter(file);
			//创建 BufferedWriter
			BufferedWriter bufw = new BufferedWriter(fW);
			
			for (int k = 0; k < content.length; k++) {
				bufw.write(content[k]);
				bufw.newLine();
			}
			bufw.close();
			fW.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileReader fr =  new FileReader(file);
			//创建bufferedReader
			 BufferedReader bufr = new BufferedReader(fr);
			 String s = null;
			 int i = 0 ;
			 
			 //if file txt line isn't null 进入循环
			 while ((s = bufr.readLine()) != null ) {
				 i ++ ;
				 System.out.println("第"+ i + "行：" + s);
			}
			 bufr.close();
			 fr.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
