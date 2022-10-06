import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTests {
    ReverseString sut;

    @BeforeAll
    public static void startTests() {
        System.out.println("-----------Тесты стартовали-----------");
    }

    @AfterAll
    public static void endTests() {
        System.out.println("-----------Тесты закончены-----------");
    }

    @BeforeEach
    public void initTwoSum() {
        sut = new ReverseString();
        System.out.println("Программа \"Сумма двух чисел\" создана");
    }

    @BeforeEach
    public void stopTwoSum() {
        sut = null;
        System.out.println("Программа \"Сумма двух чисел\" обнулена");
    }

    @Test
    public void casualStringTest(){
        // given:
        String line = "мама мыла раму";
        String expected = "умар алым амам";
        // when:
        String result = sut.reverseString(line);
        // then:
        assertEquals(expected,result);
    }
    @Test
    public void emptyStringTest(){
        // given:
        String line = "";
        // when:
        String result = sut.reverseString(line);
        // then:
        assertThat(result, Matchers.containsString("+7-999-444-45-65"));
    }

    @Test
    public void NullStringTest(){
        // given:
        String line = null;
        // when:
        String result = sut.reverseString(line);
        // then:
        assertThat(result, containsString("Нельзя перевернуть null"));
    }
}
