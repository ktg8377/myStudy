
public class Function11 {

//	함수
	
//	기본함수? 내장함수?
			
//	함수 표현식
//	함수명(컬럼이나 표현식, arg1, arg2, ,,,)
//	
//	문자형 함수: 문자를 입력하면 문자나 숫자 값을 반환한다
//	숫자형 함수: 숫자를 입력하면 숫자 값을 반환한다
//	날짜형 함수: date 타입의 값을 연산한다
//	변환형 함수: 문자, 숫자, 날짜형 값의 데이터 타입을 반환한다
//	null 관련 함수: null을 처리하기 위한 함수
//	등이 있다
//	
//	@단일행 함수의 특징
//	- select, where, order by절에 사용가능 하다
//	- 각 행(row)들에 대해 개별적으로 작용하여 데이터 값들을 조작하고
//	각각의 행에 대한 조작 결과를 리턴한다
//	- 여러 인자를 입력해도 단 하나의 결과만 리턴한다
//	- 함수의 인자로 상수, 변수, 표현식이 사용 가능하고
//	하나의 인수를 가지는 경우도 있지만 여러 개의 인수를 가질 수도 있다
//	- 특별한 경우가 아니면 함수의 인자로 함수를 사용하는 함수의 중첩이 가능하다
	
	
	
//	오라클에만 일단 존재함
//	@DUAL테이블
//	
//	오라클은 SELECT 절과 FROM 절 두 개의 절을 SELECT 문장의 필수 절로
//	지정하였으므로 사용자 테이블이 필요없는 SQL 문장의 경우에도
//	필수적으로 DUAL이라는 테이블을 FROM절에 지정한다
//	
//	DUAL 테이블의 특징
//	- 사용자 SYS가 소유하며 모든 사용자가 엑세스 가능한 테이블이다
//	- SELECT ~ FROM ~의 형식을 갖추기 위한 일종의 DUMMY 테이블이다
//	- DUMMY라는 문자열 유형의 컬럼에 'X'라는 값이 들어 있는 행을
//	1건 포함하고 있다
	
	
//	@문자열 일부만 추출하는 SUBSTR 함수
//	형식
//	SUBSTR(대상, 시작 위치, 추출할 개수)
	
//	특정 문자의 위치를 구하는 instr 함수
//	
//	expression
//	INSTR(대상, 찾을 글자, 시작위치, 몇 번째 발견)
//	
//	특정 문자가 나타나는 위치를 알려준다
	
//	@특정 문자를 잘라내는 trim 함수
//	문자열에서 머리말, 꼬리말, 또는 양족에 있는 지정 문자를 제거한다
//	
//	trim('지정문자' from '문자열')
//	trim(' 문자열 ')		공백제거
	
//	@숫자함수
//	데이터를 입력받아 처리하고 숫자를 리턴하는 함수이다
//	
//	소수점 아래를 버리는 floor함수
//	표현식
//	floor(숫자)
//	
//	반올림 함수
//	ROUND(대상, 자릿수)
	
//	특정 자리에서 잘라내는 TRUNC 함수
//	TRUNC(대상, 자릿수)
//	지정한 자릿수 이하를 버린 결과를 구하는 함수
	
//	@나머지 구하는 함수 MOD
//	
//	나누기 연산 후 나머지를 결과로 반환한다
//	MOD(숫자, 나눌 값)
	
//	올림처리
//	CEILING()
	
//	@날짜함수
//	
//	Date형에 사용하는 함수이며
//	결과값으로 날짜 또는 기간을 얻는다
//	
//	데이터베이스는 날짜를 숫자로 저장하기 때문에 덧셈, 뺄셈 같은 산술
//	연산자로도 계산이 가능하다
//	
//	단일행 날짜형 데이터 연산
//	연산					결과			설명
//	날짜 + 숫자			날짜			숫자만큼의 날수를 더한다
//	날짜 - 숫자			날짜			숫자만큼의 날수를 뺀다
//	날짜 - 날짜			날짜수		다른 하나의 날짜에서 하나의 날짜를 빼면 일수가 나온다
//	날짜 + 숫자/24			날짜			시간을 날짜에 더한다
	
//	변환형 함수(형 변환 함수)
//	서로 다른 데이터 타입을 변환해서 반환한다
	
//	--숫자형을 문자형으로 변환
//	TO_CHAR()
//	--0       자릿수를 나타내며 자릿수가 맞지 않을 경우 0으로 채운다
//	--9       자릿수를 나타내며 자릿수가 맞지 않아도 채우지 않는다
//	--L       각 지역별 통화 기호를 앞에 표시한다
//	--.       소수점 표시
//	--,       천 단위 자리 구분
	
//	숫자형으로 변환하는 TO_NUMBER()
//	특정 데이터를 숫자형으로 변환하는 함수
	
//	@문자형으로 변환하는 TO_CHAR함수2
//	날짜형을 문자형으로 변환하기
//	
//	DATE 형태의 데이터를 지정한 양식에 의해 VARCHAR2형의 문자로 변환한다
	
//	표현식
//	TO_CHAR(숫자|날짜, FORMAT)
//	숫자나 날짜를 주어진 FORMAT형태로 문자열 타입으로 변환한다
//	
//	날짜형 포맷 형식
//	종류					의미
//	YYYY				년도 표현(4자리)
//	YY					년도 표현(2자리)
//	MM					월을 숫자로 표현
//	MON					월을 알파벳으로 표현
//	DAY					요일 표현
//	,,,
//	ETC					이런게 아주 많음
//	
//	시간 출력 형식
//	AM OR PM		오전 오후 표시
//	HH OP HH12		하루 12시간 표시 1~12
//	HH24			하루 24시간 표시 0~23
//	MI				분
//	SS				초	(분,초는 0~59)
//	
//	날짜형으로 변환하는 TO_DATE함수
//	
//	문자열을 날짜형으로 변환한다
//	
//	TO_DATE('문자', 'FORMAT')
//	문자는 날짜형태의 문자만 가능하다
	
//	데이터 유형 변환의 종류
//	종류
//	명시적(Explicit) 데이터 유형 변환:
//		데이터 변환형 함수로 데이터 유형을 변환하도록 명시해 주는 경우
//	암시적(Implicit) 데이터 유형 변환:
//		데이터베이스가 자동으로 데이터 유형을 변환하여 계산하는 경우
//	
//		****
//	묵시적인 경우 성능 저하가 발생할 수 있으며,
//	자동적으로 데이터베이스가 알아서 계산하지 않는 경우가 있어 에러를 발생할 수 있으므로
//	명시적인 데이터 변환 방법을 사용하는 것이 바람직하다
		
//	형 변환 함수
//	
//	NUMBER	<--		CHARACTER	<--		DATE
//			-->					-->
//			
//	형 변환은 NUMBER에서 DATE 타입으로 변경이 불가능하다		
	
	
//	NULL 관련 함수
//	NULL이란?
//	- 널 값은 아직 정의 되지 않은 값으로 0 또는 공백과 다르다
//	0은 숫자이고, 공백은 하나의 문자다
//	- 테이블을 생성할 때 NOT NULL 등으로 정의되지 않은 모든 데이터 유형은
//	널 값을 포함할 수 있다
//	- 널 값을 포함하는 연산의 경우 결과 값도 널 값이다
//	모르는 데이터에 숫자를 더하거나 빼도 결과는 마찬가지로 모르는 것과 같다
//	- 결과값이 NULL이 아닌 다른 값을 얻고자 할 때 NVL등의 함수를 사용한다
//	NULL 값의 대상이 숫자 유형 데이터인 경우는 주로(0)으로 문자 데이터인
//	경우는 블랭크보다는 'X'같이 해당 시스템에서 의미 없는 문자로 바꾸는 경우가 많다
//	
//	NVL() 함수
//	표현식
//	NVL(표현식1, 표현식2)
//	표현식1의 결과값이 NULL이면 표현식2의 값을 출력한다
//	
//	단, 표현식1과 표현식2의 결과 데이터 타입이 같아야 한다
//	NULL 관련 가장 많이 사용되는 함수이므로 중요하다
	
//	선택을 위한 DECODE 함수
//	SWITCH CASE문과 같은 기능이다
//	
//	DECODE(
//		표현식,	조건1, 결과1,
//				조건2, 결과2,
//				조건3, 결과3,
//				조건4, 결과4,
//				,,,등등
//	)	AS 컬럼명
//	
//	CASE문
//	
//	형식
//	CASE	WHEN 조건1 THEN 결과1
//			WHEN 조건2 THEN 결과2
//			WHEN 조건3 THEN 결과3
//			ELSE	결과 N
//	END 컬럼명
//	
//	IF문 같은 친구다
	
	
	
}