package ie.tudublin;



public class FlightControls
{
    
    private float b;
    private float a;
    private float width;
    private float height;
    UI ui;

    


    public FlightControls(UI ui, float a, float b, float width, float height)
    {
        this.ui = ui;
        this.a = a;
        this.b = b;
        this.width = width;
        this.height = height;
        
        
    }
    int value = 0;
    public void render()
    {
        ui.rect(50  , 600, 150, 150);
        ui.line(125, 600, 125, 750); 
        ui.line(50, a + 700, 125, a + 700);
        ui.line(125, b + 700, 200, b + 700);
    }

    public void update()
    {
        if (ui.checkKey('a'))
		{
			
            a += 5;
            b -= 5;
            
            
        
        }

        if (ui.checkKey('d'))
        {
            a -= 5;
            b += 5;
        }

        if (ui.checkKey('w'))
        {
            
            a -= 5;
            b -= 5;
        }

        if (ui.checkKey('s'))
        {
            if(b < 700)
            {
                
                a += 5;
                b += 5;
            }
            
                
                
            
        }
        
        
    }

   

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @return the a
     */
    public float getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(float a) {
        this.a = a;
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