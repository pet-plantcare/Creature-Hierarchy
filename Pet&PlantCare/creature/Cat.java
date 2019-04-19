package creature;

public class Cat extends Mammal
{
   public Cat()
   {
      super();
      addTask( this, FOOD);
      addTask( this, VACCINATION);
      addTask( this, MEDICATION);
      addTask( this, HYGIENE);
      addTask( this, NAILS);
      addTask( this, WATER_ANIMAL);
      addTask( this, CUSTOM_ANIMAL);
   }
}
