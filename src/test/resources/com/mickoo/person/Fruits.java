
package com.mickoo.person;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "Fruits")
@Namespace(reference = "http://person.mickoo.com/")
public enum Fruits {

    Apple,
    Banana,
    Mango,
    Orange,
    Grapes,
    Watermelon,
    Peach,
    Apricot,
    Grapefruit;

}
