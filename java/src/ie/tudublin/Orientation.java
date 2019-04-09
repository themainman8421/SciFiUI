package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Orientation
{
    private float x;
    private float y;
		private float rotation;
		private PVector pos;
		private float diameter;
		private String text1;
		UI ui;
		private float radius;
		private String text2;
		private String text3;
		private String text4;


    public Orientation(UI ui, float x, float y, float diameter, String text1, String text2, String text3, String text4)
    {
      this.ui = ui;
      this.x = x;
			this.y = y;
			this.diameter = diameter;
			this.pos = new PVector(x, y);
			this.text1 = text1;
			this.text2 = text2;
			this.text3 = text3;
			this.text4 = text4;
			radius = diameter /2;

        
        
    }

    public void render()
    {
			//ui.pushMatrix();
			ui.translate(pos.x + ui.width / 2 , pos.y + 650);
			
			ui.ellipse(x, y, diameter, diameter);
			ui.pushMatrix();
			ui.rotate(rotation);
			ui.line(x, y, radius - 30, radius - 30);
			ui.popMatrix();
			ui.fill(0);
			ui.textAlign(PApplet.CENTER, PApplet.CENTER);
			ui.text(text1, x, y - radius - 10);
			ui.text(text2, x + radius + 10, y);
			ui.text(text3, x, y + radius + 10);
			ui.text(text4, x - radius - 10, y);
			//ui.popMatrix();
         
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


	/**
	 * @return the text1
	 */
	public String getText1() {
		return text1;
	}

	/**
	 * @param text1 the text1 to set
	 */
	public void setText1(String text1) {
		this.text1 = text1;
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
	 * @return the text2
	 */
	public String getText2() {
		return text2;
	}

	/**
	 * @param text2 the text2 to set
	 */
	public void setText2(String text2) {
		this.text2 = text2;
	}

	/**
	 * @return the text3
	 */
	public String getText3() {
		return text3;
	}

	/**
	 * @param text3 the text3 to set
	 */
	public void setText3(String text3) {
		this.text3 = text3;
	}

	/**
	 * @return the text4
	 */
	public String getText4() {
		return text4;
	}

	/**
	 * @param text4 the text4 to set
	 */
	public void setText4(String text4) {
		this.text4 = text4;
	}

	

	

    

}