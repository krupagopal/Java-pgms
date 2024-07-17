class TextilesRunner{
public static void main(String[]args){
Textiles.addTextiles("cotton");
Textiles.addTextiles("linen");
Textiles.addTextiles("wool");
Textiles.addTextiles("polyester");
Textiles.addTextiles("silk");
Textiles.addTextiles("chiffon");
Textiles.addTextiles("leather");
Textiles.addTextiles("rayon");

Textiles.getaddTextiles();
Textiles.updateaddTextiles("cotton" , "velvet");
Textiles.getaddTextiles();
Textiles.deletematerialName("leather");
Textiles.getaddTextiles();
}
}