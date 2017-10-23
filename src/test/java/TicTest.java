
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
	
	@Test
	public void testTrueWinner() {
		Tic t = new Tic();
		t.updateBoard(1);
		t.updateBoard(2);
		t.updateBoard(3);
		t.updateBoard(4);
		t.updateBoard(5);
		t.updateBoard(6);
		t.updateBoard(7);
		assertTrue(t.isWinner());
		assertEquals(t.player(), 'X');
	}

	@Test
	public void testFalseWinner() {
		Tic t = new Tic();
		t.updateBoard(1);
		assertFalse(Tic.isWinner());
	}

	@Test
	public void testDraw() {
		Tic t = new Tic();
		t.updateBoard(1);
		t.updateBoard(2);
		t.updateBoard(3);
		t.updateBoard(4);
		t.updateBoard(5);
		t.updateBoard(6);
		t.updateBoard(7);
		t.updateBoard(8);
		t.updateBoard(9);
		assertTrue(Tic.isDraw());
	}

	@Test
	public void testNotDraw() {
		Tic t = new Tic();
		t.updateBoard(1);
		t.updateBoard(2);
		t.updateBoard(3);
		t.updateBoard(4);
		t.updateBoard(5);
		assertFalse(Tic.isDraw());
	}
}
