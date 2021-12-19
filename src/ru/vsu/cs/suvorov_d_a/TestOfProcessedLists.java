package ru.vsu.cs.suvorov_d_a;

import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import ru.vsu.cs.suvorov_d_a.utils.ArrayUtils;

public class TestOfProcessedLists {

    @Test
    public void testingListWithoutNegativeNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/input1.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/output1.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testingListWithOnlyNegativeNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/input2.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/output2.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testingListWithAlternatingZeroesAndPositiveNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/input3.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/output3.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testingRandomList() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/input4.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/output4.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testingListOfThreeNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/input5.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/output5.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }
}