import java.util.Scanner;
public class CiclosJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/
		
		/*
		 * Ciclo For
		 * for (variable de inicialización; variable de inicialización < 10; variable++);
		 
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
			
			*/
		
		/* Crear un metodo que reciba por parametro un número y nos muestre la 
		 * tabla de multiplicar de ese número
		 * Ejemplo:
		 * 1 X 1 = 1
		 * 1 X 2 = 2
		 * 1 X 3 = 3
		 * ...
		 * 1 X 10 = 10
		 */

		
Scanner leer = new Scanner(System.in);
		/*
		
		System.out.println("Bienvenido al generador de tablas de multiplicar. Ingresa un número entero: ");
		int num = leer.nextInt();
		
		tablas(num);
		
		*/

/*
System.out.println("Bienvenido a la calculadora de números pares e impares. Introduce el número entero límite a sumar:");
int numSum = leer.nextInt();
		
paresOimpares(numSum);



/* 
 * Ciclo while
 * 
 * while (condicion) {
 * codigo
 * codigo
 * codigo
 * }
 * 
 * 
 *  Escribir un programa que pida 2 numeros por consola de manera reiterada
		 * La ejecución del programa terminará cuando los numeros ingresados sean
		 * iguales.
		 * 
		 * Nota: utilizar un ciclo while
		 * 
		 * 
		 * Ciclo do while
		 * 
		 * do {
		 * codigo
		 * codigo
		 * codigo
		 * } while (condicion) {
		 * codigo
		 * }
		 */

/*
System.out.println("Bienvenido, escribe un número: ");
int num1 = leer.nextInt();
System.out.println("Ahora, escribe otro número: ");
int num2 = leer.nextInt();

while(num1 != num2) {
	
	System.out.println("Bienvenido, escribe un número: ");
	num1 = leer.nextInt();

	System.out.println("Ahora, escribe otro número: ");
	num2 = leer.nextInt();
}

System.out.println("Sus números son iguales, ¡felicidades!");
	
*/

int num1 = 0;
int num2 = 0;

do {
	System.out.println("Bienvenido, escribe un número: ");
	num1 = leer.nextInt();

	System.out.println("Ahora, escribe otro número: ");
	num2 = leer.nextInt();
} while (num1 != num2);

leer.close();
System.out.println("Sus números son iguales, ¡felicidades!");

	}

	/*
	 * public static void tablas(int num) {
		System.out.println("Estas son las tablas, del 1 al 10, de " + num + ":");
		
		for (int i = 1; i < 11; i++) {
			int resultado = num * i; 
			System.out.println(num + " x " + i + " = " + resultado);
	}

} 

*/

/*
	
	public static void paresOimpares(int numSum) {
		int sumPar = 0;
		int sumImp = 0;
		for (int i = 1; i <= numSum; i++) {
			if (i % 2 == 0) {
				sumPar = sumPar + i; 
			} else {
				sumImp = sumImp + i; 
			}
		}
		System.out.println("Aquí están tus resultados: ");
		System.out.println("La suma de los números pares, hasta " + numSum + ", es " + sumPar);
		System.out.println("La suma de los números impares, hasta " + numSum + ", es " + sumImp);
	}
	
		*/
	


}
	
