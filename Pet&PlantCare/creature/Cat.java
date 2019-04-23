package creature;
import tasks.*;
public class Cat extends Mammal
{
   public Cat()
   {
      super();
      addTask( this,AnimalTask.FOOD);
      addTask( this,AnimalTask.VACCINATION);
      addTask( this,AnimalTask.MEDICATION);
      addTask( this,AnimalTask.HYGIENE);
      addTask( this,AnimalTask.NAILS);
      addTask( this,AnimalTask.WATER_ANIMAL);
      
      //for custiomized tasks
      addTask( this,AnimalTask.CUSTOM_ANIMAL);
   }
}
