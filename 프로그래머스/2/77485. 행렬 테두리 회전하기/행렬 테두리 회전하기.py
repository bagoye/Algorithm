def solution(rows, columns, queries):
    answer = []
    arr = [[(i*columns) + j + 1 for j in range(columns)] for i in range(rows)]
    
    for query in queries:
        x1, y1, x2, y2 = query
        x1 -= 1
        y1 -= 1
        x2 -= 1
        y2 -= 1
        
        temp = arr[x1][y1]
        min_val = temp
        
        for i in range(x1, x2):
            arr[i][y1] = arr[i+1][y1]
            min_val = min(min_val, arr[i][y1])
        
        for i in range(y1, y2):
            arr[x2][i] = arr[x2][i+1]
            min_val = min(min_val, arr[x2][i])
            
        for i in range(x2, x1, -1):
            arr[i][y2] = arr[i-1][y2]
            min_val = min(min_val, arr[i][y2])
            
        for i in range(y2, y1, -1):
            arr[x1][i] = arr[x1][i-1]
            min_val = min(min_val, arr[x1][i])
            
        arr[x1][y1+1] = temp
        answer.append(min_val)
            
    return answer