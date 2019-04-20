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
      addTask( AnimalTask.FOOD);
      addTask( AnimalTask.VACCINATION);
      addTask( AnimalTask.MEDICATION);
      addTask( AnimalTask.HYGIENE);
      addTask( AnimalTask.NAILS);
      addTask( AnimalTask.WATER_ANIMAL);
      
      //for customized tasks
      addTask( AnimalTask.CUSTOM_ANIMAL);
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
