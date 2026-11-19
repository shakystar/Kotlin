# 단순 팩토리 (Simple Factory)

[전체 학습 안내](../../../../../../README.md)

## 해결하려는 문제

종류에 따른 객체 생성 분기가 여러 사용처에 흩어져, 생성 방법을 바꿀 때 같은 조건문을 반복해서 수정해야 한다.

## 패턴 없이 구현하면

호출하는 곳마다 이메일인지 문자인지 판단하고 구체 클래스를 생성한다. 한두 곳에서 직접 생성하는 것은 충분히 단순한 선택이지만, 동일한 분기가 반복되면 변경 지점이 늘어난다.

## 이 예제의 해결 방식

| 파일 | 역할 |
|---|---|
| [Notification.kt](Notification.kt) | 사용자가 의존하는 알림 규칙. |
| [EmailNotification.kt](EmailNotification.kt) | 이메일 알림의 출력 구현. |
| [SmsNotification.kt](SmsNotification.kt) | 문자 알림의 출력 구현. |
| [NotificationFactory.kt](NotificationFactory.kt) | `when`으로 구현체를 선택해 생성한다. |
| [Main.kt](Main.kt) | 종류를 전달하고 공통 인터페이스로 알림을 보낸다. |

`Main → NotificationFactory.create(type) → Notification 구현체 → send()`

## 실행과 확인

[Main.kt](Main.kt)를 저장한 뒤 VS Code에서 열고 `⌘ + Shift + B`로 실행한다. 환경 준비는 [전체 학습 안내](../../../../../../README.md)를 참고한다.

현재 코드의 출력:

```text
이메일 알림 : 가입을 환영합니다.
문자 알림 : 인증번호는 1234입니다.
```

이메일과 문자 알림을 확인한다. 추가 실험으로 `create("emial")`을 호출하면 `IllegalArgumentException`이 발생한다. 문자열 오타는 컴파일 시점에 검사되지 않으며, `enum class`로 개선할 수 있다.

## 장점과 비용

생성 분기를 한곳에 모으고 호출부를 간단하게 만든다. 새 종류를 추가할 때는 기존 팩토리의 `when`을 수정해야 한다. 팩토리가 `object`인 것은 예제의 선택이며 필수 조건이 아니다.

## 적용할 때와 쓰지 않아도 될 때

종류 선택과 생성 로직을 여러 곳에서 재사용할 때 적합하다. 생성이 단순하고 한 곳에서만 필요하면 직접 생성해도 된다. 단순 팩토리는 GoF 23개 패턴에 포함되지 않으며, 팩토리 메서드와 비교하기 위한 선행 예제다.
