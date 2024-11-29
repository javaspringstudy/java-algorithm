import linear.Ex10_linearSearch_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {

    private final Ex10_linearSearch_1 linear = new Ex10_linearSearch_1();

    @Test
    void 선형검색(){
        /*
        1. Given (준비) - 테스트 환경을 설정하거나 초기 상태를 정의하는 단계
           1) 테스트 대상 객체나 의존성을 준비
           2) 입력값이나 초기 상태를 설정
         */
        String[] friends = new String[]{"또치", "도우너", "둘리", "마이콜", "하니"};

        /*
        2. When (실행) - 테스트하려는 실제 로직(메서드나 기능)을 실행하는 단계
           1) 테스트 대상 메서드를 호출
           2) 이 단계는 테스트의 핵심 동작을 나타냄
         */
        int idx = linear.srch(friends, "둘리");

        /*
        3. Then (검증) - 실행 결과가 기대한 대로 나왔는지 검증하는 단계
           1) 결과 값을 확인하거나 예상 결과와 비교
           2) 주로 테스트 프레임워크의 assert 메서드를 사용
         */
        Assertions.assertEquals(2, idx);//성공
        //Assertions.assertEquals(3, idx);//실패
    }
}
