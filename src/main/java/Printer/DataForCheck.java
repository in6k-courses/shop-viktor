package Printer;

import Order.Thing;

// Этот класс, только с более адекватным названием и полями, должен был стать тем,
// что бы попадало в карзину а потом и в сам чек.
public class DataForCheck {
    public DataForCheck(Thing thing){
        this.thing = thing;
        numOfThisThing = 1;
    }
    Thing thing;
    int numOfThisThing;
}
