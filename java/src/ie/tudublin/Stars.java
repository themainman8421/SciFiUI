package ie.tudublin;


public class Stars
{
    private float x;
    private float y;
    private float diameter;
    private float stars;
    UI ui;
    private float radius;

    public Stars(UI ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.stars = 20; 
        radius = diameter / 2;      
        
    }

    public void render()
    {
        

            for(int i = 0 ; i < 38 ; i ++)
		{
			for(int j = 0 ; j < 38 ; j ++)
			{
				float x = radius + (i * 21);
				float y = radius + (j * 21);
				ui.ellipse(x, y, diameter, diameter);
			}
		}
            
            
	

            
            
            
            
        
    }

    

    public void update()
    {
    
        if (ui.checkKey('a'))
		{
			
            x -= 0.1f;
            
        
        }

        if (ui.checkKey('d'))
        {
            x += 0.1f;
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