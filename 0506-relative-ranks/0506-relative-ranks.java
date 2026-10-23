class Athlete{
    int index;
int score;
public Athlete(int score, int index){
    this.score=score;
    this.index=index;
}
}
class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Athlete> maxHeap= new PriorityQueue<>((a1,a2)->a2.score -a1.score);
        for(int i=0;i<score.length;i++){
            maxHeap.add(new Athlete(score[i],i));
        }
        String[] result = new String[score.length];
        for(int rank=1;rank<=score.length;rank++){
            Athlete athlete=maxHeap.poll();
            if(rank==1){
                result[athlete.index]="Gold Medal";
            }
            else if(rank==2){
                result[athlete.index]="Silver Medal";
            }else if(rank==3){
                result[athlete.index]="Bronze Medal";
            }else{
                result[athlete.index]=String.valueOf(rank);
            }
        }
        return result;
    }
}