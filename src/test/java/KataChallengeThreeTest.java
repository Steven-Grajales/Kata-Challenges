import com.katachallenges.KataChallengeThree;
import com.katachallenges.util.ArrayUtil;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KataChallengeThreeTest {

    @Test
    public void testOrderArray() {
        ArrayList<Integer> inputArray = new ArrayList<>(){{
            add(5);add(7);add(1);add(1);add(2);add(3);add(22);
        }};
        ArrayList<Integer> expectedArray = new ArrayList<>(){{
            add(1);add(1);add(2);add(3);add(5);add(7);add(22);
        }};
        assertEquals(expectedArray, ArrayUtil.orderArray(inputArray));
    }

    @Test
    public void testMinimumAmountOfChangeThatCannotGiveExample1() {
        KataChallengeThree KataChallengeThree = new KataChallengeThree();
        ArrayList<Integer> inputArray = new ArrayList<>(){{
            add(5);add(7);add(1);add(1);add(2);add(3);add(22);
        }};
        int expectedArray = 20;
        assertEquals(expectedArray, KataChallengeThree.calculateMinimumAmountOfChangeThatCannotGive(inputArray));
    }

    @Test
    public void testMinimumAmountOfChangeThatCannotGiveExample2() {
        KataChallengeThree KataChallengeThree = new KataChallengeThree();
        ArrayList<Integer> inputArray = new ArrayList<>(){{
            add(1);add(1);add(1);add(1);add(1);
        }};
        int expectedArray = 6;
        assertEquals(expectedArray, KataChallengeThree.calculateMinimumAmountOfChangeThatCannotGive(inputArray));
    }

    @Test
    public void testMinimumAmountOfChangeThatCannotGiveExample3() {
        KataChallengeThree KataChallengeThree = new KataChallengeThree();
        ArrayList<Integer> inputArray = new ArrayList<>(){{
            add(1);add(5);add(1);add(1);add(1);add(10);add(15);add(20);add(100);
        }};
        int expectedArray = 55;
        assertEquals(expectedArray, KataChallengeThree.calculateMinimumAmountOfChangeThatCannotGive(inputArray));
    }
}
