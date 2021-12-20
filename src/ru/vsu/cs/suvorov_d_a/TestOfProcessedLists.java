package ru.vsu.cs.suvorov_d_a;

import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import ru.vsu.cs.suvorov_d_a.utils.ArrayUtils;

public class TestOfProcessedLists {

    @Test
    public void testListWithoutNegativeNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCaseForListA.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResultForListA.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testListWithOnlyNegativeNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCaseForListB.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResultForListB.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testListWithAlternatingZeroesAndPositiveNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCaseForListC.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResultForListC.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testRandomList() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCaseForListD.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResultForListD.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testListOfThreeNumbers() {
        List<Integer> testingInputList = ArrayUtils.readListFromFile("testSrc/testCaseForListE.txt");
        List<Integer> actualList = SortPositiveNumbersOfList.process(testingInputList);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResultForListE.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }
}
