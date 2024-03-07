package class11;

import java.io.File;

public class CreateDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir") + "/src/resources/NEWFOLDER";
//		to get this shit working, you need to put the name of the new folder at the end of the path
//		for example:
//			"[...]/src/resources/newFOLDER" or "[...]/src/resources/newFOLDER/"
//			if the folder already exists, or you fuck up the path, it won't work when the mkdirs() method is called lolol
			
		File d = new File(projectPath);
		
		//Creates directory
		System.out.println(d.mkdirs()); //-> mkdirs actually returns a boolean, so you can just call the method while putting it inside a println 
//		method to see if it actually worked
//		fyi: the method mkdirs() spawns a folder every time it is called (only when it is successful)
		
//		to see if the method works, you just need to refresh your ide. for eclipse, it's f5 or you can just right click the any of the ancestor folders
//		for this example, it's resources, src, and then class 11.
//		idk how it works in intellij lol
		
	}

}
