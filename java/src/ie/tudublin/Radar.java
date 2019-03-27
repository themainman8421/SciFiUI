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
        ui.pushMatrix();
        ui.translate(pos.x, pos.y);
        ui.stroke(255);
        ui.ellipse(x , y , diamater, diamater);
        ui.rotate(rotation);
        ui.stroke(255);
        ui.line(x, y, radius, radius - 40);
        ui.stroke(1);
        ui.fill(255);
        ui.popMatrix();
    }

    public void update()
    {
        this.x = (float) Math.sin(rotation);
        this.y = - (float) Math.cos(rotation);
        rotation += 0.05f;
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

    

    



}