package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class WCwordsplitTest {
	public static WCwordsplitTestEdition Test1 = new WCwordsplitTestEdition();
	private String s1 ="ab-d table1-2";
	private String s2 ="ab-6d table1-2";
	private String s3 ="a65d";
	private String s4 ="a--";
	private String s5 ="a68-d";
	private String s6 ="a68-d 1da3";
	private String s7 ="let's";
	private String s8 ="\"a";
	private String s9 ="(see Box 3-2).8885d_c01_016";
	private String s10 ="a68 \"d";
	private String s11 ="a--68-d";
	private String s12 ="a'd123";
	private String s13 ="software";
	private String s14 ="6d--";
	private String s15 ="--d6";
	private String s16 ="table,100yuan";
	private String s17 ="[\"love\"]";
	private String s18 =":y!o~u-";
	private String s19 ="d - a222d";
	private String s20 ="dream-girl-ssss";
	
	@Test
		public void test() {
			fail("Not yet implemented");
		}

		@Test
		public void testSplit1(){
			ArrayList<String> result1 = new ArrayList<String>();
			result1.add("ab-d");
			result1.add("table");
			assertEquals(result1,Test1.split(s1));
		}
		
		@Test
		public void testSplit2(){
			ArrayList<String> result2 = new ArrayList<String>();
			result2.add("ab");
			result2.add("d");
			result2.add("table");
			assertEquals(result2,Test1.split(s2));
		}
		
		@Test
		public void testSplit3(){
			ArrayList<String> result3 = new ArrayList<String>();
			result3.add("a");
			result3.add("d");
			assertEquals(result3,Test1.split(s3));
		}
		
		@Test
		public void testSplit4(){
			ArrayList<String> result4 = new ArrayList<String>();
			result4.add("a");
			assertEquals(result4,Test1.split(s4));
		}
		
		@Test
		public void testSplit5(){
			ArrayList<String> result5 = new ArrayList<String>();
			result5.add("a");
			result5.add("d");
			assertEquals(result5,Test1.split(s5));
		}
		
		@Test
		public void testSplit6(){
			ArrayList<String> result6 = new ArrayList<String>();
			result6.add("a");
			result6.add("d");
			result6.add("da");
			assertEquals(result6,Test1.split(s6));
		}
		
		@Test
		public void testSplit7(){
			ArrayList<String> result7 = new ArrayList<String>();
			result7.add("let");
			result7.add("s");
			assertEquals(result7,Test1.split(s7));
		}
		
		@Test
		public void testSplit8(){
			ArrayList<String> result8 = new ArrayList<String>();
			result8.add("a");
			assertEquals(result8,Test1.split(s8));
		}
		
		@Test
		public void testSplit9(){
			ArrayList<String> result9 = new ArrayList<String>();
			result9.add("see");
			result9.add("Box");
			result9.add("d");
			result9.add("c");
			assertEquals(result9,Test1.split(s9));
		}
		
		@Test
		public void testSplit10(){
			ArrayList<String> result10 = new ArrayList<String>();
			result10.add("a");
			result10.add("d");
			assertEquals(result10,Test1.split(s10));
		}
		
		@Test
		public void testSplit11(){
			ArrayList<String> result11 = new ArrayList<String>();
			result11.add("a");
			result11.add("d");
			assertEquals(result11,Test1.split(s11));
			
		}
		
		@Test
		public void testSplit12(){
			ArrayList<String> result12 = new ArrayList<String>();
			result12.add("a");
			result12.add("d");
			assertEquals(result12,Test1.split(s12));
		}
		
		@Test
		public void testSplit13(){
			ArrayList<String> result13 = new ArrayList<String>();
			result13.add("software");
			assertEquals(result13,Test1.split(s13));
		}
		
		@Test
		public void testSplit14(){
			ArrayList<String> result14 = new ArrayList<String>();
			result14.add("d");
			assertEquals(result14,Test1.split(s14));
		}
		
		@Test
		public void testSplit15(){
			ArrayList<String> result15 = new ArrayList<String>();
			result15.add("d");
			assertEquals(result15,Test1.split(s15));
		}
		
		@Test
		public void testSplit16(){
			ArrayList<String> result16 = new ArrayList<String>();
			result16.add("table");
			result16.add("yuan");
			assertEquals(result16,Test1.split(s16));
		}
		
		@Test
		public void testSplit17(){
			ArrayList<String> result17 = new ArrayList<String>();
			result17.add("love");
			assertEquals(result17,Test1.split(s17));
		}
		
		@Test
		public void testSplit18(){
			ArrayList<String> result18 = new ArrayList<String>();
			result18.add("y");
			result18.add("o");
			result18.add("u");
			assertEquals(result18,Test1.split(s18));
		}
		
		@Test
		public void testSplit19(){
			ArrayList<String> result19 = new ArrayList<String>();
			result19.add("d");
			result19.add("a");
			result19.add("d");
			assertEquals(result19,Test1.split(s19));
		}
		
		@Test
		public void testSplit20(){
			ArrayList<String> result20 = new ArrayList<String>();
			result20.add("dream-girl-ssss");
			assertEquals(result20,Test1.split(s20));
		}
		
		
}