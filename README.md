# Drop
> 드론 택배 배송 서비스 <br/>

<br/>

## 1. 제작 기간 & 참여 인원
* 2022.06.07 ~ 2022.06.21
* 4명 : [이다혜](https://github.com/ekgpgdi), [김지호](https://github.com/kimziaco?tab=repositories), [김대희](https://github.com/eet43), [최찬혁](https://github.com/choichanhyeok)
<br/>

## 2. 사용 기술
<b>```Back-end```<b/>
* Java17
* Spring Boot 2.7.0
* Gradle 7.4.1
* Spring Data JPA
* H2
* MySQL 8.0.29
* Spring Security
* JWT

<br/>

## 3. ERD 설계
<img width="573" alt="스크린샷 2022-08-09 오후 5 18 45" src="https://user-images.githubusercontent.com/84092014/183600270-a8bbe543-5faf-4724-ac3b-91285d1d6552.png">

<img width="615" alt="스크린샷 2022-08-09 오후 5 18 58" src="https://user-images.githubusercontent.com/84092014/183600296-fa7df3a9-fda7-4259-b00f-021ebf68aefc.png">


<br/>
<br/>

## 4. 핵심 기능


<br/>

## 5. 아키텍처도

<img width="1188" alt="DropArchitecture" src="https://user-images.githubusercontent.com/88760828/185903861-4b114634-2617-4fa8-8c7e-aa2958f6c461.png">

<br/>

## 6. 핵심 트러블 슈팅
1. 하나의 프로젝트 내 두개의 Spring Security</br>
DDD 의 경험을 위해 각 도메인을 한명씩 담당하고 개발을 진행하다가 소통의 부재로 인해 두 개의 도메인에서 각 Spring Security 를 적용하였고 두 개의 Spring Security 인해 “Found 2 beans for type interface org.springframework.security.authentication.AuthenticationManag er, but none marked as primary” 오류가 발생하였습니다.
이때 MSA 아키텍처의 필요성을 느끼고 각 도메인을 분리하여 프로젝트를 구성했다면 어떨까 생각이 들어 다음 프로젝트에 MSA 아키텍처를 적용하였습니다.
