# 팩토리 메서드 (Factory Method)

[전체 학습 안내](../../../../../../README.md)

## 해결하려는 문제

공통 처리 흐름은 유지하면서, 그 흐름에서 사용할 객체의 생성 방법을 하위 클래스가 확장해야 한다.

## 패턴 없이 구현하면

상위 처리 코드가 `EmailNotification()`을 직접 생성하면 특정 구현체에 묶인다. 종류마다 처리 흐름 전체를 복사하면 공통 동작을 수정할 때 여러 곳을 고쳐야 한다.

## 이 예제의 해결 방식

| 파일 | 역할 |
|---|---|
| [Notification.kt](Notification.kt) | 생성 대상의 공통 인터페이스(Product). |
| [EmailNotification.kt](EmailNotification.kt) | 이메일 제품 구현. |
| [SmsNotification.kt](SmsNotification.kt) | 문자 제품 구현. |
| [NotificationService.kt](NotificationService.kt) | 공통 `notify()`와 추상 생성 메서드를 정의하는 Creator. |
| [EmailNotificationService.kt](EmailNotificationService.kt) | 생성 메서드를 재정의해 이메일 객체를 만든다. |
| [SmsNotificationService.kt](SmsNotificationService.kt) | 생성 메서드를 재정의해 문자 객체를 만든다. |
| [Main.kt](Main.kt) | 사용할 하위 서비스를 선택한다. |

`notify(message) → 재정의된 createNotification() → notification.send(message)`

## 실행과 확인

[Main.kt](Main.kt)를 저장한 뒤 VS Code에서 열고 `⌘ + Shift + B`로 실행한다. 환경 준비는 [전체 학습 안내](../../../../../../README.md)를 참고한다.

현재 코드의 출력:

```text
이메일 알림 : 가입을 환영합니다.
문자 알림 : 인증번호는 1234입니다.
```

단순 팩토리와 출력은 같지만 생성 결정이 조건문에서 하위 클래스의 `override`로 옮겨졌다. 출력만 보지 말고 `NotificationService.notify()`가 구체 클래스를 직접 생성하지 않는지 확인한다.

## 장점과 비용

공통 흐름을 수정하지 않고 생성 방법을 하위 클래스로 확장한다. 대신 상속 계층과 클래스가 늘어난다. 새 서비스를 선택해 연결하는 코드는 여전히 필요하다. 문자열 대신 타입을 쓴다는 이유만으로 항상 더 안전하거나 더 좋은 설계인 것은 아니다.

## 적용할 때와 쓰지 않아도 될 때

공통 처리 흐름을 제공하는 프레임워크나 상속 기반 확장 지점에 적합하다. 이 예제처럼 흐름이 짧다면 단순 팩토리나 객체 주입만으로 충분할 수 있다. `Service`는 역할을 설명하기 위한 이름이며 MVC 계층을 강제하지 않는다.
