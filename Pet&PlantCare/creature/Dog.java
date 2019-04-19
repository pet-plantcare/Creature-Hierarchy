package creature;

public class Dog extends Mammal
{
   public Dog()
   {
      super();
      addTask( this, AnimalTask.FOOD);
      addTask( this, AnimalTask.VACCINATION);
      addTask( this, AnimalTask.MEDICATION);
      addTask( this, AnimalTask.HYGIENE);
      addTask( this, AnimalTask.NAILS);
      addTask( this, AnimalTask.WATER_ANIMAL);
      addTask( this, AnimalTask.CUSTOM_ANIMAL);
   }
}
