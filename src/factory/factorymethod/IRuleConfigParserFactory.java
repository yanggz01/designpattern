package factory.factorymethod;

import factory.simplefactory.IRuleConfigParser;

public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
