class cambiar {
	public static void main(String[] args) {
		gato migato = new gato();
		migato.gato();

		cruz micruz = new cruz();
		micruz.cruz();

		llanta millanta = new llanta();
		millanta.setLlanta("Michelin");
		System.out.println(millanta.getLlanta());

		proceso miproceso = new proceso();
		miproceso.proceso();
	}
}

class llanta {
	private String llanta;

	public String getLlanta() {
		return llanta;
	}

	public void setLlanta(String r) {
		this.llanta = r;
	}
}

class cruz {
	static void cruz() {
		System.out.println("Cruz de cuatro lados");
	}
}

class gato {
	static void gato() {
		System.out.println("Gato de 1.5tl");
	}
}

class proceso {
	static void proceso() {
		System.out.println("Poner el gato y subir el vehiculo\nDestornillar y quitar la llanta dañada\nPoner la nueva llanta y atornillar\nRetirar el gato");
	}
}