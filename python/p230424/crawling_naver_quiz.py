from bs4 import BeautifulSoup
from datetime import datetime
import urllib.request as request
import requests


url = 'https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=101'
# user-agent 정보가 없는 요청은 무시
headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36'}
html = requests.get(url, headers=headers).text

# html = request.urlopen(url).read()
soup = BeautifulSoup(html, 'html.parser')
write_time = datetime.now()

classfy = soup.find('div', class_='classfy')
titles = classfy.find_all('a')
# # 태그의 속성은 딕셔너리 형태로 BeautifulSoup이 파싱
# print(titles[0]['title'])
# print(titles[0]['href'])

with open('news.txt', 'a', encoding='UTF-8') as news:
    news.write(f'기록일시 : {write_time}\n')
    for idx, title in enumerate(titles, 1):
        news.write(f'{idx}. {title.text}\n')
    news.write('\n')

print('** 프로그램 종료 **')
