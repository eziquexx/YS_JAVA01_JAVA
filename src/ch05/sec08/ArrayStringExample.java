package ch05.sec08;

public class ArrayStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[4];
		strArray[0] = "java";
		strArray[1] = "java script";
		strArray[2] = new String("java");
		strArray[3] = strArray[0];

//		String[] newArray = strArray; //얕은복사
		//깊은복사 수동
//		String[] newArray = new String[4];
//		for(int i =0; i<newArray.length; i++) {
//			newArray[i] = strArray[i];
//		}
		
		String[] newArray = new String[4];
		System.arraycopy(strArray, 0, newArray, 1, 3);
		
		printArr(strArray);
		printArr(newArray);
//		strArray[0] = "c++";
//		newArray[0] = "c#";
//		newArray[2] = "delphy";
//		printArr(strArray);
//		printArr(newArray);
		
		
		
		
	}
	
	public static void printArr(String[] Arr) {
		for(int idx =  0; idx < Arr.length; idx++) {
			int iTempo = System.identityHashCode(Arr[idx]);
			System.out.printf("주소:%d, 값:%s\n",iTempo, Arr[idx]);
			
		}
		System.out.println("------------------");
	}

}
