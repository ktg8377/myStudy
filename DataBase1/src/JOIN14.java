
public class JOIN14 {

//	지금까지는 하나의 테이블에서 데이터를 추출했다
//	
//	하지만 이것만으론 일상생활에서 발생하는 다양한 조건을
//	만족하는 SQL문장을 작성하기에는 부족하다
//	
//	서로 다른 테이블의 정보를 조합하는 기술이다
	
//	조인에는 다양한 종류의 조인이 존재한다
//	
//	EQUI JOIN(동등조인)
//	표현식
//	SELECT 테이블1.컬럼명, 테이블2.컬럼명
//	FROM 테이블1, 테이블2
//	WHERE 테이블1.컬럼명1 = 테이블2.컬럼명;
//	
//	WHERE 절에 JOIN 조건을 넣는다
//	
//	동등조인은 가장많이 사용되는 조인 방법으로
//	조인대상이 되는 두테이블에서 공통적으로 존재하는 컬럼의 값이
//	일치되는 행을 연결하여 결과를 생성하는 방법이다
	
//	CROSS JOIN
//	2개 이상의 테이블이 조인될 때
//	WHERE 절에 의해 공통되는 컬럼에 의한 결합이 발생하지 않는 경우를 의미한다
//	이 처럼 SQL문이 수행되면 테이블 전체 행의 전체 컬럼이 조인된다
	
//	비동등 조인(NON-EQUI JOIN)
//	조인 조건의 특정 범위내에 있는지를 조사하는 WHERE절이다
//	일반적으로 비교연산자를 사용한다
	
//	SELF JOIN
//	조인은 두 개 이상의 서로 다른 테이블을 연결하기도 하지만
//	하나의 테이블 내에서 조인을 해야하지만
//	자료를 얻을 수 있는 경우에는 자기자신의 테이블에 조인을 맺는 경우가 있다
//	SELF 조인은 자기 자신과 조인을 맺는 것을 말한다
	
//	@외부조인(OUTER JOIN)
//	
//	아우터 조인은 2개 이상의 테이블이 조인될 때 어느 한쪽의 테이블에는
//	해당하는 데이터가 존재하는데 다른 쪽 테이블에는 데이터가 존재하지 않는 경우
//	그 데이터는 출력되지 않는 문제를 해결하기 위해 사용되는 조인기법이다
	
//	join조건에서도 동일한 값이 없는 행도 반환할 때 사용할 수 있다
//	null인 행들을 결과 데이터에 포함할 수 있는 join문이다
	
//	@ANSI JOIN(안시 표준 조인)
//	다양한 DBMS와 호환성을 위해서는 ANSI 조인을 사용하는 것이 좋다
//	지금까지 학습한 SQL 조인보다 더욱 간편하고 완벽한 포괄 조인을 지원한다
//	
//	STANDARD JOIN이라고도 부른다
//	
//	@FROM 절 JOIN형태
//	- INNER JOIN
//	- CROSS JOIN
//	- ON 조건절
//	- OUT JOIN
//	등이 있다
	
	
	
	
	
	
	
	
	
	
}
