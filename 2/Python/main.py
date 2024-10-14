n = int(input("Input the size of the array:\n"))

a = []
result = []

print("Input the array:\n")
for i in range(n):
    a.append(int(input()))

for i in range(n):
    if (i == 0 and max(a[i], a[i+1]) == a[i]) or (i == n-1 and max(a[i], a[i-1]) == a[i]) or (max(max(a[i], a[i+1]), a[i-1]) == a[i]):
        result.append(a[i])

print(result)