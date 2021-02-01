package pxp.api.utils.common;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Objects;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLConfig {
	private static final Logger LOGGER = LoggerFactory.getLogger(XMLConfig.class);

	private static Document doc;

	/**
	 * It will read the xml configuration from file.
	 * 
	 * @param root     : tag name from which you want to start
	 * @param tagName  : the exact tag name that you want to get
	 * @param filePath : optional (if you want to use other xml file)] e.g
	 *                 "src\test\resources\other.xml"
	 * @return value of requested tag
	 * @throws URISyntaxException
	 */
	public static String getConfig(String root, String tagName, String... filePath) {
		XMLConfig xmlConfig = new XMLConfig();
		String fileLocation = filePath.length == 0 ? xmlConfig.getFile("config/config.xml") : filePath[0];
		String value = null;
		try {
			File file = new File(fileLocation);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			if (Objects.isNull(doc)) {
				LOGGER.info("Parsing xml file : {}", fileLocation);
				doc = db.parse(file);
			}
			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getElementsByTagName(root);
			for (int itr = 0; itr < nodeList.getLength(); itr++) {
				Node node = nodeList.item(itr);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;
					value = eElement.getElementsByTagName(tagName).item(0).getTextContent();
				}
			}
		} catch (Exception e) {
			LOGGER.error("Error occurred while parsing or reading file : {}", e.getMessage());
			e.printStackTrace();
		}

		return value;
	}

	/** It will return the file path for any file within main/resources f
	 * @param fileName
	 * @return
	 */
	private String getFile(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource(fileName);
		String filePath = null;
		try {
			filePath = resource.toURI().getPath();
		} catch (URISyntaxException e) {
			LOGGER.error("Error while getting file name : ", e.getMessage());
			e.printStackTrace();
		}
		return filePath;

	}
}
