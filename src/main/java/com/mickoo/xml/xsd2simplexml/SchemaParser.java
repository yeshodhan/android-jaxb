package com.mickoo.xml.xsd2simplexml;

import org.ow2.easywsdl.schema.api.Element;
import org.ow2.easywsdl.schema.api.Schema;
import org.ow2.easywsdl.schema.api.SchemaException;
import org.ow2.easywsdl.schema.api.SchemaReader;
import org.ow2.easywsdl.schema.impl.SchemaReaderImpl;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * com.mickoo.xml.xsd2simplexml
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@tp-link.com)
 * @version 1.0
 * @since 1.0
 */
public class SchemaParser {

    /**
     * Supports single XML Schema file as of now. Will support multiple XML Schemas in later releases.
     * @param file
     */
    public SchemaParser(File file) throws ParserConfigurationException, IOException, SAXException, SchemaException {

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(file);
        doc.getDocumentElement().normalize();
        SchemaReader schemaReader = new SchemaReaderImpl();
        Schema schema = schemaReader.readSchema(doc);
        for(Element element : schema.getElements()) {

        }
    }

}
