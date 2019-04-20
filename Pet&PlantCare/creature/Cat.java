package creature;
import tasks.*;
public class Cat extends Mammal
{
   public Cat()
   {
      super();
      addTask( AnimalTask.FOOD);
      addTask( AnimalTask.VACCINATION);
      addTask( AnimalTask.MEDICATION);
      addTask( AnimalTask.HYGIENE);
      addTask( AnimalTask.NAILS);
      addTask( AnimalTask.WATER_ANIMAL);
      
      //for custiomized tasks
      addTask( AnimalTask.CUSTOM_ANIMAL);
   }
}
