package practise;

public class candy {


	
		
	
		    public String taste()
		    {
		        return "tastes sweet!";
		    }

		    public static void main(String[] args)
		    {
		        candy c1 = new candy();
		        System.out.println(c1.taste());
		        candy c2 = new Chocolate();
		        System.out.println(c2.taste());
		    }
		}

		class Chocolate extends candy
		{
		    // ADD CODE HERE
		    @Override
		    public String taste()
		    {
		        return "tastes chocolately";
		    }
		} 
	
