package class11;

import java.io.File;

public class ReadDIr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir") + "/src/";
		System.out.println(projectPath);
		
		File file = null;
		String[] paths;
		
		try {
			//create new file object
			file = new File(projectPath);
			
			//array of files and directory
			paths = file.list();
			
			//for each name in the path array
			for(String path : paths) {
				//prints filename and directory name
				System.out.println(path);
				File subfile = null;
				String[] subpaths;
				
				try {
					subfile = new File(projectPath + path + "/");
					subpaths = subfile.list();
					for(String subpath : subpaths) {
						System.out.println(subpath);
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			//should output the all names of the files within the resources folder
		}catch (Exception e) {
			//if any error occurs
			e.printStackTrace();
		}
	}

}
