def binary_search(arr, target):
    """
    Binary search algorithm
    Repeatedly divide the arr in half the portion that could contain the item, until it has narrowed down the possible locations to just one.
    """
    start = 0
    end = len(arr) - 1

    while start <= end:
        mid = start + (end - start) // 2

        # Check if the target is present at mid
        if arr[mid] == target:
            print("Element found at index: ", mid)
            return mid
        # If the target is greater, ignore left half
        elif arr[mid] < target:
            start = mid + 1
        # If the target is smaller, ignore right half
        else:
            end = mid - 1

    print("Element not present in the array")
    return -1

arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
target = 3
result = binary_search(arr, target)
