/**
 * 
 */
package slideDeckExercises;

import java.io.File;
import java.io.IOException;
import java.util.Date;


/**
 * 
 */
public class CreatingDirectoryandFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("David's files");

		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("Directory created");
		} else {
			System.out.println("Directory already exists");
		}

		File file = new File(dir.getName() + "/First File Created.txt");
		File newFile = new File(dir.getName() + "/QUBnew");
		
		file.renameTo(newFile);
		
		if (!file.exists() && newFile.exists()) {
			System.out.println("Rename successful");
		}
		
		newFile.delete();
		
		if (newFile.exists()) {
			System.out.println("File not deleted");
		} else {
			System.out.println("File deleted");
		}

		dir.delete();
		
		if (dir.exists()) {
			System.out.println("Directory not deleted");
		} else {
			System.out.println("Directory deleted");
		}
		
//		try {
//			if (!file.exists()) {
//				file.createNewFile();
//				System.out.println("File created");
//			} else {
//				System.out.println("File already exists");
//			}
//		} catch (IOException e) {
//			System.out.println("Problem creating file");
//			e.printStackTrace();
//		}

		File dir2 = new File("David's files2/Subfolder1/Subfolder2");

		if (!dir2.exists()) {
			dir2.mkdirs();
			System.out.println("Directory created");
		} else {
			System.out.println("Directory already exists");
		}

		File file2 = new File(dir2.getPath() + "/Third File Created.txt");

		try {
			if (!file2.exists()) {
				file2.createNewFile();
				System.out.println("File created");
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("Problem creating file");
			e.printStackTrace();
		}
		
		System.out.println("Absolute path name of dir " + dir.getAbsolutePath());
		System.out.println("Absolute path name of dir2 " + dir2.getAbsolutePath());
		System.out.println("Absolute path name of file1 " + file.getAbsolutePath());
		System.out.println("Abstract path name of file2 " + file2.getPath());
		System.out.println("Last modified file " + file.lastModified());
		
		long lastModifiedTimestamp = file.lastModified();
		Date lastModifiedDate = new Date(lastModifiedTimestamp);
		System.out.println(lastModifiedDate);
		
		String[] allFiles = dir2.list();
		System.out.println("Number of files in directory "+ allFiles.length);
		for (String f : allFiles) {
			System.out.println(f);
		}
		
		

	}

}
