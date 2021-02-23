class sandwich {
public static void main(String[] args) {
		crear doble=new crear(); // Creamos un sandwich doble
		crear tostadora=new crear(); // Creamos una tostadora
		doble.setIngredientes("pan integral, mayonesa, queso derretido, tomate, doble carne molida, mostaza");

		System.out.println(doble.getIngredientes()); // Dato
		tostadora.tostado(); // Invocar metodo
	}
}

class crear {
		private String ingredientes; // Creamos objeto

		public String getIngredientes() {
			return ingredientes; // Retornamos el valor a ingredientes
			                     // Este valor sera obtenido
		}

		public void setIngredientes(String r) {
			this.ingredientes = r; // Almacenamos el valor
		}

		static void tostado() {
			System.out.println("\n");
			System.out.println("Tostando..."); // Dato
		}
}