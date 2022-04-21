import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class FileManager {

	private HashMap<String, byte[]> hashSavedMap;
	
	private ArrayList<byte[]> savedBytes;
	private ArrayList<String> fileName;
	
	public FileManager() {
		this.savedBytes = new ArrayList<byte[]>();
	}
	
	public ArrayList<byte[]> getSavegBytes(){
		return this.savedBytes;
	}
	
	public void fileToBytes(String strDir, String strFileName) {
		//stream
		try {
			String fileFullPath = strDir + "\\" + strFileName;
			
			//특정파일을 받아서 메모리에 저장
			File file = new File(fileFullPath);
			
			long fileLength = file.length();
			
			byte[] bytes = new byte[(int)fileLength];
			
			FileInputStream input = new FileInputStream(file);
			
			while(true) {
				int readNum = input.read(bytes);
				if(readNum == -1) {
					break;
				}
			}
			
			File copyFile = new File("C:\\app2\\"+ strFileName);
			FileOutputStream output = new FileOutputStream(copyFile);
			output.write(bytes);
			
			input.close();
			output.flush();
			output.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
