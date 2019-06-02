package MemoryDust.FileUtilities;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;

public class XMLRetriever {

    public NodeList fetchInfoFromXML(String tags){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        NodeList results = null;
        try {
            Document doc = factory.newDocumentBuilder().parse("./resources/CharacterDatabase.xml");
            XPath xpath = XPathFactory.newInstance().newXPath();
            results  = (NodeList) xpath.compile(tags).evaluate(doc, XPathConstants.NODESET);
        } catch (SAXException | ParserConfigurationException | IOException | XPathExpressionException e) {
            e.printStackTrace();
        }
        return results;
    }
}
