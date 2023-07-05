/*
1. 단일 element 추출(반환)
1-1) document.getElementById('아이디');
1-2) document.querySelector('선택자');
  아이디 : #
  클래스 : .
  태그 : 태그명

2. 복수 element 추출(반환)
2-1) document.getElementsByClassName('클래스');
2-2) document.getElementsByTagNAme('태그');
2-3) document.querySelectorAll('선택자1, 선택자2');
  아이디 : #
  클래스 : .
  태그 : 태그명
*/

// 1. 단일 element 추출(반환)
const id_txt = document.getElementById('txt');
const id_greeting = document.querySelector('#greeting');

// 2. 복수 element 추출(반환)
const class_c_txt = document.getElementsByClassName('c_txt')
const div = document.getElementsByTagName('div');
// const selector = document.querySelectorAll('.c_txt');
const selector = document.querySelectorAll('#txt, hr');

// 1. 단일 element 추출(반환)
console.log('id_txt >>', id_txt);
console.log('id_greeting >>', id_greeting);
console.log('id_greeting type >>', typeof id_greeting);
console.log('id_greeting innerText >>', id_greeting.innerText);
id_greeting.innerText = '무야호!'
console.log('id_greeting innerText >>', id_greeting.innerText);

// 2. 복수 element 추출(반환)
console.log('class_c_txt >>', class_c_txt);
// [문제]
console.log('greeting innerText >>', class_c_txt[1].innerText);

console.log('div >>', div);
console.log('selector >>', selector);
 