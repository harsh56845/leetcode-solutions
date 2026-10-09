import heapq as hp
class Solution(object):
    def lastStoneWeight(self, stones):
        heap = [-stone for stone in stones]
        hp.heapify(heap)
        while(len(heap)>1):
            l = -hp.heappop(heap)
            sl = -hp.heappop(heap)
            if(l!=sl): hp.heappush(heap,-(l-sl))
        
        return -heap[0] if heap else 0
