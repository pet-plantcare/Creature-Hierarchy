package creature;



public class Bird extends Animal
{
   public static final String MALE = "Male";
   public static final String FEMALE = "Female";
   
   String gender;
   
   public Bird()
   {
      super();
      gender = "N/A";
      addTask( this, FOOD);
      addTask( this, VACCINATION);
      addTask( this, MEDICATION);
      addTask( this, HYGIENE);
      addTask( this, NAILS);
      addTask( this, WATER_ANIMAL);
      addTask( this, CUSTOM_ANIMAL);
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
