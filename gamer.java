/*
Name: Rutwa Engineer
Description of the program: This program is used to display one of the 5 screensavers
and determine the speed of the screensavers as well as the length of the execution.

VARIABLE            TYPE                   PURPOSE

speed               int                    sets the speed for the screensaver
time                double                 sets the timer for the execution of the time


*/

import java.awt.*; //provides access to java files
import hsa.*; //provides access to the Console
import java.lang.*; // provides access Thread class


public class gamer implements Runnable
{
    private Console c; // creates an instance variable of the Console
    int speed = 0; //sets the speed for the screensaver
    double time = 0;//sets the timer for the execution of the time


//global variable for the color black
    Color black = new Color (0, 0, 0);
    //global variable for the color gray
    Color gray = new Color (125, 125, 125);
    //global variable for the color white
    Color white = new Color (255, 255, 255);
    //global variable for the color pink
    Color pink = new Color (255, 51, 153);
    //global variable for the color yellow
    Color yellow = new Color (255, 255, 0);
    //global variable for the color red
    Color red = new Color (255, 0, 0);
    
    public void Gamer ()  //method used for creating the
    {


	c.clear ();
	c.setColor (black); //sets colour to black
	c.fillRect (0, 0, 640, 500);
	while (true)
	{
	    for (int x = 0 ; x < 100 ; x++) //for loops for drawing the gaming control
	    {
		c.setColor (black); //sets the colour to black
		c.fillRect (0 + x, 250, 300, 200);
		c.setColor (gray);  //sets the colour to gray
		c.fillRect (1 + x, 250, 380, 150);

		try
		{
		    Thread.sleep (speed); //determines the speed of the execution
		}
		catch (Exception e)
		{
		}

	    }

	    for (int x = 0 ; x < 100 ; x++) //for loops for drawing the gaming control
	    {
		c.setColor (gray); //sets the colour to gray
		c.fillRect (101, 250, 380, 150);
		c.setColor (white); //sets the colour to white
		c.fillRoundRect (200, 250, 50, 25, 100, 25);
		c.fillRoundRect (200, 280, 50, 25, 100, 25);
		c.fillRoundRect (200, 310, 50, 25, 100, 25);
		c.fillRoundRect (200, 340, 50, 25, 100, 25);
		c.fillRoundRect (200, 370, 50, 25, 100, 25);
		try
		{
		    Thread.sleep (speed);//used to determine the speed of the execution

		}
		catch (Exception e)
		{
		}

	    }


	    for (int x = 0 ; x < 100 ; x++)   //for loops for drawing the gaming control
	    {
		c.setColor (gray); //sets colour to gray
		c.fillRect (101, 250, 380, 150);
		c.setColor (white);  //sets colour to gray
		c.fillRoundRect (200, 250, 50, 25, 100, 25);
		c.fillRoundRect (200, 280, 50, 25, 100, 25);
		c.fillRoundRect (200, 310, 50, 25, 100, 25);
		c.fillRoundRect (200, 340, 50, 25, 100, 25);
		c.fillRoundRect (200, 370, 50, 25, 100, 25);

		c.setColor (black);  //sets colour to black
		c.fillRect (40 + x, 330, 50, 30);
		c.setColor (pink);  //sets colour to pink
		c.fillRect (41 + x, 330, 50, 30);

		c.setColor (black);  //sets colour to black
		c.fillRect (53 + x, 320, 25, 50);
		c.setColor (pink);  //sets colour to pink 
		c.fillRect (54 + x, 320, 25, 50);
		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver

		}
		catch (Exception e)
		{
		}

	    }

	    for (int x = 100 ; x > 0 ; x--) //for loops for drawing the gaming control
	    {
		c.setColor (gray); //sets colour to gray
		c.fillRect (101, 250, 380, 150);
		c.setColor (white); //sets colour to white
		c.fillRoundRect (200, 250, 50, 25, 100, 25);
		c.fillRoundRect (200, 280, 50, 25, 100, 25);
		c.fillRoundRect (200, 310, 50, 25, 100, 25);
		c.fillRoundRect (200, 340, 50, 25, 100, 25);
		c.fillRoundRect (200, 370, 50, 25, 100, 25);
		c.setColor (pink); //sets colour to pink
		c.fillRect (141, 330, 50, 30);
	    
		c.fillRect (154, 320, 25, 50); 
		c.setColor (black); //sets colour to black
		c.fillRect (400, 321 + x, 50, 50);
		c.setColor (yellow); //sets colour to yellow
		c.fillRect (400, 320 + x, 50, 50);

		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver
		    
		}
		catch (Exception e)
		{
		}

	    }
	   

