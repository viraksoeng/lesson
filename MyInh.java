class A{
	int x,y;
	 int  sum(){
	  return x+y;
	}
     }
class B extends A{
	int z;
  int sumall(){
	return x+y+z;
}
}
class MyInh{
   public static void main(String args[]){
	B ob = new B();
	ob.x=5;ob.y=6;ob.z=7;
    System.out.println("sum x+y" + ob.sum());
    System.out.println("sum X+y+z"+ ob.sumall());	
     }	
 }
