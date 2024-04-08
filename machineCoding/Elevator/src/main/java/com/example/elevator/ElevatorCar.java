package com.example.elevator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElevatorCar {

    private int id;
    private Door door;
    private Display display;
    private Button button;
    private int currFloorNumber;
    private Direction direction;

    public ElevatorCar(int id)
    {
        this.id=id;
        this.door=new Door();
        this.display=new Display();
        this.button=new InternalButton();
        this.currFloorNumber=0;
        this.direction=Direction.NONE;
    }

    public void pressButton(int floor)
    {
        Direction dir= Direction.NONE;
        if(floor>currFloorNumber)
            dir= Direction.UP;
        else if(floor<currFloorNumber)
            dir= Direction.DOWN;
        button.pressButton(floor, dir, id);
    }

    public void move(Direction dir, int floor)
    {
        System.out.println("Elevator " + id + "moving " + dir);
        System.out.println("Elevator " + id + "stops at floor " + floor);
        door.open(id);
        door.close(id);

        //called everytime when currFloor value changes
        setDisplay();

    }
    private void setDisplay()
    {
        display.setFloorNumber(currFloorNumber);
        display.setDirection(direction);

    }



}
