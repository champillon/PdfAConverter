package pdfbox;

/**
 * Convert file input from PDF to PDF/A-3
 * 
 * @author ETDA
 *
 */

public class Convert {

	/**
	 * Input argument with full path of file.
	 * 
	 * 
	 * @param args[input
	 *            file name, embed file name, color profile name, output file
	 *            name, document type, document file name, document version]
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		/**** Sample Input ****/
		/*String inputFilePath = "src/main/resources/sample.pdf";
		String embbedFilePath = "src/main/resources/ETDA-invoice.xml";
		String colorProfilePath = "src/main/resources/sRGB Color Space Profile.icm";
		String outputFilePath = "target/success.pdf";
		String documentType = "Tax Invoice";
		String docFileName = "ETDA-invoice.xml";
		String docVersion = "2.0";*/
		
		String inputFilePath = args[0];
		String embbedFilePath = args[1];
		String colorProfilePath = args[2];
		String outputFilePath = args[3];
		String documentType = args[4];
		String docFileName = args[5];
		String docVersion = args[6];
		PDFA3Components pdfa3Components = new PDFA3Components(inputFilePath, embbedFilePath, colorProfilePath,
				outputFilePath, documentType, docFileName, docVersion);

		ConvertPDFtoA3.Convert(pdfa3Components);
	}
}
