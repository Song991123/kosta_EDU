package ex0223.io;

import java.io.File;

import javax.swing.JOptionPane;

public class FileExam {
    public FileExam() throws Exception{
    	String path = JOptionPane.showInputDialog("파일경로는?");
    	System.out.println(path);
    	File file = new File(path);
    	
    	if(file.exists()) { // 파일이 존재한다면
    		System.out.println(path+"는 있습니다.^^");
    		
    		if(file.isDirectory()) { // 폴더인가?
    			System.out.println("폴더안에 정보를 확인 해볼게요!!");
    			String fileNames [] = file.list(); //list는 String[] 안에 디렉토리 안에 들어있는 폴더 이름이나 파일 이름들을 추출
    			// listFiles()는 실제 그 안에 들어있는 걸 가져오는데 그 안에 들어있는 파일이나 폴더를 가져와서 File 객체로 만들어준다.
    			
    			for(String fname : fileNames) {
    				System.out.println(fname);
    			}
    			
    		}else { // 폴더가 아닌가? 
    			System.out.println("**파일의 정보를 확인해볼께요!!***");
    			System.out.println("file.canRead() = " + file.canRead());
    			System.out.println("file.canWrite() = " + file.canWrite());
    			System.out.println("file.length() = " + file.length());
    			System.out.println("file.getName() = " + file.getName());
    			System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
    			System.out.println("file.lastModified() = " + file.lastModified());
    			
    		}
    		
    	}else { // 파일이 없으면
    		System.out.println(path+"가 없으니 생성할께요.");
    		//파일생성
//    		file.createNewFile();
    		
    		//폴더 생성
    		file.mkdir();
    	}
    	
    	
    }
	public static void main(String[] args) throws Exception {
		new FileExam();

	}

}
