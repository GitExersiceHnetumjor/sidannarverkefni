
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
	
}
