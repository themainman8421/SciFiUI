package ie.tudublin;


public class Stars
{
    private float x;
    private float y;
    private float diameter;
    //private float stars;
    UI ui;
    private float radius;

    public Stars(UI ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        //this.stars = 20; 
        radius = diameter / 2;      
        
    }

    public void render()
    {
        /*
        
            for(int i = 0 ; i < 38 ; i ++)
		{
			for(int j = 0 ; j < 38 ; j ++)
			{
                ui.fill(255);
				float x = radius + (i * 21);
                float y = radius + (j * 21);
				ui.ellipse(x, y, diameter, diameter);
			}
        }
        
        */
        
        ui.ellipse(x, y, diameter, diameter);
        ui.ellipse(x + 50, y + 40 , diameter, diameter);
        ui.ellipse(x + 150, y + 100, diameter, diameter);
        ui.ellipse(x + 100, y + 150, diameter, diameter);
        ui.ellipse(x - 50, y + 75, diameter, diameter);
        ui.ellipse(x - 75, y, diameter, diameter);
        ui.ellipse(x + 75, y + 10, diameter, diameter);
        ui.ellipse(x + 400, y, diameter, diameter);
        ui.ellipse(x - 200, y + 20, diameter, diameter);
        ui.ellipse(x + 350, y, diameter, diameter);
        ui.ellipse(x + 200, y + 10, diameter, diameter);
        ui.ellipse(x + 300, y + 20, diameter, diameter);
        ui.ellipse(x + 225, y + 125, diameter, diameter);
        ui.ellipse(x - 50, y, diameter, diameter);    
	}

    

    public void update()
    {
    
        if (ui.checkKey('a'))
		{
			
            x -= 5;
            
        
        }

        if (ui.checkKey('d'))
        {
            x += 5;
        }

        if (x < 0)
        {
            x = ui.width;
        }
        if (x > ui.width)
        {
            x = 0;
        }
        if (y < 0)
        {
            y = ui.height;
        }
        if (y > ui.height)
        {
            y = 0;
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