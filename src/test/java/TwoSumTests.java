import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TwoSumTests {
    private TwoSum sut;

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
        sut = new TwoSum();
        System.out.println("Программа \"Сумма двух чисел\" создана");
    }

    @BeforeEach
    public void stopTwoSum() {
        sut = null;
        System.out.println("Программа \"Сумма двух чисел\" обнулена");
    }

    @Test
    public void firstTest() {
        //given
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};

        //when
        int[] result = sut.twoSum(nums, target);

        //then
        assertArrayEquals(expected, result);
    }

    @Test
    public void ZeroTest() {
        //given
        int[] nums = {0, 1, 2, 3, 0};
        int target = 0;
        int[] expected = {0, 4};

        //when
        int[] result = sut.twoSum(nums, target);

        //then
        assertArrayEquals(expected, result);
    }

    @Test
    public void NoneTest() {
        //given
        int[] nums = {1, 3, 2, 6, 8};
        int target = 64;
        int[] expected = {0, 0};

        //when
        int[] result = sut.twoSum(nums, target);

        //then
        assertArrayEquals(expected, result);
    }

    @Test
    public void TimeTest() {
        //given
        int[] nums = new int[10000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1;
        }
        nums[9998] = 6;
        nums[9999] = 5;
        int target = 11;
        int[] expected = {9998, 9999};

        //when

        //then
        assertTimeout(Duration.ofMillis(100), () -> sut.twoSum(nums, target));
    }
}
