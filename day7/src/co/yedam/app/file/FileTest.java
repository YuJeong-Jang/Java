package co.yedam.app.file;

import java.io.File;
import java.io.IOException;

import co.yedam.app.StringUtil;

public class FileTest {

	public static void filecreate() throws IOException {
	//파일생성
	File file = new File("d:/temp/diary.txt");
	boolean result = file.createNewFile();
	System.out.println(result);
}
	

	public static void main(String[] args) throws IOException {
		//filecreate();
//		makefolder();
//		fileInfo();
		forderlist(); //폴더목록
}


	private static void fileInfo() {
		File file = new File("d:/temp/image.png");
		System.out.println(file.length());
		System.out.println(file.getName());
		System.out.println(file.canExecute());
		
	}


	private static void forderlist() {
		File file = new File("d:/temp");
		if(file.isDirectory()) {
			File[] list = file.listFiles();
			for(File f : list) {
				if(StringUtil.getExtention(f.getName()).equals("png")){
					
					System.out.println(f.getName());
					FileUtil.copy(f.getAbsolutePath(), "d:/temp/images/" + f.getName());
				}
			}
//		for(int i=0; i<file.size(); i++) {
//			File file = list.get(i);
//			System.out.println(file.listFiles);
//		}
		}
		
	}


	private static void makefolder() {
		File file = new File("d:/temp/images");
		file.mkdir();
	}
	
	
	
}