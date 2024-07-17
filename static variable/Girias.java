import java.util.* ;
class Girias{
static String addAppliances [] = {null, null , null, null , null , null , null , null , null , null , null , null};
static int index;
public static boolean addhomeAppliances(String appliancename){
boolean isAppliancesAdded = false;
if(index < addAppliances.length){
if(appliancename != null){
              addAppliances[index] = appliancename ;
			  index++;
			  isAppliancesAdded = true;

 }
 
}

return isAppliancesAdded ;
}

public static void getaddhomeAppliances(){
	
System.out.println("The aplliances are:");
for(String appliances:addAppliances){
	System.out.println(appliances);
}
}
public static boolean updatenewAppliances(String oldApplianceName , String newApplianceName){
boolean isupdatednewappliance = false;
for(int index = 0; index < addAppliances.length ; index++ )	{
	if (oldApplianceName == addAppliances[index]){
		addAppliances[index] = newApplianceName ;
	    isupdatednewappliance = true;
		
	
}
}
if (isupdatednewappliance == false){
	System.out.println(oldApplianceName + "not found");
}
return isupdatednewappliance;
	
}
public static boolean deleteAppliances(String removeAppliance){
	boolean isdeleteAppliances = false;
	int newIndex , oldIndex;
	for(newIndex = 0 ,oldIndex=0 ; oldIndex < addAppliances.length; oldIndex++ ){
		if(addAppliances[oldIndex] != removeAppliance){
			addAppliances[newIndex] = addAppliances[oldIndex];
			newIndex++;
		}else{
			isdeleteAppliances = true;
		}
	}
	addAppliances = Arrays.copyOf(addAppliances,newIndex);
	if(isdeleteAppliances ==false){
		System.out.println(removeAppliance +"not found");
	}
	return isdeleteAppliances;
}

}