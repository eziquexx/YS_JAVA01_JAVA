package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1 = Singleton.getInstance();
		obj1.color = "yellow";
		Singleton obj2 = Singleton.getInstance();
		System.out.printf("%s \n", obj2.color);
		
		System.out.printf("%s \n", System.identityHashCode(obj1));
		System.out.printf("%s \n", System.identityHashCode(obj2));
		
		System.out.println(obj1 == obj2);
	}

}
