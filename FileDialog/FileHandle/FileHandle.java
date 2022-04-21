import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandle {

	private boolean chkDir(String orgDir) {
		boolean isResult = false;
		
		File file = new File(orgDir);
		
		if(file.exists()) {
			isResult = true;
		}
		
		return isResult;
	}
	
	private void bytesToFile(String copyDir, byte[] bytes, String fileName) {
		try {
			String strFullPath = copyDir + "\\" + fileName;
			File file = new File(strFullPath);
			FileOutputStream output = new FileOutputStream(file);
			output.write(bytes);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void fileCopy(String orgDir, String copyDir, String fileName) {
		boolean ischkDir = chkDir(copyDir);      
		
		if(!ischkDir) { //디렉토리가 존재하지 않으면
			File file = new File(copyDir);
			file.mkdirs();
		}
		
		try {
			String orgFullName = orgDir + "\\" + fileName;
			File orgFile = new File(orgFullName);
			
			FileInputStream input = new FileInputStream(orgFile);
			
			long orgFileSize = orgFile.length();
			
			byte[] orgFileBytes = new byte[(int)orgFileSize];
			
			while(true){
				int readNum = input.read(orgFileBytes);
				
				if(readNum == -1) {
					break;
				}
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
