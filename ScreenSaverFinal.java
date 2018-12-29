/*
Name: Rutwa Engineer
Description of the program: This program is used to display one of the 5 screensavers
and determine the speed of the screensavers as well as the length of the execution.

VARIABLE               TYPE                 PURPOSE

speed                  int                  used to set the speed of the screensaver
time                   double               used to set the timer for the execution of the screensaver
timer                  int                  another variable which was used to tun the execution of the screensaver
str1                   string               used for error trapping through the program
pick                   int                  used to determine which screensaver the user would like displayed
mainMenu               int                  used for executing the password
 password              string               used for executing the password
*/

import java.awt.*; //this is used to import all java classes
import hsa.*; //used to import hsa console
import java.io.*; // imports for putting input and output to any type of file

public class ScreenSaverFinal //used to execute the class called screensaverfinal

{

    Console c; //makes an instances of the consol

    int speed = 0; //used to set the speed of the screensaver
    double time = 0; //used to set the timer for the execution of the screensaver
    int timer = 0; //another variable which was used to tun the execution of the screensaver
    String str1 = ""; //used for error trapping through the program
    int pick; //used to determine which screensaver the user would like displayed
    int mainMenu; //used for determining the 3 options in mainMenu
    String password = ""; //used for executing the password
    PrintWriter output; //used for outputting data to the allocated text files


    //global variable called green for colour
    Color green = new Color (51, 255, 0);
    //global variable called black for colour
    Color black = new Color (0, 0, 0);
    //global variable called purple for colour
    Color purple = new Color (102, 0, 51);
    //global variable called darkred for colour
    Color darkred = new Color (102, 0, 0);
    //global variable called pink for colour
    Color pink = new Color (255, 102, 178);
    //global variable called white for colour
    Color white = new Color (255, 255, 255);
    //global variable called yellow for colour
    Color yellow = new Color (255, 255, 51);
    //global variable called yellow2 for colour
    Color yellow2 = new Color (255, 255, 0);
    //global variable called purple2 for colour
    Color purple2 = new Color (102, 0, 51);
    //global variable called green2 for colour
    Color green2 = new Color (0, 255, 0);
    //global variable called red for colour
    Color red = new Color (255, 0, 0);
    //global variable called red2 for colour
    Color red2 = new Color (100, 0, 0);
    //global variable called green3 for colour
    Color green3 = new Color (0, 100, 0);
    //global variable called orange for colour
    Color orange = new Color (255, 146, 20);

    public ScreenSaverFinal ()


    {
	c = new Console ("Screen Saver"); //the window title of the consol
    }


    public void title ()  //method used to display the title

    {
	c.setColor (green); //used to set the colour
	c.fillRect (0, 0, 640, 500);
	c.setColor (black);
	c.setFont (new Font ("Times New Roman", Font.BOLD, 60)); //used to set the font style
	c.drawString ("Screensavers", 140, 175); //title

    }


    public void box ()  //method used to display the box animation using threads
    {
	box a = new box (c);  //allows it to diaplay the boxes in this console
	a.run ();
	pauseProgram (); //calls pauseprogram
    }



    public void intro ()  //method used to display the introduction to the program
    {

	c.clear ();
	c.setColor (green); //used to set the colour
	c.fillRect (0, 0, 640, 500);
	c.setColor (black); //used to set the colour
	c.setFont (new Font ("Arial", Font.BOLD, 40)); //used to set the font style
	c.drawString ("Screensavers", 200, 50);
	c.setColor (red2); //used to set the colour
	c.setFont (new Font ("Times New Roman", Font.PLAIN, 30)); //used to set the font style
	c.drawString ("Introduction", 250, 100);
	c.setColor (black); //used to set the colour
	c.setFont (new Font ("Times New Roman", Font.PLAIN, 20)); //used to set the font style
	c.drawString ("This program allow the user to choose one of the five ", 100, 150);
	c.drawString ("screensavers, as well as the lenght of execution and speed", 90, 180);
	c.drawString ("of the Screensaver.", 280, 210);
	box (); //used to diaplay the box animation
	c.clear ();
	//chooseScreenSaver ();

    }


