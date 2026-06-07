package Multi_threading;

public class sleep_method 
{

	public static void main(String[] args) 
	{
		
		int sec, min, hr;
		for(hr=1; hr<=1;hr++)
		{
			for(min=1; min<=60; min++)
			{
				for(sec=1; sec<=60; sec++)
				{
					try
					{
				
						Thread.sleep(10);
					}
					catch(Exception e)
					{
				
					}
			
					System.out.println("sec count"+" "+sec);
				}
			
				System.out.println(min + " min"+ " completed");
			}
			
			System.out.println(hr + " hour completed");
		}
	

	}

}
