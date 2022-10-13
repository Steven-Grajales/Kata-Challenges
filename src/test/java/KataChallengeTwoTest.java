import com.katachallenges.KataChallengeTwo;
import com.katachallenges.util.ArrayUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class KataChallengeTwoTest {

    @Test
    public void testOrderArray() {
        ArrayList<Integer> inputArray = new ArrayList<>(){{
            add(60);add(6);add(5);add(4);add(3);add(2);
            add(7);add(7);add(29);add(1);
        }};
        ArrayList<Integer> expectedArray = new ArrayList<>(){{
            add(1);add(2);add(3);add(4);add(5);add(6);
            add(7);add(7);add(29);add(60);
        }};
        assertEquals(expectedArray, ArrayUtil.orderArray(inputArray));
    }

    private ArrayList<Integer> buildOrderArray(List<Integer> inputArray){
        return ArrayUtil.orderArray(inputArray);
    }

    @Test
    public void testCalculateSquaredElement() {
        KataChallengeTwo kataChallengeTwo = new KataChallengeTwo();
        int x = -6;
        assertEquals(36, kataChallengeTwo.calculateSquareNumber(x));
    }

    @Test
    public void testSortedSquaredArrayExample1() {
        KataChallengeTwo kataChallengeTwo = new KataChallengeTwo();
        ArrayList<Integer> inputArray = new ArrayList<>(){{
            add(1);add(2);add(3);add(5);add(6);add(8);add(9);
        }};
        ArrayList<Integer> expectedArray = new ArrayList<>(){{
            add(1);add(4);add(9);add(25);
        }};
        inputArray = buildOrderArray(inputArray);
        int S = 3;
        assertEquals(expectedArray, kataChallengeTwo.calculateSortedSquaredArray(inputArray, S));
    }

    @Test
    public void testSortedSquaredArrayExample2() {
        KataChallengeTwo kataChallengeTwo = new KataChallengeTwo();
        ArrayList<Integer> inputArray = new ArrayList<>(){{
            add(-2);add(-1);
        }};
        ArrayList<Integer> expectedArray = new ArrayList<>(){{
            add(1);add(4);
        }};
        inputArray = buildOrderArray(inputArray);
        int S = 3;
        assertEquals(expectedArray, kataChallengeTwo.calculateSortedSquaredArray(inputArray, S));
    }

    @Test
    public void testSortedSquaredArrayExample3() {
        KataChallengeTwo kataChallengeTwo = new KataChallengeTwo();
        ArrayList<Integer> inputArray = new ArrayList<>(){{
            add(-6);add(-5);add(0);add(5);add(6);
        }};
        ArrayList<Integer> expectedArray = new ArrayList<>(){{
            add(0);add(25);add(25);
        }};
        inputArray = buildOrderArray(inputArray);
        int S = 3;
        assertEquals(expectedArray, kataChallengeTwo.calculateSortedSquaredArray(inputArray, S));
    }

    @Test
    public void testSortedSquaredArrayExample4() {
        KataChallengeTwo kataChallengeTwo = new KataChallengeTwo();
        ArrayList<Integer> inputArray = new ArrayList<>(){{
            add(-10);add(-10);
        }};
        ArrayList<Integer> expectedArray = new ArrayList<>(){{
        }};
        inputArray = buildOrderArray(inputArray);
        int S = 3;
        assertEquals(expectedArray, kataChallengeTwo.calculateSortedSquaredArray(inputArray, S));
    }
}
