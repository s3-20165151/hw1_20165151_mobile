# hw1_20165151_mobile
mobile programming - first homework

[테스트 환경]
1. 안드로이드 스튜디오 SDK (Tools -> SDK Manager로 확인)
   - SDK 플랫폼 : Android 10.0(Q), 9.0(Pie), 8.1(Oreo)
   - Android SDK Build-Tools : 29.0.2, 28.0.3, 28.0.2
   - Android Emulator
   - Android SDK Platform-Tools
   - Android SDK Tools
   - Google Play services
   - Intel x86 Emulator Accelerator (HXAM Installer)
   - Google USB Driver
2. JDK-10.0.2
   Java(TM) SE Runtime Environment 18.3 (build 10.0.2+13)
3. 안드로이드 스튜디오 실행 환경
   - Windows 10 Home, 64비트 운영체제(x64 기반 프로세서)
   
[구현내용]
1. 첫번째 화면 (Relative Layout 사용)
- 회원가입(Button)

2. 두번째 화면 (Linear Layout 사용)
- 회원가입 페이지, 첫번째 페이지에서 회원가입 버튼 클릭 시 출력
- ID(EditView, 중복검사), 비밀번호(EditView)
- 이름/전화번호/주소(EditView)
- 개인정보 사용 동의 간략 약관(TextView), 동의 여부(Radio Button, Decline/Accept)
- 취소 및 등록 버튼 누르면 첫번째 페이지로 이동
