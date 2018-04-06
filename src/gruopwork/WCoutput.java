package gruopwork;
import java.io.*;
import java.util.List;
import java.util.Map;

public class WCoutput {
	public static void writeFile(String outputFilePath, String outputFileContent) throws IOException 
	{
		outputFilePath = "result.txt";
        try {  
            File file = new File(outputFilePath);  
            if (!file.exists()) {  
	            file.createNewFile();  
	        } 
            FileWriter fw = new FileWriter(outputFilePath, true);  
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(outputFileContent);
            bw.close();
            fw.close(); 
        } catch (FileNotFoundException e) {   
            e.printStackTrace();  
        }		
	}
	
	//输出文件内容构造
	public static String contentConstruct(List<Map.Entry<String, Integer>> list) throws IOException 
	{
		String outputFileContent = "";
		for(Map.Entry<String,Integer> entry: list)
		{
			outputFileContent += entry.getKey() + " " + entry.getValue() + "\r\n";
        }	
		return outputFileContent;
	}
}
