import re

data = '''abc mart food2
 10days 5252ab 퇴근!
   야호~ 안녕  at     '''

# cp = re.compile('a')     # a
# cp = re.compile('ac')     # ac 
# cp = re.compile('[ac]')     # a또는 c인 것 
# cp = re.compile('[a-z]')     # a~z인 것 한 개
# cp = re.compile('[a-zA-Z]')     # a~z, A~Z인 것 한 개 
# cp = re.compile('[0-9]')     # 0~9인 것 한 개 
# cp = re.compile('o*')   # o가 0개 이상인 것  - 일치하지 않은 것도 찾음
# cp = re.compile('o+')   # o가 1개 이상인 것  - 일치하는 것만 찾음
# cp = re.compile('o{2,4}')   # o가 2 ~ 4개인 것
# cp = re.compile('[a-z]+')   # a~z까지 1개 이상인 것
# cp = re.compile('fo+')   # f로 시작하고 o를 1개 이상인 것
# cp = re.compile('fo{2}')   # f로 시작하고 o가 2개인 것
# cp = re.compile('[0-9]+')   # 0~9까지 1개 이상인 것
# cp = re.compile('[0-9]+[a-z]+')   # 0~9까지 1개 이상으로 시작하고 a~z까지 1개 이상인 것
# cp = re.compile('[a-z]+[0-9]+')   # a~z까지 1개 이상으로 시작하고 0~9까지 1개 이상인 것
# cp = re.compile('[가-힣]+')     # 가 ~ 힣까지 1개 이상인 것 - 히의 받침까지 처리해줘야 되기 때문에 힣까지
# cp = re.compile('\w+')     # [a-zA-z0-9] - 모든 문자(한글도 가능)
# cp = re.compile('\W+')     # [^a-zA-z0-9]
# cp = re.compile('\d+')     # [0-9]
# cp = re.compile('\D+')     # [^0-9]
# cp = re.compile('\s+')     # [ \t\n\r\f\v] - 공백
# cp = re.compile('\S+')     # [^ \t\n\r\f\v]
# cp = re.compile('[^ao]')   # a와 o를 제외한 모든 것
# cp = re.compile('a.t')     # aㅁt a로 시작하고 중간에 아무거나 하나 무조건 들어오고 t로 끝나는 문자
# cp = re.compile('[a.t]')   # a 또는 . 또는 t 
cp = re.compile('^a')        # 문자열 기준 a로 시작하는 문자


# print('1) match :', cp.match(data)) 
# print('2) search :', cp.search(data))
print('3) findall :', cp.findall(data))
# print('4) finditer :', cp.finditer(data))
# print(type(cp.finditer(data)))
# for data in cp.finditer(data):
#     print(data)
