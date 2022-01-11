dict_a = {'v1': 32, 'l1': [1, 2, 3], 'd1': {'a': 1, 'b': 2}}

print(dict_a['v1'])
print('='*20)
print(dict_a['l1'])
print(dict_a['l1'][0:2])
print('='*20)
print(dict_a['d1'])
print(dict_a['d1']['a'],'\n')

print(dict_a.keys())
print(dict_a.values())
print(dict_a.items())