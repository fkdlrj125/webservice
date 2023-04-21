import os

# 경로 존재 확인
print(os.path.exists(r'd:\test'))
print(os.path.exists(r'd:\day'))

# 파일 생성
open(r'd:\test\ex.txt', 'w')

# 파일 존재 확인
print(os.path.exists(r'd:\test\ex.txt'))

# 디렉토리 생성
# 예외 처리
try:
    os.mkdir(r'd:\okay')
except:
    print('폴더가 이미 존재합니다.')
else:
    print('폴더 생성 완료')

# 조건문
okay_path = r'd:\okay' # 경로가 반복 사용될 땐 변수로 만들어 사용
if os.path.exists(okay_path):
    print('폴더가 이미 존재합니다.')
else:
    os.mkdir(okay_path)
    print('폴더 생성 완료')

os.mkdir('d:\\hey\\sub\\hi\\yo') # 상위 디렉토리가 존재하지 않아 Error
os.makedirs('d:\\hey\\sub\\hi\\yo', exist_ok=False)

# 폴더 삭제
os.rmdir(r'd:\okay')  # 빈 디렉토리가 아니라 Error
os.rmdir(r'd:\test')  # 빈 디렉토리가 아니라 Error

# 파일 삭제
os.remove(r'd:\okay\test.txt')     # test의 하위 파일 ex.txt삭제
os.rmdir(r'd:\test')  # 빈 디렉토리라 삭제 가능

os.removedirs('d:\\hey\\sub\\hi\\yo')
os.removedirs(r'd:\okay\hi\media') 

# # 쉘 유틸리티
# import shutil

# # shutil.rmtree(r'd:\hey')
# shutil.rmtree(r'd:\okay')

print(' === 프로그램 종료 === ')