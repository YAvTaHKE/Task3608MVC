package main.view;

import main.controller.Controller;
import main.model.ModelData;

public interface View {

    void refresh (ModelData modelData);

    void setController(Controller controller);
}
