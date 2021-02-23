interface cafeteria {
	public void cafe();
	public void galletas();
}

class salida implements cafeteria {
	public void cafe() {
		System.out.println("El cafe esta caliente"); // Dato
	}

	public void galletas() {
		System.out.println("Hay 3 paquetes de galletas"); // Dato
	}
}