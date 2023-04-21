from bs4 import BeautifulSoup   # __init__.py에 있는 클래스 BeautifulSoup import

html = '''
<html>
    <body>
        <h1>BeautifulSoup 연습합니다.</h1>
        <p>연습 중1</p>
        <p>연습 중2</p>
    </body>
</html>
'''

# print('html >>', html)
# print('html type >>', type(html))

## 페이지를 계층구조로 표현
soup = BeautifulSoup(html, 'html.parser')
# print(soup)
# print(type(soup))

## h1 엘리먼트 추출
## 방법 1. 변수로 접근
# print(soup.html.body.h1)
# print(type(soup.html.body.h1))

# # h1 컨텐트 추출
# # 방법 1. text
# print(soup.html.body.h1.text)
# print(type(soup.html.body.h1.text))     # str

# # 방법 2. string
# print(soup.html.body.h1.string)
# print(type(soup.html.body.h1.string))   # bs4.element.NavigableString

# # 방법 3. get_text()
# print(soup.html.body.h1.get_text())
# print(type(soup.html.body.h1.get_text()))   # str

# # 방법 4. getText()
# print(soup.html.body.h1.getText())
# print(type(soup.html.body.h1.getText()))    # str

# # body 엘리먼트 content 추출
# print(soup.html.body.text)
# print(type(soup.html.body.text))

# print(soup.html.body.string)
# print(type(soup.html.body.string))

# print(soup.body.get_text())
# print(type(soup.html.body.get_text()))

# print(soup.body.getText())
# print(type(soup.html.body.getText()))

## h1에서 접근 시작
# 최상위 엘리먼트(노드) html에서 시작하지 않아도 됨
# print(soup.h1)
# print(soup.h1.text)

# # p 접근 
# print(soup.p)
# print(soup.p.text)

# # p 엘리먼트 추출
# p = soup.html.body.p
# print('p >>', p)
# print('p >>', p.text)

# # 형제 엘리먼트 접근
# p2 = p.next_sibling.next_sibling
# print('p2 >>', p2)

# h1 = p.previous_sibling.previous_sibling
# print('h1 >>', h1)

# # 일부의 엘리먼트 추출
# body = soup.html.body
# print(body)
# print('h1 추출 :',body.h1)