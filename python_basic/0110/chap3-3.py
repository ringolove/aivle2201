n = 0
while n <= 5:
    print(n)
    n += 1
    
n1 = 1

while n1 <= 5:
    if n1%2 != 0:
        print('*'*n1)
        n1 += 1
    else:
        print('%'*n1)
        n1 += 1

n2 = 1
s = 0

while n2 <= 100:
    if n2%3 == 0:
        s += n2
        n2 += 1
    else:
        n2 += 1
print(s)

i = 1
num = int(input("숫자를 입력하세요: "))
sentence = input("문장을 입력하세요: ")
while i <= num:
    print(sentence)
    i += i
    
while True:
    namee = input("이름을 입력하세요: ")
    
    if namee == "링고러브":
        print(f"환영합니다, {namee}님!")
        break
    
total = 0
while True:
    if total <= 50:
        n = int(input('숫자를 입력하세요: '))
        total += n
        print(f'total value는 {total}이다.')
    else:
        break

kor, math, eng = 96,72, 88

while True:
    score = input('점수가 궁금한 과목을 입력하세요: ')
    
    if score == '국어':
        print(f'국어 점수는 {kor}입니다.')
        break
    elif score == '수학':
        print(f'수학 점수는 {math}입니다.')
        break
    elif score == '영어':
        print(f'영어 점수는 {eng}입니다.')
        break
    else:
        print('잘못 입력하셨습니다.')
        
input_n = int(input())
count_n = 0

while True:
    think_n = int(input('생각한 값을 입력하세요: '))
    count_n += 1
    
    if think_n != input_n:
        if think_n > input_n:
            print('숫자가 큽니다. 다시 입력하세요.')
        else:
            print('숫자가 작습니다. 다시 입력하세요.')
    else:
        print(f'정답입니다. {count_n}번만에 맞추셨습니다.')
        break
    
money, coffee = 10000, 1300

while True:
    buy = input('아아 드릴까요?')
    if buy == "네":
        if money >= 1300:
            money -= coffee
            print(f'아아 나왔습니다. 현재 잔액 {money}원.')
        else:
            print('잔액이 부족합니다.')
            break
    else:
        print('다시 입력하세요.')