const element = document.getElementById('greeting');

// 함수 선언식
function textChange() {
  // [방법 1] 
  // const element = document.getElementById('greeting');
  element.innerText = 'Clicked';
  element.style.backgroundColor = '#abcdef';
}

function textReset() {
  // const element = document.getElementById('greeting');
  element.innerText = 'Hello~ Hi~~~';
  element.style.backgroundColor = '#fff';
}


