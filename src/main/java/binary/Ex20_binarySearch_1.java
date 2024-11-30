package binary;

//이진검색, 이분검색 - 시간복잡도 O(log n)
//전제조건 : 이미 오름차순 or 내림차순으로 sort 된 배열
public class Ex20_binarySearch_1 {

    /*
        이진검색

        1. 중복이 없는 숫자배열
        2. 시작인덱스 startIdx, 끝인덱스 endIdx
        3. 중간인덱스 midIdx

        4. 종료조건1 - 검색성공(일치하는 값을 찾으면 해당인덱스 리턴)
        5. 종료조건2 - 검색실패(일치하는 값이 없으면 -1 리턴)
     */

    public int srch(int[] nums, int value) {


        int startIdx = 0;
        int endIdx = nums.length-1;

        do{
            int midIdx = (startIdx+endIdx)/2;

            //검색성공 : nums[midIdx] 값이 value와 일치하면
            if(nums[midIdx]==value) {
                return midIdx;
            }else if(value>nums[midIdx]){
                startIdx = midIdx+1;//검색범위를 뒤쪽 절반으로 좁힘
            }else{
                endIdx = midIdx-1;//검색범위를 앞쪽 절반으로 좁힘
            }
        }while(startIdx<=endIdx);

        return -1;//검색실패
    }
}
