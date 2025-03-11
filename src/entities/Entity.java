package src.entities;

public abstract class Entity {
    protected float x, y; // protected = only class that extends to this can use x and y
    public Entity(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
