package create_factory.abstractfactory;

import create_factory.simplefactory.IRuleConfigParser;

public interface IConfigParserFactory {

    IRuleConfigParser createRuleParser();

    ISystemConfigParser createSystemParser();
    //此处可以扩展新的parser类型，比如IBizConfigParser
}
