package creature;
public abstract class Plant extends Creature {
   
   //properties
   private int height;
   private String species;
   
   public Plant()
   {
      super();
      height = 0;
      species = "N/A";
   }
   //methods
   public int getHeight() {
      return height;
   }
   
   public void setHeight( int height)
   {
      this.height = height;
   }
   
   public void setSpecies(String species)
   {
      this.species = species;
   }
   
   public String getSpecies()
   {
      return species;
   }
   
   
   
   
   
}