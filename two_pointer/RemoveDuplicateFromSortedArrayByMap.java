import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
          if(hm.containsKey(nums[i]))
          {
              if(hm.get(nums[i])==1)
              {
                  hm.put(nums[i],2);
              }
              else
              continue;
          }
          else{
              hm.put(nums[i],1);
          }
        }
        int count=0;
        for(Map.Entry<Integer,Integer> d:hm.entrySet())
        {
            if(d.getValue()==2)
            {
                nums[count]=d.getKey();
                nums[count+1]=d.getKey();
                count+=2;
            }
            else{
            nums[count]=d.getKey();
            count+=1;
            }
        }
        return count;
    }
    
}