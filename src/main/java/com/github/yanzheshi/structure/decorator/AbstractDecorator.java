package com.github.yanzheshi.structure.decorator;

/**
 * 抽象装饰者
 * @author shiyanzhe
 */
public class AbstractDecorator extends AbstractComponent {

    private AbstractComponent component = null;

    public AbstractDecorator(AbstractComponent abstractComponent) {
        this.component = abstractComponent;
    }


    /**
     * 委托给被修饰者执行
     */
    @Override
    public void operate() {
        component.operate();
    }
}
