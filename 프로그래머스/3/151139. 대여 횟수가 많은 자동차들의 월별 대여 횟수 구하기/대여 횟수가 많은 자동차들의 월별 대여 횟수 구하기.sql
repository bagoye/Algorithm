-- 코드를 입력하세요
SELECT MONTH(START_DATE) AS MONTH, CAR_ID, COUNT(*) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE START_DATE >= '2022-08-01' and START_DATE < '2022-11-01' 
AND CAR_ID IN (
    SELECT CAR_ID 
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
    WHERE START_DATE >= '2022-08-01' and START_DATE < '2022-11-01'
    GROUP BY CAR_ID 
    HAVING COUNT(CAR_ID) >= 5
)
GROUP BY CAR_ID, MONTH
ORDER BY MONTH, CAR_ID DESC