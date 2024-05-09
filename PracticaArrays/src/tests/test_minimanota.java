package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class test_minimanota {
	static int[]arraybueno;
	static int[]arraymalo;	
	@BeforeAll
	static void arrays() {
		arraybueno= new int[]{4,9,1,5,6};
		arraymalo =new int[]{2,5,12,5,8};			
	}
	@Test
	void testMinimaNotaValida(){
		float minimaEsperada=1;
		float minimaObtenida=MisArrays.minimaNota(arraybueno);
		assertEquals(minimaEsperada, minimaObtenida);
	}
	
	@Test
	void testMinimaNotaInvalida(){
		assertThrows(IllegalArgumentException.class,()->MisArrays.minimaNota(arraymalo));
	}
}

