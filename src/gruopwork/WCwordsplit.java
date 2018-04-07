package gruopwork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class WCwordsplit {
	private ArrayList<String> sing = new ArrayList<String>();
	private InputStreamReader inputStreamreader;
    private BufferedReader bufferReader;
    
    public void readFile(File file) throws FileNotFoundException{
    	inputStreamreader = new InputStreamReader(
                new FileInputStream(file));
    	bufferReader = new BufferedReader(inputStreamreader);
    }
    
	public ArrayList<String> split(File file) throws Exception {
		readFile(file);
        String s;
        while ((s = bufferReader.readLine()) != null) {
            String[] word = s.split("[ ,'\"~`!#%^&*_\\(\\)\\[\\]+=:;|<>.?/[0-9]]");
            for (String l : word){
            	if (!Pattern.matches("\\s*",l)&&!Pattern.matches("[-]+",l))   
               	 sing.add(l);
            } 	
        for (int i=0;i < sing.size();i++) 
		{
			s = sing.get(i);
			if (Pattern.matches("[a-z]+[-]+",s))
				{
				word = s.split("[-]+");
				sing.remove(i);
				sing.add(i,word[0] );
				}
			else if(Pattern.matches("[-]+[a-z]+",s))
			{
				word = s.split("[-]+");
				System.out.println(word.length);
				sing.remove(i);
				sing.add(i,word[1] );
			}
		}
        }
        inputStreamreader.close();
        bufferReader.close();
        return sing;
           
    }
    
}
