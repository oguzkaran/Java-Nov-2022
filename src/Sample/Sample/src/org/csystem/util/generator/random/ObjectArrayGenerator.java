package org.csystem.util.generator.random;

import org.csystem.math.geometry.Line;
import org.csystem.math.geometry.Point;
import org.csystem.util.array.ArrayUtil;
import org.csystem.util.string.StringUtil;

import java.util.Random;

public class ObjectArrayGenerator {
    private final Random m_random = new Random();

    //String, Integer, Point, Line, int [], Boolean, Character
    private Object createObject()
    {
        return switch (m_random.nextInt(7)) {
            case 0 -> StringUtil.getRandomTextTR(m_random, m_random.nextInt(5, 16));
            case 1 -> m_random.nextInt(-128, 127);
            case 2 -> Point.ofCartesian(m_random.nextDouble(-100, 100), m_random.nextDouble(-100, 100));
            case 3 -> new Line(m_random.nextDouble(-100, 100), m_random.nextDouble(-100, 100), m_random.nextDouble(-100, 100), m_random.nextInt(-100, 100));
            case 4 -> m_random.nextBoolean();
            case 5 -> (char)(m_random.nextInt(26) + (m_random.nextBoolean() ? 'A' : 'a'));
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
