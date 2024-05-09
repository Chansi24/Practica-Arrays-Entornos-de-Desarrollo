package util;

import java.util.Arrays;

public abstract class MisArrays {
	/**
	 * 
	 * @param notas
	 * @return dado un array de notas, en primer lugar comprueba que las notas estén comprendidas entre 0 y 10
	 * y luego calcula la media de las notas introducidas
	 */
	public static float mediaNotas(int[] notas) throws IllegalArgumentException{
		for (int i=0;i<notas.length;i++) {
			if (notas[i]<0||notas[i]>10) {
				 throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
			}
		}
		float sum = 0;
		for (float nota : notas) {
			sum += nota;
			}
		return (float) sum / notas.length;
		}
	                            
}
