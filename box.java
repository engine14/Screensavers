/*
Name: Rutwa Engineer
Description of the program: This program is used to display one of the 5 screensavers
and determine the speed of the screensavers as well as the length of the execution.

*/


import java.awt.*; //provides access to java files
import hsa.Console; //provides access to the Console
import java.lang.*; // provides access Thread class

public class box implements Runnable
{
    private Console c; // creates an instance variable of the Console
    //global variable for the colour green
    Color green = new Color (51, 255, 0);
    //global variable for the colour white
    Color white = new Color (255, 255, 255);
    //global variable for the colour midblue
    Color midblue = new Color (25, 25, 113);
    //global variable for the colour darkred
    Color darkred = new Color (102, 0, 0);
    //global variable for the colour indigo
    Color indigo = new Color (128, 0, 130);
    public void Box ()  //method used for creating the italian flag
    {
	//loops used to draw the box
	for (int x = 0 ; x < 100 ; x++)
	{

	    c.setColor (green); //sets the colour to green
	    c.fillRect (0 + x, 250, 125, 80); //erases 
	    c.setColor (midblue);  //sets the colour
	    c.fillRect (1 + x, 250, 125, 80); //draw

	    c.setColor (green); //sets the colour to green
	    c.fillRect (280, 350 - x, 125, 80);//erases
	    c.setColor (darkred); //sets the colour
	    c.fillRect (280, 349 - x, 125, 80); //draw

	    c.setColor (green);  //sets the colour to green
	    c.fillRect (550 - x, 250, 125, 80); //erases
	    c.setColor (indigo); //sets the colour
	    c.fillRect (549 - x, 250, 125, 80); //draw

	    try
	    {
		Thread.sleep (20); //sets the speed of the execution
	    }
	    catch (Exception e)
	    {
	    }

	}
    }


    public box (Console con)  //box class construtor
    {
	c = con;
    }


    public void run ()  //allows the thread to run in MyCreation
    {
	Box ();
    }
}


