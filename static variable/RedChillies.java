import java.util.* ;
class RedChillies{
static String actorNames[] = {null, null , null, null, null , null , null, null , null};
static int index;
public static boolean entertainment(String actorName){
boolean isactornameAdded = false;
if(index < actorNames.length){
if(actorName != null){
  actorNames[index] = actorName;
  index++;
  isactornameAdded = true;
}else{
System.out.println("cant be null");
}
}else{
System.out.println("values are more check it.......");
}
return isactornameAdded ;


}
public static void getentertainment(){
System.out.println("actors are:");
for(String actorss : actorNames){
System.out.println(actorss);
}
}

public static boolean updateEntertainment(String oldActorName , String newActorName){
boolean isupdatedactors = false;
for(int index = 0; index < actorNames.length ; index++ ){
if(oldActorName == actorNames[index]){
    actorNames[index] = newActorName;
	isupdatedactors = true;
}
}
if (isupdatedactors == false) {
System.out.println(oldActorName +"not found");
}
return isupdatedactors;
}


 public static boolean deleteactor(String removeActor){
	boolean isdeleteactor = false;
	int newIndex , oldIndex ;
	for(newIndex = 0 , oldIndex = 0; oldIndex < actorNames.length ; oldIndex++){
		if(actorNames[index] != removeActor){
			actorNames[newIndex] = actorNames[oldIndex];
			newIndex++;
		}else isdeleteactor = true;
	}
	
	if(isdeleteactor == false){
		System.out.println(removeActor +"not found");
	}
	return isdeleteactor;
 }
}
