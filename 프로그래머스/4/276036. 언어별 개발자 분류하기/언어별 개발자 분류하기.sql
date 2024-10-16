-- 코드를 작성해주세요
SELECT 
(CASE
    WHEN (SKILL_CODE & (
        SELECT SUM(CODE) 
        FROM SKILLCODES 
        WHERE CATEGORY LIKE 'Front%')) 
        AND (SKILL_CODE & (
            SELECT CODE 
            FROM SKILLCODES 
            WHERE NAME ='Python')) 
    THEN 'A'
    WHEN SKILL_CODE & (
        SELECT CODE 
        FROM SKILLCODES 
        WHERE NAME ='C#') 
    THEN 'B'
    WHEN SKILL_CODE & (
        SELECT SUM(CODE) 
        FROM SKILLCODES 
        WHERE CATEGORY LIKE 'front%') 
    THEN 'C'
    ELSE NULL
    END) AS GRADE, ID, EMAIL
FROM DEVELOPERS
HAVING GRADE IS NOT NULL
ORDER BY GRADE, ID;