    public void chooseScreenSaver ()  //method used to choose the screensaver
    {
	//mainMenu ();
	askpreview (); //calls the previw of the screensaver
	c.setColor (pink); //used to set the colour
	c.fillRect (0, 0, 640, 500);
	c.setFont (new Font ("Times New Roman", Font.PLAIN, 20)); //used to set the font style
	c.setColor (black); //used to set the colour
	c.drawString ("Please choose the screensaver from the choices below.", 125, 100);
	c.drawString ("1/ Color bars", 280, 140);
	c.drawString ("2/ Abstract tree", 280, 170);
	c.drawString ("3/ Game controller", 280, 200);
	c.drawString ("4/ Parachute", 280, 230);
	c.drawString ("5/ Computer", 280, 260);
	c.setFont (new Font ("Times New Roman", Font.PLAIN, 15)); //used to set the font style
	c.drawString ("Note: You will be required to enter the data twice for conformation purposes", 120, 50);
	while (true) //error traps for error
	{
	    try
	    {
		c.setCursor (15, 67); //set the cursor to a new location
		c.setFont (new Font ("Times New Roman", Font.PLAIN, 18));
		c.drawString ("Please enter the screensaver that you would like to be displayed: ", 60, 300);
		writeFile4 (); //calls for writeFile4 to write the screensaver number in a file
		c.setCursor (15, 67); //set the cursor to a new location
		str1 = c.readLine (); //reads the input entered by the input
		pick = Integer.parseInt (str1); //converts the data from string to integer
		break;
	    }
	    catch (NumberFormatException e)  //catches if the input is not a number
	    {
		new Message ("Please enter from the chooses above.");
	    }

	}

	speed ();
	timer ();
	if (pick == 1) //displays the first screensaver
	{
	    colourBars ();

	}
	if (pick == 2) //displays the second screensaver
	{
	    flower1 ();
	}

	if (pick == 3) //displays the third screensaver
	{
	    gamer ();

	}
	if (pick == 4) //displays the fourth screensaver
	{
	    para ();
	}

	if (pick == 5) //displays the fifth screensaver
	{
	    computer ();
	}

	if (pick != 1 || (pick != 2) || (pick != 3) || (pick != 4) || (pick != 5)) //if the chooses are not an of the above
	{
	    //new Message ("Please choose an option from above");
	}

	c.clear ();
	password ();
	exit ();

    }


    public void mainMenu ()  //method used to display the main menu options
    {

	c.setColor (orange); //sets colour
	c.fillRect (0, 0, 640, 500);
	c.setColor (black); //sets colour
	c.setFont (new Font ("Times New Roman", Font.BOLD, 28)); //sets font style
	c.drawString ("What would you like to do ?", 180, 150);
	c.setFont (new Font ("Times New Roman", Font.PLAIN, 20)); //sets font style
	c.drawString ("1/ Introduction", 200, 200);
	c.drawString ("2/ Continuing", 200, 230);
	c.drawString ("3/ Exit", 200, 260);


	while (true) //used to error trap the input
	{
	    try
	    {
		c.setCursor (1, 1); //sets the cursor to a new location
		c.drawString ("Please choose an option from above: ", 200, 300);
		c.setCursor (15, 63); //sets the cursor to a new location
		str1 = c.readLine (); //used to read the data from the user
		mainMenu = Integer.parseInt (str1); //converts from a string to an integer
		if (mainMenu == 1) //displays the introductions
		{
		    c.clear ();
		    intro ();
		    //askpreview ();
		    mainMenu ();
		    break;

		}
		else if (mainMenu == 2) //continues the program
		{
		    c.clear ();
		    askpreview (); //displays all the screensavers one by one
		    askpreview ();
		    askpreview ();
		    askpreview ();
		    chooseScreenSaver (); //calls screensaver
		    break;
		}
		else if (mainMenu == 3) //goes to the exit
		{
		    c.clear ();
		    goodBye ();
		    break;
		}
		else //displays the error message if it's not an of the options
		{
		    new Message ("Please enter an option from above");
		    c.clear ();
		    mainMenu ();
		}
		break;

	    }
	    catch (NumberFormatException e)  //error traps if it not an number
	    {
		new Message ("Please enter from the options above");
	    }

	}

    }


