package _31_07_23_;

class Vehicle {
	void print() {
		System.out.println("This is Base class");
	}
}

class Car extends Vehicle {
	void tata() {
		System.out.println("This is method of car class");
	}
}

class Plane extends Vehicle {
	void Indigo() {
		System.out.println("This is method of Plane class");
	}
}

class Boat extends Vehicle {

	void yatch() {
		System.out.println("This is method of Boat class");
	}
}

class Submarine extends Vehicle {
	void Smarine() {
		System.out.println("This is method of submarine class");
	}
}

public class InheritanceHierarchical {

	public static void main(String[] args) {
		Car c1 = new Car();
		Plane p1 = new Plane();
		Boat b1 = new Boat();
		Submarine s1 = new Submarine();

		c1.print();
		p1.print();
		b1.print();
		s1.print();

	}

}
