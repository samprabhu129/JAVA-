class Shape{
	public void draw(){
		System.out.println("Drawing a shape");
	}
}
class Circle extends Shape{
	public void draw(){
		System.out.println("Drawing a Circle");
	}
}
class Triangle extends Shape{
	public void draw(){
		System.out.println("Drawing a Triangle");
	}
}
class PolymorphismExample{
public static void main(String args[]){
Shape s = new Circle();
Shape s1= new Triangle();
s.draw();
s1.draw();
}	
}