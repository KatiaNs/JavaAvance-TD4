package fr.dauphine.javaavance.td3;

public class Main {

	public static void main(String[] args) {
		MyList<Object> list = new MyList<Object>();

		list.addLast("tatu");
		list.add("toto");
		list.add("titi");
		list.addLast("tutu");
		//list.addLast(null);
		//list.add(20.555);
		//list.add("in middle", 2);

		System.out.println(list);
		System.out.println("The size of the list: " + list.size());
		System.out.println("The element is: " + list.get(1));
		System.out.println("The sum of the letters: " + list.sumLetters());
		System.out.println("contains: " + list.contains("toto"));

//		MyList<String> l = new MyList<String>();
//		l.addLast("toto2");
//		l.add("toto");
//		l.add("titi");
//		l.addLast("bla");
//		l.addLast("bli");
//		l.add("doh");
//		System.out.println(l.get(2));

	}

}
