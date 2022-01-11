a = [23,3,16,45,11]
a.append(99)
b = [100]
a = a+b
print(a)

l = [1,3,5,7]
l2 = [2,4,8]
l.append(l2[1])
print(l)

l1 = [1,3,5,7]
print(l1+l2)

a[1] = 300
print(a)

a[4] = 11*2
print(a)

del(a[1])
print(a)