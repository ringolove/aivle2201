dict_a = { 'v1':32, 'l1':[1, 2, 3], 'd1': {'a':1, 'b':2} }
for a, b in dict_a.items():
    print(a,':',b)
    
icecream = {'메로나':[400,380],
 '비비빅':[400,350],
 '탱크보이':[500,450],
 '월드콘':[1000,900]}

test = list(icecream.values())
print(test[2][0])

day = input("요일 입력: ")
주말 = ['토', '일']
if day in 주말:
    key = list(icecream.keys())
    val = list(icecream.values())
    for i in range(len(icecream)):
        print(key[i],':',val[i][1])
else:
    key = list(icecream.keys())
    val = list(icecream.values())
    for i in range(len(icecream)):
        print(key[i],':',val[i][0])
        
lyrics = '''
Since I was born
they couldn't hold me down
Another misfit kid,
another burned-out town
Never played by the rules
I never really cared
My nasty reputation
takes me everywhere
I look and see it's not only me
So many others have stood
where I stand
We are the young
so raise your hands
They call us problem child
We spend our lives on trial
We walk an endless mile
We are the youth gone wild
We stand and we won't fall
We're the one and one for all
The writing's on the wall
We are the youth gone wild
Boss screaming in my ear
about who I'm supposed to be
Getcha a 3-piece Wall Street
Smile and son you'll look just like me
I said hey man there's something
that you oughta know
I tell ya Park Avenue leads to skid row
I look and see it's not only me
We're standing tall ain't never a doubt
We are the young, so shout it out
They call us problem child
We spend our lives on trial
We walk an endless mile
We are the youth gone wild
We stand and we won't fall
We're the one and one for all
The writing's on the wall
We are the youth gone wild
'''

lyrics = lyrics.replace('\n',' ').replace(',','').lower().split()

words = {}
for i in lyrics:
    words[i] = words.get(i,0)+1

print(words)
