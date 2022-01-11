def cal1(a,b:int,operator):
    if operator == '+':
        return a+b
    elif operator == '-':
        return a-b
    elif operator == '*':
        return a*b
    elif operator == '/':
        return a/b
    else:
        print("다시 입력하세요")
        
c = cal1(10,20,'*')
print(c)

def cal2(a,b:int):
    return a//b, a%b
r1, r2 = cal2(50,25)
print(r1,r2)

def even(a):
    list=[]
    for i in a:
        if i%2==0:
            list.append(i)
    return list
print(even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))