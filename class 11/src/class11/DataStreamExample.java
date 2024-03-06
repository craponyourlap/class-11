package class11;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir") + "/src/resources/";
		FileOutputStream fout1 = new FileOutputStream(projectPath + "f1.txt");
		FileOutputStream fout2 = new FileOutputStream(projectPath + "f2.txt");
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		
		bout.flush();
		bout.close();
		System.out.println("Success...");
		
	}

}
