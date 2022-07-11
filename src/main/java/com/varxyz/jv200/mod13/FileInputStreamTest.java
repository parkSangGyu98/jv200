package com.varxyz.jv200.mod13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int totalBytes = 0; //읽은 byte 수
		try {
			try {
				fis = new FileInputStream("test.txt");
				fos = new FileOutputStream("test_makeCopy.txt");
				for( int readByte; (readByte = fis.read()) != -1; ){
					System.out.write(readByte);
					fos.write(readByte);
					totalBytes++;
				}
			}finally {
				fos.close();
				fis.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("\n전체 바이트 수 : " + totalBytes + "bytes.");
	}
}
