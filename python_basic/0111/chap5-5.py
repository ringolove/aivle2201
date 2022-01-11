dict_a = { 'v1':32, 'l1':[1, 2, 3], 'd1': {'a':1, 'b':2} }
print('v1' in dict_a.keys())
print(dict_a.get('v1'))
print('v2' in dict_a.keys())
print(dict_a.get('v2',0))