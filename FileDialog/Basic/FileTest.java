import java.awt.datatransfer.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileTest {
	public void testOutputStream() {
		try {
			OutputStream foutput = new FileOutputStream("C:\\FileTest\\test.txt");
			
			Scanner sc = new Scanner(System.in);
			/*
			byte[] bytes = new byte[5];
			for(int i=0; i<5; i++) {
				bytes[i] = (byte)sc.nextInt();
			}*/
			byte[] bytes1 = {73, 76, 79, 86, 69};
			//foutput.write(73);
			//foutput.write(92);
			//foutput.write(34);
			foutput.write(bytes1);
			
			foutput.flush();
			foutput.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());		
		}
	}

	public void testInputStream() {
		try {
			InputStream input = new FileInputStream("C:\\FileTest\\test.txt");
			
			int inputNum = 0;
			while(true) {
				inputNum = input.read();
				
				if(inputNum == -1) {
					break;
				}
				System.out.println((char)inputNum);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public void fileCopy(File orgFile) {
		try {
			String orgFileName = orgFile.getName();
			
			String copyDir = "C:\\FileTest\\"; // 카피하고자 하는 디렉터리 
			String copyFileName = "";
			
			if(orgFile.exists()) {	//존재한다면
				int dotLoc = orgFileName.lastIndexOf(".");	//.의 위치 
				String orgFileExt = orgFileName.substring(dotLoc + 1);
				String FileName = orgFileName.substring(0, dotLoc);
				
				copyFileName = FileName + "- 복사본." + orgFileExt;
			}
			else {
				// 이미 존재할 시 
				copyFileName = orgFileName;
			}
			
			File copyFile = new File(copyDir + copyFileName);
			FileInputStream input = new FileInputStream(orgFile);
			FileOutputStream output = new FileOutputStream(copyFile);
			
			// 1. orgFile의 크기를 구한다 
			long orgFileLenth = orgFile.length();
			
			// 2. byte 배열을 만든다.
			byte[] orgFileBytes = new byte[(int)orgFileLenth];
			
			int readNum = 0;
			while(true) {
				readNum = input.read(orgFileBytes);
				
				if(readNum == -1) {
					break;
				}
			}
			output.write(orgFileBytes);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	// FileClass
	public void fileClassTest() {
		
		// 내가 원하는 파일의 정보를 확인하는 클래스 
		File file = new File("C:\\FileTest\\test.txt");
		
		// 이름 가져오기 
		String strName = file.getName();
		System.out.println(strName);			// test.txt
		
		// 경로 가져오기
		String strPath = file.getPath();
		System.out.println(strPath);			// C:\FileTest\test.txt
		
		// \\의 위치를 가져오기
		int result = strPath.indexOf("\\");
		System.out.println(result);				// 2
		
		int result2 = strPath.lastIndexOf("\\");
		System.out.println(result2);			// 11
		
		String realPath = strPath.substring(0, result2 + 1);
		System.out.println(realPath);			// C:\FileTest\
		
		String strAPath = file.getAbsolutePath();
		System.out.println(strAPath);			// C:\FileTest\test.txt
		
		if(file.exists()) {
			System.out.println("중복된 파일이 존재한다.");
		}
	}
	
	private String checkFileName(File chkFile, String dirName) {
		
		String updateFileName = "";
		String orgFileName = chkFile.getName();
		String copyFullPath = dirName + "\\" + orgFileName;
		
		System.out.println(copyFullPath);
		System.out.println("");
		
		File file = null;
		int dotLoc = 0;
		String fileNameOnly = "";
		String fileExt = "";
		
		int i=0;
		while(true) {
			file = new File(copyFullPath);
			if(file.exists()) {
				dotLoc = orgFileName.lastIndexOf(".");
				fileNameOnly = orgFileName.substring(0,dotLoc);
				fileExt = orgFileName.substring(dotLoc + 1);
				orgFileName = fileNameOnly + "(" + i + ")." + fileExt;
				copyFullPath = dirName + "\\" + orgFileName;
				
				System.out.println(copyFullPath);
				i++;
			}
			else {
				break;
			}
		}
		updateFileName = orgFileName;
		
		return updateFileName;
	}
	
	public void fileCopy(File orgFile, String dirName){
	
		// 1. 복사한 파일을 dirName에 붙인다.
		File copyDir = new File(dirName);
		// dir이 없을 경우
		if(!copyDir.exists()) {
			if(copyDir.mkdir()) {
				System.out.println("성공적으로 새로운 폴더가 생성되었습니다.");
			}
		}
		
		// 2. 파일이름 체크 
		String updateFileName = checkFileName(orgFile, dirName);
		
		File copyFile = new File(dirName + "\\" + updateFileName);
		
		// 3. 필요한 객체 
		try {
			FileInputStream input = new FileInputStream(orgFile);
			FileOutputStream output = new FileOutputStream(copyFile);
			
			long byteSize = orgFile.length();
			
			// 4. 담아둘 메모리 
			byte[] bytes = new byte[(int)byteSize];
			
			while(true) {
				int inNum = input.read(bytes);
				
				if(inNum == -1) {
					break;
				}
			}
			output.write(bytes);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
