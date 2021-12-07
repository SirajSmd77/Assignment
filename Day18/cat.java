package practise;



	
		// TODO Auto-generated method stub

		public class cat
		{
		    public void speak()
		    {
		        System.out.println("meowww!");
		    }

		    public static void main(String[] args)
		    {
		        cat d = new cat();
		        d.speak();
		        cat b = new persian();
		        b.speak();
		    }
		}

		class persian extends cat
		{
		    public void speak()
		    {
		        System.out.println("mmeeeeoww mewwwwowow");
		    }
		}



