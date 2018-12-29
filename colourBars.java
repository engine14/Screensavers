/*
Name: Rutwa Engineer
Description of the program: This program is used to display one of the 5 screensavers
and determine the speed of the screensavers as well as the lenght of the execution.

VARIABLE            TYPE                   PURPOSE

speed               int                    sets the speed for the screensaver
time                double                 sets the timer for the execution of the time

*/

import java.awt.*; //provides access to java files
import hsa.*; //provides access to the Console
import java.lang.*; // provides access Thread class


public class colourBars implements Runnable
{
    private Console c; // creates an instance variable of the Console
    int speed = 0; //sets the speed for the screensaver
    double time = 0; //sets the timer for the execution of the time

//global variable for colour red
    Color red = new Color (255, 0, 0);
    //global variable for colour orange 
    Color orange = new Color (255, 128, 0);
    //global variable for colour yellow
    Color yellow = new Color (255, 255, 51);
    //global variable for colour green
    Color green = new Color (153, 255, 51);
    //global variable for colour blue
    Color blue = new Color (51, 51, 255);
    //global variable for colour indigo
    Color indigo = new Color (51, 0, 51);
    //global variable for colour violet
    Color violet = new Color (153, 0, 153);
    //global variable for colour white
    Color white = new Color (255, 255, 255);
    //global variable for colour black
    Color black = new Color (0, 0, 0);

    public void ColourBars ()  //method used for creating the
    {

	c.clear ();
	while (true) //while loop used for displaying the animation of the colourBars
	{

	    for (int x = 0 ; x < 550 ; x++) //for loop animation of the colourBars
	    {

		c.setColor (white);//sets color to white
		c.fillRect (0 + x, 299, 92, 50);//draws 
		c.setColor (red); //sets color to orange 
		c.fillRect (1 + x, 299, 92, 50); //erases
		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		    
		}
		catch (Exception e)
		{
		}
	    }
	  
	    for (int x = 0 ; x < 458 ; x++) //for loop animation of the colourBars
	    {

		c.setColor (white);//sets color to white
		c.fillRect (0 + x, 299, 92, 50); //draws
		c.setColor (orange); //sets color to orange 
		c.fillRect (1 + x, 299, 92, 50); //erases
		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		    
		}
		catch (Exception e)
		{
		}
	    }
	   
