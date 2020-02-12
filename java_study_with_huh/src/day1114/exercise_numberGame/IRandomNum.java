package day1114.exercise_numberGame;

//interface IRandomNum{
//	void correctNum();
//}
//correctNum 설명
//랜덤으로 숫자 하나를 생성하여,
//유저가 맞추는 게임.
//1~100 사이의 숫자를 맞추는 게임.만약 입력중 영문자를 
//넣어서 발생한 예외가 있으면 try catch로 예외처리 할것
//================
//[ ] 실행결과
//1 과 100 사이의 값을 입력하세요:50
//더 작은 수를 입력하세요.
//1과 100 사이의 값을 입력하세요:asdf
//유효하지 않은 값입니다 다시 값을 입력해주세요 . 
//1과 100 사이의 값을 입력하세요:38
//더 큰 수를 입력하세요.
//1과 100 사이의 값을 입력하세요:44
//맞추었습니다.
//시도횟수는 5번 입니다.

public interface IRandomNum {
	void correctNum();
}
