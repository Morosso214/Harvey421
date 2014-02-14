import java.io.File;
import java.awt.event.ActionListener;
import javax.swing.Timer; 

public class Racer
   extends Thread
{
   //Still need to implement 3 different threads
     
   private int mFileNumber;
   private boolean isCreator;
   
   public Racer(boolean theCreator)
   {
      mFileNumber = 0;
      isCreator = theCreator;
   }
   
   public File newFileN(int number)
   {
      return new File(String.format("file.%05d", number));
   }   
   
   public void run()
   {
      while (isCreator)
      {
         try
            {
               if (newFileN(mFileNumber).createNewFile())
               {
                  mFileNumber++;
               }
               Thread.sleep(500);
            }
         catch (Exception e)
         {
         }
      }
      
      while (!isCreator)
      {
         try
         {
            if (newFileN(mFileNumber).delete())
            {
               mFileNumber++;
            }
            Thread.sleep(500);
         }
         catch (Exception e)
         {
         }
      }      
   }

   public static void StartRacer()
   {
      new Racer(true);
      new Racer(false);
   }
   
   public static void main(String[] args)
   {
      StartRacer();
   }
}