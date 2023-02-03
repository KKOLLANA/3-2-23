package supermethod;

public class Parent {
	
	int a,b;
	Parent(int a, int b){
		this.a = a;
		this.b = b;
	}

	void f1() {
		System.out.println("inside Parent f1()");
	}
}
