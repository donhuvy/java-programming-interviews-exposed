//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.28 at 11:31:51 AM BST 
//


package com.wiley.javainterviewsexposed.chapter15.generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wiley.javainterviewsexposed.chapter15.generated package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wiley.javainterviewsexposed.chapter15.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Team }
     * 
     */
    public Team createTeam() {
        return new Team();
    }

    /**
     * Create an instance of {@link Team.Players }
     * 
     */
    public Team.Players createTeamPlayers() {
        return new Team.Players();
    }

    /**
     * Create an instance of {@link Team.Players.Player }
     * 
     */
    public Team.Players.Player createTeamPlayersPlayer() {
        return new Team.Players.Player();
    }

}
