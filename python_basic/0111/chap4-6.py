animal = ['사자', '코끼리', '하마', '기린', '얼룩말']
for i in animal:
    print(i)
    
disney = ['인어공주', '알라딘', '겨울왕국', '라푼젤']
disney.append('라이온킹')
for i in disney:
    print(i)
    
multiple7 = []
multiple7 = [i for i in range(1,101) if i%7==0]
print(multiple7)

mylist=[]
for i in range(5):
    mylist.append(int(input("숫자 입력: ")))

mylist.sort()
print(mylist)

odd=[]
even=[]
for i in range(10):
    n = int(input("숫자 입력: "))
    
    if n%2==0:
        even.append(n)
    else:
        odd.append(n)

print(odd)
print(even)
