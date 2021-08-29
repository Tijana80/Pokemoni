
public class FirePockemon extends Pockemon {   

    public FirePockemon(String name, String type, int health) {
        super(name, type, health);
    }
    
    
    
    

    @Override
    public String logAll() {
       return "Napada: " +  napad()+ "\n" +"Brani se: "+ odbrana()+"\n"+"Pobedjuje: " +pobeda()+"\n" + "Gubi od: "+poraz();
    }

    @Override
    public String napad() {
        return "Vatrom.";
    }

    @Override
    public String odbrana() {
      return "Telesno.";
    }

    @Override
    public String pobeda() {
       return "Grass type.";
    }

    @Override
    public String poraz() {
      return "Water type";
    }

    
}
