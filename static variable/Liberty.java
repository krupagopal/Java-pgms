import java.util.* ;
class Liberty{
static String shoeBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index; 
public static boolean addshoebrand(String shoebrand){
boolean isaddshoebrand = false;
if(index < shoeBrands.length){
if(shoebrand != null){
shoeBrands[index]= shoebrand;
index++;
isaddshoebrand=true;

}
}
return isaddshoebrand;
}
public static void getaddshoebrand(){
System.out.println("the shoe brands are:");
for(String shoebrandss : shoeBrands ){
System.out.println(shoebrandss);
}
}

public static boolean updateaddshoebrand(String oldShoeBrand , String newShoeBrand){
boolean isupdateaddshoebrand = false;
for(int index = 0; index < shoeBrands.length ; index++){
if(oldShoeBrand == shoeBrands[index]){
shoeBrands[index] = newShoeBrand;
isupdateaddshoebrand = true;
}
}
if(isupdateaddshoebrand == false ){
System.out.println(oldShoeBrand +"not found");
}
return isupdateaddshoebrand;
}
public static boolean deleteShoeBrands(String removeShoeBrands){
	boolean isdeleteShoeBrands = false;
	int oldIndex , newIndex ;
	for(oldIndex=0 , newIndex = 0; oldIndex < shoeBrands.length; oldIndex++){
		if(shoeBrands[oldIndex] != removeShoeBrands){
			shoeBrands[newIndex] = shoeBrands[oldIndex];
			newIndex++;
		} else isdeleteShoeBrands = true;
		
		
	}
if(isdeleteShoeBrands == false){
	System.out.println(removeShoeBrands +"not found");
	
}
return isdeleteShoeBrands;
}
}