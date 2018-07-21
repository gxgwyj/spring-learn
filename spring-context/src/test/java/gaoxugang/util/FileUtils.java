package gaoxugang.util;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/10/13.
 */
public class FileUtils {
	public static InputStream  getInputStreamClassPath(String location){
		InputStream is;
		is = FileUtils.class.getClassLoader().getResourceAsStream(location);
		return is;
	}

	public static Document  getDoc(InputStream inputStream) throws Exception{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		return builder.parse(inputStream);
	}

	public static Document  getDoc(String location) throws Exception{
		InputStream inputStream = getInputStreamClassPath(location);
		return getDoc(inputStream);
	}

	public static String  xml2Str (Document document) throws Exception{
		//将xml文件内容用字符串的形式打印
		TransformerFactory tf   =   TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		ByteArrayOutputStream bos   =   new   ByteArrayOutputStream();
		t.transform(new DOMSource(document), new StreamResult(bos));
		String xmlStr = bos.toString();
		return xmlStr;
	}

	public static void main(String[] args) throws Exception{
		String path = "gaoxugang/context-simple.xml";
		Document doc = getDoc(path);
		String result = xml2Str(doc);
		System.out.println("xml content:");
		System.out.println(result);
	}

}
