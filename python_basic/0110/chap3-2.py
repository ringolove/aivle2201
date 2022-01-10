i=0
for i in range(6):
   print(i)

for a in range(6):
    print('*'*a)
 
for i in range(1,6):
    print((' '*(5-i))+('*'*i))

for i in range(6):
    if i%2!=0:
        print('*'*i)
    else:
        print('%'*i)

r = 0
for i in range(101):
    r += i
print(r)

s = 0
for i in range(1,101,2):
    s += i
print(s)

t = 0
for i in range(0,500,12):
    t += i
print(t)

result = 0
for i in range(1,101):
    if i % 2 != 0:
        result += i
    else:
        result -= i
print(result)

num = int(input())
name = input()

for i in range(num):
    print(name)

for character in name:
    print(character)

for i in range(num):
    if num<10:
        print(name)
    else:
        print('너무 많아요'*4)

for i in range(2,10):
    print(f"구구단 {i}단을 출력합니다.")
    for j in range(1,10):
        print(f"{i} x {j} = {i*j}")
    print("========")
    
count = input("up or down")
if count == 'up':
    n = int(input("input number"))
    for i  in range(1, n+1):
        print(i)
elif count == 'down':
    n = int(input("input numbers under 20"))
    for i in range(20,n-1,-1):
        print(i)
else:
    print("틀렸어요")