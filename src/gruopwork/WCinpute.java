package gruopwork;
import java.io.*;
import java.util.*;

public class WCinpute {
	public File inpute(String args[]) throws Exception{
		File f=null;
		if(args==null){
			System.out.println("����Ϊ�գ����������룡");
		}
		else if(args.length==0){
			System.out.println("��������Ҫ���в�����Ŀ���ļ���");
		}
		else if(args.length>1){
			System.out.println("�������һ��Ŀ���ļ���");
		}
		else if(args[0].endsWith(".txt")){
			f =new File(args[0]);
			if(!f.exists()){
				System.out.println("���ļ������ڣ����������룡");
			}	
		}
		else{
			System.out.println("��������ȷ���ļ���ʽ����׺��Ϊ.txt��");
		}
		return f;
	}	
}
