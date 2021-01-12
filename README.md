# ObserverPattern
Observer Pattern 설명 및 예제 레포지토리입니다.

## ObserverPattern 설명
### Why
- 주체객체: 상태를 갖고있는
- 관찰객체: 상태의 변경을 알아야하는
위 두 객체가 다음과 같은 관계를 갖고있다.
![ObserverPattern_pic1](https://images.velog.io/images/cchloe2311/post/b32c1069-3a9a-40e4-afb1-4273a136a4ee/image.png)

위 두 객체가 서로의 정보를 넘기고 받는 과정에서,
정보의 단위가 클수록, 객체들의 규모가 클수록 -> 각 객체간의 복잡도가 놓아지고 구현이 어려워지는 문제가 있다.
### How
1. Observer 객체를 관찰대상인 Subject 객체에 등록한다. (즉, one-to-many 의존성을 가진다.)
2. 상태의 변화가 생기면 Subject 객체가 이벤트를 발생시킨다
3. Observer 객체는 이 이벤트를 받아 처리한다.

![ObserverPattern_pic2](https://images.velog.io/images/cchloe2311/post/63330f02-4278-4a94-9544-af1563af7c75/image.png)
### What
위와 같이 동작하는 Observer Pattern이란,
> 객체의 상태 변화를 관찰하는 옵저버들의 목록을 객체에 **등록**해, 상태변화가 있을 때마다 메서드를 통해 객체가 직접 옵저버에 **통지**하도록 하는 디자인패턴이다.

![ObserverPattern_pic3](https://upload.wikimedia.org/wikipedia/commons/0/01/W3sDesign_Observer_Design_Pattern_UML.jpg)

이 패턴은 분산 이벤트 핸들링 시스템, MVC 패턴, 안드로이드-OnClickListener, 안드로이드-LiveData 등에서 사용되고 있다.
### SOLID
옵저버는 서브젝트에 update API만 제공한다. 서브젝트는 옵저버가 특정 인터페이스를 구현한다는 정보만 가지고있다.
따라서, 옵저버는 언제든 추가, 제거를 할 수 있다. 또, 새로운 형식의 옵저버가 추가되어도 서브젝트에 전혀 영향을 주지 않는 느슨한 결합을 갖고있다.

이는 SOLID 원칙의 OCP, LSP, DIP를 만족한다!
## ObserverPattern 예제
_헤드 퍼스트 디자인패턴 책에서 참고한 예제입니다._
### 문제
> 날씨 정보가 바뀌면 각 방송사가 이를 방송하도록 하라
### 역할
- Subject
  - 날씨 상태를 가짐
  - Observer 리스트를 가짐
- Observer
  - 각 방송사로, Subject를 구독
  - 상태변화 observe 시 방송
### 결과
![ObserverPattern_pic4](https://media.vlpt.us/images/cchloe2311/post/34fc6b2a-f4cc-45ec-9022-00c4a7ed9f02/image.png)

날씨정보 변경 시, 각 방송사가 이를 observe해 방송하는 것을 확인
