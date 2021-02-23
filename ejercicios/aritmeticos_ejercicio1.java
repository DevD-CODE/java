public class aritmeticos_ejercicio1 {
	public static void main(String[] args) {
		int[] res = {3,5,6,4};
		int[] operaciones = {0,0,0,0,0};

		operaciones[0] = res[0]+res[3]; System.out.println("Suma : "+operaciones[0]);
		operaciones[1] = res[2]/res[1]; System.out.println("Division : "+operaciones[1]);
		operaciones[2] = res[3]*res[1]; System.out.println("Multiplicacion : "+operaciones[2]);
		operaciones[3] = res[2]-res[3]; System.out.println("Resta : "+operaciones[3]);
		operaciones[4] = (res[1]+res[2]+res[3])*res[0]; System.out.println("Avanzada : "+operaciones[4]);
	}
}