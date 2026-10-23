class Task{
    char name;
    int count;
    public Task(char name, int count){
        this.name=name;
        this.count=count;
    }
}
class Solution {
    public int leastInterval(char[] tasks, int n) {
       Map<Character,Integer> freq=new HashMap<>();
       for(char task: tasks){
        freq.put(task,freq.getOrDefault(task,0)+1);
       }
      PriorityQueue<Task> maxHeap = new PriorityQueue<>((t1,t2)-> t2.count-t1.count);
      for(Map.Entry<Character,Integer> entry:freq.entrySet()){
        maxHeap.add(new Task( entry.getKey(),entry.getValue()));
      }
      int intervals=0;
      while(!maxHeap.isEmpty()){
        int cooldownPeriod=n+1;
        Queue<Task>queue = new LinkedList<>();
        while(!maxHeap.isEmpty() && cooldownPeriod>0){
            Task task =maxHeap.poll();
            intervals +=1;
            cooldownPeriod-=1;
            task.count-=1;
            if(task.count>0){
                queue.add(task);
            }
        }
      
      if(queue.size()!=0){
        maxHeap.addAll(queue);
        intervals+=cooldownPeriod;
      }
      }
      return intervals;
    }
}