package class11;

import java.io.File;

public class CreateDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir") + "/src/resources/";
		File d = new File(projectPath);
		
		//Creates directory
		d.mkdirs();
	}

}
