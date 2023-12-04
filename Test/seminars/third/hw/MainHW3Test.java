package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static seminars.third.hw.MainHW3.evenOddNumber;
import static seminars.third.hw.MainHW3.numberInInterval;

class MainHW3Test {
    /**
     * HW 3.1. Нужно покрыть тестами метод на 100%
     * Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
     */

    @Test
    void evenNumberTest() {                           // Чтобы обеспечить 100% тестовое покрытие метода, необходимо создать тесты на каждую строку кода
        int n = 8;                                    // В  методе evenOddNumber() имеется две ветви, для каждой из которых пердусмотрен тест:
        assertEquals(evenOddNumber(n), true);   // evenNumberTest - проверка ветви четности
    }                                                 // oddNumberTest() - проверка ветви нечетности
    @Test
    void oddNumberTest(){assertFalse(MainHW3.evenOddNumber(3));}

    /**
     * HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
     * покрыть тестами метод на 100%
     */
    @Test
    void numberInIntervalTest() {                         // Метод numberInInterval() также имеет две ветви, и для 100% тестового покрытия
        int n = 99;                                       // необходимы два теста:  numberInIntervalTest() - проверка ветви принадлежности диапазону,
        assertEquals(numberInInterval(n), true);    // numberOutIntervalTest() - проверка ветви непринадлежности числа заданному диапазону
    }
    @Test
    void numberOutIntervalTest(){assertFalse(MainHW3.numberInInterval(100));}
}