
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TicTest {
	@Test
	public void testInvalidUpdateBoard() {
		Tic.updateBoard(5);
		assertFalse(Tic.updateBoard(5));		
	}

	@Test
	public void testValidUpdateBoard() {
		Tic t = new Tic();
		assertTrue(t.updateBoard(8));		
	}

	@Test
	public void testInvalidInput() {
		IllegalArgumentException e = null;
		try {
			Tic.updateBoard(-1);
		} catch (IllegalArgumentException ex) {
			e = ex;
		}
		if (e != null) {
			assertEquals(e.getMessage(), "Invalid Input");
		}
	}

	@Test
	public void testValidInputLetter() {
		assertTrue(Tic.updateBoard(2));		
	}
	
}
