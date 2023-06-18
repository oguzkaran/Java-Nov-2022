package org.csystem.util.generator.random;

import org.csystem.math.geometry.Line;
import org.csystem.math.geometry.Point;
import org.csystem.util.array.ArrayUtil;
import org.csystem.util.string.StringUtil;
import org.csystem.wrapper.IntValue;

import java.util.Random;

public class ObjectArrayGenerator {
    private final Random m_random = new Random();

    //String, IntValue, Point, Line, int []
    private Object createObject()
    {
        return switch (m_random.nextInt(5)) {
            case 0 -> StringUtil.getRandomTextTR(m_random, m_random.nextInt(5, 16));
            case 1 -> IntValue.of(m_random.nextInt(-128, 127));
            case 2 -> Point.ofCartesian(m_random.nextDouble(-100, 100), m_random.nextDouble(-100, 100));
            case 3 -> new Line(m_random.nextDouble(-100, 100), m_random.nextDouble(-100, 100), m_random.nextDouble(-100, 100), m_random.nextInt(-100, 100));
            default -> ArrayUtil.getRandomArray(m_random, m_random.nextInt(5, 16), 0, 99);
        };
    }

    public Object[] createObjects(int n)
    {
        Object [] objects = new Object[n];

        for (int i = 0; i < n; ++i)
            objects[i] = createObject();

        return objects;
    }
}
