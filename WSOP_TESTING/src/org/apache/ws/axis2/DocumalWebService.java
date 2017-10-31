

/**
 * DocumalWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

    package org.apache.ws.axis2;

    /*
     *  DocumalWebService java interface
     */

    public interface DocumalWebService {
          

        /**
          * Auto generated method signature
          * 
                    * @param setFlwActDataAddUsersCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean setFlwActDataAddUsersCmp(

                        struct.xsd.AutInfoCmp autInfo,struct.xsd.LogKey logKey,struct.xsd.FlwAcbKey flwAcbKey,java.lang.String[] addActPucds)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param doDeleteFlwCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean doDeleteFlwCmp(

                        struct.xsd.AutInfoCmp autInfo0,struct.xsd.LogKey logKey1,struct.xsd.FlwKey flwKey)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getLogKeyCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.LogKey getLogKeyCmp(

                        struct.xsd.AutInfoCmp autInfo3)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param doRejectCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean doRejectCmp(

                        struct.xsd.AutInfoCmp autInfo5,struct.xsd.LogKey logKey6,struct.xsd.FlwActKey flwActKey,java.lang.String comment,struct.xsd.FlwActKey targetFlwActKey)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param setDocData
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean setDocData(

                        struct.xsd.AutInfo autInfo8,struct.xsd.DocKey docKey,struct.xsd.DocInfo docInfo,struct.xsd.DocData docData,struct.xsd.DocAttData[] docAttData)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getDocInfoCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.DocInfo getDocInfoCmp(

                        struct.xsd.AutInfoCmp autInfo10,struct.xsd.DocKey docKey11)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getDocListByFlw
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.DocInfo[] getDocListByFlw(

                        struct.xsd.AutInfo autInfo13,struct.xsd.FlwKey flwKey14)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getDocData
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.DocData getDocData(

                        struct.xsd.AutInfo autInfo16,struct.xsd.DocKey docKey17)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param doApprovalCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean doApprovalCmp(

                        struct.xsd.AutInfoCmp autInfo19,struct.xsd.LogKey logKey20,struct.xsd.FlwActKey flwActKey21,java.lang.String comment22)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param setDocDataCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean setDocDataCmp(

                        struct.xsd.AutInfoCmp autInfo24,struct.xsd.DocKey docKey25,struct.xsd.DocInfo docInfo26,struct.xsd.DocData docData27,struct.xsd.DocAttData[] docAttData28)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getRrfInfoList
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.RrfInfo[] getRrfInfoList(

                        struct.xsd.AutInfo autInfo30,int startCount,int listCount,boolean isRequest,boolean isRunning,java.lang.String optWhere)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param doRequestCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean doRequestCmp(

                        struct.xsd.AutInfoCmp autInfo32,struct.xsd.LogKey logKey33,struct.xsd.FlwActKey flwActKey34,java.lang.String comment35)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param doCreateFlwCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.FlwKey doCreateFlwCmp(

                        struct.xsd.AutInfoCmp autInfo37,struct.xsd.LogKey logKey38,java.lang.String catCode,java.lang.String flwMcod)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param setFlwActDataAddUsers
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean setFlwActDataAddUsers(

                        struct.xsd.AutInfo autInfo40,struct.xsd.LogKey logKey41,struct.xsd.FlwAcbKey flwAcbKey42,java.lang.String[] addActPucds43)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getDocAttFileDataListCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.DocAttData[] getDocAttFileDataListCmp(

                        struct.xsd.AutInfoCmp autInfo45,struct.xsd.DocAttData[] docAttDataArray)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getDocAttFileDataList
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.DocAttData[] getDocAttFileDataList(

                        struct.xsd.AutInfo autInfo47,struct.xsd.DocAttData[] docAttDataArray48)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getLogKey
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.LogKey getLogKey(

                        struct.xsd.AutInfo autInfo50)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param setFlwAcbDataByAbbFlagCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean setFlwAcbDataByAbbFlagCmp(

                        struct.xsd.AutInfoCmp autInfo52,struct.xsd.LogKey logKey53,struct.xsd.FlwAcbKey flwAcbKey54,boolean isAbbFlag)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param doDeleteFlw
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean doDeleteFlw(

                        struct.xsd.AutInfo autInfo56,struct.xsd.LogKey logKey57,struct.xsd.FlwKey flwKey58)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getLogInfoCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.LogInfo getLogInfoCmp(

                        struct.xsd.AutInfoCmp autInfo60,struct.xsd.LogKey logKey61)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getRrfInfoListCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.RrfInfo[] getRrfInfoListCmp(

                        struct.xsd.AutInfoCmp autInfo63,int startCount64,int listCount65,boolean isRequest66,boolean isRunning67,java.lang.String optWhere68)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getDocInfo
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.DocInfo getDocInfo(

                        struct.xsd.AutInfo autInfo70,struct.xsd.DocKey docKey71)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getDocDataCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.DocData getDocDataCmp(

                        struct.xsd.AutInfoCmp autInfo73,struct.xsd.DocKey docKey74)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param doReject
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean doReject(

                        struct.xsd.AutInfo autInfo76,struct.xsd.LogKey logKey77,struct.xsd.FlwActKey flwActKey78,java.lang.String comment79,struct.xsd.FlwActKey targetFlwActKey80)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param doReceive
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean doReceive(

                        struct.xsd.AutInfo autInfo82,struct.xsd.LogKey logKey83,struct.xsd.FlwActKey flwActKey84,java.lang.String comment85)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getUsrInfoByUsrLgcd
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.UsrInfo getUsrInfoByUsrLgcd(

                        java.lang.String usrLgcd)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param doRevisionFlwCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.FlwKey doRevisionFlwCmp(

                        struct.xsd.AutInfoCmp autInfo88,struct.xsd.LogKey logKey89,struct.xsd.FlwKey flwKey90,java.lang.String flwMcod91)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getDocAttDataListCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.DocAttData[] getDocAttDataListCmp(

                        struct.xsd.AutInfoCmp autInfo93,struct.xsd.DocKey docKey94)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param doCreateFlw
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.FlwKey doCreateFlw(

                        struct.xsd.AutInfo autInfo96,struct.xsd.LogKey logKey97,java.lang.String catCode98,java.lang.String flwMcod99)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getLogInfo
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.LogInfo getLogInfo(

                        struct.xsd.AutInfo autInfo101,struct.xsd.LogKey logKey102)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param setFlwActDataByUserCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean setFlwActDataByUserCmp(

                        struct.xsd.AutInfoCmp autInfo104,struct.xsd.LogKey logKey105,struct.xsd.FlwActKey flwActKey106,java.lang.String actPucd)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param doApproval
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean doApproval(

                        struct.xsd.AutInfo autInfo108,struct.xsd.LogKey logKey109,struct.xsd.FlwActKey flwActKey110,java.lang.String comment111)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param setFlwActDataByUser
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean setFlwActDataByUser(

                        struct.xsd.AutInfo autInfo113,struct.xsd.LogKey logKey114,struct.xsd.FlwActKey flwActKey115,java.lang.String actPucd116)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getDocListByFlwCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.DocInfo[] getDocListByFlwCmp(

                        struct.xsd.AutInfoCmp autInfo118,struct.xsd.FlwKey flwKey119)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getDocAttDataList
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.DocAttData[] getDocAttDataList(

                        struct.xsd.AutInfo autInfo121,struct.xsd.DocKey docKey122)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getFlwDataCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.FlwData getFlwDataCmp(

                        struct.xsd.AutInfoCmp autInfo124,struct.xsd.FlwKey flwKey125)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getUsrInfoByUsrCode
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.UsrInfo getUsrInfoByUsrCode(

                        java.lang.String usrCode)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param doReceiveCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean doReceiveCmp(

                        struct.xsd.AutInfoCmp autInfo128,struct.xsd.LogKey logKey129,struct.xsd.FlwActKey flwActKey130,java.lang.String comment131)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param doRevisionFlw
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.FlwKey doRevisionFlw(

                        struct.xsd.AutInfo autInfo133,struct.xsd.LogKey logKey134,struct.xsd.FlwKey flwKey135,java.lang.String flwMcod136)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getUsrInfoByUsrLgcdCmp
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.UsrInfo getUsrInfoByUsrLgcdCmp(

                        struct.xsd.AutInfoCmp autInfo138,java.lang.String usrLgcd139)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getFlwData
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public struct.xsd.FlwData getFlwData(

                        struct.xsd.AutInfo autInfo141,struct.xsd.FlwKey flwKey142)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param setFlwAcbDataByAbbFlag
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean setFlwAcbDataByAbbFlag(

                        struct.xsd.AutInfo autInfo144,struct.xsd.LogKey logKey145,struct.xsd.FlwAcbKey flwAcbKey146,boolean isAbbFlag147)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param doRequest
                
             * @throws org.apache.ws.axis2.ExceptionException : 
         */

         
                     public boolean doRequest(

                        struct.xsd.AutInfo autInfo149,struct.xsd.LogKey logKey150,struct.xsd.FlwActKey flwActKey151,java.lang.String comment152)
                        throws java.rmi.RemoteException
             
          ,org.apache.ws.axis2.ExceptionException;

        

        
       //
       }
    