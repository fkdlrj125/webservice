from bs4 import BeautifulSoup

html = '''
<html>
<body>
    <p id="wrap">
        <a class="website" id="naver" href="https://www.naver.com">NAVER</a>
        <a class="website" id="daum" href="https://www.daum.net">DAUM</a>
        <a class="website" id="google" href="https://www.goolge.com">GOOGLE</a>
    </p>    
</body>
</html>
'''

soup = BeautifulSoup(html, 'html.parser')

# 모든 a 추출 
# 1. 태그 : 모든 a 엘리먼트 추출
a_all_01 = soup.find_all('a')
# print('모든 a 태그 >>', a_all_01)
# print('find_all 타입 >>', type(a_all_01))

# 2.1. 속성 : class가 website인 엘리먼트 추출
a_all_02_01 = soup.find_all(class_='website') # 파이썬의 class와 충돌이 나기 때문에 _로 구분
# print('모든 a 태그 >>', a_all_02_01)

# 2.2. 속성 : id
# a_all_02_02 = soup.find_all(id=True) # 아이디가 있는 모든 엘리먼트 추출 
a_all_02_02 = soup.find_all('a', id=True) # 아이디가 있는 모든 a 엘리먼트 추출
# print('모든 a 태그 >>', a_all_02_02)
# print('모든 a 태그 >>', len(a_all_02_02))

# 2.3. 속성 : 여러 개 지정
a_all_02_03 = soup.find_all(attrs={'class':'website', 'id':'naver'})
# print('a >>', a_all_02_03)

# 3. 태그와 속성
a_all_03 = soup.find_all('a', class_='website')
# print('a_all_03 >>', a_all_03)

# 4. content : content가 NAVER인 엘리먼트 추출
a_all_04 = soup.find_all(string='NAVER')
# print('a_all_04 >>', a_all_04)

# a 하나만 추출
a_one_01 = soup.find('a')
# print('a_one_01 >>', a_one_01)
# print('a_one_01 >>', type(a_one_01))

a_one_02 = soup.find(class_='website')
# print('a_one_02 >>', a_one_02)

# a_one_03 = soup.find(id=True)  # id가 있는 첫 번재 태그를 추출 - p태그
a_one_03 = soup.find('a', id=True) 
# print('a_one_03 >>', a_one_03)

p_one = soup.find(id=True)
# print('p_one >>', p_one)
# print('p_one : type >>', type(p_one))
print(p_one.find_all('a'))
