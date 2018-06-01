package com.github.yanzheshi.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shiyanzhe
 */
public class Composite extends Component {
    //构件容器
    private List<Component> components = new ArrayList<>();


    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public List<Component> getChildren() {
        return components;
    }
}
