package create_factory.abstractfactory;

import create_factory.simplefactory.IRuleConfigParser;
import create_factory.simplefactory.JsonRuleConfigParser;

public class JsonConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}