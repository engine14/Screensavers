/*
Name: Rutwa Engineer
Description of the program: This program is used to display one of the 5 screensavers
and determine the speed of the screensavers as well as the length of the execution.

VARIABLE            TYPE                   PURPOSE

speed               int                    sets the speed for the screensaver
time                double                 sets the timer for the execution of the time


*/

import java.awt.*; //provides access to java files
import hsa.Console; //provides access to the Console
import java.lang.*; // provides access Thread class

public class flower1 implements Runnable
{
    private Console c; // creates an instance variable of the Console
    //global variable for the colour red
    Color red = new Color (255, 0, 0);
    //global variable for the colour black
    Color black = new Color (0, 0, 0);
    //global variable for the colour yellow
    Color yellow = new Color (255, 255, 0);
    //global variable for the colour purple
    Color purple = new Color (153, 0, 153);
    //global variable for the colour green
    Color green = new Color (0, 255, 0);
    //global variable for the colour pink
    Color pink = new Color (255, 0, 255);
    //global variable for the colour white
    Color white = new Color (255, 255, 255);
    int speed = 0;
    double time = 0;



    public void Flower1 ()  //method used for creating the tree
    {
	c.fillRect (0, 0, 640, 640); //sets the background

	while (true)
	{
	    for (int x = 0 ; x < 100 ; x++) //for loop for executing the tree
	    {
		c.setColor (black); //sets colour to black
		c.fillOval (280, 25 + x, 100, 100);//draws
		c.setColor (red); //sets colour to red
		c.fillOval (280, 26 + x, 100, 100); //erases
		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver

		}
		catch (Exception e)
		{
		}
	    }


	    for (int x = 0 ; x < 100 ; x++) //for loop for executing the tree
	    {
		c.setColor (red); //sets colour to red
		c.fillOval (280, 125, 100, 100);

		c.setColor (black); //sets colour to black
		c.fillOval (300, 45 + x, 60, 60);

		c.setColor (yellow); //sets colour to black
		c.fillOval (300, 46 + x, 60, 60);

		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver

		}
		catch (Exception e)
		{
		}
	    }

