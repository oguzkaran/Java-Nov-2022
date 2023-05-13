package org.csystem.math.geometry.test;

import org.csystem.math.geometry.Point;

class RandomPointGenerator {
	//...
	public static Point createRandomPoint(java.util.Random random, double min, double bound)
	{
		return new Point(random.nextDouble(min, bound), random.nextDouble(min, bound));
	}
}