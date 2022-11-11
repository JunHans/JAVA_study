package kr.or.DataObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Copy {

	public static void main(String[] args) {
		
		
		try {
			String inName = args[0];
			String outName = args[1];
			
			FileReader fr = new FileReader(inName);
			FileWriter fw = new FileWriter(outName, false);
			PrintWriter out = new PrintWriter(fw, true);
			int data =0;
			while(true){
				data = fr.read();
				if(data==-1) break;
				out.print((char)data);
				
			}
			
			fr.close();
			fw.close();
			out.close();
			System.out.println("1 file is copied");
			
		}catch(Exception e){
			System.out.println("File is not found!" + e);
		}
		

	}

}