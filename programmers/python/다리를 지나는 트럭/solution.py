# from collections import deque
# def solution(bridge_length, weight, truck_weights):
#     time = 0
#     truck_weights = deque(truck_weights)
#     passing = [0]*bridge_length
#     passing = deque(passing)

#     while(passing):
#         passing.popleft()
#         if truck_weights:
#             if sum(passing)+truck_weights[0] <= weight:
#                 passing.append(truck_weights.popleft())
#             else:
#                 passing.append(0)
#         time += 1
#     return time

import queue

def solution(bridge_length, weight, truck_weights):
    time = 0
    truck = queue.Queue()
    for i in truck_weights:
        truck.put(i)
    a = [0]*bridge_length
    passing = queue.Queue()

    for i in a:
        passing.put(i)

    while(passing.queue):
        passing.get()
        if truck.queue:
            if sum(passing.queue)+truck.queue[0] <= weight:
                passing.put(truck.get())
            else:
                passing.put(0)
        time += 1
    return time

#solution(2, 10, [7,4,5,6])
solution(100, 100, [10])