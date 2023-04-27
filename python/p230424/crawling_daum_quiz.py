# [문제] daum의 경제 탭에서 오늘의 연재 타이틀을 화면에 출력하시오.

from bs4 import BeautifulSoup
from urllib import request as request
import requests

url = 'https://news.daum.net/economic#1'
# html = requests.get(url).text
# html = requests.get(url).content

html = request.urlopen(url).read()

soup = BeautifulSoup(html, 'html.parser')
print(soup)

# todayseries = soup.find('ul', class_='list_todayseries')
# title_todayseries = todayseries.find_all('a', class_='link_txt')

# for idx, title in enumerate(title_todayseries, 1):
#     print(f'{idx}. {title.text}')
