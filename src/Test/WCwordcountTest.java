package Test;


import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import gruopwork.WCwordcount;

class WCwordcountTest{
	@Test
	void WCwordcountTest_1(){
		WCwordcount wc = new WCwordcount();
		wc.input.add("assd");
		wc.count();
	}

	@Test
	void WCwordcountTest_2(){
		WCwordcount wc = new WCwordcount();
		wc.input.add("assd");
		wc.input.add("aa");
		wc.input.add("owowo");
		wc.count();
	}

	@Test
	void WCwordcountTest_3(){
		WCwordcount wc = new WCwordcount();
		wc.input.add("p_wq");
		wc.input.add("aa");
		wc.input.add("owowo");
		wc.count();
	}

	@Test
	void WCwordcountTest_4(){
		WCwordcount wc = new WCwordcount();
		wc.input.add("assd");
		wc.input.add("aa");
		wc.input.add("owowo");
		wc.count();
	}

	@Test
	void WCwordcountTest_5(){
		WCwordcount wc = new WCwordcount();
		wc.input.add("oqpwq");
		wc.input.add("\n");
		wc.input.add("owowo");
		wc.count();
	}
	@Test
	void WCwordcountTest_6(){
		WCwordcount wc = new WCwordcount();
		wc.input.add("  ");
		wc.input.add("\n");
		wc.input.add("a");
		wc.count();
	}
	@Test
	void WCwordcountTest_7(){
		WCwordcount wc = new WCwordcount();
		wc.input.add("a");
		wc.input.add(" ");
		wc.input.add("owowo");
		wc.count();
	}
	@Test
	void WCwordcountTest_8(){
		WCwordcount wc = new WCwordcount();
		wc.input.add("fff");
		wc.input.add("fff");
		wc.input.add("fff");
		wc.count();
	}
	@Test
	void WCwordcountTest_9(){
		WCwordcount wc = new WCwordcount();
		wc.input.add("a");
		wc.input.add("b");
		wc.input.add("c");
		wc.count();
	}
	@Test
	void WCwordcountTest_10(){
		WCwordcount wc = new WCwordcount();
		wc.input.add("pwpwp");
		wc.input.add("pwpwp");
		wc.input.add("pwpwp");
		wc.count();
	}
	@Test
	void WCwordcountTest_11(){
		WCwordcount wc = new WCwordcount();
		wc.input.add("1");
		wc.input.add("a");
		wc.input.add("1");
		wc.count();
	}
	@Test
	void WCwordcountTest_12(){
		WCwordcount wc = new WCwordcount();
		wc.input.add("oo");
		wc.input.add("aa");
		wc.input.add("oo");
		wc.count();
	}
	@Test
	void WCwordcountTest_13(){
		WCwordcount wc = new WCwordcount();
		wc.input.add("assd");
		wc.input.add("aa");
		wc.input.add("owowo");
		wc.input.add("assd");
		wc.input.add("aa");
		wc.input.add("owowo");
		wc.input.add("assd");
		wc.input.add("aa");
		wc.input.add("owowo");
		wc.input.add("assd");
		wc.input.add("aa");
		wc.input.add("owowo");
		wc.input.add("assd");
		wc.input.add("aa");
		wc.input.add("owowo");
		wc.input.add("assd");
		wc.input.add("aa");
		wc.input.add("owowo");
		wc.count();
	}
}