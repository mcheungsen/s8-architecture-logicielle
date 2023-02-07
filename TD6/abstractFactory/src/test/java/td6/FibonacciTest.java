package td6;

import static org.junit.Assert.assertTrue;

import java.nio.file.FileVisitOption;

import org.junit.Before;
import org.junit.Test;

import td6.Algorithmes.Fibonacci;

public class FibonacciTest {

	private Fibonacci fibonacci;

	@Before
	public void initialize(){
		fibonacci = new Fibonacci();
	}

	@Test
	public void testGetName() throws Exception {
		assertTrue(fibonacci.getName().equals("Fibonacci"));
	}

	@Test
	public void testGetVal() throws Exception {

	}

}
