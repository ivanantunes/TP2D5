package BallDecorator;

public class BallRed extends BallDecorator {
	
	public BallRed(IBall ball) {
		super(ball);
	}
	
	public String decoratorMove() {
		return " Quicar Bola Vermelha";
	}
	
	public String move() {
		return super.move()+decoratorMove();
	}
	
}
 