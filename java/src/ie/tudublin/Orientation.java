package ie.tudublin;

import processing.core.PVector;

public class Orientation
{
    private float x;
    private float y;
	private float rotation;
	private PVector pos;
	private float diameter;
	
    UI ui;

    public Orientation(UI ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
		this.y = y;
		this.diameter = diameter;
		this.pos = new PVector(x, y);

        
        
    }

    public void render()
    {
		ui.pushMatrix();
		ui.translate(pos.x + ui.width / 2 , pos.y + 650);
		ui.rotate(rotation);
		ui.ellipse(x, y, diameter, diameter);
		ui.popMatrix();
         
    }

    public void update()
    {
		if (ui.checkKey('a'))
		{
			
			rotation -= 0.1f;
        }

        if (ui.checkKey('d'))
        {
            rotation += 0.1f;
        }
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
	 * @return the diameter
	 */
	public float getDiameter() {
		return diameter;
	}

	/**
	 * @param diameter the diameter to set
	 */
	public void setDiameter(float diameter) {
		this.diameter = diameter;
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