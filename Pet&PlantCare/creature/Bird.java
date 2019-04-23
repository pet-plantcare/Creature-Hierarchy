package creature;
import tasks.*;



public class Bird extends Animal
{
   public static final String MALE = "Male";
   public static final String FEMALE = "Female";
   
   String gender;
   
   public Bird()
   {
      super();
      gender = "N/A";
      addTask(this, AnimalTask.FOOD);
      addTask(this, AnimalTask.VACCINATION);
      addTask(this, AnimalTask.MEDICATION);
      addTask( this,AnimalTask.HYGIENE);
      addTask( this,AnimalTask.NAILS);
      addTask( this,AnimalTask.WATER_ANIMAL);
      
      //for customized tasks
      addTask( this,AnimalTask.CUSTOM_ANIMAL);
   }
   
   public void setGender(String gender)
   {
      if (gender.equals(MALE))
      {
         gender = MALE;
      }
      else if (gender.equals(FEMALE))
      {
         gender = FEMALE;
      }
   }
   
   public String getGender()
   {
      return gender;
   }
}
