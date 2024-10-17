# Spring Boot 3 기반 웹 게시판 시스템
<br/>

## 📝 작품소개
 Spring Boot 3를 기반으로 제작한 웹 게시판 시스템입니다. <br> 
 게시글 및 댓글의 CRUD 기능을 제공하며, RESTful API를 통해 서버와의 통신을 최적화하고, JPA를 이용하여 데이터베이스에 저장하고 관리합니다. <br> 
 UI는 Mustache 템플릿 엔진과 자바스크립트를 활용해 동적인 인터페이스를 구현했습니다.

<br/>

## 🌁 주요 기능

**웹 게시판**
- 게시글의 제목 및 작성자, 내용을 목록 형태로 게시
 <table>
  <tr>
    <td align="center" width="50%">
      <img src="https://github.com/user-attachments/assets/ecf8ab16-95a8-4bf7-b6fc-4f318174af30" width="100%" />
    </td>
  </tr>
  <tr>
    <td align="center" style="border: none;">
      <p align="center">게시판 메인 페이지</p>
    </td>
  </tr>
</table>
<br>

- **게시글 CRUD**
<table>
  <tr>
    <td align="center" width="50%">
      <img src="https://github.com/user-attachments/assets/b9848c99-8322-4fe9-9015-8d40c4427c02" width="100%" />
    </td>
    <td align="center" width="50%">
      <img src="https://github.com/user-attachments/assets/8181cfab-ee3c-4811-aa57-6ff1a306f588" width="100%" />
    </td>
  </tr>
  <tr>
    <td align="center" style="border: none;">
      <p align="center">게시글 생성</p>
    </td>
    <td align="center" style="border: none;">
      <p align="center">게시글 읽기</p>
    </td>
  </tr>
  <tr>
    <td align="center" width="50%">
      <img src="https://github.com/user-attachments/assets/53f73b30-da2a-45c7-9eb7-e9dc4238dcd7" width="100%" />
    </td>
    <td align="center" width="50%">
      <img src="https://github.com/user-attachments/assets/a9e12862-170d-4f2e-8b9e-cba51f332402" width="100%" />
    </td>
  </tr>
  <tr>
    <td align="center" style="border: none;">
      <p align="center">게시글 수정</p>
    </td>
    <td align="center" style="border: none;">
      <p align="center">게시글 수정 후 갱신</p>
    </td>
  </tr>
<tr>
    <td align="center" width="50%">
      <img src="https://github.com/user-attachments/assets/c40d89f0-deb3-4d4c-8b40-209e71734899" width="100%" />
    </td>
  </tr>
  <tr>
    <td align="center" style="border: none;">
      <p align="center">게시글 삭제</p>
    </td>
  </tr>
</table>
<br/>

- **댓글 CRUD**
 <table>
  <tr>
    <td align="center" width="50%">
      <img src="https://github.com/user-attachments/assets/9e41a1b3-ebd3-49a3-880f-68b9d3385f52" width="100%" />
    </td>
    <td align="center" width="50%">
      <img src="https://github.com/user-attachments/assets/c8d6f086-fcb7-4b29-9491-7f56a2fd4180" width="100%" />
    </td>
  </tr>
  <tr>
    <td align="center" style="border: none;">
      <p align="center">댓글 작성</p>
    </td>
    <td align="center" style="border: none;">
      <p align="center">댓글 등록</p>
    </td>
  </tr>
</table>
<table>
  <tr>
    <td align="center" width="33.33%">
      <img src="https://github.com/user-attachments/assets/5fe6e168-891d-4a3e-8c4c-31db9628e581" width="100%" />
    </td>
    <td align="center" width="33.33%">
      <img src="https://github.com/user-attachments/assets/4727e453-5ed8-4809-9e8e-8229d2bfe167" width="100%" />
    </td>
    <td align="center" width="33.33%">
      <img src="https://github.com/user-attachments/assets/fbb23b5c-fa8f-4dab-857f-1d45e953b9f5" width="100%" />
    </td>
  </tr>
  <tr>
    <td align="center" style="border: none;">
      <p align="center">댓글 수정</p>
    </td>
    <td align="center" style="border: none;">
      <p align="center">댓글 수정 완료 팝업</p>
    </td>
    <td align="center" style="border: none;">
      <p align="center">댓글 수정 후 갱신</p>
    </td>
  </tr>
</table>
 <table>
  <tr>
    <td align="center" width="50%">
      <img src="https://github.com/user-attachments/assets/40cce5fd-5956-49ff-9da3-f40b2f037017" width="100%" />
    </td>
    <td align="center" width="50%">
      <img src="https://github.com/user-attachments/assets/1a7d71ef-a088-45d1-93b5-924a0e36a3f8" width="100%" />
    </td>
  </tr>
  <tr>
    <td align="center" style="border: none;">
      <p align="center">댓글 삭제 및 삭제 완료 팝업</p>
    </td>
    <td align="center" style="border: none;">
      <p align="center">댓글 삭제 후 갱신</p>
    </td>
  </tr>
</table>
<br> 

- **Spring Boot 3 기반 백엔드 시스템 구축**  
  - RESTful 게시판 시스템 개발 및 유지보수  
  - 게시글 및 댓글의 CRUD (Create, Read, Update, Delete) 기능 구현  
  - JPA를 사용하여 데이터베이스와의 연동 최적화  

- **프론트엔드 및 UI/UX 설계**  
  - Mustache 템플릿 엔진을 적용하여 깔끔한 UI 구현  
  - 자바스크립트를 활용한 동적인 사용자 인터페이스 및 인터랙션 구현

- **아키텍처 및 코드 품질 개선**  
  - MVC 패턴을 적용하여 코드 구조를 체계적으로 관리  
  - 테스트 코드 작성 및 유닛 테스트 수행으로 시스템의 안정성 확보

<br>

## 🔧 Stack
**Backend**  
- **Language**: Java  
- **Framework**: Spring Boot 3  
- **Database**: MySQL  
- **ORM**: JPA  

**Frontend**  
- **Templating Engine**: Mustache  
- **Language**: JavaScript, HTML, CSS  
- **Libraries**: jQuery  

<br>

## 🙋‍♂️ Developer
|  Fullstack |             
| :--------: | 
| [김가은](https://github.com/gaeunamy) |
