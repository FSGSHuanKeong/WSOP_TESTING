package wsop;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.mail.MessagingException;
import javax.mail.internet.MimeUtility;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.ws.axis2.DocumalWebServiceStub;

import struct.xsd.AutInfo;
import struct.xsd.DocAttData;
import struct.xsd.DocData;
import struct.xsd.DocInfo;
import struct.xsd.DocKey;
import struct.xsd.FlwActKey;
import struct.xsd.FlwKey;
import struct.xsd.LogKey;

/**
 * Servlet implementation class StartWSOP
 */
public class StartWSOP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String URL_ENDPOINT = "http://192.9.230.168:80/dsewsop/services/DocumalWebService.DocumalWebServiceHttpEndpoint/";
	
	// 1st commit
	String a = "";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartWSOP() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar calStart = Calendar.getInstance();
		System.out.println("START: " + dateFormat.format(calStart.getTime()));
		
		for (int i = 1; i <= 10; i++) {
			try {
	            DocumalWebServiceStub stubPWS = getStubPWS();
	            
	            AutInfo autInfo = new AutInfo();
	            
	            autInfo.setUsrLgcd("SystemAdmin");
	            autInfo.setUsrPass("SystemAdmin");
	            
	            // System.out.println(autInfo.getUsrLgcd() + " - " + autInfo.getUsrPass());
	            LogKey logKey = stubPWS.getLogKey(autInfo);
	            
	            //if LogKey not null means login successfully
	            System.out.println("\n" + i + " Log Key: " + logKey.getWslCode());
	            
	            // DSE
	            String EXISTS_CAT_CODE = "CF200800000261"; // Folder Code
	            String EXISTS_FLW_MCOD = "FM200800000061"; // Flow Code
	            
	            // TKS
	            // String EXISTS_CAT_CODE = "CF200800000301"; // Folder Code
	            // String EXISTS_FLW_MCOD = "FM200800000141"; // Flow Code
	            
	            FlwKey flwKey = stubPWS.doCreateFlw(autInfo, logKey, EXISTS_CAT_CODE, EXISTS_FLW_MCOD);
	            
//	            if(flwKey == null) {
//	                throw new IllegalArgumentException("doCreateFlw error. Please check folder authority security.");
//	            }
	            
	            DocInfo[] docInfos = stubPWS.getDocListByFlw(autInfo, flwKey);
	            DocKey docKey = docInfos[0].getDocKey();
	            
	            DocInfo docInfo = stubPWS.getDocInfo(autInfo, docKey);
	            
	            System.out.println("Doc Code = " + docInfos[0].getDocKey().getComCode());
	            docKey.setComCode(docInfos[0].getDocKey().getComCode());
	            docKey.setComEdin(docInfos[0].getDocKey().getComEdin());
	            
	            DocData docData = stubPWS.getDocData(autInfo, docKey);
	            
	            DocAttData[] docAttData = stubPWS.getDocAttDataList(autInfo, docKey);
	            
	            docData.getTextValue()[0] = "" + i;
	            docData.getTextValue()[1] = "" + i;
	            
	            File file = new File("C:\\testing.pptx"); // 200KB
	            
	            BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
	            
	            int size = Integer.parseInt((String.valueOf(file.length())));
	            byte[] retBytes = new byte[size];
	            
	            try{
	                in.read(retBytes, 0 , size);
	            } finally {
	                if (in != null){
	                    in.close();
	                }
	            }
	            
	            docAttData[0].setFileBinaryBase64(encodeBase64(retBytes));
	            docAttData[0].setAttFnam("WSOP_TESTING_" + i + ".csv");
	            docAttData[0].setAttNamm(docAttData[0].getAttFnam());
	            docAttData[0].setAttFsiz(String.valueOf(retBytes.length));
	            
	            stubPWS.setDocData(autInfo, docKey, docInfo, docData, docAttData);

	            //doRequest start
	            FlwActKey flwActKey = new FlwActKey();
	            
	            flwActKey.setComCode(flwKey.getComCode());
	            flwActKey.setAcbNumb("1");
	            flwActKey.setActNumb("1");
	            
	            String comment = "";
	            stubPWS.doRequest(autInfo, logKey, flwActKey, comment);
	            //doRequest end
	            
	            //edited by kai end                         
	        } catch (RemoteException e) {
	        	e.printStackTrace();
	        } catch (Exception e) {
	        	e.printStackTrace();
	    	}
		}
		
		Calendar calEnd = Calendar.getInstance();
		System.out.println("\nEND: " + dateFormat.format(calEnd.getTime()) + "\n");
		
		int totalSeconds = 0;
		int totalMinute = 0;
		int totalHour = 0;
		int seconds = 0;
		int minute = 0;
		int hour = 0;
		int day = 0;
		String totalTimeTaken = "";
		
		totalSeconds = (int) ((calEnd.getTimeInMillis() - calStart.getTimeInMillis()) / 1000);
		
		if (totalSeconds / 60 < 60) {
			seconds = totalSeconds;
		} else {
			seconds = totalSeconds % 60;
			totalMinute = totalSeconds / 60;
		}
		
		if (minute / 60 < 60) {
			minute = totalMinute;
		} else {
			minute = totalMinute % 60;
			totalHour = totalMinute / 60;
		}
		
		if (totalMinute / 60 < 24) {
			hour = totalHour;
		} else {
			hour = totalHour % 24;
			day = totalHour / 24;
		}
		
		totalTimeTaken = day + " day(s) " + hour + " hour(s) " + minute + " minute(s) " + seconds + " second(s)";
		
		System.out.println(totalTimeTaken);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Total time taken: " + totalTimeTaken + ".');");
		out.println("location='welcome.jsp';");
		out.println("</script>");
		out.close();
		
	}
	
	private static String encodeBase64(byte[] data) throws IOException, UnsupportedEncodingException, MessagingException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        OutputStream out = MimeUtility.encode(bao, "base64");
        out.write(data);
        out.close();
        return bao.toString("iso-8859-1");
    }
	
	private DocumalWebServiceStub getStubPWS() throws AxisFault {
        DocumalWebServiceStub stubPWS = null;
        
        if (URL_ENDPOINT == null){
            stubPWS = new DocumalWebServiceStub();
        } else {
            stubPWS = new DocumalWebServiceStub(URL_ENDPOINT);
        }
        
        stubPWS._getServiceClient().getOptions().setTimeOutInMilliSeconds(10000000);
        stubPWS._getServiceClient().getOptions().setProperty(org.apache.axis2.transport.http.HTTPConstants.HTTP_PROTOCOL_VERSION, org.apache.axis2.transport.http.HTTPConstants.HEADER_PROTOCOL_10);
        stubPWS._getServiceClient().getOptions().setProperty(HTTPConstants.CHUNKED, Boolean.FALSE);
        
        return stubPWS;
    }

}
