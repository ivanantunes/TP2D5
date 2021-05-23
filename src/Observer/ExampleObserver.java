package Observer;

public class ExampleObserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject();

		new HexaObserver(subject);
	    new OctalObserver(subject);
	    new BinaryObserver(subject);

	    System.out.println("Primeira Mudança de Estado: 15");	
	    subject.setState(15);
	    System.out.println("Segunda Mudança de Estado: 10");	
	    subject.setState(10);

	}

}
