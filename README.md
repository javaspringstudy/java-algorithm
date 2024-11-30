# ▣ 자료구조와 알고리즘 연구(TDD)

      ▣ 테스트코드 구성

      1. Given (준비) - 테스트 환경을 설정하거나 초기 상태를 정의하는 단계
         1) 테스트 대상 객체나 의존성을 준비
         2) 입력값이나 초기 상태를 설정
      
      2. When (실행) - 테스트하려는 실제 로직(메서드나 기능)을 실행하는 단계
         1) 테스트 대상 메서드를 호출
         2) 이 단계는 테스트의 핵심 동작을 나타냄
   
      3. Then (검증) - 실행 결과가 기대한 대로 나왔는지 검증하는 단계
         1) 결과 값을 확인하거나 예상 결과와 비교
         2) 주로 테스트 Assertions.assert~ 메서드를 사용


1. 선형/순차검색

    - [정렬되지 않은 문자열 배열에서 검색 - while문][Ex10_1]
    - [정렬되지 않은 숫자 배열에서 검색 - for문][Ex10_2]
      <br /><br />
1. 이진/이분검색
   - [정렬된 중복없는 숫자배열에서 검색 - do~while문][Ex20_1]
   - [정렬된 중복값이 있는 숫자배열에서 맨처음 값 검색 - do~while, for문][Ex20_2]

[Ex10_1]: ./src/main/java/linear/Ex10_linearSearch_1.java
[Ex10_2]: ./src/main/java/linear/Ex10_linearSearch_2.java
[Ex20_1]: ./src/main/java/binary/Ex20_binarySearch_1.java
[Ex20_2]: ./src/main/java/binary/Ex20_binarySearch_2.java
[msi>d>algorithm]: .
