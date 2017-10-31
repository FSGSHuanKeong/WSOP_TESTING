
/**
 * UsrInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package struct.xsd;
            

            /**
            *  UsrInfo bean class
            */
        
        public  class UsrInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = UsrInfo
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
                        * field for AgeCode
                        */

                        
                                    protected java.lang.String localAgeCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgeCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAgeCode(){
                               return localAgeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgeCode
                               */
                               public void setAgeCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAgeCodeTracker = true;
                                       } else {
                                          localAgeCodeTracker = true;
                                              
                                       }
                                   
                                            this.localAgeCode=param;
                                    

                               }
                            

                        /**
                        * field for BosCode
                        */

                        
                                    protected java.lang.String localBosCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBosCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBosCode(){
                               return localBosCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BosCode
                               */
                               public void setBosCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localBosCodeTracker = true;
                                       } else {
                                          localBosCodeTracker = true;
                                              
                                       }
                                   
                                            this.localBosCode=param;
                                    

                               }
                            

                        /**
                        * field for BosNamm
                        */

                        
                                    protected java.lang.String localBosNamm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBosNammTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBosNamm(){
                               return localBosNamm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BosNamm
                               */
                               public void setBosNamm(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localBosNammTracker = true;
                                       } else {
                                          localBosNammTracker = true;
                                              
                                       }
                                   
                                            this.localBosNamm=param;
                                    

                               }
                            

                        /**
                        * field for CmpCode
                        */

                        
                                    protected java.lang.String localCmpCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCmpCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCmpCode(){
                               return localCmpCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CmpCode
                               */
                               public void setCmpCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCmpCodeTracker = true;
                                       } else {
                                          localCmpCodeTracker = true;
                                              
                                       }
                                   
                                            this.localCmpCode=param;
                                    

                               }
                            

                        /**
                        * field for CmpNamm
                        */

                        
                                    protected java.lang.String localCmpNamm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCmpNammTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCmpNamm(){
                               return localCmpNamm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CmpNamm
                               */
                               public void setCmpNamm(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCmpNammTracker = true;
                                       } else {
                                          localCmpNammTracker = true;
                                              
                                       }
                                   
                                            this.localCmpNamm=param;
                                    

                               }
                            

                        /**
                        * field for OrgCode
                        */

                        
                                    protected java.lang.String localOrgCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrgCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOrgCode(){
                               return localOrgCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrgCode
                               */
                               public void setOrgCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOrgCodeTracker = true;
                                       } else {
                                          localOrgCodeTracker = true;
                                              
                                       }
                                   
                                            this.localOrgCode=param;
                                    

                               }
                            

                        /**
                        * field for OrgNamm
                        */

                        
                                    protected java.lang.String localOrgNamm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrgNammTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOrgNamm(){
                               return localOrgNamm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrgNamm
                               */
                               public void setOrgNamm(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOrgNammTracker = true;
                                       } else {
                                          localOrgNammTracker = true;
                                              
                                       }
                                   
                                            this.localOrgNamm=param;
                                    

                               }
                            

                        /**
                        * field for SecCode
                        */

                        
                                    protected java.lang.String localSecCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecCodeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecCode(){
                               return localSecCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecCode
                               */
                               public void setSecCode(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSecCodeTracker = true;
                                       } else {
                                          localSecCodeTracker = true;
                                              
                                       }
                                   
                                            this.localSecCode=param;
                                    

                               }
                            

                        /**
                        * field for SecNamm
                        */

                        
                                    protected java.lang.String localSecNamm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecNammTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecNamm(){
                               return localSecNamm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecNamm
                               */
                               public void setSecNamm(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSecNammTracker = true;
                                       } else {
                                          localSecNammTracker = true;
                                              
                                       }
                                   
                                            this.localSecNamm=param;
                                    

                               }
                            

                        /**
                        * field for UsrAuth
                        */

                        
                                    protected java.lang.String localUsrAuth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsrAuthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsrAuth(){
                               return localUsrAuth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsrAuth
                               */
                               public void setUsrAuth(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUsrAuthTracker = true;
                                       } else {
                                          localUsrAuthTracker = true;
                                              
                                       }
                                   
                                            this.localUsrAuth=param;
                                    

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
                        * field for UsrLang
                        */

                        
                                    protected java.lang.String localUsrLang ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsrLangTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsrLang(){
                               return localUsrLang;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsrLang
                               */
                               public void setUsrLang(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUsrLangTracker = true;
                                       } else {
                                          localUsrLangTracker = true;
                                              
                                       }
                                   
                                            this.localUsrLang=param;
                                    

                               }
                            

                        /**
                        * field for UsrLgcd
                        */

                        
                                    protected java.lang.String localUsrLgcd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsrLgcdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsrLgcd(){
                               return localUsrLgcd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsrLgcd
                               */
                               public void setUsrLgcd(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUsrLgcdTracker = true;
                                       } else {
                                          localUsrLgcdTracker = true;
                                              
                                       }
                                   
                                            this.localUsrLgcd=param;
                                    

                               }
                            

                        /**
                        * field for UsrMail
                        */

                        
                                    protected java.lang.String localUsrMail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsrMailTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsrMail(){
                               return localUsrMail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsrMail
                               */
                               public void setUsrMail(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUsrMailTracker = true;
                                       } else {
                                          localUsrMailTracker = true;
                                              
                                       }
                                   
                                            this.localUsrMail=param;
                                    

                               }
                            

                        /**
                        * field for UsrMemm
                        */

                        
                                    protected java.lang.String localUsrMemm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsrMemmTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsrMemm(){
                               return localUsrMemm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsrMemm
                               */
                               public void setUsrMemm(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUsrMemmTracker = true;
                                       } else {
                                          localUsrMemmTracker = true;
                                              
                                       }
                                   
                                            this.localUsrMemm=param;
                                    

                               }
                            

                        /**
                        * field for UsrNamm
                        */

                        
                                    protected java.lang.String localUsrNamm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsrNammTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsrNamm(){
                               return localUsrNamm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsrNamm
                               */
                               public void setUsrNamm(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUsrNammTracker = true;
                                       } else {
                                          localUsrNammTracker = true;
                                              
                                       }
                                   
                                            this.localUsrNamm=param;
                                    

                               }
                            

                        /**
                        * field for UsrNams
                        */

                        
                                    protected java.lang.String localUsrNams ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsrNamsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsrNams(){
                               return localUsrNams;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsrNams
                               */
                               public void setUsrNams(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUsrNamsTracker = true;
                                       } else {
                                          localUsrNamsTracker = true;
                                              
                                       }
                                   
                                            this.localUsrNams=param;
                                    

                               }
                            

                        /**
                        * field for UsrOrdr
                        */

                        
                                    protected java.lang.String localUsrOrdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsrOrdrTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsrOrdr(){
                               return localUsrOrdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsrOrdr
                               */
                               public void setUsrOrdr(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUsrOrdrTracker = true;
                                       } else {
                                          localUsrOrdrTracker = true;
                                              
                                       }
                                   
                                            this.localUsrOrdr=param;
                                    

                               }
                            

                        /**
                        * field for UsrPass
                        */

                        
                                    protected java.lang.String localUsrPass ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsrPassTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsrPass(){
                               return localUsrPass;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsrPass
                               */
                               public void setUsrPass(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUsrPassTracker = true;
                                       } else {
                                          localUsrPassTracker = true;
                                              
                                       }
                                   
                                            this.localUsrPass=param;
                                    

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
                       UsrInfo.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":UsrInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "UsrInfo",
                           xmlWriter);
                   }

               
                   }
                if (localAgeCodeTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ageCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ageCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ageCode");
                                    }
                                

                                          if (localAgeCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAgeCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBosCodeTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"bosCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"bosCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("bosCode");
                                    }
                                

                                          if (localBosCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBosCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBosNammTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"bosNamm", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"bosNamm");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("bosNamm");
                                    }
                                

                                          if (localBosNamm==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBosNamm);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCmpCodeTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"cmpCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"cmpCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("cmpCode");
                                    }
                                

                                          if (localCmpCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCmpCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCmpNammTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"cmpNamm", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"cmpNamm");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("cmpNamm");
                                    }
                                

                                          if (localCmpNamm==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCmpNamm);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrgCodeTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"orgCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"orgCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("orgCode");
                                    }
                                

                                          if (localOrgCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrgCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrgNammTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"orgNamm", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"orgNamm");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("orgNamm");
                                    }
                                

                                          if (localOrgNamm==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrgNamm);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSecCodeTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"secCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"secCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("secCode");
                                    }
                                

                                          if (localSecCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSecCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSecNammTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"secNamm", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"secNamm");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("secNamm");
                                    }
                                

                                          if (localSecNamm==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSecNamm);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsrAuthTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"usrAuth", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"usrAuth");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("usrAuth");
                                    }
                                

                                          if (localUsrAuth==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsrAuth);
                                            
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
                             } if (localUsrLangTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"usrLang", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"usrLang");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("usrLang");
                                    }
                                

                                          if (localUsrLang==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsrLang);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsrLgcdTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"usrLgcd", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"usrLgcd");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("usrLgcd");
                                    }
                                

                                          if (localUsrLgcd==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsrLgcd);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsrMailTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"usrMail", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"usrMail");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("usrMail");
                                    }
                                

                                          if (localUsrMail==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsrMail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsrMemmTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"usrMemm", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"usrMemm");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("usrMemm");
                                    }
                                

                                          if (localUsrMemm==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsrMemm);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsrNammTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"usrNamm", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"usrNamm");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("usrNamm");
                                    }
                                

                                          if (localUsrNamm==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsrNamm);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsrNamsTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"usrNams", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"usrNams");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("usrNams");
                                    }
                                

                                          if (localUsrNams==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsrNams);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsrOrdrTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"usrOrdr", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"usrOrdr");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("usrOrdr");
                                    }
                                

                                          if (localUsrOrdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsrOrdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsrPassTracker){
                                    namespace = "http://struct/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"usrPass", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"usrPass");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("usrPass");
                                    }
                                

                                          if (localUsrPass==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsrPass);
                                            
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

                 if (localAgeCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "ageCode"));
                                 
                                         elementList.add(localAgeCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgeCode));
                                    } if (localBosCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "bosCode"));
                                 
                                         elementList.add(localBosCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBosCode));
                                    } if (localBosNammTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "bosNamm"));
                                 
                                         elementList.add(localBosNamm==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBosNamm));
                                    } if (localCmpCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "cmpCode"));
                                 
                                         elementList.add(localCmpCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCmpCode));
                                    } if (localCmpNammTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "cmpNamm"));
                                 
                                         elementList.add(localCmpNamm==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCmpNamm));
                                    } if (localOrgCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "orgCode"));
                                 
                                         elementList.add(localOrgCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrgCode));
                                    } if (localOrgNammTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "orgNamm"));
                                 
                                         elementList.add(localOrgNamm==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrgNamm));
                                    } if (localSecCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "secCode"));
                                 
                                         elementList.add(localSecCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecCode));
                                    } if (localSecNammTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "secNamm"));
                                 
                                         elementList.add(localSecNamm==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecNamm));
                                    } if (localUsrAuthTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "usrAuth"));
                                 
                                         elementList.add(localUsrAuth==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsrAuth));
                                    } if (localUsrCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "usrCode"));
                                 
                                         elementList.add(localUsrCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsrCode));
                                    } if (localUsrLangTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "usrLang"));
                                 
                                         elementList.add(localUsrLang==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsrLang));
                                    } if (localUsrLgcdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "usrLgcd"));
                                 
                                         elementList.add(localUsrLgcd==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsrLgcd));
                                    } if (localUsrMailTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "usrMail"));
                                 
                                         elementList.add(localUsrMail==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsrMail));
                                    } if (localUsrMemmTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "usrMemm"));
                                 
                                         elementList.add(localUsrMemm==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsrMemm));
                                    } if (localUsrNammTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "usrNamm"));
                                 
                                         elementList.add(localUsrNamm==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsrNamm));
                                    } if (localUsrNamsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "usrNams"));
                                 
                                         elementList.add(localUsrNams==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsrNams));
                                    } if (localUsrOrdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "usrOrdr"));
                                 
                                         elementList.add(localUsrOrdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsrOrdr));
                                    } if (localUsrPassTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://struct/xsd",
                                                                      "usrPass"));
                                 
                                         elementList.add(localUsrPass==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsrPass));
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
        public static UsrInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UsrInfo object =
                new UsrInfo();

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
                    
                            if (!"UsrInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UsrInfo)org.apache.ws.axis2.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","ageCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAgeCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","bosCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBosCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","bosNamm").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBosNamm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","cmpCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCmpCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","cmpNamm").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCmpNamm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","orgCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrgCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","orgNamm").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrgNamm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","secCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","secNamm").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecNamm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","usrAuth").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsrAuth(
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
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","usrLang").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsrLang(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","usrLgcd").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsrLgcd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","usrMail").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsrMail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","usrMemm").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsrMemm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","usrNamm").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsrNamm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","usrNams").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsrNams(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","usrOrdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsrOrdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://struct/xsd","usrPass").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsrPass(
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
           
          