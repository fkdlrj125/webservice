from bs4 import BeautifulSoup
import requests
from datetime import datetime

url = 'https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=101'
# 무분별한 크롤링을 막기 위해 헤더 정보가 없는 요청은 무시
html = requests.get(url, headers={'User-Agent':'Mozilla/5.0'}).text
soup = BeautifulSoup(html, 'html.parser')
write_time = datetime.now()

classfy = soup.find('div', class_='classfy')
titles = classfy.find_all('a')

with open('news.txt', 'a', encoding='UTF-8') as news:
    news.write(f'기록일시 : {write_time}\n')
    for idx, title in enumerate(titles, 1):
        news.write(f'{idx}. {title.text}\n')
    news.write('\n')

print('** 프로그램 종료 **')
