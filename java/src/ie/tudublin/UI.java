package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Design design;
    Orientation orientation;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        design = new Design(this, 50, 50, 50, 50);
        orientation = new Orientation(this, 50, 50, 50 ,50);
        }

    public void draw()
    {
        //background(0);
        //b.render();

        //mc.update();
        //mc.render();

        design.render();
        orientation.render();


        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

