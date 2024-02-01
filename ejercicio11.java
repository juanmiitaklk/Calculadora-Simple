
package es.studium.Tablas;



import java.util.Scanner;



public class ejercicio11

{

	public static void main(String[] args)

	{

		final int FILAS = 3;

		final int COLUMNAS = 3;

		int matriz[][] = new int[FILAS][COLUMNAS];

		Scanner teclado = new Scanner(System.in);

		boolean simetrica = true;

		for(int i = 0; i < FILAS; i++)

		{

			for(int j = 0; j < COLUMNAS; j++)

			{

				System.out.println("Matriz["+i+"]["+j+"]");

				matriz[i][j] = teclado.nextInt();

			}

		}

		teclado.close();

		for(int i = 0; i < FILAS; i++)

		{

			for(int j = 0; j < COLUMNAS; j++)

			{

				if(matriz[i][j] != matriz[j][i])

				{

					simetrica = false;

				}

			}

		}

		if(simetrica==true)

		{

			System.out.println("Es simétrica");

		}

		else

		{

			System.out.println("No es simétrica");

		}

	}

}


