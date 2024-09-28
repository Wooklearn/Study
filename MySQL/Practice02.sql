use employee;

-- 1. 직급이 대리이면서 아시아 지역에 근무하는 직원 조회
-- 사번, 이름, 직급명, 부서명, 근무지역명, 급여를 조회하세요
-- (조회시에는 모든 컬럼에 테이블 별칭을 사용하는 것이 좋다.)
-- (사용 테이블 : job, department, location, employee)


-- 2. 주민번호가 70년대 생이면서 성별이 여자이고, 
--    성이 전씨인 직원들의 사원명, 주민번호, 부서명, 직급명을 조회하시오.
-- (사용 테이블 : employee, department, job)

-- 3. 이름에 '형'자가 들어가는 직원들의
-- 사번, 사원명, 직급명을 조회하시오.
-- (사용 테이블 : employee, job)

-- 4. 해외영업팀에 근무하는 사원명, 
--    직급명, 부서코드, 부서명을 조회하시오.
-- (사용 테이블 : employee, department, job)

-- 5. 보너스포인트를 받는 직원들의 사원명, 
--    보너스포인트, 부서명, 근무지역명을 조회하시오.
-- (사용 테이블 : employee, department, location)
select
	a.EMP_NAME,	  -- 사원명    / employee
	a.BONUS,		  -- 보너스    / employee
    b.DEPT_TITLE,   -- 부서명    / department
    c.LOCAL_NAME    -- 근무지역명 / location
from
	employee a
join
	department b on a.DEPT_CODE = b.DEPT_ID
join
	location c on c.LOCAL_CODE = b.LOCATION_ID
where
	BONUS is not null;

-- 6. 부서코드가 D2인 직원들의 사원명, 
--    직급명, 부서명, 근무지역명을 조회하시오.
-- (사용 테이블 : employee, job, department, location)
select
	a.EMP_NAME,	  -- 사원명    /  employee
	b.JOB_NAME,	  -- 직급명    / 	job
	c.DEPT_TITLE,	  -- 부서명    /  department
    d.LOCAL_NAME	  -- 근무지역명 /  location
from
	employee a 
join
	job b on a.JOB_CODE = b.JOB_CODE
join
	department c on a.DEPT_CODE = c.DEPT_ID
join
	location d on c.LOCATION_ID = d.LOCAL_CODE
where
	a.DEPT_CODE like 'D2';

-- 7. 본인 급여 등급의 최소급여(MIN_SAL)를 초과하여 급여를 받는 직원들의
--    사원명, 직급명, 급여, 보너스포함 연봉을 조회하시오.
--    연봉에 보너스포인트를 적용하시오.
-- (사용 테이블 : employee, job, sal_grade)
select
	b.EMP_NAME,	  -- 사원명    /  employee  b
	c.JOB_NAME,	  -- 직급명    / 	job  c
	b.SALARY,		  -- 급여 	 /  employee  b
	(SALARY * 12 + BONUS * 12) as '보너스포함 연봉'	  -- 최소급여   / sal_grade  a

from
	employee b
join
	sal_grade a on a.SAL_LEVEL = b.SAL_LEVEL
join
	job c on b.JOB_CODE = c.JOB_CODE
where
	a.MIN_SAL;
	

-- 8. 한국(KO)과 일본(JP)에 근무하는 직원들의 
--    사원명, 부서명, 지역명, 국가명을 조회하시오.
select
	a.EMP_NAME,	  -- 사원명    /  employee
    b.DEPT_TITLE,	  -- 부서명    /  department
	c.LOCAL_NAME,	  -- 지역명    /  location
	d.NATIONAL_NAME -- 국가명    /  nation
from
	employee a
join
	department b on a.DEPT_CODE = b.DEPT_ID
join
	location c on b.LOCATION_ID = c.LOCAL_CODE
join
	nation d on c.NATIONAL_CODE = d.NATIONAL_CODE
where
	d.NATIONAL_NAME in ('한국', '일본');

