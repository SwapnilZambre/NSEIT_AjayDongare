package nseit;


	public class ThisDemo 
	{
		
		String name;
		String location;
		
		public ThisDemo(String name, String location) 
		{
			System.out.println("Parameterized constructor");
			showDetails();
			this.name = name;
			this.location = location;
		}
		public ThisDemo() 
		{
			this("Ajju","Mum");
			System.out.println("Default constructor");
			
			name="Ajju";
			location="Mumbai";
		}
		public void showDetails() {
			
			System.out.println("Name: "+name+" "+"location: "+location);
		}

	}

