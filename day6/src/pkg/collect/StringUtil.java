package pkg.collect;

public class StringUtil {
//파일명 추출
	public static String getFilename(String path) {
		String s = null;
		if (path == null)
			return null;
		s = path.substring(path.indexOf(".") + 1);
		return s;
	}

	// 확장자 jpg
	public static String getExtention(String path) {
		String h = null;
		if (path == null)
			return null;
		h = path.substring(16, 19);
		return h;
	}

	// 경로 c:/temp/image
	public static String getPath(String path) {
		String l = null;
		if (path == null)
			return null;
		l = path.substring(0, 13);
		return l;
	}

}
