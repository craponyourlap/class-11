package class11;

import java.io.FileInputStream;
import java.io.IOException;

public class ClassTask1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir") + "/src/resources/";
		System.out.println(projectPath);//outputs path of the class, excluding the class itself
//		for example, it outputs C:\Users\6177869\eclipse-workspace\ for me
		FileInputStream input = new FileInputStream(projectPath + "taskInput.txt");
		int k = 0;
		String string = "";
		while((k = input.read()) != -1) {
//			if you're planning to use regex, then just add the character to the string regardless
//			string += (char)k;
			if (Character.isLetter((char)k)) {
				System.out.print((char)k);
				string += (char)k;//this is so bad lol, ngl you would normally use another int and increase it every time.
			}
		}
//		if using regex:
//			string.replaceAll("[^a-zA-Z0-9]", "").replaceAll("\\s+", "");
		System.out.print("\n");
		System.out.println("number of characters: "+string.length());
	}

}
