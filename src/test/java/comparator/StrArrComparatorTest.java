package comparator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrArrComparatorTest {

    StrArrComparator stc = new StrArrComparator();

    @Test
    void compare(){
        String[] animals = {"lion", "Snake", "tiger", "dog"};

        String[] expected = {"dog", "lion", "Snake", "tiger"};
        String[] result = stc.compareArr(animals);

        Assertions.assertArrayEquals(expected, result);
    }
}
