
package six;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest_119 {
	static Person_119 obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj=new Person_119("Chris",20);
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
	public void name_test() {
		String name=obj.name;
		assertEquals("Chris",name);
	}
	@Test
	public void age_test() {
		obj.set_age(22);
		int age=obj.display_age();
		assertEquals(22,age);
	}


}
