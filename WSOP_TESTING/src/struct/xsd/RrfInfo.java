
/**
 * RrfInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package struct.xsd;
            

            /**
            *  RrfInfo bean class
            */
        
        public  class RrfInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RrfInfo
                Namespace URI = http://struct/xsd
                Namespace Prefix = ns1
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://struct/xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for FlwActKey
                        */

                        
                                    protected struct.xsd.FlwActKey localFlwActKey ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFlwActKeyTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return struct.xsd.FlwActKey
                           */
                           public  struct.xsd.FlwActKey getFlwActKey(){
                               return localFlwActKey;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FlwActKey
                               */
                               public void setFlwActKey(struct.xsd.FlwActKey param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localFlwActKeyTracker = true;
                                       } else {
                                          localFlwActKeyTracker = true;
                                              
                                       }
                                   
                                            this.localFlwActKey=param;
                                    

                               }
                            

                        /**
                        * field for ProFlag
                        */

                        
                                    protected java.lang.String localProFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProFlagTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProFlag(){
                               return localProFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProFlag
                               */
                               public void setProFlag(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProFlagTracker = true;
                                       } else {
                                          localProFlagTracker = true;
                                              
                                       }
                                   
                                            this.localProFlag=param;
                                    

                               }
                            

                        /**
                        * field for ReqClas
                        */

                        
                                    protected java.lang.String localReqClas ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReqClasTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReqClas(){
                               return localReqClas;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReqClas
                               */
                               public void setReqClas(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReqClasTracker = true;
                                       } else {
                                          localReqClasTracker = true;
                                              
                                       }
                                   
                                            this.localReqClas=param;
                                    

                               }
                            

                        /**
                        * field for RrfDucd
                        */

                        
                                    protected java.lang.String localRrfDucd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRrfDucdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRrfDucd(){
                               return localRrfDucd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RrfDucd
                               */
                               public void setRrfDucd(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRrfDucdTracker = true;
                                       } else {
                                          localRrfDucdTracker = true;
                                              
                                       }
                                   
                                            this.localRrfDucd=param;
                                    

                               }
                            

                        /**
                        * field for RrfDunm
                        */

                        
                                    protected java.lang.String localRrfDunm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRrfDunmTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRrfDunm(){
                               return localRrfDunm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RrfDunm
                               */
                               public void setRrfDunm(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRrfDunmTracker = true;
                                       } else {
                                          localRrfDunmTracker = true;
                                              
                                       }
                                   
                                            this.localRrfDunm=param;
                                    

                               }
                            

                        /**
                        * field for RrfDyms
                        */

                        
                                    protected java.lang.String localRrfDyms ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRrfDymsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRrfDyms(){
                               return localRrfDyms;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RrfDyms
                               */
                               public void setRrfDyms(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRrfDymsTracker = true;
                                       } else {
                                          localRrfDymsTracker = true;
                                              
                                       }
                                   
                                            this.localRrfDyms=param;
                                    

                               }
                            

                        /**
                        * field for RrfPucd
                        */

                        
                                    protected java.lang.String localRrfPucd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRrfPucdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRrfPucd(){
                               return localRrfPucd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RrfPucd
                               */
                               public void setRrfPucd(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRrfPucdTracker = true;
                                       } else {
                                          localRrfPucdTracker = true;
                                              
                                       }
                                   
                                            this.localRrfPucd=param;
                                    

                               }
                            

                        /**
                        * field for RrfPunm
                        */

                        
                                    protected java.lang.String localRrfPunm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRrfPunmTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRrfPunm(){
                               return localRrfPunm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RrfPunm
                               */
                               public void setRrfPunm(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRrfPunmTracker = true;
                                       } else {
                                          localRrfPunmTracker = true;
                                              
                                       }
                                   
                                            this.localRrfPunm=param;
                                    

                               }
                            

                        /**
                        * field for RrfPymd
                        */

                        
                                    protected java.lang.String localRrfPymd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRrfPymdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRrfPymd(){
                               return localRrfPymd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RrfPymd
                               */
                               public void setRrfPymd(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRrfPymdTracker = true;
                                       } else {
                                          localRrfPymdTracker = true;
                                              
                                       }
                                   
                                            this.localRrfPymd=param;
                                    

                               }
                            

                        /**
                        * field for RrfRucd
                        */

                        
                                    protected java.lang.String localRrfRucd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRrfRucdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRrfRucd(){
                               return localRrfRucd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RrfRucd
                               */
                               public void setRrfRucd(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRrfRucdTracker = true;
                                       } else {
                                          localRrfRucdTracker = true;
                                              
                                       }
                                   
                                            this.localRrfRucd=param;
                                    

                               }
                            

                        /**
                        * field for RrfRunm
                        */

                        
                                    protected java.lang.String localRrfRunm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRrfRunmTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRrfRunm(){
                               return localRrfRunm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RrfRunm
                               */
                               public void setRrfRunm(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRrfRunmTracker = true;
                                       } else {
                                          localRrfRunmTracker = true;
                                              
                                       }
                                   
                                            this.localRrfRunm=param;
                                    

                               }
                            

                        /**
                        * field for RrfRymd
                        */

                        
                                    protected java.lang.String localRrfRymd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRrfRymdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRrfRymd(){
                               return localRrfRymd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RrfRymd
                               */
                               public void setRrfRymd(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRrfRymdTracker = true;
                                       } else {
                                          localRrfRymdTracker = true;
                                              
                                       }
                                   
                                            this.localRrfRymd=param;
                                    

                               }
                            

                        /**
                        * field for RrfStam
                        */

                        
                                    protected java.lang.String localRrfStam ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRrfStamTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRrfStam(){
                               return localRrfStam;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RrfStam
                               */
                               public void setRrfStam(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRrfStamTracker = true;
                                       } else {
                                          localRrfStamTracker = true;
                                              
                                       }
                                   
                                            this.localRrfStam=param;
                                    

                               }
                            

                        /**
                        * field for RrfSubm
                        */

                        
                                    protected java.lang.String localRrfSubm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRrfSubmTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRrfSubm(){
                               return localRrfSubm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RrfSubm
                               */
                               public void setRrfSubm(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRrfSubmTracker = true;
                                       } else {
                                          localRrfSubmTracker = true;
                                              
                                       }
                                   
                                            this.localRrfSubm=param;
                                    

                               }
                            

                        /**
                        * field for RrsClas
                        */

                        
                                    protected java.lang.String localRrsClas ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRrsClasTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRrsClas(){
                               return localRrsClas;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RrsClas
                               */
                               public void setRrsClas(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRrsClasTracker = true;
                                       } else {
                                          localRrsClasTracker = true;
                                              
                                       }
                                   
                                            this.localRrsClas=param;
                                    

                               }
                            

                        /**
                        * field for SufFalg
                        */

                        
                                    protected java.lang.String localSufFalg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSufFalgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSufFalg(){
                               return localSufFalg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SufFalg
                               */
                               public void setSufFalg(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSufFalgTracker = true;
                                       } else {
                                          localSufFalgTracker = true;
                                              
                                       }
                                   
                                            this.localSufFalg=param;
                                    

                               }
                            

                        /**
                        * field for UsrCode
                        */

                        
                                    protected java.lang.String localUsrCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsrCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsrCode(){
                               return localUsrCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsrCode
                               */
                               public void setUsrCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUsrCodeTracker = true;
                                       } else {
                                          localUsrCodeTracker = true;
                                              
                                       }
                                   
                                            this.localUsrCode=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       RrfInfo.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://struct/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":RrfInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RrfInfo",
                           xmlWriter);
                   }

               
                   }
                if (localFlwActKeyTracker){
                                    if (localFlwActKey==null){

                                            java.lang.String namespace2 = "http://struct/xsd";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"flwActKey", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"flwActKey");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("flwActKey");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFlwActKey.serialize(new javax.xml.namespace.QName("http://struct/xsd","flwActKey"),
                                        factory,xmlWriter);
                                    }
                                } if (localProFlagTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"proFlag", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"proFlag");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("proFlag");
                                    }
                                

                                          if (localProFlag==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProFlag);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReqClasTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"reqClas", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"reqClas");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("reqClas");
                                    }
                                

                                          if (localReqClas==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReqClas);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRrfDucdTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"rrfDucd", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"rrfDucd");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("rrfDucd");
                                    }
                                

                                          if (localRrfDucd==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRrfDucd);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRrfDunmTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"rrfDunm", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"rrfDunm");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("rrfDunm");
                                    }
                                

                                          if (localRrfDunm==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRrfDunm);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRrfDymsTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"rrfDyms", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"rrfDyms");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("rrfDyms");
                                    }
                                

                                          if (localRrfDyms==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRrfDyms);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRrfPucdTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"rrfPucd", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"rrfPucd");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("rrfPucd");
                                    }
                                

                                          if (localRrfPucd==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRrfPucd);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRrfPunmTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"rrfPunm", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"rrfPunm");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("rrfPunm");
                                    }
                                

                                          if (localRrfPunm==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRrfPunm);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRrfPymdTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"rrfPymd", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"rrfPymd");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("rrfPymd");
                                    }
                                

                                          if (localRrfPymd==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRrfPymd);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRrfRucdTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"rrfRucd", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"rrfRucd");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("rrfRucd");
                                    }
                                

                                          if (localRrfRucd==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRrfRucd);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRrfRunmTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"rrfRunm", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"rrfRunm");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("rrfRunm");
                                    }
                                

                                          if (localRrfRunm==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRrfRunm);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRrfRymdTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"rrfRymd", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"rrfRymd");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("rrfRymd");
                                    }
                                

                                          if (localRrfRymd==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRrfRymd);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRrfStamTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"rrfStam", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"rrfStam");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("rrfStam");
                                    }
                                

                                          if (localRrfStam==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRrfStam);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRrfSubmTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"rrfSubm", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"rrfSubm");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("rrfSubm");
                                    }
                                

                                          if (localRrfSubm==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRrfSubm);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRrsClasTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"rrsClas", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"rrsClas");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("rrsClas");
                                    }
                                

                                          if (localRrsClas==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRrsClas);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSufFalgTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"sufFalg", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"sufFalg");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("sufFalg");
                                    }
                                

                                          if (localSufFalg==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSufFalg);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsrCodeTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"usrCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"usrCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("usrCode");
                                    }
                                

                                          if (localUsrCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsrCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localFlwActKeyTracker){
                            elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "flwActKey"));
                            
                            
                                    elementList.add(localFlwActKey==null?null:
                                    localFlwActKey);
                                } if (localProFlagTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "proFlag"));
                                 
                                         elementList.add(localProFlag==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProFlag));
                                    } if (localReqClasTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "reqClas"));
                                 
                                         elementList.add(localReqClas==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReqClas));
                                    } if (localRrfDucdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "rrfDucd"));
                                 
                                         elementList.add(localRrfDucd==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRrfDucd));
                                    } if (localRrfDunmTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "rrfDunm"));
                                 
                                         elementList.add(localRrfDunm==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRrfDunm));
                                    } if (localRrfDymsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "rrfDyms"));
                                 
                                         elementList.add(localRrfDyms==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRrfDyms));
                                    } if (localRrfPucdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "rrfPucd"));
                                 
                                         elementList.add(localRrfPucd==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRrfPucd));
                                    } if (localRrfPunmTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "rrfPunm"));
                                 
                                         elementList.add(localRrfPunm==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRrfPunm));
                                    } if (localRrfPymdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "rrfPymd"));
                                 
                                         elementList.add(localRrfPymd==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRrfPymd));
                                    } if (localRrfRucdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "rrfRucd"));
                                 
                                         elementList.add(localRrfRucd==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRrfRucd));
                                    } if (localRrfRunmTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "rrfRunm"));
                                 
                                         elementList.add(localRrfRunm==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRrfRunm));
                                    } if (localRrfRymdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "rrfRymd"));
                                 
                                         elementList.add(localRrfRymd==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRrfRymd));
                                    } if (localRrfStamTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "rrfStam"));
                                 
                                         elementList.add(localRrfStam==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRrfStam));
                                    } if (localRrfSubmTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "rrfSubm"));
                                 
                                         elementList.add(localRrfSubm==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRrfSubm));
                                    } if (localRrsClasTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "rrsClas"));
                                 
                                         elementList.add(localRrsClas==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRrsClas));
                                    } if (localSufFalgTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "sufFalg"));
                                 
                                         elementList.add(localSufFalg==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSufFalg));
                                    } if (localUsrCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "usrCode"));
                                 
                                         elementList.add(localUsrCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsrCode));
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static RrfInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RrfInfo object =
                new RrfInfo();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"RrfInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RrfInfo)org.apache.ws.axis2.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","flwActKey").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFlwActKey(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFlwActKey(struct.xsd.FlwActKey.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","proFlag").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","reqClas").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReqClas(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","rrfDucd").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRrfDucd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","rrfDunm").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRrfDunm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","rrfDyms").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRrfDyms(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","rrfPucd").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRrfPucd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","rrfPunm").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRrfPunm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","rrfPymd").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRrfPymd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","rrfRucd").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRrfRucd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","rrfRunm").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRrfRunm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","rrfRymd").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRrfRymd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","rrfStam").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRrfStam(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","rrfSubm").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRrfSubm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","rrsClas").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRrsClas(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","sufFalg").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSufFalg(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","usrCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsrCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          