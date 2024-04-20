-- 코드를 작성해주세요
SELECT SUM(HG.SCORE) AS SCORE, HE.EMP_NO, HE.EMP_NAME, HE.POSITION, HE.EMAIL
FROM HR_DEPARTMENT HD
JOIN HR_EMPLOYEES HE
ON HD.DEPT_ID = HE.DEPT_ID
JOIN HR_GRADE HG
ON HE.EMP_NO = HG.EMP_NO
GROUP BY YEAR, EMP_NO
ORDER BY 1 DESC
LIMIT 1