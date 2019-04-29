package balmes.m2i.singleton.personne;

public class Test {

	public static void main(String[] args) {
		func();
		func();
		func();
	}

	private static void func() {
		Personne p1 = SinglePersonne.getPersonne("Simon", "Balm�s");
		System.out.println("p1: " + p1);
		Personne p2 = new Personne("Simon", "Balm�s");
		System.out.println("p2: " + p2);
	}

}
