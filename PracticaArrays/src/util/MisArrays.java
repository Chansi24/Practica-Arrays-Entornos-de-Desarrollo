package util;

import java.util.Arrays;

public abstract class MisArrays {
	/**
	 * 
	 * @param notas
	 * @return dado un array de notas, en primer lugar comprueba que las notas estén comprendidas entre 0 y 10
	 * y luego calcula la media de las notas introducidas.
	 * @throws IllegalArgumentException
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
	
	/**
	 * 
	 * @param notas
	 * @return dado un arrays de notas, en primer lugar comprueba que las notas estén comprendidas entre
	 * 0 y 10 y luego devolverá un float con la mediana de las notas del array.
	 * @throws IllegalArgumentException
	 */
	public static float medianaNotas(int[] notas) throws IllegalArgumentException {
		for (int i=0;i<notas.length;i++) {
			if (notas[i]<0||notas[i]>10) {
				 throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
			}
		}
		Arrays.sort(notas);
		int middle = notas.length / 2;
		if (notas.length % 2 == 0) {
			return (float) (notas[middle - 1] + notas[middle]) / 2;
			}
		else {
			return notas[middle];			
			}
		}
	
	/**
	 * 
	 * @param notas
	 * @return en primer lugar comprueba que las notas introducidas en el array estén entre 0 y 10
	 * en segundo lugar nos devuelve la máxima nota de las notas introducidas.
	 * @throws IllegalArgumentException
	 */
	public static int maximaNota(int[] notas) throws IllegalArgumentException {
		for (int i=0;i<notas.length;i++) {
			if (notas[i]<0||notas[i]>10) {
				 throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
			}
		}
		int max = notas[0];
		for (int nota : notas) {
			if (nota > max) {
				max = nota;
				}
			}
		return max;
		}
	/**
	 * 
	 * @param notas
	 * @return en primer lugar comprueba que las notas introducidas en el array estén entre 0 y 10,
	 * después devuelve la menor nota de las existentes en el array
	 */
	public static int minimaNota(int[] notas) {
		for (int i=0;i<notas.length;i++) {
			if (notas[i]<0||notas[i]>10) {
				 throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
			}
		}
		int min = notas[0];
		for (int nota : notas) {
			if (nota < min) {
				min = nota;
				}
			}
		return min;
		}
}
