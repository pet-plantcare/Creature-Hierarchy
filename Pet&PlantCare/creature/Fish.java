package creature;
import tasks.*;
public class Fish  extends Animal
{
   String species;
   public Fish()
   { 
      super();
      species = "N/A";
      addTask( this,AnimalTask.FOOD);
      addTask( this,AnimalTask.VACCINATION);
      addTask( this,AnimalTask.MEDICATION);
      addTask( this,AnimalTask.HYGIENE);
      addTask( this,AnimalTask.WATER_CLEANING);
      
      
      
   }
   
   public void setSpecies( String species)
   {
      this. species = species;
   }
   
   
   public String getSpecies()
   {
      return species;
   }
   
   public void createCustomTask()
   {
   //for costomized tasks
      addTask( this,AnimalTask.CUSTOM_ANIMAL);
   }
   
   
   
}
