package ie.tudublin;


import processing.core.PVector;

public class Radar
{
    
    private float x;
    private float y;
    private float diamater;
    private float rotation;
    private PVector pos;
    UI ui;
    private float radius;

    public Radar(UI ui, float x, float y, float diamater)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diamater = diamater;
        pos = new PVector(x, y);
        radius = diamater / 2;
        
    }

    public void render()
    {
        //ui.translate(x, y);
        ui.ellipse(x + 650, y + 625, diamater, diamater);
        ui.line(x + 650, y + 625, 700, 725);
    }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the diamater
     */
    public float getDiamater() {
        return diamater;
    }

    /**
     * @param diamater the diamater to set
     */
    public void setDiamater(float diamater) {
        this.diamater = diamater;
    }

    /**
     * @return the rotation
     */
    public float getRotation() {
        return rotation;
    }

    /**
     * @param rotation the rotation to set
     */
    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    /**
     * @return the pos
     */
    public PVector getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(PVector pos) {
        this.pos = pos;
    }

    /**
     * @return the ui
     */
    public UI getUi() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUi(UI ui) {
        this.ui = ui;
    }

    /**
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    

    



}