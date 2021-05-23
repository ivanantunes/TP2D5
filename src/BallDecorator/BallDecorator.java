package BallDecorator;

public class BallDecorator implements IBall {

	private IBall ball;
	
	public BallDecorator(IBall ball) {
		this.ball = ball;
	}
	
	@Override
	public String move() {
		return ball.move();
	}

}
