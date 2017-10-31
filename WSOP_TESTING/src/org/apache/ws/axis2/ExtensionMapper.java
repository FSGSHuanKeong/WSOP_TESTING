
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */

            package org.apache.ws.axis2;
            /**
            *  ExtensionMapper class
            */
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "FlwActData".equals(typeName)){
                   
                            return  struct.xsd.FlwActData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "DocKey".equals(typeName)){
                   
                            return  struct.xsd.DocKey.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "RrfInfo".equals(typeName)){
                   
                            return  struct.xsd.RrfInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "LogInfo".equals(typeName)){
                   
                            return  struct.xsd.LogInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "AutInfo".equals(typeName)){
                   
                            return  struct.xsd.AutInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "FlwActKey".equals(typeName)){
                   
                            return  struct.xsd.FlwActKey.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "FlwData".equals(typeName)){
                   
                            return  struct.xsd.FlwData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "DocData".equals(typeName)){
                   
                            return  struct.xsd.DocData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "DocInfo".equals(typeName)){
                   
                            return  struct.xsd.DocInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "AutInfoCmp".equals(typeName)){
                   
                            return  struct.xsd.AutInfoCmp.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "FlwKey".equals(typeName)){
                   
                            return  struct.xsd.FlwKey.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "UsrInfo".equals(typeName)){
                   
                            return  struct.xsd.UsrInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "FlwAcbData".equals(typeName)){
                   
                            return  struct.xsd.FlwAcbData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "DocAttData".equals(typeName)){
                   
                            return  struct.xsd.DocAttData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "LogKey".equals(typeName)){
                   
                            return  struct.xsd.LogKey.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.apache.org/axis2".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  org.apache.ws.axis2.Exception.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://struct/xsd".equals(namespaceURI) &&
                  "FlwAcbKey".equals(typeName)){
                   
                            return  struct.xsd.FlwAcbKey.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    