package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    //MovingCircle mc;
    Design design;
    Orientation orientation;
    FlightControls flight;
    Radar radar;
    Warp warp;

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
       // mc = new MovingCircle(this, width / 2, height / 2, 50);
        design = new Design(this, 50, 50, 50, 50);
        orientation = new Orientation(this, 0, 0, 200);
        flight = new FlightControls(this, 50, 50, 50, 50);
        radar = new Radar(this, 700, 650, 100);
        warp = new Warp(this, 300, 50, 100, 50, "WARP");
    }

    public void draw()
    {
        background(0);
        //b.render();

        //mc.update();
        //mc.render();

        design.render();
        
        //orientation.render();
        //orientation.update();

        flight.render();

        warp.render();

        radar.render();
        radar.update();

        orientation.render();
        orientation.update();

       // warp.render();


        
    }
}

