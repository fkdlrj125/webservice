const emoji = document.querySelector('.emoji');
const text_change = document.querySelector('.text_change');
const greeting = document.getElementById('greeting');
const remove = document.querySelector('.remove');

// [이벤트 리스너 등록]
emoji.addEventListener('click', emojiHandler);
text_change.addEventListener('click', () => {
  greeting.innerText = '...';
  greeting.style.color = '#fff';
});
greeting.addEventListener('mouseover', () => console.log('😒'))
remove.addEventListener('click', removeHandler);

// 함수 선언식
function emojiHandler(event) {
  console.log(event);
  console.log('😢');
}

function removeHandler() {
  console.log('이모지 출력 이벤트 해제');
  emoji.removeEventListener('click', emojiHandler);
}
