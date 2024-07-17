class BarRunner{
public static void main(String[]args){
Bar.addWineBrands("jack daniels");
Bar.addWineBrands("black & white");
Bar.addWineBrands("kingfisher");
Bar.addWineBrands("ballentines");
Bar.addWineBrands("white rum");
Bar.addWineBrands("vodka");
Bar.addWineBrands("red label");
Bar.addWineBrands("blue label");
Bar.getaddWineBrands();
boolean wineNames = Bar.updateaddWineBrands("vodka", "rum");
System.out.println(wineNames);	
Bar.getaddWineBrands();
Bar.deleteWineBrand("kingfisher");
Bar.getaddWineBrands();	
}
}