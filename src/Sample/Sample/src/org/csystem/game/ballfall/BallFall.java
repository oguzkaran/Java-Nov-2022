package org.csystem.game.ballfall;

public class BallFall {
	private String m_shape;

	private static boolean calculateRightFlag(boolean isRight, int ballIndex, int width)
	{
		if (ballIndex == 0)
			isRight = true;
		else if (ballIndex == width - 1)
			isRight = false;
		
		return isRight;
	}
	
	private static int calculateBallIndex(int ballIndex, boolean isRight)
	{
		if (isRight)
			return ballIndex + 1;
		
		return ballIndex - 1;		
	}

	private void fillSpace(int begin, int end)
	{
		for (int i = begin; i < end; ++i)
			m_shape += ' ';
	}

	private void fillBall(int ballIndex, int end)
	{
		fillSpace(0, ballIndex);
		m_shape += '*';
		fillSpace(ballIndex + 1, end);
	}

	public BallFall()
	{
		m_shape = "";
	}

	public String getShape()
	{
		return m_shape;
	}
	
	public void play(int width, int height)
	{
		int ballIndex = 0;
		boolean isRight = false;

		m_shape = "";
		for (int i = 1; i <= height; ++i) {
			m_shape += '|';
			fillBall(ballIndex, width);
			if (width != 1) {
				isRight = calculateRightFlag(isRight, ballIndex, width);
				ballIndex = calculateBallIndex(ballIndex, isRight);
			}
			m_shape += "|\r\n";
		}
	}
}
