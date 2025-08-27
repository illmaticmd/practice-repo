

def min_abs_diff_pairs(arr):
    # Sort the array in non-decreasing order
    arr.sort()
 
    # Find the minimum absolute difference between pairs
    min_diff = float('inf')
    pairs = []
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            diff = abs(arr[i] - arr[j])
            if diff < min_diff:
                min_diff = diff
                pairs = [[arr[i], arr[j]]]
            elif diff == min_diff:
                pairs.append([arr[i], arr[j]])
 
    return pairs
 
# Driver Code
if __name__ == "__main__":
    numbers_c = int(input().strip())
    arr = []

    for _ in range(numbers_c):
        num_item = int(input().strip())
        arr.append(num_item)
    p = min_abs_diff_pairs(arr)

    for z in p:
        print(z[0], z[1])