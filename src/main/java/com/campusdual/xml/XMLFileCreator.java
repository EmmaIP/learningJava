package com.campusdual.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XMLFileCreator {
    private static void createDocument() throws ParserConfigurationException, TransformerException {
        //generamos una factoría para crear objetos
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //factoría da un constructor de documentos que puede dar una excepción
        DocumentBuilder builder = factory.newDocumentBuilder();

        //el constructor genera el documento
        Document document = builder.newDocument();

        //creamos un elemento raiz de DOM
        Element root = document.createElement("computer");

        //de Document cuelga root y de root los demás componentes
        document.appendChild(root);
        Element components = document.createElement("components");
        root.appendChild(components);

        //genero el componente interior con su atributo y valor del atributo
        //Element component = document.createElement("component");
        //component.setAttribute("quantity", "1");
        //component.setTextContent("CPU");
        //components.appendChild(component);

        components.appendChild(createItem(document,"component","quantity", "1", "CPU"));
        components.appendChild(createItem(document,"component","quantity", "2", "RAM"));
        components.appendChild(createItem(document,"component","quantity", "3", "Fan"));
        components.appendChild(createItem(document,"component","quantity", "1", "Graphic card"));
        components.appendChild(createItem(document,"component","quantity", "1", "Mother board"));
        components.appendChild(createItem(document,"component","quantity", "2", "SSD"));
        components.appendChild(createItem(document,"component","quantity", "1", "Power supply"));
        components.appendChild(createItem(document,"component","quantity", "1", "Computer case"));

        writeToFile(document, "src/main/resources/computerList.xml");

    }

    private static void writeToFile(Document document, String pathFile) throws TransformerException {
        //creamos un transformador factoría
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();
        //le metemos propiedades al transformador, los espacios de indentación
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
        //donde queremos crear el documento
        File file = new File(pathFile);
        //lo pasamos a una fuente DOM
        DOMSource source = new DOMSource(document);
        //lo escribimos con un stream
        StreamResult result = new StreamResult(file);
        transformer.transform(source, result);
    }

    //aquí lo mismo de antes pero con un método
    private static Element createItem (Document document, String tagName, String attribute, String attValue, String textComponent) {

        Element component = document.createElement(tagName);
        component.setAttribute(attribute, attValue);
        component.setTextContent(textComponent);
        return component;
    }
    public static void main(String[] args) {
        try {
            XMLFileCreator.createDocument();
        } catch (ParserConfigurationException | TransformerException e) {
            throw new RuntimeException(e);
        }
    }


}
