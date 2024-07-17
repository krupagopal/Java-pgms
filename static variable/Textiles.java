import java.util.*;
class Textiles {
static String materialNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addTextiles(String materialType){
boolean isaddTextiles = false;
if(index < materialNames.length){
if(materialType != null){
materialNames[index] = materialType;
index++;
isaddTextiles = true;
}
}
return isaddTextiles;
}
public static void getaddTextiles() {
System.out.println("The material types are:");
for(String materialNamess : materialNames){
System.out.println(materialNamess);
}
}
public static boolean updateaddTextiles(String oldMaterial , String newMaterial) {
boolean isupdateaddTextiles = false;
for(int index = 0; index < materialNames.length ; index++){
if(oldMaterial == materialNames[index]){
   materialNames[index] = newMaterial;
   isupdateaddTextiles = true;
}

}
if(isupdateaddTextiles == false){
System.out.println(oldMaterial +"not found");
}
return isupdateaddTextiles;

}

public static boolean deletematerialName(String removeMaterialName){
	boolean isdeletematerialName = false;
    int oldIndex , newIndex;
	for(oldIndex = 0 , newIndex=0 ; oldIndex < materialNames.length ; oldIndex++){
		if(materialNames[oldIndex] != removeMaterialName){
			materialNames[newIndex] = materialNames[oldIndex];
			newIndex++ ;
		}else isdeletematerialName = true;
	}
	materialNames = Arrays.copyOf(materialNames , newIndex);
if(isdeletematerialName == false){
	System.out.println(removeMaterialName +"not found");
}
return isdeletematerialName;	
}
}