    public void exit ()  //method used to execute the exit screen
    {
	char choice; //whether you would like to exit or not
	c.setColor (yellow2); //sets colour
	c.fillRect (0, 0, 640, 500);
	c.setFont (new Font ("Arial Black", Font.BOLD, 50)); //sets the font style
	c.setColor (red); //sets colour
	c.drawString ("EXIT", 280, 100);
	c.setFont (new Font ("Times New Roman", Font.BOLD, 28)); //sets the font style
	c.setColor (black); //sets colour
	c.drawString ("Would you like to exit the program?", 140, 200);
	c.setFont (new Font ("Times New Roman", Font.PLAIN, 20)); //sets the font style
	c.drawString ("If yes, please press 'y' or else press 'n' for no", 180, 230);
	choice = c.getChar (); //gets the user input from the user
	if (choice == 'y') //goes to the goodbye screen
	{
	    c.clear ();
	    goodBye ();
	}
	else if (choice == 'n') //goes back to the introdution
	{
	    c.clear ();
	    title ();
	    intro ();
	    askpreview ();
	    askpreview();
	    askpreview();
	    askpreview();      
	    chooseScreenSaver ();

	}
	else //displays an error message
	{
	    new Message ("Please choose 'y' or 'n'");
	    c.clear ();
	    exit ();
	}
    }


    public void askpreview ()  //method used displays the scrensaver
    {

	String str1; // used for error trapping
	int pick; //used to pick the screen saver
	c.setColor (yellow); //sets color
	c.fillRect (0, 0, 640, 500);
	c.setFont (new Font ("Times New Roman", Font.PLAIN, 20)); //sets font
	c.setColor (black);
	c.drawString ("Please choose the screensaver from the choices below.", 125, 100);
	c.drawString ("1/ Color bars", 280, 140);
	c.drawString ("2/ Abstract tree", 280, 170);
	c.drawString ("3/ Game controller", 280, 200);
	c.drawString ("4/ Parachute", 280, 230);
	c.drawString ("5/ Computer", 280, 260);
	c.setFont (new Font ("Times New Roman", Font.ITALIC, 30)); //sets font
	c.drawString ("PREVIEW", 270, 50);

	while (true)
	{
	    try
	    {
		c.setCursor (1, 1); //sets cursor
		c.setFont (new Font ("Times New Roman", Font.PLAIN, 18)); //set the font
		c.drawString ("Please enter the screensaver that you would like to preview: ", 60, 300);

		c.setCursor (15, 63); //sets cursor
		str1 = c.readLine ();
		pick = Integer.parseInt (str1); //converts from a string to a integer
		break;
	    }
	    catch (NumberFormatException e)  //error traps if the data is not a number
	    {
		new Message ("Please enter from the chooses above.");
	    }

	}


	if (pick == 1) // previews the first screensaver
	{
	    c.clear ();
	    previewColorBars ();
	    PauseProgram ();

	}
	if (pick == 2) // previews the second screensaver
	{

	    c.clear ();
	    previewAbstractTree ();
	    PauseProgram ();
	}
	if (pick == 3) // previews the third screensaver
	{

	    c.clear ();
	    previewGamer ();
	    PauseProgram ();
	}
	if (pick == 4) // previews the forth screensaver
	{
	    c.clear ();
	    previewPara ();
	    PauseProgram ();
	}
	if (pick == 5) // previews the fifth screensaver
	{
	    c.clear ();
	    previewComputer ();
	    PauseProgram ();
	}

	else
	{
	}
    }


