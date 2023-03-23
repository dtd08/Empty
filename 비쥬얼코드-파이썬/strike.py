# 스트라이크 게임
import random

a = random.randint(100, 999)
a_100 = a // 100    #맞출 수의 100의 자리
a_10 = (a % 100) // 10  #맞출 수의 10의 자리
a_1 = (a % 100) % 10   #맞출 수의 1의 자리     

strike = 0 #숫자 & 자리까지 맞았을 때
ball = 0 #숫자만 맞았을 때
out = 0 #아무것도 맞지 않을 때


i = True

while(i) : #무한반복
    n = int(input("3자리 숫자를 입력하세요 > "))
    n_100 = n // 100 #정답의 100의 자리
    n_10 = (n % 100) // 10 #정답의 10의 자리
    n_1 = (n % 100) % 10 #정답의 1의 자리
   
    #n_100의 자리 판단
    if n_100 == a_100:
         #숫자 & 자리까지 맞았을 때 스트라이크 1개 추가
         strike += 1
    elif n_100 == a_10 or n_100 == a_1:
         #숫자만 맞았을 때 볼 1개 추가
         ball += 1
    else :
         #아무것도 맞지 않을 때 아웃 1개 추가
         out += 1
    
    #n_10의 자리 판단
    if n_10 == a_10:
         strike += 1
    elif n_10 == a_100 or n_10 == a_1:
         ball += 1
    else:
         out += 1
   
    #n_1의 자리 판단
    if n_1 == a_1:
         strike += 1
    elif n_1 == a_100 or n_1 == a_10:
         ball += 1
    else:
         out += 1

    if strike == 3 :
         # 전부 다 맞췄을 때
         print("정답!")
         #무한반복 멈추기
         i = False
    else :
         #결과 출력
         print(f"{strike} Strike  {ball} ball  {out} out")
         strike = 0
         ball = 0
         out = 0
