package day1015;

public class Hww {

}
1. 매일 각 반의 수강생들의 출석여부를 관리할 수 있도록 출석부를 만드시오.
- 수강생 (Student)
- 출결 (Attendance)
- 날짜 (Date)

========================
* 일단 한 반만 생각해보자 *

//어떤 날짜의 출결의 데이터가 필요해~
//attendance record

//컬렉션은 두가지 필요해!! 1. Map 2. List
Map<Date, AttendanceList> dailyAttendances;

class Attendance {
Student student;
boolean isAttendance;
} //출석 하나임

class Attendance {
Date date;
LIst<Attendance> attendances;
} //어느 한 날짜의 출석리스트


2. 과별 학생 목록을 관리하시오.
- 학생 (Student)
- 과 (Department)

class Student {
Department department;
//역참조: 과에 학생이 속해있지만 사실은 학생 내부에 속한 과의 정보가 있어
//---> 서로의 관계 이것이 바로 relationship
//관계의 불일치가 일어나지 않도록 설계해야해!!!
//나아가서 관계 있는 사이의 한쪽이 내용을 변경할 때 다른 쪽에서도 변경되도록 코딩해줘야해
}

class Department {
List<Student> students;
//과에 학생정보가 있어..
}

3. consol 프로그램 구조
(출력)물어보고-> 입력받고-> 확인(validation)하고-> 저장하고-> 다시 물어봐~~ 
=>무한루프의 구조얌

4. 숙제) 걍 String으로  이름과 성을 받아서 확인하는 간단한구조 만들기
저장하면 빠져나오고, 취소하면 저장 안하고 종료
메뉴: 수정(현재 이름과 성 표시, 물어보고 저장할건지! 성 수정, 이름 수정 메뉴 만들기 , 바뀐거 표시해주고 종료), 취소
==========
이름과 성을 수정하는 콘솔 프로그램 작성=>기본적 메뉴구조

# 기본화면
성: 홍
이름: 길동

(1)성씨 수정
(2)이름 수정
(x) 종료
입력:

#수정화면(성씨 수정화면과 이름수정화면 입력에 따라 각각 뜨도록)
현재: 길동
수정:

s.저장
c.취소
(예외 처리: s나 c 이외의 것 누르면 다시 물어보거나 메뉴가 다시 뜨도록 할것)


종료함수 System.exit(); 사용할것
완료될때까지는 while로 무한루프 돌릴것
