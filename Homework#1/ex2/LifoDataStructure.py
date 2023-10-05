import time

stack = []

def push(element):
    start_time = time.perf_counter()
    stack.append(element)
    end_time = time.perf_counter()
    elapsed_time = end_time - start_time
    return elapsed_time

def pop():
    start_time = time.perf_counter()
    removed_element = stack[-1]
    stack[:] = stack[:-1]
    end_time = time.perf_counter()
    elapsed_time = end_time - start_time
    return removed_element, elapsed_time

def peek():
    start_time = time.perf_counter()
    peek_element = stack[-1]
    end_time = time.perf_counter()
    elapsed_time = end_time - start_time
    return peek_element, elapsed_time

def size():
    return len(stack)

push(3)
push(5)
print("Push", push(8))

print("Pop:", pop())
print("Peek:", peek())
print("Stack size:", size())
print("Peek:", peek())