    public void PauseProgram ()  //asks user to come back to the previews
    {
	char any;
	any = c.getChar ();
	if (any != 'c')
	{

	}
	else
	{

	}

    }


    public void previewColorBars ()  //method used to preview the display the forst screensaver
    {
	Image picture = Toolkit.getDefaultToolkit ().getImage ("colourBars2.gif"); //imports image
	MediaTracker tracker = new MediaTracker (new Frame ());
	tracker.addImage (picture, 0); //dispalys the image
	try
	{
	    tracker.waitForAll ();
	}
	catch (InterruptedException e)
	{
	}
	c.drawImage (picture, 50, 0, null); //draws the picture on the screen
    }


    public void previewAbstractTree ()  //method used to preview the display the second screensaver
    {
	Image picture = Toolkit.getDefaultToolkit ().getImage ("abstractTree.png"); //imports image  of the abstract tree
	MediaTracker tracker = new MediaTracker (new Frame ());
	tracker.addImage (picture, 0);
	try
	{
	    tracker.waitForAll (); //dispalys the image
	}
	catch (InterruptedException e)
	{
	}
	c.drawImage (picture, 150, 50, null); //draws the picture on the screen
    }


    public void previewGamer ()  //method used to preview the display the third screensaver
    {
	Image picture = Toolkit.getDefaultToolkit ().getImage ("gamer.png"); //imports image  of the game console
	MediaTracker tracker = new MediaTracker (new Frame ());
	tracker.addImage (picture, 0);  //dispalys the image for the game console
	try
	{
	    tracker.waitForAll ();
	}
	catch (InterruptedException e)
	{
	}
	c.drawImage (picture, 0, 0, null); //draws the picture on the screen
    }


    public void previewPara ()  //method used to preview the display the fourth screensaver
    {
	Image picture = Toolkit.getDefaultToolkit ().getImage ("para.png"); //imports image  of the game console
	MediaTracker tracker = new MediaTracker (new Frame ()); //dispalys the image for the game console
	tracker.addImage (picture, 0);
	try
	{
	    tracker.waitForAll ();
	}
	catch (InterruptedException e)
	{
	}
	c.drawImage (picture, 50, 10, null); //draws the picture on the screen
    }


    public void previewComputer ()  //method used to preview the display the fifth screensaver
    {
	Image picture = Toolkit.getDefaultToolkit ().getImage ("computer.png"); //imports image  of the game console
	MediaTracker tracker = new MediaTracker (new Frame ());
	tracker.addImage (picture, 0); //dispalys the image for the of the parachute console
	try
	{
	    tracker.waitForAll ();
	}
	catch (InterruptedException e)
	{
	}
	c.drawImage (picture, 50, 10, null);   //draws the picture on the screen
    }



    public void goodBye ()  //method used to display the the goodbye screen
    {
	c.setColor (green3); //sets the color
	c.fillRect (0, 0, 640, 500);
	c.setFont (new Font ("Arial Black", Font.BOLD, 25)); //sets the font style
	c.setColor (white); //sets the color
	c.setFont (new Font ("Arial Black", Font.PLAIN, 25)); //sets the font style
	c.drawString ("Thank you for using the program", 100, 180);
	c.setColor (yellow2); //sets the color
	c.drawString ("Good bye! ", 250, 240);
	c.setColor (green2); //sets the color
	c.drawString ("By: Rutwa Engineer", 200, 350); //sets the font style
    }



