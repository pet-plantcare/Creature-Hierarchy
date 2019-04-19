package creature;
public class Fish  extends Animal
{
   String species;
   public Fish()
   { 
      super();
      species = "N/A";
      
   }
   
   public void setSpecies( String species)
   {
      this. species = species;
   }
   
   
   public String getSpecies()
   {
      return species;
   }
   
   
   
}