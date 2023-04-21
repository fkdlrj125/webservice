# [문제] 사용자가 입력한 데이터가 파일에 저장되도록 하시오.
# 파일이 없으면 새로 생성하고, 기존에 있는 파일이면 데이터가 추가되어 저장
# 파일명 : userInputData.txt
# 입력 데이터가 없으면 입력 종료

# SyntaxError: (unicode error) 'unicodeescape' codec can't decode bytes in position 28-29: truncated \uXXXX escape
# \u가 이스케이프문자라 error 발생
# 해결방법 
# [1] '\\'로 '\' 표현 - windows os는 경로를 \로 표현하기 때문에 \ 사용
# [2] '\' 대신 '/' 사용 - 파이썬은 /를 사용해도 windows os에서 사용 가능하도록 처리
# [3] prifix r을 추가 -> raw string으로 쓰겠다는 의미
#                        문자열 그대로 쓰겠다

with open('D:\webservice\python\p230418\\userInputData.txt', 'a', encoding='utf-8') as file:
    data_list = list()
    while True:
        # [1]
        # data = input('기록할 데이터 입력 >> ')

        # if not data:
        #     break

        # file.write(data + '\n')

        # [2]
        # data = input('기록할 데이터 입력 >> ')

        # if not data:
        #     break

        # data_list.append(data + '\n')
    
    # file.writelines(data_list) 

        # [3]
        data_list.append(input('기록할 데이터 입력 >> '))

        if not data_list[-1]:
            break
    
    file.write('\n'.join(data_list)) # ['입력값', '입력값', ''] 상태라 join을 해도 줄바꿈이 잘 표현됨
        
