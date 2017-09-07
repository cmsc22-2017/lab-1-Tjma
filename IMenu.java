
interface IMenu {}

class Salad implements IMenu{
	BasicInfo info;
	boolean isVeg;
	String dressing;
	
	Salad(BasicInfo info, boolean isVeg, String dressing){
		this.info = info;
		this.isVeg = isVeg;
		this.dressing = dressing;
	}
	
	
}
class Soup implements IMenu{
	BasicInfo info;
	boolean isVeg;
	
	Soup(BasicInfo info, boolean isVeg){
		this.info = info;
		this.isVeg = isVeg;
	}
	
}
class Sandwich implements IMenu{
	BasicInfo info;
	String bread;
	String filling;
	
	
	Sandwich(BasicInfo info, String bread, String filling){
		this.info = info;
		this.bread = bread;
		this.filling = filling;
	}
	
}

class BasicInfo{
	String name;
	int price;
	
	BasicInfo(String name, int price){
		this.name = name;
		this.price = price;
	}
}

class ExampleMenu{
	ExampleMenu(){}
	
	BasicInfo chicken = new BasicInfo("Chicken Noodle Soup",500);
	IMenu chick = new Soup(chicken,false);
	
	BasicInfo almond = new BasicInfo("Almond Chicken Soup",1000);
	IMenu alm = new Soup(almond,false);
	
	BasicInfo macaroni = new BasicInfo("Macaroni Salad",500);
	IMenu mac = new Salad(macaroni,true,"Mayonnaise");
	
	BasicInfo vegSal = new BasicInfo("Vegetable Salad",1500);
	IMenu veg = new Salad(vegSal,true,"Salad Cream");
	
	BasicInfo egg = new BasicInfo("Egg Sandwich",500);
	IMenu eggSand = new Sandwich(egg,"Loaf Bread","Egg and Mayonnaise");
	
	BasicInfo ham = new BasicInfo("Ham Sandwich",600);
	IMenu hamSand = new Sandwich(ham,"Loaf Bread","Ham and Cheese");
}