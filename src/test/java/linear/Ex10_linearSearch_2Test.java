package linear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex10_linearSearch_2Test {
    //given
    Ex10_linearSearch_2 linear = new Ex10_linearSearch_2();


    @Test
    void 선형검색(){
        //given

        int targetNum = 95;//찾을값

        int[] nums = new int[100];//1~100의 값을 원소로 갖는 정수배열
        for(int i=0;i<100;i++){
            nums[i] = i+1;
        }


        //when
        int result = linear.srch(nums, targetNum);

        //then
        assertEquals(1, result);
    }
}