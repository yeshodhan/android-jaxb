package com.mickoo.xml.xsd2simplexml;

import org.apache.commons.cli.*;

import java.io.File;

/**
 * Main Class
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.0
 */

public class Main {

    public static void main(String[] args) throws Exception {

        HelpFormatter formatter = new HelpFormatter();
        String headerFooter = "---------------------------------------------------------------------";

        Options options = new Options();
        options.addOption("d", "destination", true, "destination directory for generated classes");
        options.addOption("p", "package", true, "package name for generated classes. Eg.: com.example.app");
        options.addOption("b", "bindings", true, "bindings JSON file");
        options.addOption("h", "help", false, "Help on usage");
        options.addOption("v", "version", false, "Version");

        if(args == null) {
            formatter.printHelp("android-jaxb", headerFooter, options, headerFooter);
            System.exit(1);
        }

        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);


        if(commandLine.hasOption("h")) {
            formatter.printHelp("android-jaxb", headerFooter, options, headerFooter);
            System.exit(0);
        }

        if(commandLine.hasOption("v")) {
            System.out.println("Android JAXB v1.0");
            System.exit(0);
        }

        if(commandLine.getOptions().length == 0) {
            formatter.printHelp("android-jaxb", headerFooter, options, headerFooter);
            System.exit(1);
        }

        String destinationDirPath = commandLine.getOptionValue("d");
        String packageName = commandLine.getOptionValue("p");
        String bindingsFilePath = commandLine.getOptionValue("b");
        String xmlSchemaPath = commandLine.getOptionValue("xsd");
        if(Utils.isEmpty(xmlSchemaPath)) xmlSchemaPath = commandLine.getArgs()[0];

        File destinationDir = new File(destinationDirPath);
        if (!destinationDir.exists()) {
            destinationDir.mkdirs();
        }

        File bindingsFile = null;
        if (!Utils.isEmpty(bindingsFilePath)) {
            bindingsFile = new File(bindingsFilePath);
        }

        File xmlSchema = null;
        if (!Utils.isEmpty(xmlSchemaPath)) {
            xmlSchema = new File(xmlSchemaPath);
        }

        if (!xmlSchema.exists()) {
            formatter.printHelp("android-jaxb", options);
            System.exit(1);
        }

        SchemaParser schemaParser = new SchemaParser(xmlSchema, destinationDir, packageName, bindingsFile);
        schemaParser.parse();

    }

}
