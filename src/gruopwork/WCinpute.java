package gruopwork;
import java.io.*;
import java.util.*;

public class WCinpute {
	public File inpute(String args[]) throws Exception{
		File f=null;
		if(args==null){
			System.out.println("输入为空，请重新输入！");
		}
		else if(args.length==0){
			System.out.println("请输入你要进行操作的目标文件！");
		}
		else if(args.length>1){
			System.out.println("请仅输入一个目标文件！");
		}
		else if(args[0].endsWith(".txt")){
			f =new File(args[0]);
			if(!f.exists()){
				System.out.println("该文件不存在，请重新输入！");
			}	
		}
		else{
			System.out.println("请输入正确的文件格式，后缀名为.txt！");
		}
		return f;
	}	
}
