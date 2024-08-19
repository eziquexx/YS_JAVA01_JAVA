package ch08.sec13;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplClass impl = new ImplClass();
		
		impl.methodA();
		impl.methodB();
		impl.methodC();
		
		System.out.println("--------------------------\n");
		
		InterfaceA ia = impl;
		ia.methodA();
		
		System.out.println();

		InterfaceB ib = impl;
		ib.methodA();
		ib.methodB();

		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}

}
