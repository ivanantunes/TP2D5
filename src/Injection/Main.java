package Injection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Olá Mundo!");
		
		classRepository cr = new classRepository();
		
		cr.setClassDependece(new classDependece());

	}

}
