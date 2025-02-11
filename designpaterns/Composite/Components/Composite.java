package com.example.designpaterns.Composite.Components;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    String name;
    List<Component> components=new ArrayList<>();
    public  Composite(String name)
    {
        this.name=name;
    }
    public void addComponent(Component component)
    {
        components.add(component);
    }
    public void removeComponent(Component component)
    {
        components.remove(component);
    }
    @Override
    public void showPrice() {

        for(Component component:components)
        {
            component.showPrice();
        }

    }
}