    public void password ()  //method used to display the the password
    {
	c.setColor (purple2); //sets the color
	c.fillRect (0, 0, 640, 500);
	c.setFont (new Font ("Arial", Font.BOLD, 40)); //sets the font style
	c.setColor (green2); //sets the color
	c.drawString ("Guest", 280, 160);
	c.setColor (white); //sets the color
	c.fillRect (300, 200, 80, 80);
	c.setColor (white); //sets the color
	c.drawRect (290, 190, 100, 100);
	c.setColor (yellow2); //sets the color
	c.fillOval (305, 205, 70, 70);
	c.setColor (black); //sets the color
	c.drawOval (305, 205, 70, 70);
	c.fillOval (320, 230, 10, 10);
	c.fillOval (350, 230, 10, 10);
	c.setColor (green2); //sets the color
	c.setFont (new Font ("Times New Roman", Font.BOLD, 14)); //sets the font style
	c.drawString ("Note: The password entered is saved in 'password.txt' file", 150, 425);
	c.setColor (red); //sets the color
	c.fillArc (320, 230, 40, 40, -180, 180);
	c.setFont (new Font ("Times New Roman", Font.BOLD, 30)); //sets the font style
	c.setColor (yellow2); //sets the color
	c.drawString ("Please enter password: ", 200, 325);
	c.setColor (white); //sets the color
	c.fillRect (270, 350, 150, 50);
	c.setCursor (19, 38);
	writeFile ();

    }


    public void writeFile ()  //used to display the password to a text file
    {
	password = c.readLine (); //reads the password

	try
	{
	    output = new PrintWriter (new FileWriter ("password.txt")); //saves in a file called password.txt

	    output.println ("Your password is: " + password); //output of the password
	    output.close ();
	}


	catch (IOException e)
	{
	}
    }


    public void writeFile2 ()  //used to display the speed to a text file
    {
	speed = c.readInt (); //reads the speed of the screensaver

	try
	{
	    output = new PrintWriter (new FileWriter ("speed.txt")); //saves in a file called speed.txt
	    output.println ("Your speed of execution is " + speed + " of a millisecond."); //output of the speed
	    output.close ();
	}


	catch (IOException e)
	{
	}
    }


    public void writeFile3 ()  //used to display the timer to a text file
    {
	time = c.readDouble (); //reads the timer of the screensaver

	try
	{
	    output = new PrintWriter (new FileWriter ("time.txt")); // saves in a file called time.txt
	    output.println ("Your time of execution is" + time + "minutes"); //output of the timer
	    output.close ();
	}


	catch (IOException e)
	{
	}
    }


    public void writeFile4 ()  //used to display the screensaver to a text file
    {
	pick = c.readInt (); //reads which screensaver is displayed

	try
	{
	    output = new PrintWriter (new FileWriter ("screensaver.txt")); // saves in a file called screensaver.txt
	    output.println ("You picked screensaver #" + pick + "."); //output the screensaver #
	    output.close ();
	}


	catch (IOException e)
	{
	}
    }


    public void colourBars ()  //used to display the first screensaver
    {
	colourBars g = new colourBars (speed, time, c); //links the thread + passes parameters
	KeyPress k = new KeyPress (c); //disrupts the screensaver
	Thread thr = new Thread (k);
	Thread colour = new Thread (g);
	thr.start ();
	colour.start ();
	time = time * 60000; //sets the timer to a minute
	while (timer < time)
	{
	    try
	    {
		Thread.sleep (1);
		timer++;
		if (k.pressed ()) //goes to the password
		    break;
	    }
	    catch (Exception e)
	    {
	    }
	}
	colour.stop ();

    }


    public void flower1 ()  //used to display the second screensaver

    {
	flower1 b = new flower1 (speed, time, c); //links the thread + passes parameters
	KeyPress k = new KeyPress (c);  //disrupts the screensaver
	Thread thr = new Thread (k);
	Thread flower = new Thread (b);
	thr.start ();
	flower.start ();
	time = time * 60000; //sets the timer to a minute
	while (timer < time)
	{
	    try
	    {
		Thread.sleep (1);
		timer++;
		if (k.pressed ()) //goes to the password
		    break;
	    }
	    catch (Exception e)
	    {
	    }
	}
	flower.stop ();
    }


