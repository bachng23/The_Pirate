package src.entities;

public abstract class Entity {
    protected float x, y; // protected = only class that extends to this can use x and y
    protected int width, height;
    public Entity(float x, float y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


}
