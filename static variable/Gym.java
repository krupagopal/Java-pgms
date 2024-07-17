import java.util.* ;
class Gym {
static String gymEquipments[]= {null,null,null,null,null,null,null,null};
static int index;
public static boolean addGymEquipments(String equipmentName){
System.out.println("Equipments started");
boolean isGymEquipmentsCreated = false;
if(index < gymEquipments.length ){
if(equipmentName != null){
     gymEquipments[index] = equipmentName;
	 index++;
	 isGymEquipmentsCreated = true;
}else{
  System.out.println("equiment cannot be null");
}
}else{
System.out.println("equipments are full cannot add any more");
}
System.out.println("Equipments ended");
return isGymEquipmentsCreated ;
}
public static void getaddGymEquipments(){
System.out.println("Gym eqipments are: ");
for(String equipmentt : gymEquipments){
System.out.println(equipmentt);
}
}
//update gym equipment 
public static boolean updateGymEquipment(String oldEquipmentName , String newUpdatedEquipment){
boolean isGymEquipmentUpdated = false;
for ( int index = 0; index < gymEquipments.length ; index++ ){
	if(oldEquipmentName == gymEquipments[index]){
		gymEquipments[index] = newUpdatedEquipment;
		isGymEquipmentUpdated = true;
	}
}
if(isGymEquipmentUpdated==false){
	System.out.println(oldEquipmentName +"not found");
}
return isGymEquipmentUpdated;

}

  public static boolean deleteEquipments(String removeEquipment){
	boolean isdeleteEquipments = false;
	int newIndex , oldIndex ;
	for(newIndex = 0 , oldIndex = 0 ; oldIndex < gymEquipments.length; oldIndex++){
		if(gymEquipments[oldIndex] != removeEquipment){
			gymEquipments[newIndex] = gymEquipments[oldIndex];
			newIndex++;
			
		} else isdeleteEquipments = true ;
	}
	gymEquipments = Arrays.copyOf(gymEquipments , newIndex);

   if(isdeleteEquipments == false){ 
	System.out.println(removeEquipment +"not found");
   }	
   return isdeleteEquipments;
  }
}