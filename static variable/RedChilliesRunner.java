class RedChilliesRunner{
public static void main(String[]args){
boolean addedActors = RedChillies.entertainment("puneeth");
System.out.println(addedActors);
addedActors=RedChillies.entertainment("srk");
System.out.println(addedActors);
addedActors=RedChillies.entertainment("ranveer");
System.out.println(addedActors);
addedActors = RedChillies.entertainment("prajwal");
System.out.println(addedActors);
addedActors = RedChillies.entertainment("uppi");
System.out.println(addedActors);
addedActors = RedChillies.entertainment("yuva");
System.out.println(addedActors);
RedChillies.getentertainment();	
addedActors = RedChillies.updateEntertainment("srk" , "rishab");
System.out.println(addedActors);
RedChillies.getentertainment();
RedChillies.deleteactor("srk");
RedChillies.getentertainment();
	
}
}