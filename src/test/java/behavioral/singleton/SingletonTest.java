package behavioral.singleton;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SingletonTest {

	static Singleton singleton1;
	static Singleton singleton2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		singleton1 = Singleton.getInstance();
		singleton2 = Singleton.getInstance();
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
	public void test() throws Exception {
		assertSame(singleton1, singleton2);
	}

}
