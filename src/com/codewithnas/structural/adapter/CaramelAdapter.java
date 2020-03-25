package com.codewithnas.structural.adapter;

import com.codewithnas.structural.adapter.avaFilters.Caramel;
// Adapter Pattern implemented through Inheritance
public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
      init();
      render(image);
    }
}
