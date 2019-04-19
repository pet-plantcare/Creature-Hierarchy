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