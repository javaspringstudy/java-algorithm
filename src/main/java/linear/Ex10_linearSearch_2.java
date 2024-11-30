package linear;

//선형검색, 순차검색 - 시간복잡도 O(n)
//정렬되지 않은 배열에서 검색할 때 사용하는 유일한 방법
//데이터가 작고 간단할 때 유용하며, 빠르게 구현할 수 있는 장점
public class Ex10_linearSearch_2 {
    public int srch(int[] nums, int targetNum) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]==targetNum) return 1;//종료조건1 : 검색성공 1
        }

        return -1;//종료조건2 : 검색실패 -1

    }
}
