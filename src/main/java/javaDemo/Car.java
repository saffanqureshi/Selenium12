package javaDemo;

public class Car {

	public static void main(String[] args) {
		
		//horn(); //we can;t call non-static method inside static/main method
				
		addTwoNum(20, 30); //static methods we can directly called from/under main/static method
		addTwoString("Hello"," World");
		substructTwoNum(100,30);
		
		addTwoNum(30,30);
		addTwoNum(50,50);
		
		//drive();
		
		//Syntax of object creation of a class
		//className obj = new calssName();
		
		Car obj = new Car();
		obj.drive();
		obj.driving();
		obj.mirror();
		obj.horn();
		obj.add(2, 3);
		obj.num(10);
		obj.brake();
		
		
		obj.drive();
		obj.driving();
		obj.driving();		
		obj.driving();
		
		obj.brake();
		obj.brake();
		
		
		obj.horn();
		obj.horn();
		
		obj.mirror();
		obj.mirror();
		
		obj.num(10);		
		
		obj.add(10, 20);
		
							
			//Through an error- we can'nt call non-static method inside static method
				//driving();
			}
			
			//A method have 4 things
			//public- Access Modifier
			//void- return type
			//driving()- Method name
			//Method body- { System.out.println("I am Driving");}
				
	public void drive() {
				System.out.println("I am from drive");
			}
	
	public void driving(){
		System.out.println("I am from driving");
	}

	private void horn() {
		System.out.println("Her car horn sound very loud");
	} 

	void brake() {
		System.out.println("Eva's car has power brake");
	}

	protected void mirror() {
		System.out.println("Hasan bai Car has two mirror");
	}
		
	public int add(int a, int b) {
		 //parameterized methods, because we pass two arguments in this method
		System.out.println(a+b);
		return a+b;		
	}
	public int num(int a) {
		System.out.println(a);
		return a;		
	}
	
	
	//Below is the example of static methods, and don't need to create object of static methods
	public static int addTwoNum(int c, int d) {
		System.out.println(c+d);
		return c+d;		
	}
	//return type
	public static String addTwoString(String x, String y) {
		System.out.println(x+y);
		return x+y;
		}
	public static int substructTwoNum(int a, int b) {
		System.out.println(a-b);
		return a-b;		
	}			
		/*public void driving() {
				
				System.out.println("I am Driving"); //method Body
			}

			private void horn() {
				System.out.println("My car horn is vry good");
			}
			
			 void CarBreak() {
				System.out.println("Car has break");
			}
			
			protected void miror() {
				System.out.println("Car has mioor");
			}
			public void tipu() {
				System.out.println("My name is Tipu");
			}
			private void rumman() {
				System.out.println("Rumman learns java well");
			}
			void eat() {
				System.out.println("I am eating");
			}
			
			protected void java() {
				System.out.println("We ar learning Java");
				
			}

			public void add(int a, int b) { //parameterized methods, because we pass two arguments in this method
				System.out.println(a+b);
				
			}
			//Below is the example of static methods, and don't need to create object of static methods
			public static void addTwoNum(int c, int d) {
				System.out.println(c+d);
			}
			//return type
			public static String addTwoString(String x, String y) {
				return x+y;
				}*/
	}
