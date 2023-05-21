package org.csystem.random.lottery.numericlottery;

import java.util.Random;

public class NumericLottery {
    private final Random m_random;

    private static int [] getNumbers(boolean [] flags)
    {
        int [] numbers = new int[6];
        int index = 0;

        for (int i = 1; i < 50; ++i)
            if (flags[i])
                numbers[index++] = i;

        return numbers;
    }

    private boolean [] getFlags()
    {
        boolean [] flags = new boolean[50];

        for (int i = 0; i < 6; ++i) {
            int val;

            for (;;) {
                val = m_random.nextInt(1, 50);
                if (!flags[val])
                    break;
            }
            flags[val] = true;
        }

        return flags;
    }

    public NumericLottery()
    {
        m_random = new Random();
    }

    public NumericLottery(Random r)
    {
        m_random = r;
    }

    public int [] getNumbers()
    {
        return getNumbers(getFlags());
    }

    public int [][] getNumbers(int count)
    {
        int [][] numbers = new int[count][];

        for (int i = 0; i < count; ++i)
            numbers[i] = getNumbers();

        return numbers;
    }
}
