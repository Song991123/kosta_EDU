package ex0223.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class FileCopyExam {

	public FileCopyExam(String readFile, String writeFile) {
		long start = System.nanoTime();
		BufferedInputStream bfInput       =  null;
		BufferedOutputStream bfOutput = null;
		try {
			// readFile에 있는 내용을 읽어서 writeFile에 저장한다. (Buffered 사용)
			bfInput    = new BufferedInputStream(new FileInputStream(readFile));
			bfOutput = new BufferedOutputStream(new FileOutputStream(writeFile, true));
			
			byte[] buffer = new byte[1024];
			int readCount;

			while((readCount = bfInput.read(buffer)) != -1) {
			    bfOutput.write(buffer, 0, readCount);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bfInput.close();
				bfOutput.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		
		long end  = System.nanoTime();
		
		System.out.println((end - start) + "ns");
	}
	public static void main(String[] args) {
		String readFile = JOptionPane.showInputDialog("읽을 파일명은?");
		String writeFile = JOptionPane.showInputDialog("저장할 파일명은?");
		
		new FileCopyExam(readFile, writeFile);
	}

}
