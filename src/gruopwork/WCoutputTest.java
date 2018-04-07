package gruopwork;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class WCoutputTest {
	
	//�����ļ����Բ���
	static Map<String,Integer> map = new HashMap<String,Integer>();
	static List<Map.Entry<String, Integer>> list = new ArrayList<>();
	static InputStreamReader inputStreamreader;
    static BufferedReader bufferReader;
	@Test
	//д�ļ�����1
	void testWriteFile_1() throws IOException {
		WCoutput.writeFile("fda");
		
	}
	
	
	//д�ļ�����2
	@Test
	void testWriteFile_2() throws IOException {
		WCoutput.writeFile("1");
		
	}
	
	//д�ļ�����3
	@Test
	void testWriteFile_3() throws IOException {
		WCoutput.writeFile("1");
		WCoutput.writeFile("eqwe");
		
	}
	
	
	//д�ļ�����4
	@Test
	void testWriteFile_4() throws IOException {
		WCoutput.writeFile("1fafaf");
	}
	
	//д�ļ�����5
	@Test
	void testWriteFile_5() throws IOException {
		WCoutput.writeFile("s");
		
	}
	
	//�ļ��������1
	@Test
	void testContentConstruct_1() throws IOException {
		map.put("sa",1);
		for(Map.Entry<String, Integer> entry : map.entrySet()){
            list.add(entry); 
       }
		WCoutput.contentConstruct(list);
		
	}

	//�ļ��������2
	@Test
	void testContentConstruct_2() throws IOException {
		map.put(" ",1);
		for(Map.Entry<String, Integer> entry : map.entrySet()){
            list.add(entry); 
       }
		WCoutput.contentConstruct(list);
	}
	
	//�ļ��������3
	@Test
	void testContentConstruct_3() throws IOException {
		map.put("sa",1);
		map.put("dad", 2);
		for(Map.Entry<String, Integer> entry : map.entrySet()){
            list.add(entry); 
       }
		WCoutput.contentConstruct(list);
		
	}
	//�ļ��������4
	@Test
	void testContentConstruct_4() throws IOException {
		map.put("sa",1);
		map.put("mmp", 1);
		for(Map.Entry<String, Integer> entry : map.entrySet()){
            list.add(entry); 
       }
		WCoutput.contentConstruct(list);
	}
	
	//�ļ��������5
	@Test
	void testContentConstruct_5() throws IOException {
		map.put("sa",1);
		map.put("cnm", 1);
		for(Map.Entry<String, Integer> entry : map.entrySet()){
            list.add(entry); 
       }
		WCoutput.contentConstruct(list);		
	}

	//�ۺϲ���1
	@Test
	void testAll_1() throws IOException {
		String outputFileContent;
		map.put("sa",1);
		map.put("cnm", 1);
		for(Map.Entry<String, Integer> entry : map.entrySet()){
            list.add(entry); 
       }
		outputFileContent = WCoutput.contentConstruct(list);	
		WCoutput.writeFile(outputFileContent);
	}

	//�ۺϲ���2
	@Test
	void testAll_2() throws IOException {
		String outputFileContent;
		map.put("sa",1);
		map.put("mmp", 1);
		for(Map.Entry<String, Integer> entry : map.entrySet()){
            list.add(entry); 
       }
		outputFileContent = WCoutput.contentConstruct(list);	
		WCoutput.writeFile(outputFileContent);
	}
	
	//�ۺϲ���3
	@Test
	void testAll_3() throws IOException {
		String outputFileContent;
		map.put(" ", 1);
		for(Map.Entry<String, Integer> entry : map.entrySet()){
            list.add(entry); 
       }
		outputFileContent = WCoutput.contentConstruct(list);	
		WCoutput.writeFile(outputFileContent);
	}

	//���ļ��Ƚ�
	@Test
	void testReadFile() throws IOException {
		File file = new File("result.txt"); 
		inputStreamreader = new InputStreamReader(new FileInputStream(file));
    	bufferReader = new BufferedReader(inputStreamreader);
    	String s;
        while ((s = bufferReader.readLine()) != null) {
            System.out.println(s);
            } 	
        inputStreamreader.close();
        bufferReader.close();
	}
	
}
