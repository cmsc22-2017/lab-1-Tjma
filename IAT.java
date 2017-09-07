interface IAT {}

class Person implements IAT{
	
	IAT mom;
	IAT dad;
	String name;
	
	Person(String name, IAT mom, IAT dad){
		this.mom = mom;
		this.dad = dad;
		this.name = name;
	}

}

class Unknown implements IAT{
	
	Unknown(){
		
	}

}

class ExamplesIAT {
	ExamplesIAT(){}
		
		IAT unknown = new Unknown();
		IAT mom = new Person("Rosario",unknown,unknown);
		IAT dad = new Person("Francisco",unknown,unknown);
		IAT mom1 = new Person("Polie",unknown,unknown);
		IAT dad1 = new Person("Anie",unknown,unknown);
		IAT mom2 = new Person("Flor",mom1,dad1);
		IAT dad2 = new Person("Ariel",mom,dad);
		IAT mom3 = new Person("Dianne",mom2,dad2);
}

