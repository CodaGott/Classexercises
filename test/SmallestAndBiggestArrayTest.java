import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestAndBiggestArrayTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatSumReturnsBiggestValueWhenOneValueIsRemoved(){
        SmallestAndBiggestArray checkArray = new SmallestAndBiggestArray();
        int [] array = {13,4,5,8};
        checkArray.calculateSmallestSum(array);
        assertEquals(26, checkArray.getMaxSum());
    }

    @Test
    void testThatSumReturnsSmallestValueWhenOneValueIsRemoved(){
        SmallestAndBiggestArray checkArray = new SmallestAndBiggestArray();
        int [] newArray = {10, 7, 15, 7};
        checkArray.calculateLargestNumber(newArray);
        assertEquals(24, checkArray.getMinSum());
    }
}