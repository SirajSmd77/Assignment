package practise;


		// TODO Auto-generated method stub

	public	class sports{
		    String getName(){
		        return "Generic Sports";
		    }
		    void getNumberOfTeamMembers(){
		        System.out.println( "Each team has n players in " + getName() );
		    }
		}
		 
		class Soccer extends sports{
		    @Override
		    String getName(){
		        return "Soccer Class";
		    }
		    @Override
		    void getNumberOfTeamMembers(){
		        System.out.println( "Each team has 11 players in Soccer Class ");
		    }
		    
		}
		public class sports{

			public static void main(String[] args) {
				sports s = new sports();
				System.out.println(s.getName());
				s.getNumberOfTeamMembers();
				Soccer sc = new Soccer();
				System.out.println(sc.getName());
				System.out.println();
				sc.getNumberOfTeamMembers();

			}
		}

		
