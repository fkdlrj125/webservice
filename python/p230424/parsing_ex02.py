from bs4 import BeautifulSoup

html = '''
<html>
    <body>
        <div id="wrap">
            <h1>공지</h1>
            <h2>과목</h2>
            <ul class="lec">
                <li>파이썬 기초1</li>
                <li>파이썬 기초2</li>
                <li>머신러닝</li>
            </ul>
            <h2>강의 일정</h2>
            <h2>교재 목록</h2>
        </div>
    </body>
</html>
'''

soup = BeautifulSoup(html, 'html.parser')
# print(soup)

# select 함수
# 모든 h2 추출
# 방법 1 - 자식을 통한 접근
h2_all_01 = soup.select('html > body > div > h2')
print('모든 h2 추출 1 :', h2_all_01)
print('타입 :',type(h2_all_01))

# 방법 2 - 자손을 통한 접근
h2_all_02 = soup.select('body h2')
print('모든 h2 추출 2 :', h2_all_02)
print('타입 :',type(h2_all_02))

# 방법 3 - 자식을 통한 접근
h2_all_03 = soup.select('div > h2')
print('모든 h2 추출 2 :', h2_all_03)
print('타입 :',type(h2_all_03))

# 방법 4 - 아이디를 통한 자식 접근
h2_all_04 = soup.select('#wrap > h2')
print('모든 h2 추출 2 :', h2_all_04)
print('타입 :',type(h2_all_04))

# [문제] 아래와 같이 content만 추출하시오.
# 과목
# 강의 일정
# 교재 목록

for data in h2_all_04:
    # print(data.text)
    # print(data.string)
    print(data.get_text())
    # print(data.getText())

# h2 하나 추출
h2_one_01 = soup.select_one('div > h2')
print('h2 하나 추출 1 >>', h2_one_01)
print(type(h2_one_01))

h2_one_02 = soup.select_one('div h2:nth-of-type(1)')
print('h2 하나 추출 2 >>', h2_one_02)

h2_one_03 = soup.select_one('div h2:nth-of-type(2)')
print('h2 하나 추출 3 >>', h2_one_03)

# ul태그를 추출 후 ul태그의 content 추출
ul_select_one = soup.select_one('#wrap ul.lec')
print('ul_select_one >>',ul_select_one)
print('ul_select_one의 content 추출 >>',ul_select_one.text)

# ul태그의 li태그를 select함수로 추출 - ul_select_one이 Tag type이라 가능
print(ul_select_one.select('li'))

# 1번째 li 엘리먼트
li_one_01 = soup.select_one('.lec li:first-of-type')
print('첫 번째 li 추출 1 >>', li_one_01)

# 2번째 li 엘리먼트
li_one_02 = soup.select_one('#wrap li:nth-of-type(2)')
print('두 번째 li 추출 2 >>', li_one_02)

# 2번째 li의 다음 형제 엘리먼트
li_one_03 = soup.select_one('.lec li:nth-of-type(2) + li')
print('세 번째 li 추출 3 >>', li_one_03)