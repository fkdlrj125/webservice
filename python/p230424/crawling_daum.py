from bs4 import BeautifulSoup
import requests
import urllib.request as request

url = 'https://news.daum.net/economic#1'

# 1. 요청
# [방법 1] requests
# html = requests.get(url).content
# html = requests.get(url).text
# print(type(html))
# print(html)

# [방법 2] request
html = request.urlopen(url)
# print(html)
# print(type(html))

# 2. 파싱(parsing)
soup = BeautifulSoup(html,'html.parser')
# print(soup)

# 3. 엘리먼트 추출 : 뉴스 타이틀 리스트 ul 
news = soup.find(class_='list_newsmajor').find_all('a', class_='link_txt')
# print(news)
# print(len(news))

for idx, news_title in enumerate(news, 1):
    # print(news_title)
    print(f'{idx}. {news_title.text}')