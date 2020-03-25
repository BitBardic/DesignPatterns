package com.codewithnas.structural.adapter;

import com.codewithnas.structural.adapter.avaFilters.Caramel;
// Adapter Pattern implemented through Composition
public class CaramelFilter implements Filter{
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
