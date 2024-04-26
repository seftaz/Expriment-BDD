package calculator;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int calculate(int value1, int value2, char opt) {
        if (opt == '*')
            return value1 * value2;
        if (opt == '/')
            return value1 / value2;
        if (opt == '^') {
            int result = 1;
            for (int i = 0; i < value2; i++)
                result *= value1;
            return result;
        }
        throw new NotImplementedException();
    }
}