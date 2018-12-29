/*
Name: Rutwa Engineer
Description of the program: This program is used to display one of the 5 screensavers
and determine the speed of the screensavers as well as the length of the execution.

VARIABLE            TYPE                   PURPOSE

speed               int                    sets the speed for the screensaver
time                double                 sets the timer for the execution of the time

*/

import java.awt.*; //gives access to the java files
import hsa.Console; //gives access to the Console
import java.lang.*; // to access Thread class

public class computer implements Runnable

{
    private Console c; //creates a private console object
    int speed = 0; //sets the speed for the screensaver
    double time = 0; //sets the timer for the execution of the time


    //global variable for the colour black
    Color black = new Color (0, 0, 0);
    //global variable for the colour white
    Color box = new Color (255, 255, 255);
    //global variable for the colour red
    Color white = new Color (255, 0, 0);
    //global variable for the colour pink
    Color pink = new Color (255, 58, 177);
    //global variable for the colour darkgreen
    Color darkgreen = new Color (0, 100, 0);
    //global variable for the colour midnightblue
    Color midnightblue = new Color (25, 25, 112);
    //global variable for the colour orange
    Color orange = new Color (255, 140, 0);
    //global variable for the colour orchid
    Color orchid = new Color (186, 85, 211);
    //global variable for the colour darkpink
    Color darkpink = new Color (220, 20, 60);
    //global variable for the colour darkblue
    Color darkblue = new Color (139, 0, 139);
    //global variable for the colour yellow
    Color yellow = new Color (255, 255, 0);
    //global variable for the colour white
    Color white2 = new Color (255, 255, 255);



    public void Computer ()  //creates a new class called computer
    {

	c.clear ();
	c.setColor (black); //sets the colour to black
	c.fillRect (0, 0, 640, 500);
	//loops used to create the computer
	while (true)
	{
	    for (int x = 0 ; x < 200 ; x++) //for loop animation of the ccomputer
	    {
		c.setColor (black); //sets colour to black
		c.fillRect (0 + x, 300, 300, 100);
		c.setColor (white2); //set colour to white
		c.fillRect (1 + x, 300, 300, 100);
		c.setColor (orange);
		
		
		//used for printing the keyboard keys
		c.fillRect (210, 310, 10, 5);
		c.fillRect (230, 310, 10, 5);
		c.fillRect (250, 310, 10, 5);
		c.fillRect (270, 310, 10, 5);
		c.fillRect (290, 310, 10, 5);
		c.fillRect (310, 310, 10, 5);
		c.fillRect (330, 310, 10, 5);
		c.fillRect (350, 310, 10, 5);
		c.fillRect (370, 310, 10, 5);
		c.fillRect (390, 310, 10, 5);
		c.fillRect (410, 310, 10, 5);
		c.fillRect (430, 310, 10, 5);
		c.fillRect (450, 310, 10, 5);
		c.fillRect (470, 310, 10, 5);
		c.fillRect (490, 310, 10, 5);

		c.fillRect (210, 320, 10, 10);
		c.fillRect (230, 320, 10, 10);
		c.fillRect (230, 320, 10, 10);
		c.fillRect (250, 320, 10, 10);
		c.fillRect (270, 320, 10, 10);
		c.fillRect (290, 320, 10, 10);
		c.fillRect (310, 320, 10, 10);
		c.fillRect (330, 320, 10, 10);
		c.fillRect (350, 320, 10, 10);
		c.fillRect (370, 320, 10, 10);
		c.fillRect (390, 320, 10, 10);
		c.fillRect (410, 320, 10, 10);
		c.fillRect (430, 320, 10, 10);
		c.fillRect (450, 320, 10, 10);
		c.fillRect (470, 320, 10, 10);
		c.fillRect (490, 320, 10, 10);


		c.fillRect (210, 340, 20, 10);
		c.fillRect (230, 340, 10, 10);
		c.fillRect (250, 340, 10, 10);
		c.fillRect (270, 340, 10, 10);
		c.fillRect (290, 340, 10, 10);
		c.fillRect (310, 340, 10, 10);
		c.fillRect (330, 340, 10, 10);
		c.fillRect (350, 340, 10, 10);
		c.fillRect (370, 340, 10, 10);
		c.fillRect (390, 340, 10, 10);
		c.fillRect (410, 340, 10, 10);
		c.fillRect (430, 340, 10, 10);
		c.fillRect (450, 340, 10, 10);
		c.fillRect (470, 340, 10, 10);
		c.fillRect (490, 340, 10, 10);

		c.fillRect (210, 360, 13, 10);
		c.fillRect (230, 360, 10, 10);
		c.fillRect (230, 360, 10, 10);
		c.fillRect (250, 360, 10, 10);
		c.fillRect (270, 360, 10, 10);
		c.fillRect (290, 360, 10, 10);
		c.fillRect (310, 360, 10, 10);
		c.fillRect (330, 360, 10, 10);
		c.fillRect (350, 360, 10, 10);
		c.fillRect (370, 360, 10, 10);
		c.fillRect (390, 360, 10, 10);
		c.fillRect (410, 360, 10, 10);
		c.fillRect (430, 360, 10, 10);
		c.fillRect (450, 360, 10, 10);
		c.fillRect (470, 360, 10, 10);
		c.fillRect (490, 360, 10, 10);

		c.fillRect (230, 380, 10, 10);
		c.fillRect (230, 380, 10, 10);
		c.fillRect (250, 380, 10, 10);
		c.fillRect (270, 380, 10, 10);
		c.fillRect (290, 380, 10, 10);
		c.fillRect (310, 380, 10, 10);

		c.fillRect (320, 380, 80, 10);

		c.fillRect (410, 380, 10, 10);

		c.fillRect (430, 380, 10, 10);
		c.fillRect (450, 380, 10, 10);
		c.fillRect (470, 380, 10, 10);
		c.fillRect (490, 380, 10, 10);
		//used to delay the animation
		try
		{
		    Thread.sleep (speed);//determines the speed 

		}
		catch (Exception e)
		{

		}
	    }

	    for (int x = 0 ; x < 300 ; x++) //creates a new class called computer
	    {
		c.setColor (black); //sets color to black
		c.fillRect (15 + x, 200, 25, 50);
		c.setColor (pink); //sets colour to pink
		c.fillRect (16 + x, 200, 25, 50);

		c.setColor (black);//sets color to black
		c.fillRect (0 + x, 235, 50, 15);
		c.setColor (pink); //sets colour to pink
		c.fillRect (1 + x, 235, 50, 15);

		c.setColor (black);//sets color to black
		c.fillRect (-50 + x, 100, 150, 100);
		c.setColor (white);
		c.fillRect (-49 + x, 100, 150, 100);


		c.setColor (black);//sets color to black
		c.fillRect (-40 + x, 120, 125, 60);
		c.setColor (white2);//sets colour to pink
		c.fillRect (-39 + x, 120, 125, 60);

		c.setFont (new Font ("Arial Black", Font.BOLD, 50));
		c.drawString ("Computer", 225, 50);
		try
		{
		    Thread.sleep (speed); //determines the speed 

		}
		catch (Exception e)
		{

		}
	    }
	    c.clear ();
	    Computer ();
	}
    }


    public computer (int speed1, double time1, Console con) //colourbars class construtor + sets the timer 
    {
	c = con;
	speed = speed1;
	time = time1 * 40000; //sets the timer to a minute
    }


    public void run ()  //allows upwardPara to run on MyCreation

    {

	Computer ();
    }
}


