
public class WaterPockemon extends Pockemon{
    private static String type= "Water";
    
    public WaterPockemon(String name, int health) {
        super(name, type, health);
    }
    
 

    @Override
    public String napad() {
       return   "Vodom";
    }

    @Override
    public String odbrana() {
      
        return "Vodom";
    }

    @Override
    public String pobeda() {
    return "Fire type.";
    }

    @Override
    public String poraz() {
    return "Grass type.";
    }

    
    @Override
    public String logAll() {
        return "Napada: " +  napad()+ "\n" +"Brani se: "+ odbrana()+"\n"+"Pobedjuje: " +pobeda()+"\n" + "Gubi od: "+poraz();
     
    }
}