	    for (int x = 0 ; x < 366 ; x++) //for loop animation of the colourBars
	    {

		c.setColor (white); //sets color to white
		c.fillRect (0 + x, 299, 92, 50); //draws
		c.setColor (green); //sets color to green 
		c.fillRect (1 + x, 299, 92, 50); //erases
		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		  
	  
		}
		catch (Exception e)
		{
		}
	    }
	   
	    for (int x = 0 ; x < 274 ; x++) //for loop animation of the colourBars
	    {

		c.setColor (white); //sets color to white
		c.fillRect (0 + x, 299, 92, 50); //draws
		c.setColor (yellow); //sets color to yellow
		c.fillRect (1 + x, 299, 92, 50); //erases
		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		  
		}
		catch (Exception e)
		{
		}
	    }
	    
	    for (int x = 0 ; x < 182 ; x++) //for loop animation of the colourBars
	    {

		c.setColor (white); //sets color to white
		c.fillRect (0 + x, 299, 92, 50); //draws
		c.setColor (blue); //sets color to blue
		c.fillRect (1 + x, 299, 92, 50); //erases
		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		  
		   
		}
		catch (Exception e)
		{
		}
	    }
	   
	    for (int x = 0 ; x < 90 ; x++) //for loop animation of the colourBars
	    {

		c.setColor (white); //sets color to white
		c.fillRect (0 + x, 299, 92, 50); //draws
		c.setColor (indigo); //sets color to blue
		c.fillRect (1 + x, 299, 92, 50); //erases
		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		    
		}
		catch (Exception e)
		{
		}
	    }
	   
	    for (int x = -10 ; x < -2 ; x++) //for loop animation of the colourBars
	    {

		c.setColor (white); //sets color to white
		c.fillRect (0 + x, 299, 92, 50); //draws
		c.setColor (violet); //sets color to violet
		c.fillRect (1 + x, 299, 92, 50); //erases
		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
	 
		}
		catch (Exception e)
		{
		}
	    }

	    for (int x = 0 ; x < 250 ; x++) //for loop animation of the colourBars
	    {
		c.setColor (red); //sets color to red
		c.fillRect (0, -50 + x, 92, 100); //square to the right

		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver

		}
		catch (Exception e)
		{
		}

	    }

	    for (int x = 0 ; x < 300 ; x++) //for loop animation of the colourBars
	    {
		c.setColor (orange); //sets color to orange
		c.fillRect (92, -200 + x, 92, 200); //square to the right

		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		   

		}
		catch (Exception e)
		{
		}
	    }

	    for (int x = 0 ; x < 300 ; x++) //for loop animation of the colourBars
	    {
		c.setColor (yellow); //sets color to yellow
		c.fillRect (184, -200 + x, 92, 200); //square to the right

		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		   

		}
		catch (Exception e)
		{
		}
	    }
	 
	    for (int i = 0 ; i < 300 ; i++) //for loop animation of the colourBars
	    {
		c.setColor (green); //sets color to green
		c.fillRect (276, -200 + i, 92, 200); //square to the right

		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		   
		}
		catch (Exception e)
		{
		}
	    }

	    for (int i = 0 ; i < 300 ; i++) //for loop animation of the colourBars
	    {
		c.setColor (blue); //sets color to blue
		c.fillRect (368, -200 + i, 92, 200); //square to the right


		try
		{
		    Thread.sleep (speed);  //determines the speed of the screensaver

		}
		catch (Exception e)
		{
		}
	    }
	    
	    for (int i = 0 ; i < 300 ; i++) //for loop animation of the colourBars
	    {
		c.setColor (indigo); //sets color to indigo
		c.fillRect (460, -200 + i, 92, 200); //square to the right

		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver

		    
		}
		catch (Exception e)
		{
		}
	    }
	   
	    for (int i = 0 ; i < 300 ; i++) //for loop animation of the colourBars
	    {
		c.setColor (violet); //sets color to indigo
		c.fillRect (552, -200 + i, 92, 200); //square to the right

		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		    
		}
		catch (Exception e)
		{
		}
	    }
	    
	    for (int x = 200 ; x > 0 ; x--) //for loop animation of the colourBars
	    {
		c.setColor (green); //sets color to green
		c.fillRect (0, x + 350, 92, 50);//square to the right

		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		    
		}
		catch (Exception e)
		{
		}

	    }
	    
	    for (int x = 200 ; x > 0 ; x--) //for loop animation of the colourBars
	    {
		c.setColor (yellow); //sets color to yellow
		c.fillRect (92, x + 350, 92, 50);  //square to the right

		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		    
		}
		catch (Exception e)
		{
		}

	    }
	    
	    for (int x = 200 ; x > 0 ; x--) //for loop animation of the colourBars
	    {
		c.setColor (violet); //sets color to violet
		c.fillRect (184, x + 350, 92, 50);  //square to the right

		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		    
		}
		catch (Exception e)
		{
		}

	    }
	    
	    for (int x = 200 ; x > 0 ; x--) //for loop animation of the colourBars
	    {
		c.setColor (red);  //sets color to red
		c.fillRect (276, x + 350, 92, 50); //square to the right

		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		    
		}
		catch (Exception e)
		{
		}

	    }
	   
	    for (int x = 200 ; x > 0 ; x--) //for loop animation of the colourBars
	    {
		c.setColor (indigo); //sets color to indigo 
		c.fillRect (368, x + 350, 92, 50); //square to the right

		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		    
		}
		catch (Exception e)
		{
		}
	    }
	    
	    for (int x = 200 ; x > 0 ; x--) //for loop animation of the colourBars
	    {
		c.setColor (blue); //sets color to blue
		c.fillRect (460, x + 350, 92, 50); //square to the right

		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		    
		}
		catch (Exception e)
		{
		}

	    }

	    for (int x = 200 ; x > 0 ; x--) //for loop animation of the colourBars
	    {
		c.setColor (orange); //sets color to orange
		c.fillRect (552, x + 350, 92, 50); //square to the right

		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		    
		}
		catch (Exception e)
		{
		}

	    }

	    c.clear ();


	}

    }




    public colourBars (int speed1, double time1, Console con)  //colourbars class construtor + sets the timer 
    {

	c = con;
	speed = speed1;
	time = time1 * 45000; //set it to a minute
    }


    public void run ()  //allows the thread to run in ColourBars
    {
	ColourBars ();


    }
}


