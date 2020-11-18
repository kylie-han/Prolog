![Prolog-logo](https://user-images.githubusercontent.com/60127173/99497915-f0c40980-29b9-11eb-8b2d-85fd5720f22c.png)
# Prolog

## 목차

- [개요](#개요)
- [기능](#기능)
- [기술 스택](#기술-스택)
- [기술 설명](#기술-설명)
  - [ERD](#erd)
  - [기타](#기타)
- [TEAM](#TEAM)
- [프로젝트 기간](#프로젝트-기간)

## 개요

> IT직무 취업준비생을 위한 포트폴리오 관리용 블로그

######**[Prolog 소개 영상](https://www.youtube.com/watch?v=oC1O6hon53w&feature=youtu.be)**

IT직무 취준생들은 다양한 프로젝트 경험을 쌓으며 취업준비를 합니다.

하지만 프로젝트, 스펙, 취업지원 등 바쁘게 취준생활을 보내다보면 프로젝트와 경험 등을 시간내어 정리하는 것이 어렵습니다.

- 프로젝트 및 경험을 쉽게 정리하고, 해시태그를 통한 직관적인 필터링
- 지원내역과 어필한 사항들을 보기 쉽게 정리

## 기능

![20201118103043-a31e0b5bdb gif-2-mp4 com](https://user-images.githubusercontent.com/60127173/99498939-814f1980-29bb-11eb-9046-d4ef91f5c761.gif)




## 기술 스택

#### Backend : Spring Boot, Swagger, JPA

- Lombok, JPA를 이용하여 서비스 로직에 집중함

#### Frontend : Vue.js, Bootstrap

- 부트스트랩을 활용한 화면 설계
- 사용자 편의를 위한 ux
  1. 드래그앤 드랍
  2. 케러셀[이미지넘기기]
  3. 태그를 통한 필터링
  4. axios를 통한 새로고침 없는 데이터 변경
  5. 데이터 바인딩을 통한 화면 동적관리

#### DB : MariaDB - mysql

- Mysql과 호환되는 MariaDB

#### Infra : AWS EC2, Docker, Jenkins

- Jenkins를 이용하여 무중단 CI/CD구현

#### DevOps : Jira, GitLab, Git

- git, jira이용한 분업, 버전관리

## 기술 설명

### ERD

![ERD](https://user-images.githubusercontent.com/60127173/99497925-f3befa00-29b9-11eb-84c5-852940f1a7e9.png)

### 기타

- Git 브랜치
  - master : 배포된 코드의 최종 브랜치
  - develope : 개발 진핸중인 브랜치
  - feature : 기능 구현하기 위한 브랜치

- Git 커밋 메시지

  - 날짜 | 이름 | 커밋 내용

    ex) 200710 | jihye | add Readme.md

## TEAM

- 박석우 (팀장) : frontend , 발표
- 박재성 (자문, CTO) : frontend, baskend, 배포
- 한지혜(서기) : backend , 발표, CICD
- 이솔 (발표자료) : frontend , 영상, 로고 제작

## 프로젝트 기간

2020.07.07 ~ 2020.08.21

