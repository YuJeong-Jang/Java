package co.yedam.app.file;

import java.io.FileReader;
import java.io.FileWriter;

public class TextFileCopy {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("d:/temp/JYJ.txt");
			FileWriter fw = new FileWriter("d:/temp/JYJ3.txt");
			char[] c = new char[100];
			// int c;
			while (true) {
				int cnt1 = fr.read(c);
				if (cnt1 == -1)
					break;
				fw.write(c);
			}
			fr.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
