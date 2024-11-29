package linear;

public class Ex10_linearSearch_2 {

    //선형검색, 순차검색
    //정렬되지 않은 배열에서 검색할 때 사용하는 유일한 방법
    public int srch(int[] nums, int targetNum) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]==targetNum) return 1;////종료조건2 : 검색성공 1
        }

        return -1;//종료조건1 : 검색실패 -1

    }
}
