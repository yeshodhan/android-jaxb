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

    private  static HelpFormatter formatter = new HelpFormatter();
    private static  final String headerFooter = "---------------------------------------------------------------------";

    public static void main(String[] args) throws Exception {

        Options options = new Options();
        options.addOption("d", "destination", true, "destination directory for generated classes");
        options.addOption("p", "package", true, "package name for generated classes. Eg.: com.example.app");
        options.addOption("b", "bindings", true, "bindings JSON file");
        options.addOption("h", "help", false, "Help on usage");
        options.addOption("v", "version", false, "Version");

        if(args == null) {

            System.exit(1);
        }

        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);


        if(commandLine.hasOption("h")) {
            printUsage(options);
            System.exit(0);
        }

        if(commandLine.hasOption("v")) {
            System.out.println("Android JAXB v1.0");
            System.exit(0);
        }

        if(commandLine.getOptions().length == 0) {
            printUsage(options);
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
            printUsage(options);
            System.exit(1);
        }

        SchemaParser schemaParser = new SchemaParser(xmlSchema, destinationDir, packageName, bindingsFile);
        schemaParser.parse();

    }

    private static void printUsage(Options options) {
        formatter.printHelp("java -jar android-jaxb-1.0.jar <options> your-schema-file.xsd", headerFooter, options, headerFooter);
    }

}
