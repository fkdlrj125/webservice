# [문제] 네이버 날씨 페이지에서 이미지 다운로드 하시오.
# 저장위치 : d:\img\오늘날짜
# 파일명   : 시분밀리세컨드.jpg
from bs4 import BeautifulSoup
from urllib import request
from datetime import date, datetime
# import requests
import os

url = 'https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EB%82%A0%EC%94%A8'
html = request.urlopen(url).read()
soup = BeautifulSoup(html, 'html.parser')

today = str(date.today()).replace('-', '')
folder_path = f'd:\\img\\{today}\\'

# video_list = soup.find('div', class_='list_square')
img_list = soup.find_all('img', class_='api_img')

# if not os.path.exists(save_path):
#     os.makedirs(save_path)
os.makedirs(folder_path, exist_ok=True)

for img in img_list:
    save_time = str(datetime.now().strftime('%H%M%f'))
    save_path = os.path.join(folder_path, save_time+'.png')
    request.urlretrieve(img['data-lazysrc'], save_path)
