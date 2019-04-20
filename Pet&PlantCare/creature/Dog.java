package creature;
import tasks.*;
public class Dog extends Mammal
{
   public Dog()
   {
      super();
      addTask( AnimalTask.FOOD);
      addTask( AnimalTask.VACCINATION);
      addTask( AnimalTask.MEDICATION);
      addTask( AnimalTask.HYGIENE);
      addTask( AnimalTask.NAILS);
      addTask( AnimalTask.WATER_ANIMAL);
      
      //for customized tasks
      addTask( AnimalTask.CUSTOM_ANIMAL);
      
      dogs.add( this);
   }
}
