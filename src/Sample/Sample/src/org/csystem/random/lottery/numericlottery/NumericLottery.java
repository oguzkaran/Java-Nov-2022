package org.csystem.random.lottery.numericlottery;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class NumericLottery {
    public Random random;

    public NumericLottery()
    {
        random = new Random();
    }

    public NumericLottery(Random r)
    {
        random = r;
    }

    public int [] getNumbers()
    {
        int [] numbers = new int[6];

        for (int i = 0; i  < 6; ++i) {
            boolean repeat;

            do {
                repeat = false;
                numbers[i] = random.nextInt(1, 50);

                for (int k = 0; k < i; ++k)
                    if (numbers[i] == numbers[k]) {
                        repeat = true;
                        break;
                    }
            } while (repeat);
        }

        ArrayUtil.bubbleSort(numbers);

        return numbers;
    }
}
