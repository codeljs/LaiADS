from dis import dis
import heapq

def relax(u,v,weight,distTo):
    if distTo[u]+ weight < distTo[v]:
        distTo[v] = distTo[u]+ weight
        return True
    return False    

def djk(adj_list, s):
    n = len(adj_list)
    distTo = [99999 for _ in range(n)]
    distTo[s] = 0
    
    heap = [(0,s)]
    while(len(heap)!= 0):
        (new_dist, u) = heapq.heappop(heap)
        for(u,v,weight) in adj_list[s]:
            if relax(u,v,weight,distTo):
                heapq.heappush(heap,distTo[v],v) #at most O(E * logV) 


    return distTo

       
        
