import java.util.ArrayList;

public class HelloWorld {

	public static void main(String args[]){
		System.out.println("HelloWorld");
		int a = 0;
		a = a + 10;
		System.out.println(a);

		ArrayList<Integer> list = new ArrayList<>();
		list.add(a);
		System.out.println(list.size());
		System.out.println(list.get(0));

		if(a == 10){
			// a == 10 の場合
		}else if(a > 5){
			/* 10ではなく
			 * a > 5 の場合
			 */
		}else{
			//それ以外
		}

		for(int i = 0; i < 10; i++){
			System.out.println(i + "hello");
		}

		// System.out.println(i); error

		int[] array = new int[10];

		for(int i = 0; i < 10; i++){
			array[i] = i;
		}

		for(int i = 0; i < 10; i++){
			System.out.println(array[i]);
		}

		for(int j = 0; j < 10; j++){
			array[j] = j * 2;
		}

		for(int i = 0; i < 10; i++){
			System.out.println(array[i]);
		}

		//System.out.println(array[10]); error

		String str = "Hello";
		print(str);
		print();

		String strB = "World";
		print(str, strB);

		int intA = 5;

		print(intA);

	}

	public static void print(String a){
		System.out.println(a);
	}

	public static void print(int a){
		Integer ObjA = a;
		print(ObjA.toString());
	}

	public static void print(String a, String b){
		print(a + b);
	}


	public static void print(){
		print("HelloWorld");
	}
}
