package creature;
import tasks.*;
public class Fish  extends Animal
{
   String species;
   public Fish()
   { 
      super();
      species = "N/A";
      addTask( AnimalTask.FOOD);
      addTask( AnimalTask.VACCINATION);
      addTask( AnimalTask.MEDICATION);
      addTask( AnimalTask.HYGIENE);
      addTask( AnimalTask.WATER_CLEANING);
      
      //for costomized tasks
      addTask( AnimalTask.CUSTOM_ANIMAL);
      
      fishes.add( this);
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
