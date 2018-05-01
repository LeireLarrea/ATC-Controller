/**
 * Objects of class Bath represent a bathtub 
 * which temperature and level of water can be measured.
 * 
 * @author Leire Larrea Casado (E1662175)
 * @version 1.0 (December 2016)
 */
public class Bath
{
   /* instance variables */
   private int bathTemperature;
   private int waterLevel;

   /**
    * Constructor for objects of class Bathtub. 
    * Initialises the instance 
    * bathTemperature at 30 and the waterLevel at 100.
    */
   public Bath()
   {
      this.bathTemperature = 30;
      this.waterLevel = 100;
   }

   /* instance methods */
   /*
    * gets the value of the variable bathTemperature.
    */
   public int getBathTemperature ()
   {
      return this.bathTemperature;
   }
   
   /*
    * sets the value of the variable bathTemperature 
    * to the value of the argument.
    */
   public void setBathTemperature(int aTemperature)
   {
      this.bathTemperature = aTemperature;
   }
}
