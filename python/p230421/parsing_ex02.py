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
