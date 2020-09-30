package create_factory.abstractfactory;

import create_factory.simplefactory.IRuleConfigParser;
import create_factory.simplefactory.XmlRuleConfigParser;

public class XmlConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new XmlSystemConfigParser();
    }
}
// 省略YamlConfigParserFactory和PropertiesConfigParserFactory代码