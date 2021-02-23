class herencia1 {
	public herencia1() {
		System.out.println("Valor A"); // Dato
	}
}

class herencia2 extends herencia1 {
	public herencia2() {
		System.out.println("Valor B"); // Dato
	}
}

class programa {
	public static void main(String[] args) {
		herencia2 obj = new herencia2(); // Invocamos "herencia2" sobre "obj"
	}
}

// Polimorfismo
class Animal {
	public void makeSound() {
		System.out.println("grr..."); // Dato
	}
}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("Meow"); // Dato
	}
}

class Dog extends Animal {
	public void makeSound() {
		System.out.println("Woof"); // Dato
	}
}

class Animals {
	public static void main(String[] args) {
		Animal a = new Cat(); // Objeto dentro de Cat
		Animal b = new Dog(); // Objeto dentro de Dog

		a.makeSound(); // Invocamos
		b.makeSound(); // Invocamos
	}
}
