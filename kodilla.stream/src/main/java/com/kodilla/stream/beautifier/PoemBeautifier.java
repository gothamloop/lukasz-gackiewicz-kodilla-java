package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String upiekszacz, PoemDecorator poemDecorator){
        return poemDecorator.decorate(upiekszacz);
    }
}
