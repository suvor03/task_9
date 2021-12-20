package ru.vsu.cs.suvorov_d_a;

import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import ru.vsu.cs.suvorov_d_a.utils.ArrayUtils;

public class TestOfProcessedLists {

    @Test
    public void testListWithoutNegativeNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCaseA.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResultA.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testListWithOnlyNegativeNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCaseB.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResultB.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testListWithAlternatingZeroesAndPositiveNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCaseC.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResultC.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testRandomList() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCaseD.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResultD.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testListOfThreeNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCaseE.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResultE.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }
}
