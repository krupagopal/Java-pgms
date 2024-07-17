import java.util.*;
class Bar {
static String wineBrandNames[]= {null , null , null, null , null , null , null , null , null , null , null , null , null , null , null};
static int index ;
public static boolean addWineBrands(String wineNames){
boolean isaddWineBrands = false;
if(index < wineBrandNames.length){
if(wineNames != null){
wineBrandNames[index] = wineNames;
index++;
isaddWineBrands = true;
}
}
return isaddWineBrands;
}
public static void getaddWineBrands() {
for(String wineBrands : wineBrandNames){
System.out.println(wineBrands);
}
}
public static boolean updateaddWineBrands(String oldwinebrands , String newupdatedwinebrands){
boolean isupdateaddWineBrands = false;
for(int index = 0; index < wineBrandNames.length ; index++){
if(oldwinebrands == wineBrandNames[index]){
    wineBrandNames[index] = newupdatedwinebrands;
	isupdateaddWineBrands = true;
}
}
if(isupdateaddWineBrands == false){
System.out.println(oldwinebrands +"not found");

}
return isupdateaddWineBrands;
 }
 
 public static boolean deleteWineBrand(String removeWineBrand){
	boolean isdeleteWineBrand = false;
	int oldIndex , newIndex;
	 for(oldIndex = 0 , newIndex = 0 ; oldIndex < wineBrandNames.length; oldIndex++){
		  if(wineBrandNames[oldIndex] != removeWineBrand){
			  wineBrandNames[newIndex] = wineBrandNames[oldIndex];
			  newIndex++;
		  } else{
			  isdeleteWineBrand = true;
		  }
			  
	    }
	wineBrandNames=Arrays.copyOf(wineBrandNames , newIndex);
	if(isdeleteWineBrand == false){
		System.out.println(removeWineBrand +"not found");
	}
	return isdeleteWineBrand;
 }
}
