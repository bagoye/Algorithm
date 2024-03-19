for tc in range(1, 11):
	n = int(input())
	arr = list(map(int, input().split()))
	cnt = 0
	
	for i in range(2, n-2):
		left = max(arr[i-1], arr[i-2])
		right = max(arr[i+1], arr[i+2])
		best = max(left, right)
		
		if arr[i] > best:
			cnt += arr[i] - best
			
	print(f'#{tc}', cnt)