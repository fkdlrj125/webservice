const modal = document.querySelector('.modal');
const overlay = document.querySelector('.overlay');
const btn_modal = document.querySelector('.btn-modal');
const btn_close = document.querySelector('.btn-close');
const form = document.querySelector('#container > form')
const input = document.querySelector('form > input')
const ul = document.querySelector('#container > ul');

// // [구현 1]
// // text box에 입력 후, 등록 버튼 클릭하면, li 추가
// form.addEventListener('submit', (event) => {
//     // refresh 방지
//     event.preventDefault();
//     console.log('submit버튼 클릭됨')

//     // input value 가져옴
//     console.log(input.value)
    
//     // li 엘리먼트 추가
//     const li = document.createElement('li');

//     // li content 추가
//     li.innerText = input.value;
    
//     // ul 자식으로 li 추가
//     ul.appendChild(li);

//     // input 초기화
//     input.value = "";
// });

// ===========================================================

// // [구현 2] refactoring
// // : [구현 1] 코드 분리 - listener, handler

// // function
// const addLi = () => {
//     const li = document.createElement('li');
//     li.innerText = input.value;
//     ul.appendChild(li);
// };

// // Handler
// const handler = (event) => {
//   //refresh 방지
//   event.preventDefault();

//   // 빈 문자열이 아닌 경우에만, ul에 li 추가
//   if(input.value !== '') { 
//     addLi();
//   }
  
//   // input 초기화
//   input.value = '';
// };

// // Listener
// form.addEventListener('submit', handler);

// ===========================================================

// [구현 3] 기능 구현
// 1) li 엘리먼트가 추가되면, 삭제 버튼도 같이 추가
// 2) li content를 web browser에 저장
// 3) 삭제 버튼을 클릭하면 , web browser에 저장된 데이터 삭제
// 4) 새로 고침하면, web browser에 저장된 데이터를 표현

// function
const addLi = (li_item) => {
  const li = document.createElement('li');
  ul.appendChild(li);
  
  // span 추가
  const span = document.createElement('span');
  span.innerText = li_item.content;
  // li.appendChild(span);

  const btn_cross = document.createElement('button');
  // li.appendChild(btn_cross);

  btn_cross.addEventListener('click', deleteLi);
  
  li.append(span, btn_cross);

  // local storage에 저장된 요소 삭제할 때
  // 기준으로 사용될 id
  li.id = li_item.id;
};

const deleteLi = (event) => {
  btn_delLi = document.querySelector('li > button');
  const target = event.target.parentElement;
  
  // console.log(event.target.parentElement.id);

  li_items = li_items.filter((li_item) => {
    return li_item.id != target.id
  });
  console.log(li_items);

  // 엘리먼트 삭제
  target.remove();

  storage_save();
};

let li_items = [];

// local storage에 저장하는 함수
const storage_save = () => {
  localStorage.setItem('li_items', JSON.stringify(li_items));
};

// Handler
const handler = (event) => {
  event.preventDefault();

  if(input.value !== '') { 
    const li_item = {
      id : Date.now(),
      content : input.value,
    };

    li_items.push(li_item);
    console.log(li_items);

    addLi(li_item);

    storage_save();
  }
  
  // input 초기화
  input.value = '';
};

// Listener
form.addEventListener('submit', handler);

// 새로고침시 local storage에 저장된 데이터 가져오기
const init = () => {
  const local_storage_data = JSON.parse(localStorage.getItem('li_items'));
  console.log(local_storage_data);

  if(local_storage_data){
    // 전역 변수 저장
    li_items = local_storage_data;
    li_items.forEach((value) => {
      addLi(value);
    });
  }
  
};

init();
// ===========================================================

btn_modal.addEventListener('click', () => {
    modal.classList.add('active');
    overlay.classList.add('active');
});

// btn_close.addEventListener('click', () => {
//     modal.classList.remove('active');
//     overlay.classList.remove('active');
// });

// overlay.addEventListener('click', () => {
//     modal.classList.remove('active');
//     overlay.classList.remove('active');
// })

element_arr = [btn_close, overlay];

element_arr.forEach((element) => {
  element.addEventListener('click', () => {
    modal.classList.remove('active');
    overlay.classList.remove('active');
  })
})

// [연습] ==================================================
// <<web browser>> local storage
// =========================================================

// // 저장
// // localStorage.setItem();
// localStorage.setItem('name', '홍길동');

// // 가져오기
// // localStorage.getItem();
// const value = localStorage.getItem('name');
// console.log(value);

// // 객체 저장
// obj = {
//   name : '홍길동',
//   age : 25,
// }

// localStorage.setItem('obj', obj); // obj의 타입이 문자열로 저장
// //  object -> JSON(문자열)
// // 직렬화
// // JSON.stringify(obj);
// localStorage.setItem('obj', JSON.stringify(obj));

// // 객체 가져오기
// // JSON(문자열) -> object
// // 역직렬화
// // JSON.parse(localStorage.getItem(key))
// const obj_value = JSON.parse(localStorage.getItem('obj'));
// console.log(obj_value);
// console.log(typeof obj_value);
