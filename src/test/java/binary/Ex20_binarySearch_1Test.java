package binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex20_binarySearch_1Test {

    Ex20_binarySearch_1 binary = new Ex20_binarySearch_1();

    @Test
    void 이진검색(){
        //given
        int[] nums = {0,1,2,3,4,55,56,57,58,59};
        int targetNum = 57;

        //when
        int result = binary.srch(nums, targetNum);//-1 or idx

        //then
        Assertions.assertEquals(7, result);
        if(result != -1)
            System.out.printf("원소 %d의 인덱스는 %d", targetNum, result);
    }
}
