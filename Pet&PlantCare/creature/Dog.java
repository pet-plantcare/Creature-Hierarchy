package creature;
import tasks.*;
public class Dog extends Mammal
{
   public Dog()
   {
      super();
      addTask( this,AnimalTask.FOOD);
      addTask(this, AnimalTask.VACCINATION);
      addTask( this,AnimalTask.MEDICATION);
      addTask( this,AnimalTask.HYGIENE);
      addTask( this,AnimalTask.NAILS);
      addTask( this,AnimalTask.WATER_ANIMAL);
      
      //for customized tasks
      addTask( AnimalTask.CUSTOM_ANIMAL);
   }
}
