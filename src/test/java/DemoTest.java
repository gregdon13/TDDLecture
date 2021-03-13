import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

public class DemoTest {
    Demo demo = new Demo();

    @Test
    public void stringNumInOrder() {
        //Arrange
        String[] numStrArr = new String[] {"1", "5", "15", "9", "4"};
        String[] expected = new String[] {"1", "4", "5", "9", "15"};

        //Act
        String[] actual = demo.sortStrArr(numStrArr);

        //Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void StrNumInOrderTwo() {
        //Arrange
        String[] numStrArr = new String[] {"100", "5", "15", "29", "4"};
        String[] expected = new String[] {"4", "5", "15", "29", "100"};

        //Act
        String[] actual = demo.sortStrArr(numStrArr);

        //Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void StrLetterInOrder() {
        //Arrange
        String[] numStrArr = new String[] {"T", "e", "S", "932", "test"};
        String[] expected = new String[] {"S", "T", "e", "932", "test"};

        //Act
        String[] actual = demo.sortStrArr(numStrArr);

        //Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void emptyStrTest() {
        //Arrange
        String[] numStrArr = new String[] {"80", "1", "5", "", "607"};
        String[] expected = new String[] {"", "1", "5", "80", "607"};

        //Act
        String[] actual = demo.sortStrArr(numStrArr);

        //Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void nullTest() {
        //Arrange
        String[] numStrArr = new String[] {"80", "1", "5", null, "607"};
        String[] expected = new String[] {"1", "5", "80", "607", null};

        //Act
        String[] actual = demo.sortStrArr(numStrArr);

        //Assert
        Assert.assertArrayEquals(expected, actual);
    }

    ///////SUB METHODS TESTS
    @Test
    public void swapIndex() {
        //Arrange
        String[] input = {"first", "second"};
        String[] expected = {"second", "first"};

        //Act
        String[] actual = demo.swapIndex(input, 0, 1);

        //Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void swapIndexFour() {
        //Arrange
        String[] input = {"first", "second", "third", "fourth"};
        String[] expected = {"third", "second", "first", "fourth"};

        //Act
        String[] actual = demo.swapIndex(input, 0, 2);

        //Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void booleanSwapIndex() {
        //Arrange
        String first = "second";
        String second = "first";

        //Act
        boolean actual = demo.needToSwap(first, second);

        //Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void booleanSwapIndexTwo() {
        //Arrange
        String a = "1";
        String b = "15";

        //Act
        boolean actual = demo.needToSwap(a, b);

        //Assert
        Assert.assertFalse(actual);
    }

    @Test
    public void booleanSwapIndexThree() {
        //Arrange
        String a = "5";
        String b = "9";

        //Act
        boolean actual = demo.needToSwap(a, b);

        //Assert
        Assert.assertFalse(actual);
    }

    @Test
    public void booleanSwapIndexFour() {
        //Arrange
        String a = "15";
        String b = "1";

        //Act
        boolean actual = demo.needToSwap(a, b);

        //Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void booleanSwapIndexFive() {
        //Arrange
        String a = "9";
        String b = "5";

        //Act
        boolean actual = demo.needToSwap(a, b);

        //Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void booleanSwapIndexLetters() {
        //Arrange
        String a = "t";
        String b = "2";

        //Act
        boolean actual = demo.needToSwap(a, b);

        //Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void booleanSwapIndexLettersTwo() {
        //Arrange
        String a = "2";
        String b = "f";

        //Act
        boolean actual = demo.needToSwap(a, b);

        //Assert
        Assert.assertFalse(actual);
    }

    @Test
    public void booleanSwapIndexWords() {
        //Arrange
        String a = "longer";
        String b = "short";

        //Act
        boolean actual = demo.needToSwap(a, b);

        //Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void booleanSwapIndexWordsTwo() {
        //Arrange
        String a = "short";
        String b = "longer";

        //Act
        boolean actual = demo.needToSwap(a, b);

        //Assert
        Assert.assertFalse(actual);
    }

    @Test
    public void booleanSwapIndexNull() {
        //Arrange
        String a = null;
        String b = "words";

        //Act
        boolean actual = demo.needToSwap(a, b);

        //Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void booleanSwapIndexNulls() {
        //Arrange
        String a = null;
        String b = null;

        //Act
        boolean actual = demo.needToSwap(a, b);

        //Assert
        Assert.assertFalse(actual);
    }


    //Below need Regex and will be written later

//    @Test
//    public void NegativeNumbersTest() {
//        //Arrange
//        String[] numStrArr = new String[] {"80", "1", "-5", "15", "607"};
//        String[] expected = new String[] {"-5", "1", "15", "80", "607"};
//
//        //Act
//        String[] actual = demo.sortStrArr(numStrArr);
//
//        //Assert
//        Assert.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void DecimalTest() {
//        //Arrange
//        String[] numStrArr = new String[] {"80", "1", "5", "15.35", "607"};
//        String[] expected = new String[] {"1", "5", "15.35", "80", "607"};
//
//        //Act
//        String[] actual = demo.sortStrArr(numStrArr);
//
//        //Assert
//        Assert.assertArrayEquals(expected, actual);
//    }
//    @Test
//    public void singleWhiteSpaceTest() {
//        //Arrange
//        String[] numStrArr = new String[] {"80", "1", "5", " ", "607"};
//        String[] expected = new String[] {" ", "1", "5", "80", "607"};
//
//        //Act
//        String[] actual = demo.sortStrArr(numStrArr);
//
//        //Assert
//        Assert.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void doubleSpaceTest() {
//        //Arrange
//        String[] numStrArr = new String[] {"80", "1", "5", "  ", "607"};
//        String[] expected = new String[] {"  ", "1", "5", "80", "607"};
//
//        //Act
//        String[] actual = demo.sortStrArr(numStrArr);
//
//        //Assert
//        Assert.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void leadingZeroTest() {
//        //Arrange
//        String[] numStrArr = new String[] {"80", "0", "5", "0001", "607"};
//        String[] expected = new String[] {"0", "0001", "5", "80", "607"};
//
//        //Act
//        String[] actual = demo.sortStrArr(numStrArr);
//
//        //Assert
//        Assert.assertArrayEquals(expected, actual);
//    }

}
