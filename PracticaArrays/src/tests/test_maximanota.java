package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class test_maximanota {
	static int[]arraybueno;
	static int[]arraymalo;	
	@BeforeAll
	static void arrays() {
		arraybueno= new int[]{4,9,1,5,6};
		arraymalo =new int[]{2,5,12,5,8};			
	}
	@Test
	void testMaximaNotaValida(){
		float maximaEsperada=9;
		float maximaObtenida=MisArrays.maximaNota(arraybueno);
		assertEquals(maximaEsperada, maximaObtenida);
	}
	
	@Test
	void testMaximaNotaInvalida(){
		assertThrows(IllegalArgumentException.class,()->MisArrays.maximaNota(arraymalo));
	}
}

