score = 99
if score >= 90:
    print("pass")
    
age = 21
if age<10:
    print("10세 미만")
elif age<20:
    print("10대")
elif age<30:
    print("20대")
elif age<40:
    print("30대")
elif age<50:
    print("40대")
else:
    print("50대 이상")
    
scr = 98
if scr >= 90:
    print('A')
elif 80 <= scr < 90:
    print('B')
elif 70 <= scr < 80:
    print('C')
elif 60 <= scr < 70:
    print('D')
else:
    print('F')
    
scr1, scr2, scr3 = 89, 90, 83
avg = (scr1+scr2+scr3)/3
if (scr1 or scr2 or scr3 <70) or avg<=75:
    print('fail')
else:
    ('pass')

num1 = 12321
if num1%11==0:
    print("11의 배수입니다.")
else:
    print("11의 배수가 아닙니다.")

nam1, nam2 = map(int, input().split())

if nam1>nam2:
    print(nam2)
    print(nam1)
else:
    print(nam1)
    print(nam2)
    
nan = int(input())
if nan==1:
    print("잘 했어요!")
elif nan==2:
    print("정답")
elif nan==3:
    print("맞췄어요")
else:
    print("틀렸어요")
    
purchase = int(input("구매액을 입력하세요(단위: 만원): "))
vip = "10% 할인 쿠폰 지급"
s = "5% 할인 쿠폰 지급"
a = "2% 할인 쿠폰 지급"
if purchase >= 30:
    print(vip)
elif purchase >= 15:
    print(s)
elif purchase >= 5:
    print(a)
else:
    print("구매해주셔서 감사합니다.")