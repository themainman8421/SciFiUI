package ie.tudublin;



public class Design
{
    private float x;
    private float y;
    private float width;
    private float height;
    UI ui;

    public Design(UI ui, float x, float y, float height, float width)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        
    }

    public void render()
    {
        
        ui.ellipse(x + 350 , y + 800, x + 1200, y + 700 );
        ui.ellipse(x + 350, y, x + 1000, y + 300);
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