	    for (int x = 100 ; x > 0 ; x--) //for loops for drawing the gaming control
	    {
		c.setColor (gray); //sets the colour to gray
		c.fillRect (101, 250, 380, 150);
		c.setColor (white); //sets the colour to white 
		c.fillRoundRect (200, 250, 50, 25, 100, 25);
		c.fillRoundRect (200, 280, 50, 25, 100, 25);
		c.fillRoundRect (200, 310, 50, 25, 100, 25);
		c.fillRoundRect (200, 340, 50, 25, 100, 25);
		c.fillRoundRect (200, 370, 50, 25, 100, 25);
		c.setColor (pink);  //sets the colour to pink
		c.fillRect (141, 330, 50, 30);
	       
		c.fillRect (154, 320, 25, 50);
		c.setColor (yellow); //sets the colour to yellow
		c.fillRect (400, 320, 50, 50);
		c.setColor (black); //sets the colour to black
		c.fillRect (325, 321 + x, 50, 50);
		c.setColor (yellow); //sets the colour to yellow
		c.fillRect (325, 320 + x, 50, 50);


		try
		{
		    Thread.sleep (speed); //determine the speed of the screensaver
		    
		}
		catch (Exception e)
		{
		}

	    }
	  
	    for (int x = 200 ; x > 0 ; x--) //for loops for drawing the gaming control
	    {
		c.setColor (gray); //sets colour to gray
		c.fillRect (101, 250, 380, 150);
		c.setColor (white);  //sets colour to white
		c.fillRoundRect (200, 250, 50, 25, 100, 25);
		c.fillRoundRect (200, 280, 50, 25, 100, 25);
		c.fillRoundRect (200, 310, 50, 25, 100, 25);
		c.fillRoundRect (200, 340, 50, 25, 100, 25);
		c.fillRoundRect (200, 370, 50, 25, 100, 25);
		c.setColor (pink);  //sets colour to pink
		c.fillRect (141, 330, 50, 30);
		c.fillRect (154, 320, 25, 50);
		c.setColor (yellow);  //sets colour to yellow
		c.fillRect (400, 320, 50, 50);
		c.fillRect (325, 320, 50, 50);
		c.setColor (black);  //sets colour to black
		c.fillOval (335, 331 + x, 30, 30);
		c.setColor (red);  //sets colour to red 
		c.fillOval (335, 330 + x, 30, 30);
		c.setColor (black);  //sets colour to black
		c.fillOval (410, 331 + x, 30, 30);
		c.setColor (red);  //sets colour to red
		c.fillOval (410, 330 + x, 30, 30);
		c.setColor (black); //sets colour to black
		c.fillOval (x + 350, 260, 100, 50);
		c.setColor (pink);  //sets colour to pink
		c.fillOval (x + 349, 260, 100, 50);
		c.setColor (black);  //sets colour to black
		c.fillRoundRect (x + 550, 25, 50, 25, 25, 25);
		c.setColor (yellow);  //sets colour to yellow
		c.fillRoundRect (x + 551, 25, 50, 25, 25, 25);

		c.setColor (black);  //sets colour to black
		c.fillRoundRect (x + 550, 75, 50, 25, 25, 25);
		c.setColor (red);  //sets colour to red
		c.fillRoundRect (x + 551, 75, 50, 25, 25, 25);

		c.setColor (black);  //sets colour to black
		c.fillRoundRect (x + 550, 125, 50, 25, 25, 25);
		c.setColor (yellow);  //sets colour to yellow
		c.fillRoundRect (x + 551, 125, 50, 25, 25, 25);

		c.setColor (black);  //sets colour to black
		c.fillRoundRect (x + 550, 175, 50, 25, 25, 25);
		c.setColor (red);  //sets colour to red
		c.fillRoundRect (x + 551, 175, 50, 25, 25, 25);

		c.setColor (black);  //sets colour to black
		c.fillRoundRect (x + 550, 225, 50, 25, 25, 25);
		c.setColor (yellow);  //sets colour to yellow
		c.fillRoundRect (x + 551, 225, 50, 25, 25, 25);

		c.setColor (black);  //sets colour to black
		c.fillRoundRect (x + 550, 275, 50, 25, 25, 25);
		c.setColor (red);  //sets colour to red
		c.fillRoundRect (x + 551, 275, 50, 25, 25, 25);

		c.setColor (black);  //sets colour to black
		c.fillRoundRect (x + 550, 325, 50, 25, 25, 25);
		c.setColor (yellow);  //sets colour to yellow
		c.fillRoundRect (x + 551, 325, 50, 25, 25, 25);

		c.setColor (black);  //sets colour to black
		c.fillRoundRect (x + 550, 375, 50, 25, 25, 25);
		c.setColor (red);  //sets colour to red
		c.fillRoundRect (x + 551, 375, 50, 25, 25, 25);

		c.setColor (black);  //sets colour to black
		c.fillRoundRect (x + 550, 425, 50, 25, 25, 25);
		c.setColor (yellow);  //sets colour to yellow
		c.fillRoundRect (x + 551, 425, 50, 25, 25, 25);
		c.setFont (new Font ("Arial", Font.BOLD, 50));
		c.setColor (white);  //sets colour to white
		c.drawString ("Gamer ", 200, 100);

		try
		{
		    Thread.sleep (speed); //determines the speed of the screensaver
		    
		}
		catch (Exception e)
		{
		}


	    }
	    
	    c.clear ();
	    c.setColor (black);
	    c.fillRect (0, 0, 640, 500);
	}
    }


    public gamer (int speed1, double time1, Console con)  //flower class construtor
    {

	c = con;
	speed = speed1;
	time = time1 * 21000; //sets the timer for the execution of the screensaver

    }


    public void run ()  //allows the thread to run in MyCreation
    {

	Gamer ();

    }
}



