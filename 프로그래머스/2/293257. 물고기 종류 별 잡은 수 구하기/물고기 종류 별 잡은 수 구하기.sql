-- 코드를 작성해주세요
SELECT COUNT(I.FISH_TYPE) AS FISH_COUNT, FISH_NAME
FROM FISH_INFO I
JOIN FISH_NAME_INFO N
ON I.FISH_TYPE = N.FISH_TYPE
GROUP BY FISH_NAME
ORDER BY FISH_COUNT DESC
