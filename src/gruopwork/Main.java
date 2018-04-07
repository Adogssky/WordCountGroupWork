package gruopwork;

import java.util.*;

public class Main {
	static ArrayList<String> postSplit;
	static String outputContent;
	public static void main(String args[]) throws Exception 
	{
		
		WCinpute inputPart = new WCinpute();	
		WCwordsplit wordSplitPart = new WCwordsplit();
		WCoutput outputPart = new WCoutput();
		WCwordcount wordCountPart = new WCwordcount();
		postSplit = wordSplitPart.split(inputPart.inpute(args));
		wordCountPart.setInput(postSplit);
		wordCountPart.count();
		outputContent = outputPart.contentConstruct(wordCountPart.list);
		outputPart.writeFile(outputContent);
	}
}
