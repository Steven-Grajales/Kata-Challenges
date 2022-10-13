import com.katachallenges.KataChallengeOne;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KataChallengeOneTest {
    @Test
    public void testCreateArrayWithoutDigitExample1() {
        KataChallengeOne kataChallengeOne = new KataChallengeOne();
        ArrayList<String> arrayInput = new ArrayList<String>(){{
            add("1");add("2");add("2");add("2");add("3");add("4");add("5");add("6");
        }};
        ArrayList<String> arrayExpected = new ArrayList<String>(){{
            add("2");add("2");add("2");add("1");
        }};
        int S = 3;
        assertEquals(arrayExpected, kataChallengeOne.createArrayWithoutDigit(arrayInput, S));
    }

    @Test
    public void testCreateArrayWithoutDigitExample2() {
        KataChallengeOne kataChallengeOne = new KataChallengeOne();
        ArrayList<String> arrayInput = new ArrayList<String>(){{
            add("10");add("20");add("30");add("40");
        }};
        ArrayList<String> arrayExpected = new ArrayList<String>(){{
            add("40");add("0");add("20");add("10");
        }};
        int S = 3;
        assertEquals(arrayExpected, kataChallengeOne.createArrayWithoutDigit(arrayInput, S));
    }

    @Test
    public void testCreateArrayWithoutDigitExample3() {
        KataChallengeOne kataChallengeOne = new KataChallengeOne();
        ArrayList<String> arrayInput = new ArrayList<String>(){{
            add("6");
        }};
        ArrayList<String> arrayExpected = new ArrayList<String>(){{
            add("6");
        }};
        int S = 3;
        assertEquals(arrayExpected, kataChallengeOne.createArrayWithoutDigit(arrayInput, S));
    }

    @Test
    public void testCreateArrayWithoutDigitExample4() {
        KataChallengeOne kataChallengeOne = new KataChallengeOne();
        ArrayList<String> arrayInput = new ArrayList<String>(){{
            add("6");add("6");
        }};
        ArrayList<String> arrayExpected = new ArrayList<String>(){{
            add("6");add("6");
        }};
        int S = 3;
        assertEquals(arrayExpected, kataChallengeOne.createArrayWithoutDigit(arrayInput, S));
    }

    @Test
    public void testCreateArrayWithoutDigitExample5() {
        KataChallengeOne kataChallengeOne = new KataChallengeOne();
        ArrayList<String> arrayInput = new ArrayList<String>(){{
            add("6");add("65");
        }};
        ArrayList<String> arrayExpected = new ArrayList<String>(){{
            add("65");add("6");
        }};
        int S = 3;
        assertEquals(arrayExpected, kataChallengeOne.createArrayWithoutDigit(arrayInput, S));
    }

    @Test
    public void testCreateArrayWithoutDigitExample6() {
        KataChallengeOne kataChallengeOne = new KataChallengeOne();
        ArrayList<String> arrayInput = new ArrayList<String>(){{
            add("6");add("2");add("1");
        }};
        ArrayList<String> arrayExpected = new ArrayList<String>(){{
            add("1");add("2");add("6");
        }};
        int S = 3;
        assertEquals(arrayExpected, kataChallengeOne.createArrayWithoutDigit(arrayInput, S));
    }

    @Test
    public void testCreateArrayWithoutDigitExample7() {
        KataChallengeOne kataChallengeOne = new KataChallengeOne();
        ArrayList<String> arrayInput = new ArrayList<String>(){{
        add("60");add("6");add("5");add("4");add("3");add("2");
        add("7");add("7");add("29");add("1");
        }};
        ArrayList<String> arrayExpected = new ArrayList<String>(){{
            add("4");add("5");add("6");add("60");
        }};
        int S = 3;
        assertEquals(arrayExpected, kataChallengeOne.createArrayWithoutDigit(arrayInput, S));
    }

    @Test
    public void testDeleteByDigit() {
        KataChallengeOne kataChallengeOne = new KataChallengeOne();
        int S = 3;
        assertEquals(5, kataChallengeOne.deleteDigit("35", S));
    }

}
