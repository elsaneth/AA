stack = []

def push(element):
    stack.append(element)

def pop():
    removed_element = stack[-1]
    stack[:] = stack[:-1]
    return removed_element

def peek():
    return stack[-1]

def size():
    return len(stack)

push(3)
push(5)
push(8)

print("Pop:", pop())
print("Peek:", peek())
print("Stack size:", size())
print("Peek:", peek())