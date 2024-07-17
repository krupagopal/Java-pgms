class PenRunner{
public static void main(String[]factory){
//ClassName ref = new ClassName(); obejct creation logic
Pen ref = new Pen();
ref.name = "Parker";
ref.id = 1 ;   // through object refrece we are intialising here
ref.color = "green";
ref.price = 500.00;
System.out.println("The brand name is :" +ref.name);
System.out.println("The pen ID is :" +ref.id);
System.out.println("The color  is :" +ref.color);
System.out.println("The price of pen is:" +ref.price);

Pen ref1 = new Pen();
ref1.name = "Reynolds";
ref1.id = 2;   // instance variable it can be accssed through oly ref name.
ref1.color = "Black";
ref1.price = 50.00 ;
System.out.println("The brand name is :" +ref1.name);
System.out.println("The pen ID is :" +ref1.id);
System.out.println("The color  is :" +ref1.color);
System.out.println("The price of pen is:" +ref1.price);
}

}