package create_factory.factorymethod;

import create_factory.simplefactory.IRuleConfigParser;

public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
