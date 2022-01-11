def divide(a,b:int):
    if b==0:
        print('0으로 나눌 수 없습니다.')
    elif a or b != int:
        print('입력값이 모두 숫자여야 합니다.')
    else:
        return int(a/b)
divide(10, 'a')

def even(a):
    if type(a) == type(list()) :
        l=[]
        for i in a:
            if i%2==0:
                l.append(i)
        return l
    else:
        print('리스트 형태로 입력하세요.')
print(even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))