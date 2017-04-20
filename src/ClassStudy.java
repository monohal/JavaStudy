import java.util.ArrayList;

public class ClassStudy {
	public static void main(String args[]){
		profile();
		studyArray();
	}

	public static void profile(){
		//コンストラクタを呼び出す
		Human ito = new Human("ito", 22);
		Human kami = new Human("kami", 50);
		Human sato = new Human();

		System.out.println(ito.name);
		System.out.println(ito.age);
		System.out.println(kami.name);
		System.out.println(kami.age);

		System.out.println(sato.name);

		ito.myNameIs();
		kami.myNameIs();
		sato.myNameIs();

		ito.whatYourName();
		kami.whatYourName();

		ito.birthDay();

		ito.whatYourName();
		kami.whatYourName();

		String result;
		// これはコンストラクタではない
		result = ito.Human("ito", 22);
		System.out.println(result);
		ito.whatYourName();
	}

	public static void studyArray(){
		ArrayList<String> array = new ArrayList<>();
		array.add("zero");
		array.add("first");
		array.add("second");
		array.add("thrid");

		//array.add(4); error
		Integer a = new Integer(4);

		/*
		 * int b = 4; Integerとintは別物
		 * Integer はオブジェクト
		 * int はプリミティブ（原始的）
		 */

		//Integer型のtoStringという関数を用いている
		//返り値はString型
		String strA = a.toString();
		array.add(strA);

		System.out.println(array.size());

		System.out.println(array.get(2));
		array.set(2, "2");
		System.out.println(array.get(2));

		System.out.println(array.indexOf("first"));

		double c = 5.5;
		int d = (int)c;

		ArrayList<String> array2 = (ArrayList<String>)array.clone();
	}
}
