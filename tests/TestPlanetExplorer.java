import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	
	@Test
	public void consturctorTest(){
		PlanetExplorer pe = new PlanetExplorer(1,1, "");
		assertNotNull(pe);
		
	}
	
	@Test
	public void obstacles(){
		int gridX=3;
		int gridY=3;
		String obstacles = "(1,1)";
		
		PlanetExplorer pe = new PlanetExplorer(gridX,gridY, obstacles);
		assertNotNull(pe);
		
		
	}
	
	@Test
	public void positionsForward(){
		int gridX=3;
		int gridY=3;
		String obstacles = "(2,2)";
		
		PlanetExplorer pe = new PlanetExplorer(gridX,gridY, obstacles);
		
		assertEquals("(1,0,N)",pe.executeCommand("f") );
	}
	
	
	@Test
	public void positionsBackward(){
		int gridX=3;
		int gridY=3;
		String obstacles = "(2,2)";
		
		PlanetExplorer pe = new PlanetExplorer(gridX,gridY, obstacles);
		
		assertEquals("(-1,0,N)",pe.executeCommand("b") );
	}
	
	
}