    public void gamer ()  //used to display the third screensaver
    {

	gamer h = new gamer (speed, time, c); //links the thread + passes parameters
	KeyPress k = new KeyPress (c); //disrupts the screensaver
	Thread thr = new Thread (k);
	Thread gamer = new Thread (h);
	thr.start ();
	gamer.start ();
	time = time * 60000; //sets the timer to a minute
	while (timer < time)
	{
	    try
	    {
		Thread.sleep (1);
		timer++;
		if (k.pressed ()) //goes to the password
		    break;
	    }
	    catch (Exception e)
	    {
	    }
	}
	gamer.stop ();
    }


    public void para ()  //used to display the fourth screensaver
    {
	para p = new para (speed, time, c); //links the thread + passes parameters
	KeyPress k = new KeyPress (c); //disrupts the screensaver
	Thread thr = new Thread (k);
	Thread para = new Thread (p);
	thr.start ();
	para.start ();
	time = time * 60000; //sets the timer to a minute
	while (timer < time)
	{
	    try
	    {
		Thread.sleep (1);
		timer++;
		if (k.pressed ()) //goes to the password
		    break;
	    }
	    catch (Exception e)
	    {
	    }
	}
	para.stop ();
    }


    public void computer ()  //used to display the fifth screensaver
    {
	computer v = new computer (speed, time, c); //links the thread + passes parameters
	KeyPress k = new KeyPress (c); //disrupts the screensaver
	Thread thr = new Thread (k);
	Thread computer = new Thread (v);
	thr.start ();
	computer.start ();
	time = time * 60000; //sets the timer to a minute
	while (timer < time)
	{
	    try
	    {
		Thread.sleep (1);
		timer++;
		if (k.pressed ()) //goes to the password
		    break;
	    }
	    catch (Exception e)
	    {
	    }
	}
	computer.stop ();
    }



    public void speed ()  //method is used to asks the user to for the speed of the screensaver
    {

	while (true) //used to error trap
	{
	    try
	    {
		c.setCursor (17, 64);
		c.setFont (new Font ("Times New Roman", Font.PLAIN, 18));
		c.setColor (black);
		c.drawString ("Please determine the speed of the screensaver (eg. 1 = fast): ", 60, 330);
		writeFile2 ();
		c.setCursor (17, 64);
		str1 = c.readLine ();
		speed = Integer.parseInt (str1);
		break;
	    }
	    catch (NumberFormatException e)  //error traps if the data is not a number
	    {
		new Message ("Please enter a number");
	    }

	}


    }


    public void timer ()  //method is used to asks the user to for the time of execution of the screensaver
    {

	while (true)
	{
	    try
	    {
		c.setCursor (18, 54);
		c.setFont (new Font ("Times New Roman", Font.PLAIN, 18));
		c.setColor (black);
		c.drawString ("Please determine the time of the execution (mins): ", 60, 360);
		writeFile3 ();
		c.setCursor (18, 54);
		str1 = c.readLine ();
		time = Double.parseDouble (str1);

		break;
	    }
	    catch (NumberFormatException e)  //error traps if the data entered is not a number
	    {

		new Message ("Please enter a number for the time in minutes");

	    }

	}
    }


    private void pauseProgram ()  //method waits for the user to continue
    {


	char any;
	c.setFont (new Font ("Arial", Font.BOLD, 23));
	c.setColor (purple);
	c.drawString ("Please press any key to continue...", 150, 400);
	any = c.getChar ();

    }


    public static void main (String[] args)

    {
	ScreenSaverFinal f = new ScreenSaverFinal ();

	f.title ();
	f.box ();
	f.mainMenu ();



    }
}
