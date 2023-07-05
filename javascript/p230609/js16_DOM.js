const title = document.getElementById('title');
const append = document.querySelector('#append');
const first_p = document.querySelector('.paragraph:first-of-type')
const paragraph = document.getElementsByTagName('p');

console.log('title >>', title);
title.innerText = '졸려';

// append.innerText = '<h3>추가된 제목</h3>';
append.innerHTML = '<h3>추가된 제목</h3>';
console.log(append);

console.log('첫 번째 단락 접근');
console.log(first_p);
first_p.innerText = '첫 번째 단락만 변경';
first_p.style.color = '#abcdef';

console.log(paragraph);
// for(p of paragraph) {
//   p.style.textAlign = 'center';
// }
const arr = Array.from(paragraph);
arr.forEach(p => p.style.textAlign = 'center');