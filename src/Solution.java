/**
 * 使用二分查找法搜尋，以long來記錄相乘的值，以免溢位。
 * @author black
 *
 */
public class Solution {
	public int mySqrt(int x) {
        int high=x;
        int low=0;
        while(high>=low)
        {
        	long mid = (high + low)/2;
        	if(mid*mid>x)
        	{
        		high = (int)mid-1;
        	}
        	else if(mid*mid<x)
        	{
        		low = (int)mid+1;
        	}
        	else
        		return (int)mid;
        }
        return high;
    }
}
