import java.util.*;
class WatchShop{
static String watchBrands[]={null, null , null , null , null , null , null , null , null , null};
static int index;
public static boolean addWatchBrand(String brandName){
boolean isaddWatchBrand = false;
 if(index < watchBrands.length){
  if(brandName != null){
     watchBrands[index] = brandName;
	 index++;
	 isaddWatchBrand = true;
  }
 }
return isaddWatchBrand;
}
public static void getaddWatchBrand(){
for(String watchtypes : watchBrands){
System.out.println(watchtypes);
}
}
public static boolean updateaddWatchBrand(String oldWatchBrand , String newwatchBrand){
boolean isupdateaddWatchBrand = false;
for(int index = 0; index < watchBrands.length ; index++){
    if(oldWatchBrand == watchBrands[index]){
	watchBrands[index] = newwatchBrand;
	isupdateaddWatchBrand = true;
	}
}
if(isupdateaddWatchBrand == false){
 System.out.println(oldWatchBrand +"not found");
 }
return isupdateaddWatchBrand;
}
public static boolean deleteWatchBrand(String removebrandName){
	boolean isdeleteWatchBrand = false;
	int oldIndex , newIndex;
	for(oldIndex = 0 , newIndex =0  ; oldIndex < watchBrands.length; oldIndex++){
		if(watchBrands[oldIndex] != removebrandName){
			watchBrands[newIndex] = watchBrands[oldIndex];
			newIndex++;
		} else isdeleteWatchBrand = true;
	
		
	}
	watchBrands = Arrays.copyOf(watchBrands , newIndex);
	if(isdeleteWatchBrand == false){
		System.out.println(removebrandName +"not found");
	}
	return isdeleteWatchBrand;
}
}