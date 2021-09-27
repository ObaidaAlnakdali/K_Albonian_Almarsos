from collections import deque

queue = deque()

queue.append(100)
queue.append(4 * 4)
queue.append("asd")
queue.append(True)

print(queue)

x = queue.popleft() # delete left
print(x)
print(queue)

y = queue.pop() # delete Right
print(y)
print(queue)
