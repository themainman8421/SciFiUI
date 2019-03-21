package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Radar extends PApplet
{
    private float pos;
    private float x;
    private float y;
    private float width;
    private float height;
    private float rotation;
    UI ui;

    public Radar(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        
    }



}