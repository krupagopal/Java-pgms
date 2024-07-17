class GymRunner{
public static void main(String[]args){
boolean gymtools = Gym.addGymEquipments("threadmill");
System.out.println("Equipment added are:" +gymtools);
gymtools = Gym.addGymEquipments("dumbells");
System.out.println("Equipment added are:" +gymtools);
gymtools = Gym.addGymEquipments("cycling");
System.out.println("Equipment added are:" +gymtools);
gymtools = Gym.addGymEquipments("barbell");
System.out.println("Equipment added are:" +gymtools);
gymtools = Gym.addGymEquipments("power rack");
System.out.println("Equipment added are:" +gymtools);
gymtools = Gym.addGymEquipments("bench");
System.out.println("Equipment added are:" +gymtools);
gymtools = Gym.addGymEquipments("lat machine");
System.out.println("Equipment added are:" +gymtools);
gymtools = Gym.addGymEquipments("kettlebells");
System.out.println("Equipment added are:" +gymtools);


Gym.updateGymEquipment("bench" , "exercise bike");
Gym.getaddGymEquipments();
Gym.deleteEquipments("cycling");
Gym.getaddGymEquipments();

}


}