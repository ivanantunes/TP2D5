package BallDecorator;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IBall ball = new BallMove();
		
		System.out.println(ball.move());
		
		IBall ballRed = new BallRed(ball);
		
		System.out.println(ballRed.move());
		
		IBall ballBlue = new BallBlue(ballRed);
		
		System.out.println(ballBlue.move());
		
		IBall ballBlue2 = new BallBlue(ballBlue);
		
		System.out.println(ballBlue2.move());
	}

}
