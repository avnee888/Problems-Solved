class Solution {
    Set<List<Integer>>ans=new HashSet<>();
    List<Integer>res=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      Arrays.sort(candidates);
      solve(candidates,target,0);
      return new ArrayList<>(ans);  
    }
    public void solve(int[] candidates,int target,int index){
        
            if(target==0){
                
                ans.add(new ArrayList<>(res));
                return;
            }
            
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]){
                continue;
            }
    
        if(candidates[i]>target)break;
            res.add(candidates[i]);
            solve(candidates,target-candidates[i],i+1);
            res.remove(res.size()-1);
           
        
        }
    }
    }
