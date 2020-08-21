// package project3;

// import javax.xml.parser.*;
// import javax.xml.transform.*;
// import org.w3c.dom.*;
// import java.io.File;

// public class CreateXmlFileDemo{
//     public static void main(String[] args) {
//         try {
//             //membaut dockumen dengan favtory>buider>new document
//             DocumentBuilderFactory dbRactory = 
//             DocumentBuilderFactory.newInstance();
//             DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//             Document doc = dBuilder.newDocument();

//             //root element
//             Element rootElement = doc.createElement("cars");
//             doc.appendChild(rootElement);

//             //supercars element
//             Element supercacr = doc.createElement("cars");
//             doc.appendChild(rootElement);

//             //supercar element
//             Element supercar = doc.createElement("supercars");
//             rootElement.appendChild(supercar);

//             //setting attribute to element
//             Attr attr = doc.appendChild("company");
//             attr.setValue("Ferrari");
//             supercar.serAttributeNode(attr);

//             //carname element
//             Element carname = doc.createElement("carname");
//             Attr attrType = doc.createAttribute("type");// membuat object atribut attrType
//             attrType.setValue("formula one"); // mengisi niiali dari atributnya
//             carname.setAttributeNode(attrType); //set atrbut dalam carname
//             carname.appendChild(doc.createTextNode("Ferrari 101")); //membuat file anak yang berisi text node
//             supercar.appendChild(carname); //menaruh carname dalam supercar

//             Element carname1 = doc.createElement("carname");
//             Attr attrType1 = doc.createAttribute("type");
//             attrType1.setValue("sports");
//             carname1.setAttributeNode(attrType1);
//             carname1.appendChild(doc.createTextNode("Ferrari 202"));
//             supercar.appendChild(carname1);

//             // write the content into xml file
//             TransformerFactory transformerFactory = TransformerFactory.newInstance(); //membuat file transformerfactory
//             Transformer transformer = transformerFactory.newTransformer(); //
//             DOMSource source = new DOMSource(doc);
//             StreamResult result = new StreamResult(new File("cars.xml"));
//             transformer.transform(source, result);
            
//             // Output to console for testing
//             StreamResult consoleResult = new StreamResult(System.out);
//             transformer.transform(source, consoleResult);


//         } catch (Exception e) {
//             //TODO: handle exception
//             e.printStackTrace();
//         }
//     }

// }