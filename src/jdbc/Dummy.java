package jdbc;
class Exam{
//	int a=10;
	static {
		System.out.println("Exam");
	}
}

public class Dummy {
	static {
		System.out.println("Static Dummy");
		
	}

	public static void main(String[] args) throws ClassNotFoundException {
//		System.out.println("Dummy");
		Class.forName("jdbc.Exam");
	}

}
