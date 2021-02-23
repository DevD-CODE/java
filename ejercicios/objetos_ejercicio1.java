class objetos {
	public static void main(String[] args) {
		cafe micafe = new cafe();
		micafe.cafe();

		azucar miazucar = new azucar();
		miazucar.azucar();

		leche mileche = new leche();
		mileche.leche();

		proceso miproceso = new proceso();
		miproceso.proceso();
	}
}

class cafe {
	static void cafe() {
		System.out.println("Dos cucharadas y media de cafe");
	}
}

class azucar {
	static void azucar() {
		System.out.println("2 cucharadas de azucar");
	}
}

class leche {
	static void leche() {
		System.out.println("1/8 de leche");
	}
}

class proceso {
	static void proceso() {
		System.out.println("Verter agua caliente\nHechar el cafe\nPoner azucar\nPoner leche\nRevolver...");
	}
}