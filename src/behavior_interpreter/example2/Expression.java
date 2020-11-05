package behavior_interpreter.example2;

import java.util.Map;

public interface Expression {
    boolean interpret(Map<String, Long> stats);
}
