package ie.tudublin;

import processing.core.PApplet;

public class Orientation
{
    private float x;
    private float y;
    private float width;
    private float height;
    private float rotation;
    UI ui;

    public Orientation(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.rotation = rotation;
        
    }

    public void render()
    {
       ui.ellipse(x + 350, y + 650, 200, 200); 
    }

    public void updata()
    {

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
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
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

	

    

}