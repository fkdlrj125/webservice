import os

print(__file__)
print(os.path.dirname(__file__))

# 디렉토리 경로
current_path = os.path.dirname(__file__)

# 경로 생성
print(current_path + '\\' + 'gugudan.txt')
print(current_path + '\\' + 'chemical')
print(os.path.join(current_path, 'gugudan.txt'))
print(os.path.join(current_path, 'chemical', 'hi', 'media'))

# 현재 경로, 경로 변경
print(os.getcwd())
# os.chdir('d:\\test')
print(os.getcwd())