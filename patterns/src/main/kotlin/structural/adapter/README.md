# 어댑터 (Adapter)

[전체 학습 안내](../../../../../README.md)

## 해결하려는 문제

외부 라이브러리가 제공하는 인터페이스와 우리 업무 코드가 요구하는 인터페이스가 다르다. 업체별 호출 방식이 업무 코드에 퍼지는 것을 줄이고 싶다.

## 패턴 없이 구현하면

회원가입이나 주문 처리에서 `sendEmail(title, body)`를 직접 호출하면 업체가 `deliver(content, subject)`로 바뀔 때 호출부들도 수정해야 한다.

## 이 예제의 해결 방식

| 파일 | 역할 |
|---|---|
| [notification/Notifier.kt](notification/Notifier.kt) | 우리 쪽에서 사용하는 `send(message)` 규칙. |
| [signup/SignupService.kt](signup/SignupService.kt) | 업체를 몰라도 Notifier로 가입 안내를 보낸다. |
| [provider/original/ExternalEmailClient.kt](provider/original/ExternalEmailClient.kt) | 기존 업체 라이브러리 모형. |
| [provider/original/EmailNotificationAdapter.kt](provider/original/EmailNotificationAdapter.kt) | send를 기존 업체의 sendEmail로 변환한다. |
| [provider/newprovider/NewEmailClient.kt](provider/newprovider/NewEmailClient.kt) | 새 업체 라이브러리 모형. |
| [provider/newprovider/NewEmailNotifierAdapter.kt](provider/newprovider/NewEmailNotifierAdapter.kt) | send를 새 업체의 deliver로 변환한다. |
| [Main.kt](Main.kt) | 두 업체를 각각 연결하고 동일한 가입 시나리오를 실행한다. |

`SignupService → Notifier.send() → 업체별 어댑터 → 외부 클라이언트`

## 실행과 확인

[Main.kt](Main.kt)를 저장한 뒤 VS Code에서 열고 `⌘ + Shift + B`로 실행한다. 환경 준비는 [전체 학습 안내](../../../../../README.md)를 참고한다.

현재 코드의 출력:

```text
=== 기존 업체 ===
민수 님의 회원가입 완료
제목: 알림
본문: 민수 님, 가입을 환영합니다.

=== 새 업체 ===
민수 님의 회원가입 완료
[새 이메일 업체]
제목 : 알림
본문 : 민수 님, 가입을 환영합니다.
```

두 업체의 출력에서 같은 가입 메시지를 확인한다. 업체를 바꾸는 동안 `SignupService`는 동일하게 유지된다. 실제 가입 저장이나 이메일 전송 없이 출력으로 비교하며, 비교용으로 시나리오를 두 번 실행한다.

## 장점과 비용

외부 API 변경의 영향을 어댑터와 연결 지점에 모을 수 있다. 대신 업체별 어댑터를 유지해야 한다. 제목은 예제에서 알림으로 고정했다. 업무에서 제목을 정해야 한다면 인터페이스도 필요한 정보를 표현하도록 바꿔야 한다.

## 적용할 때와 쓰지 않아도 될 때

수정하기 어려운 외부 API·기존 코드·데이터 형식을 우리 규칙과 연결할 때 적합하다. 호출이 한 곳뿐이고 변화 가능성이 작다면 직접 호출이 충분할 수 있다. 데코레이터와 달리 핵심은 기능 조합보다 인터페이스 변환이다.
