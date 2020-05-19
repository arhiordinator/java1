package three;

import java.sql.Struct;

public class obstacle {
    String name;
    int parameter;

    public obstacle(String name, int parameter) {
        this.name = name;
        this.parameter = parameter;
        //this.Jump = Jump;
    }

    public void PutMeInArray(three.obstacle[] obstacles, int arrayIndex) {
        obstacles[arrayIndex] = this;
    }
}
