# SciFi UI Project

Name: James Behan

Student Number: C17348016

Fork this repository and use it a starter project for your assignment

# Description of the assignment

It is a simple design of how a spaceship UI would work and look 

# Instructions

Use the WASD keys to move the space ship in he direction you want to go.

Press the button to go into warp.

# How it works

To get the project to work i had to create 7 class.

These classes are: 
- Design 
- Flight Controls  
- Orientation 
- Radar 
- Ui 
- Warp 
- Stars 

Design

The design class is the most basic of the classes. It created the initial layout of the ship eg where the control panels and screen will be. 

Flight controls 

The flight controls class is one of the most important classes within the project. It lets the user to control how the ship moves and where it is looking. Without this class the ship wouldn’t know how fast it was going and which engines it was using.

It uses a for loop which changes the height of the line by increasing or decreasing the line when the user hits the W or S key.  

Orientation  

The orientation class is what lets the user know what direction they are facing in degrees. Without this class the user would get disorientated and not know what direction they were facing.

This class uses the rotate method to allow a line to move within a circle. The translate method is also used here to keep the spinning line within the circle by using PVectors. The push and pop matrix’s are also very important here as they contain the PVectors to the line within the circle. Without the push an pop matrix’s every object would be rotating around the PVectors point. 
The line that moves is controlled by the A and D keys. When the user presses the A key they start turning left so the orientation compass will move the line leftwards so the user doesn’t get disorientated. This is the same for when the user presses the D key but goes right instead of left

Radar 

The radar class is a constant moving line that is meant to tell the user when an approaching object is close by. 

Similar to the orientation class it uses a rotating line but it doesn’t require user input to move. This line will continue to move no matter what input the user puts in. 

UI

The UI class is where all the other classes get instantiated. Without this class no other class would run. In this class each class is declared and given there set values. This is also where each class gets drawn. 

Warp 

The warp class is where a button called warp is created. This allows the user to enter a warp mode and travel faster across long distances. 

It uses a for loop which checks where the users mouse is and when the users mouse is within the button box and they click it will print out a massage saying the ships war has been activated. 

Stars

This is what creates the stars the user sees outside the ship. When the ship moves left or right so do the stars. A for loop is used to do this so when the user presses the A or D keys the stars will move left or right depending on what key has been pressed. 


# What I am most proud of in the assignment

The thing that i am most proud of from this assignment is being able to use most things that have been thought throughout the course in a nice and simplstic way to create something that i can say is mine and not someone elses work. it also helped me understand some concepts such that the order in which classes get displayed matter as if they are in the wrong order certain classes will overlap another and not be visable. Without the use of the push and pop matrix almost everything will get controled by the rotion method cause more trouble then needs be. Even though i had trouble here and there with certain things i has fun creating this UI which made it okay to have some troubles.   

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

