package binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ex20_binarySearch_2Test {

    Ex20_binarySearch_2 binary = new Ex20_binarySearch_2();

    @Test
    void 이진검색(){
        //given
        int[] nums = {1,3,5,7,7,7,7,8,8,9,9};
        int targetNum = 7;

        //when
        int resjult = binary.srch(nums, 7);

        //then
        Assertions.assertEquals(3, resjult);
    }
}