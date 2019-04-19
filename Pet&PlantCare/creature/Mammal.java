package creature;

public abstract class Mammal extends Animal
{
   public static final String MALE = "Male";
   public static final String FEMALE = "Female";
   private String gender;
   private int weigth;
   
   public Mammal()
   {
      super();
      gender = "N/A";
      weigth = 0;
   }
   
   public String getGender()
   {
      return gender;
   }
   
   public void setGender(String genderSample)
   {
      if (genderSample.equals(MALE))
      {
         gender = MALE;
      }
      else if ( genderSample.equals(FEMALE))
      {
         gender = FEMALE;
      }
   }
   
   public int getWeigth()
   {
      return weigth;
   }
   
   public void setWeigth(int input)
   {
      weigth = input;
   }
}