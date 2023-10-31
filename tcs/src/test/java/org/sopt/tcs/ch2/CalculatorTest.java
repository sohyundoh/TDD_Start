package org.sopt.tcs.ch2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    //TDD로 개발할 때 가장 중요한 것은 기능을 검증하는 테스트 코드를 작성하는 것이다.
    @Test
    void plus() {
        int result = Calculator.plus(1, 2);
        assertEquals(3, result);
        assertEquals(5, Calculator.plus(1, 4));
    }
}
