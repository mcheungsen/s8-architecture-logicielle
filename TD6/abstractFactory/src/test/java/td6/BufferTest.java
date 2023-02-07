package td6;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import td6.Algorithmes.Buffer;
import td6.Algorithmes.Fibonacci;
import td6.Algorithmes.Padovan;

public class BufferTest {
	Buffer b;
	Fibonacci fibonacci;
	Padovan padovan;

	@Before
	public void initialize(){
		b = new Buffer(new Fibonacci());
		fibonacci = new Fibonacci();
		padovan = new Padovan();
	}

	@Test
	public void testBuffer() throws Exception {
		// test mêmes valeurs Fibonacci
		for(int i = 0; i <= 10; i++){
			assertEquals(fibonacci.getVal(i), b.getVal(i), 0.0);
			// Deuxième fois pour tester le cache
			assertEquals(fibonacci.getVal(i), b.getVal(i), 0.0);
		}

	}

}
