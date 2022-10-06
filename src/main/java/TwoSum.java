/*
Учитывая массив целых чисел nums и целое число target,
верните индексы двух чисел так, чтобы они составляли в сумме target.
Вы можете предположить, что каждый вход будет иметь ровно одно решение,
и вы не можете использовать один и тот же элемент дважды.
Вы можете вернуть ответ в любом порядке.
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] sumArr = new int[2];

        OWNER: for (int i = 0; i < nums.length; i++) {
            INNER: for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    sumArr[0] = i;
                    sumArr[1] = j;
                    break OWNER;
                }
            }
        }
        return sumArr;
    }
}
