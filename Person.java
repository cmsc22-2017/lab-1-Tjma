
 class Person {
	
	Address add;
	String name;
	int age;
	char gender;
	
	Person(Address add,String name, int age, char gender){
		this.add = add;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

}
 class Address {
	 String city;
	 String state;
	 
	 Address(String city, String state){
		 this.city = city;
		 this.state = state;
	 }
 }

class ExamplePerson {
	ExamplePerson(){}
	
	Address a1 = new Address("MA","Boston");
	Address a2 = new Address("RI","Warwick");
	Address a3 = new Address("NH","Nashua");
	
	Person a = new Person(a2,"Tim",20,'M');
	Person b = new Person(a1,"Pat",19,'F');
	Person c = new Person(a1,"Kim",17,'F');
	Person d = new Person(a3,"Dan",22,'M');
	Person e = new Person(a2,"John",21,'M');
	Person f = new Person(a2,"Jazz",20,'F');
	
}
