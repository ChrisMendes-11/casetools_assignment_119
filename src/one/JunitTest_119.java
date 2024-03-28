package one;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest_119 {
	
	static add_two_nos_119 obj1;
	static add_two_nos_119 obj2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj1=new add_two_nos_119(10,2);
		obj2=new add_two_nos_119(102,10);

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		int sum=obj1.add();
		assertEquals(12,sum);
	}
	
	@Test
	public void test2() {
		int sum=obj2.add();
		assertEquals(112,sum);
	}

}