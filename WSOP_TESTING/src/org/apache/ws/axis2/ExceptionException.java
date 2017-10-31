
/**
 * ExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package org.apache.ws.axis2;

public class ExceptionException extends java.lang.Exception{
    
    private org.apache.ws.axis2.ExceptionE faultMessage;

    
        public ExceptionException() {
            super("ExceptionException");
        }

        public ExceptionException(java.lang.String s) {
           super(s);
        }

        public ExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.apache.ws.axis2.ExceptionE msg){
       faultMessage = msg;
    }
    
    public org.apache.ws.axis2.ExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    