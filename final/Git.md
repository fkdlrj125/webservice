# Git
- 형상(버전)관리 시스템
    - 협업, 단독 프로젝트
<BR><BR>
- local 저장소에서 작업하는 작업물을 remote(원격) 저장소에 저장하여 어디서든 접근할 수 있도록 함
    - remote 저장소로 Github를 이용
<BR><BR>
- 모든 형상관리 과정은 .git폴더 내에서 관리
<BR><BR>
- windows에서 github를 로그인하면 해당 정보가 windows에 저장
    - 로그인 정보는 하나만 저장 가능하기 때문에 다른 계정이 저장돼 있으면 commit이나 remote설정에 에러 발생
    - 제어판 -> 자격 증명 관리자 -> Windows 자격 증명 -> 일반 자격 증명
        - 저장된 github 계정 삭제
<BR><BR>
## CLI(Command Line Interface)
    - git init
        - 로컬 저장소의 폴더를 형상관리하기 위해 git을 사용할 것을 표시
        - git 파일 추가됨
<BR><BR>
    - git add
        - 원격 저장소에 올릴 파일 선택
        - '.' 을 입력하면 현재 폴더 내 모든 것을 추가
<BR><BR>
    - git commit -m "설명"
        - add한 파일들을 한 묶음(버전)으로 만들고 설명 추가
        - -m 옵션으로 설명 추가
<BR><BR>
    - git remote add 주소
        - 로컬 파일을 저장할 원격 저장소 지정
<BR><BR>
    - git push
        - commit한 버전을 지정한 원격 저장소에 저장 
<BR><BR>
    - git clone 프로젝트 주소 (.)
        - 원격 저장소에 저장된 프로젝트 파일을 로컬에 저장
        - '.' 을 추가해 현재 위치에 파일만 저장
<BR><BR>
    - git pull
        - 원격 저장소에 변경된 파일만 로컬에 저장
<BR><BR>
    - git log
        - commit한 작성자와 날짜 정보 출력
<BR><BR>
    - git config --global user.email ""
        - github의 이메일 계정
<BR><BR>
    - git config --global user.name ""
        - github의 계정의 이름
<BR><BR>
## 파일 상태
- untracked
    1. 추적되지 않음 : git을 통해 관리되지 않는 상태
- tracked
    1. 수정없음 : 원격 저장소에 업로드가 완료된 상태, 원격 저장소와 로컬 저장소의 상태가 일치한 상태
    1. 수정함 : 로컬에서 파일이 수정된 상태, 원격 저장소와 로컬 저장소의 상태가 불일치한 상태
    1. 스테이지 : 선택(add)된 상태

## Branch(브랜치)
- 원본을 변경하지 않고 복사본으로 작업
- 같은 작업을 할 때 여러 사람이 push하면 작업이 덮어씌어 지기 때문에 브랜치로 분리
- 기본 이름은 master
- 브랜치를 분리하면 기존(master)에 있던 모든 파일들도 복사됨

### HEAD
- 현재 작업중인 브랜치

### Merge(병합)
- 작업한 브랜치를 master(원본)에 적용
- 적용될 브랜치에서 적용할 브랜치를 선택 후 병합
- conflict(충돌) : 브랜치의 코드가 서로 다른 상태에서 병합하면 발생
    - 해당 파일을 수정해줘야 병합가능

## Origin
- 원격 저장소 경로 기본이름

## Fetch
- 원격 저장소와 로컬의 정보를 맞춤

# Github
- repository
    - 원격 저장소의 저장공간
    - 계정명+repository명이 주소가 되어 접근가능
    - repository가 주소가 되기 때문에 같은 계정 내 중복된 repository명은 사용불가
<BR><BR>
- token 발급
    - Settings -> Developer settings -> Personal access tokens -> Tokens
    - token : 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

# SourceTree
- git을 사용하기 위한 GUI 프로그램

## Stage(스테이지)
- commit을 하기 위해 대기하는 공간

## Fork
- 다른 사람의 repository를 내 repository로 복사