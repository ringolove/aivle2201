l1 = [10,20,30,40,50]
l1.append(60)
print(l1)

l3 = ['python','is','funny']
l3 += ('~','!')
print(l3)

list1 = [10,20,30,40,50]
list1.insert(2,60)
print(list1)

list3 = ['python','is','funny']
for i in range(3):
    list3.insert(2,'very')
print(list3)

list1.remove(30)
print(list1)

l2 = list(range(1,21,3))
del l2[-3]
print(l2)

a = [1,4,2]
a.sort()
print(a)

b = ['c','a','b','d']
b.sort(reverse=True)
print(b)

sports = ['주짓수', '무에타이']
a = input("스포츠 입력: ")
sports.append(a)
sports.sort()
print(sports)

subjects = ['국','영','수','한','물','화']
dl = input("싫어하는 과목 입력: ")
subjects.remove(dl)
print(subjects)