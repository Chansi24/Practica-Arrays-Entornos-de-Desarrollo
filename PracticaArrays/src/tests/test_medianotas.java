package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class test_medianotas {
	
	static int[]arraybueno;
	static int[]arraymalo;	
	@BeforeAll
	static void arrays() {
		arraybueno= new int[]{4,9,1,5,6};
		arraymalo =new int[]{2,5,12,5,8};			
	}
	@Test
	void testMediaNotasValidas(){
		float mediaEsperada=5;
		float mediaObtenida=MisArrays.mediaNotas(arraybueno);
		assertEquals(mediaEsperada, mediaObtenida);
	}
	
	@Test
	void testMediaNotasInvalidas(){
		assertThrows(IllegalArgumentException.class,()->MisArrays.mediaNotas(arraymalo));
	}
}
