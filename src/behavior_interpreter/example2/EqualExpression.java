package behavior_interpreter.example2;

import java.util.Map;

public class EqualExpression implements Expression {

    public EqualExpression(String strExpr) {
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        return false;
    }
}
