package BallDecorator;

public class BallBlue extends BallDecorator {
	
	public BallBlue(IBall ball) {
		super(ball);
	}
	
	public String decoratorMove() {
		return " Pingar Bola Azul";
	}
	
	public String move() {
		return super.move()+decoratorMove();
	}
	
}
 