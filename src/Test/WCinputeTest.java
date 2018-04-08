package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gruopwork.WCinpute;

class WCinputeTest {

	@Test
	public void test1() throws Exception {
		WCinpute test =new WCinpute();
		String fs[] ={"wc.c"};
		test.inpute(fs);
	}
	@Test
	public void test2() throws Exception {
		WCinpute test =new WCinpute();
		String fs[] ={"wc.txt","wc.c"};
		test.inpute(fs);
	}
	@Test
	public void test3() throws Exception {
		WCinpute test =new WCinpute();
		String fs[] ={"wc.txt","wc.c","defce"};
		test.inpute(fs);
	}
	@Test
	public void test4() throws Exception {
		WCinpute test =new WCinpute();
		String fs[] ={"wc.txt","wc.c","acs.java"};
		test.inpute(fs);
	}
	@Test
	public void test5() throws Exception {
		WCinpute test =new WCinpute();
		String fs[] ={"cnjk.java"};
		test.inpute(fs);
	}
	@Test
	public void test6() throws Exception {
		WCinpute test =new WCinpute();
		String fs[] ={"cdac.c"};
		test.inpute(fs);
	}
	@Test
	public void test7() throws Exception {
		WCinpute test =new WCinpute();
		String fs[] ={"cddddcd"};
		test.inpute(fs);
	}
	@Test
	public void test8() throws Exception {
		WCinpute test =new WCinpute();
		String fs[] ={"vuabusd.ocdjn"};
		test.inpute(fs);
	}
	


}