	    for (int x = 0 ; x < 100 ; x++)
	    {
		c.setColor (red);  //sets colour to red
		c.fillOval (280, 125, 100, 100);
		c.setColor (yellow);  //sets colour to yellow
		c.fillOval (300, 146, 60, 60);
		c.setColor (black);  //sets colour to black
		c.fillOval (313, 60 + x, 30, 30);
		c.setColor (purple);  //sets colour to purple
		c.fillOval (313, 61 + x, 30, 30);

		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver

		}
		catch (Exception e)
		{
		}
	    }

	    for (int x = 0 ; x < 340 ; x++)
	    {
		c.setColor (red);//sets colour to red
		c.fillOval (280, 125, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 146, 60, 60);
		c.setColor (purple); //sets colour to purple
		c.fillOval (313, 161, 30, 30);
		c.setColor (black); //sets colour to black
		c.fillOval (0 + x, 200, 100, 100);
		c.setColor (green); //sets colour to green
		c.fillOval (1 + x, 200, 100, 100);
		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver


		}
		catch (Exception e)
		{
		}
	    }


	    for (int x = 0 ; x < 360 ; x++)
	    {
		c.setColor (red); //sets colour to red
		c.fillOval (280, 125, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 146, 60, 60);
		c.setColor (purple); //sets colour to purple
		c.fillOval (313, 161, 30, 30);
		c.setColor (green); //sets colour to green
		c.fillOval (341, 200, 100, 100);
		c.setColor (black); //sets colour to black
		c.fillOval (0 + x, 220, 60, 60);
		c.setColor (pink); //sets colour to pink
		c.fillOval (1 + x, 220, 60, 60);
		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver

		}
		catch (Exception e)
		{
		}
	    }
	    for (int x = 0 ; x < 375 ; x++)
	    {
		c.setColor (red); //sets colour to red
		c.fillOval (280, 125, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 146, 60, 60);
		c.setColor (purple); //sets colour to purple
		c.fillOval (313, 161, 30, 30);
		c.setColor (green); //sets colour to green
		c.fillOval (341, 200, 100, 100);
		c.setColor (pink); //sets colour to pink
		c.fillOval (361, 220, 60, 60);
		c.setColor (black); //sets colour to black
		c.fillOval (0 + x, 235, 30, 30);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (1 + x, 235, 30, 30);
		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver

		}
		catch (Exception e)
		{
		}
	    }

	    for (int x = 200 ; x > 0 ; x--)
	    {
		c.setColor (red); //sets colour to red
		c.fillOval (280, 125, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 146, 60, 60);
		c.setColor (purple); //sets colour to purple
		c.fillOval (313, 161, 30, 30);
		c.setColor (green); //sets colour to green
		c.fillOval (341, 200, 100, 100);
		c.setColor (pink); //sets colour to pink
		c.fillOval (361, 220, 60, 60);
		c.setColor (yellow); //sets colour to  yellow
		c.fillOval (376, 235, 30, 30);
		c.setColor (black); //sets colour to black
		c.fillOval (280, x + 225, 100, 100);
		c.setColor (red); //sets colour to red
		c.fillOval (280, x + 224, 100, 100);

		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver

		}
		catch (Exception e)
		{
		}
	    }

	    for (int x = 200 ; x > 0 ; x--)
	    {
       
		c.setColor (red); //sets colour to red
		c.fillOval (280, 125, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 146, 60, 60);
		c.setColor (purple); //sets colour to purple 
		c.fillOval (313, 161, 30, 30);
		c.setColor (green); //sets colour to green
		c.fillOval (341, 200, 100, 100);
		c.setColor (pink); //sets colour to  pink
		c.fillOval (361, 220, 60, 60);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (376, 235, 30, 30);
		c.setColor (red); //sets colour to red
		c.fillOval (280, 230, 100, 100);
		c.setColor (black); //sets colour to black
		c.fillOval (300, x + 250, 60, 60);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, x + 249, 60, 60); 
		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver

		}
		catch (Exception e)
		{
		}
	    }

	    for (int x = 200 ; x > 0 ; x--)
	    {
		c.setColor (red); //sets colour to red
		c.fillOval (280, 125, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 146, 60, 60);
		c.setColor (purple); //sets colour to purple
		c.fillOval (313, 161, 30, 30);
		c.setColor (green); //sets colour to green
		c.fillOval (341, 200, 100, 100);
		c.setColor (pink); //sets colour to pink
		c.fillOval (361, 220, 60, 60);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (376, 235, 30, 30);
		c.setColor (red); //sets colour to red
		c.fillOval (280, 230, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 250, 60, 60);
		c.setColor (black); //sets colour to black
		c.fillOval (310, x + 260, 30, 30);
		c.setColor (purple); //sets colour to purple
		c.fillOval (310, x + 259, 30, 30);
		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver

		}
		catch (Exception e)
		{
		}


	    }


	    for (int x = 0 ; x < 220 ; x++) 
	    {
		c.setColor (red); //sets colour to red
		c.fillOval (280, 125, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 146, 60, 60);
		c.setColor (purple); //sets colour to purple
		c.fillOval (313, 161, 30, 30);
		c.setColor (green); //sets colour to green
		c.fillOval (341, 200, 100, 100);
		c.setColor (pink); //sets colour to pink
		c.fillOval (361, 220, 60, 60);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (376, 235, 30, 30);
		c.setColor (red); //sets colour to red
		c.fillOval (280, 230, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 250, 60, 60);
		c.setColor (purple); //sets colour to purple
		c.fillOval (310, 259, 30, 30);
		c.setColor (black); //sets colour to black
		c.fillOval (0 + x, 190, 100, 100);
		c.setColor (green); //sets colour to green
		c.fillOval (1 + x, 190, 100, 100);
		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver

		}
		catch (Exception e)
		{
		}
	    }

	    for (int x = 0 ; x < 240 ; x++)
	    {
		c.setColor (red); //sets colour to red
		c.fillOval (280, 125, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 146, 60, 60);
		c.setColor (purple); //sets colour to purple 
		c.fillOval (313, 161, 30, 30);
		c.setColor (green); //sets colour to blue
		c.fillOval (341, 200, 100, 100);
		c.setColor (pink); //sets colour to pink
		c.fillOval (361, 220, 60, 60);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (376, 235, 30, 30);
		c.setColor (red); //sets colour to red
		c.fillOval (280, 230, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 250, 60, 60);
		c.setColor (purple); //sets colour to purple
		c.fillOval (310, 259, 30, 30);
		c.setColor (green); //sets colour to green
		c.fillOval (221, 190, 100, 100);
		c.setColor (black); //sets colour to black
		c.fillOval (0 + x, 210, 60, 60);
		c.setColor (pink); //sets colour to pink
		c.fillOval (1 + x, 210, 60, 60);
		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver

		}
		catch (Exception e)
		{
		}
	    }


	    for (int x = 0 ; x < 260 ; x++)
	    {
		c.setColor (red); //sets colour to red 
		c.fillOval (280, 125, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 146, 60, 60);
		c.setColor (purple); //sets colour to purple
		c.fillOval (313, 161, 30, 30);
		c.setColor (green); //sets colour to green
		c.fillOval (341, 200, 100, 100);
		c.setColor (pink); //sets colour to pink
		c.fillOval (361, 220, 60, 60);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (376, 235, 30, 30);
		c.setColor (red); //sets colour to red
		c.fillOval (280, 230, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 250, 60, 60);
		c.setColor (purple); //sets colour to purple 
		c.fillOval (310, 259, 30, 30);
		c.setColor (green);//sets colour to green
		c.fillOval (221, 190, 100, 100);
		c.setColor (pink); //sets colour to pink
		c.fillOval (241, 210, 60, 60);
		c.setColor (black); //sets colour to black
		c.fillOval (x + 0, 225, 30, 30);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (x + 1, 225, 30, 30);
		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver

		}
		catch (Exception e)
		{
		}

	    }


	    for (int x = 200 ; x > 0 ; x--)
	    {
		c.setColor (red); //sets colour to red
		c.fillOval (280, 125, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 146, 60, 60);
		c.setColor (purple); //sets colour to purple
		c.fillOval (313, 161, 30, 30);
		c.setColor (green); //sets colour to green
		c.fillOval (341, 200, 100, 100);
		c.setColor (pink); //sets colour to pink
		c.fillOval (361, 220, 60, 60);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (376, 235, 30, 30);
		c.setColor (red); //sets colour to red
		c.fillOval (280, 230, 100, 100);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (300, 250, 60, 60);
		c.setColor (purple); //sets colour to purple
		c.fillOval (310, 259, 30, 30);
		c.setColor (green); //sets colour to green
		c.fillOval (221, 190, 100, 100);
		c.setColor (pink); //sets colour to pink
		c.fillOval (241, 210, 60, 60);
		c.setColor (yellow); //sets colour to yellow
		c.fillOval (261, 225, 30, 30);
		c.setColor (green); //sets colour to green
		c.fillOval (325, x + 330, 30, 30);
		try
		{
		    Thread.sleep (speed);

		}
		catch (Exception e)
		{
		}
	    }

	    c.clear ();
	    c.setColor (black);
	    c.fillRect (0, 0, 640, 640);
	}


    }


    public flower1 (int speed1, double time1, Console con)  //flower class construtor
    {
	c = con;
	speed = speed1;
	time = time1 * 45000; //determines the time for the timer
    }


    public void run ()  //allows the thread to run in MyCreation
    {

	Flower1 ();
    }
}


