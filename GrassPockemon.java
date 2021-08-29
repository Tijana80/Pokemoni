
public class GrassPockemon extends Pockemon{
    private static String type="Grass";

    public GrassPockemon(String name, int health) {
        super(name, type, health);
    }
    
    

    @Override
    public String logAll() {
        return "Napada: " +  napad()+ "\n" +"Brani se: "+ odbrana()+"\n"+"Pobedjuje: " +pobeda()+"\n" + "Gubi od: "+poraz();
        
    }

    @Override
    public String poraz() {
        return  "Fire type.";
    }

    @Override
    public String pobeda() {
       return "Water type."; 
    }

    @Override
    public String odbrana() {
       return "Izbegava.";
    }

    @Override
    public String napad() {
        return "Travom.";
    }
}