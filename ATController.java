/**
 * Objects of class ATController represent an Automatic Temperature Control
 * designed to check the temperature of Bath objects and heat or cool it down 
 * until it reaches the desired temperature.
 * 
 * @author Leire Larrea Casado (E1662175)
 * @version 1.0 (December 2016)
 */
public class ATController
{
   /* instance variables */
   private int desiredTemperature;
   public Bath bath;
   private String display;
 
   /**
    * Constructor for objects of class TControl.
    * Initialises the instance desiredTemperature at  38,
    * the bath as a constructed instance of the Bath class, 
    * the display as null (to show no message)
    * and the systemOn as false (system is turned off).
    */
   public ATController()
   {
      this.desiredTemperature = 38;
      this.bath = new Bath();
      this.display = null;
   }

    /* instance methods */
   /*
    * gets the value of the variable desiredTemperature.
    */
   private int getDesiredTemperature()
   {
      return this.desiredTemperature;
   }
   
   /*
    * sets the value of the variable desiredTemperature 
    * to the value of the argument.
    */
   private void setDesiredTemperature(int aTemperature)
   {
      this.desiredTemperature = aTemperature; 
   }
   
   /*
    * turns on the heating system and increments the bathTemperature 
    * until it reaches an equal value to the desiredTemperature.
    */
   private String heat()
   {
      while ( this.getDesiredTemperature() > this.bath.getBathTemperature())
      {
        this.bath.setBathTemperature(this.bath.getBathTemperature() + 1 );
      }
      return display = display + "The heating system was turned on until " + this.bath.getBathTemperature() + " Celsius degrees were achieved.";
   }
   
   /*
    * turns on the cooling system decrements the bathTemperature 
    * until it reaches an equal value to the desiredTemperature.
    */
   private String cool()
   {
       while ( this.getDesiredTemperature() < this.bath.getBathTemperature())
      {
        this.bath.setBathTemperature(this.bath.getBathTemperature() - 1 );
      }
      return display = display + "The cooling system was turned on until " + this.bath.getBathTemperature() + " Celsius degrees were achieved.";
   }
     
   /*
    * Calculates the difference in temperature between the bathTemperature and desiredTemperature
    * and depending on this invokes the heat or cool methods.
    * Finally, it returns a message with the previous and latest bathTemperatures as well as 
    * the system used to achieve this.
    */
   @Override 
   public String toString()
   {
      int difference = this.getDesiredTemperature() - this.bath.getBathTemperature();
      display = "The temperature difference was " + difference + " degrees Celsius. ";
      
      if (difference > 0)
      {
         this.heat();
      }
      if (difference == 0)
      {
         display = "The temperature of the water is excellent. No adjustment needed.";
      }
      if (difference < 0)
      {
         this.cool();        
      }
      return display;
   }
}
