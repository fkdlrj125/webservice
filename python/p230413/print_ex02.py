note = open('test2.txt','w')

print('one')
print('two', file=note)
print('three')

note.close()
