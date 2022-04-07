package Pkg.io;

import java.io.*;

public class io {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		String lineStr = br.readLine(); 
		System.out.println(lineStr);
	}

}
