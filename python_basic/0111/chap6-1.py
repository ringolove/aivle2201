def hw(name:str):
    print("hello ",name,"welcome to Python World!")
hw('kim')

def sh(count:int):
    print('hey! '*count)
sh(5)

def hello(name:str, loud=1):
    if loud == 1:
        print(f'hello {name.upper()}!!')
    elif loud == 0:
        print(f'hello {name.lower()}.')
hello('kim',loud=0)
hello('keyboardinterrupt')

def add(a,b:int):
    sum = a+b
    print(f'덧셈 결과는 {sum}')
add(3,7)

def n(*i:int):
    print(i)
n(1,2,3,4,6,56,6,78,78,87)

def avg(*i:int):
    print(int(sum(i)/len(i)))
avg(2, 4, 6, 8, 10)