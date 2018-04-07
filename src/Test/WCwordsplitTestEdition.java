package Test;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class WCwordsplitTestEdition {
	public ArrayList<String> split(String str){
		String s="";
		String[] str1=str.split("[ ,'\"~`!#%^&*_\\(\\)\\[\\]+=:;|<>.?/[0-9]]");
		ArrayList<String> sing = new ArrayList<String>();
	
		for (String l : str1)
             if (!Pattern.matches("\\s*",l)&&!Pattern.matches("[-]+",l))
            	 sing.add(l);
		for (int i=0;i < sing.size();i++) 
		{
			s = sing.get(i);
			if (Pattern.matches("[a-z]+[-]+",s))
				{
				str1 = s.split("[-]+");
				sing.remove(i);
				sing.add(i,str1[0] );
				}
			else if(Pattern.matches("[-]+[a-z]+",s))
			{
				str1 = s.split("[-]+");
				sing.remove(i);
				sing.add(i,str1[1] );
			}
		}
		for (int i=0;i < sing.size();i++)
			System.out.println(sing.get(i));
			return sing;
}
}