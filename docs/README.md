# 학점 계산기 만들기

## 구현 class 
- class는 총 3가지로 main Major Refinement로 구성
  -- mian 에 구성되어 있는 함수는 TotalScore TotalAverage MajorAverage validateSubjectName로 구성
### Major class와 Refinement는 전공과 교양으로 나눠져 있음 두 class는 동일한 행동을 진행함
   - Name(과목명)
   - Credit(학점)
   - Score(성적)
  > 이루어져 있음 각각 입력값을 받게 준비되어 있음
  >> 각각 class 안에 MajorCreditToPoint 함수가 존재. 이 함수는 Credit을 숫자로 변환하기 위한 함수로 사용되었음
## main함수 구현 
> 메인 함수는 처음 안내를 출력 후 입력을 받고 이후 .spilt을 통해서 나눠서 진행됨
>> 전공과 교양을 나누어서 따로 담아서 ArrayList에 담겨 있고 이를 통해서 전체 학점 전체 평점 전공 평점을 구함
>>> 마지막으로 validateSubjectName를 통해서 처음 입력값에 대한 error를 조절함
####클래스에 대해서 아직 완벽하게 이해하지 못하고 main함수를 깔끔하게 만들지 못한 것에 대한 아쉬움이 남음 이후 구현하는 과제에서는 main함수를 간결하게 만들기 위해서 함수를 통해서 간결하게 만드는 것을 목표로 진행 할 예정
