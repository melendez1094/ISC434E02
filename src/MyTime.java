import java.util.ArrayList;


public class MyTime {
	boolean earlier(ArrayList<Integer> t1, ArrayList<Integer> t2)
	{
		if((t1.get(0) * 60 + t1.get(1)) < (t2.get(0) * 60 + t2.get(1)))
				return true;
		else
			return false;
	}
	
	ArrayList<Integer> 	nextSecond(ArrayList<Integer> currentTime)
	{
		return new ArrayList<Integer>();
	}

}


