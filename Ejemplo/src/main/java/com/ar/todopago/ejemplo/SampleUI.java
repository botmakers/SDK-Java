package com.ar.todopago.ejemplo;

import ar.com.todopago.api.ElementNames;
import ar.com.todopago.api.TodoPagoConector;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.Font;

public class SampleUI extends javax.swing.JFrame {

    
    TodoPagoConector tpc;
    
    private javax.swing.JButton AA;
    private javax.swing.JButton btSAR;
    private javax.swing.JButton jBConfigure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton status;
    private javax.swing.JTextField tfAmmount;
    private javax.swing.JTextField tfAnswerKeyAA;
    private javax.swing.JTextField tfAuthorization;
    private javax.swing.JTextField tfAuthorizeEndpoint;
    private javax.swing.JTextField tfAuthorizeWSDL;
    private javax.swing.JTextField tfCurrencyCode;
    private javax.swing.JTextField tfEMAILCLIENTE;
    private javax.swing.JTextField tfEncoding;
    private javax.swing.JTextField tfMerchant;
    private javax.swing.JTextField tfMerchantAA;
    private javax.swing.JTextField tfMerchantS;
    private javax.swing.JTextField tfOperationId;
    private javax.swing.JTextField tfOperationIdS;
    private javax.swing.JTextField tfOperationsEndpoiint;
    private javax.swing.JTextField tfOperationsWSDL;
    private javax.swing.JTextField tfRequestKeyAA;
    private javax.swing.JTextField tfSecurity;
    private javax.swing.JTextField tfSecurityAA;
    private javax.swing.JTextField tfSession;
    private javax.swing.JTextField tfURLError;
    private javax.swing.JTextField tfURLOk;
    private javax.swing.JTextField tfUser;
    private javax.swing.JTextArea tpAnswerAA;
    private javax.swing.JTextArea tpAnswerStatus;
    private javax.swing.JTextArea tpResponse;
    
    
    
    
    public SampleUI() {
    	setFont(new Font("Tahoma", Font.PLAIN, 11));
    	setTitle("TodoPago Ejemplo");
    	setPreferredSize(new Dimension(800, 600));
        initComponents();
    }

    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfAuthorizeWSDL = new javax.swing.JTextField();
        tfOperationsWSDL = new javax.swing.JTextField();
        tfAuthorizeEndpoint = new javax.swing.JTextField();
        tfOperationsEndpoiint = new javax.swing.JTextField();
        tfAuthorization = new javax.swing.JTextField();
        tfUser = new javax.swing.JTextField();
        jBConfigure = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfSession = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfSecurity = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfEncoding = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfMerchant = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfOperationId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfCurrencyCode = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfAmmount = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfURLOk = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfURLError = new javax.swing.JTextField();
        btSAR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tpResponse = new javax.swing.JTextArea();
        tpResponse.setFont(new Font("Tahoma", Font.PLAIN, 11));
        jLabel18 = new javax.swing.JLabel();
        tfEMAILCLIENTE = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tfSecurityAA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfMerchantAA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfRequestKeyAA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfAnswerKeyAA = new javax.swing.JTextField();
        AA = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        tfMerchantS = new javax.swing.JTextField();
        status = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tfOperationIdS = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        tpAnswerStatus = new javax.swing.JTextArea();
        tpAnswerStatus.setFont(new Font("Tahoma", Font.PLAIN, 11));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel19.setText("User");

        jLabel22.setText("Authorization");

        jLabel26.setText("OperationsEndpoiint");

        jLabel27.setText("AuthorizeEndpoint");

        jLabel3.setText("OperationsWSDL");

        jLabel9.setText("AuthorizeWSDL");

        tfAuthorizeWSDL.setText("file:D:/WorkspaceJuno/TodoPago-sdk/res/Authorize.wsdl");
        
        tfOperationsWSDL.setText("file:D:/WorkspaceJuno/TodoPago-sdk/res/Operations.wsdl");

        tfAuthorizeEndpoint.setText("https://50.19.97.101:8243/services/Authorize");

        tfOperationsEndpoiint.setText("https://50.19.97.101:8243/services/Operations");

        tfAuthorization.setText("PRISMA 912EC803B2CE49E4A541068D495AB570");

        tfUser.setText("Test");

        jBConfigure.setText("Configure");
        jBConfigure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfigureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfOperationsEndpoiint, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfAuthorization, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfOperationsWSDL, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfAuthorizeEndpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfAuthorizeWSDL, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jBConfigure, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(577, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfAuthorizeWSDL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfOperationsWSDL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tfAuthorizeEndpoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tfOperationsEndpoiint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tfAuthorization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jBConfigure)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Config", jPanel4);

        jLabel1.setText("Session");

        tfSession.setText("ABCDEF-1234-12221-FDE1-00000200");

        jLabel2.setText("Security");

        tfSecurity.setText("1234567890ABCDEF1234567890ABCDEF");

        jLabel11.setText("EncodingMethod");

        tfEncoding.setText("XML");

        jLabel12.setText("Merchant");

        tfMerchant.setText("305");

        jLabel13.setText("OperationId");

        tfOperationId.setText("01");

        jLabel14.setText("CurrencyCode");

        tfCurrencyCode.setText("032");

        jLabel15.setText("Amount");

        tfAmmount.setText("54");

        jLabel16.setText("URL_OK");

        tfURLOk.setText("http,//www.google.com");

        jLabel17.setText("URL_Error");

        tfURLError.setText("http,//www.yahoo.com");

        btSAR.setText("sendAuthorizeRequest");
        btSAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSARActionPerformed(evt);
            }
        });

        jLabel4.setText("Answer:");

        tpResponse.setColumns(20);
        tpResponse.setRows(5);
        jScrollPane8.setViewportView(tpResponse);

        jLabel18.setText("EMAILCLIENTE");

        tfEMAILCLIENTE.setText("email_cliente@dominio.com");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfOperationId, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfCurrencyCode, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfAmmount, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfURLOk, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfURLError, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfSecurity, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfEncoding, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfMerchant, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(tfSession, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(tfEMAILCLIENTE, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(btSAR))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jScrollPane8, GroupLayout.PREFERRED_SIZE, 614, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(tfSession, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(tfSecurity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel11)
        				.addComponent(tfEncoding, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel12)
        				.addComponent(tfMerchant, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel13)
        				.addComponent(tfOperationId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel14)
        				.addComponent(tfCurrencyCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel15)
        				.addComponent(tfAmmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel16)
        				.addComponent(tfURLOk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel17)
        				.addComponent(tfURLError, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel18)
        				.addComponent(tfEMAILCLIENTE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btSAR)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel4)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane8, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        jTabbedPane1.addTab("sendAuthorizeRequest", jPanel2);

        jLabel5.setText("Security");

        tfSecurityAA.setText("1234567890ABCDEF1234567890ABCDEF");

        jLabel6.setText("Merchant");

        tfMerchantAA.setText("305");
        
        jLabel7.setText("RequestKey");

        tfRequestKeyAA.setText("8496472a-8c87-e35b-dcf2-94d5e31eb12f");

        jLabel8.setText("AnswerKey");

        tfAnswerKeyAA.setText("8496472a-8c87-e35b-dcf2-94d5e31eb12f");

        AA.setText("getAuthorizeAnswer");
        AA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AAActionPerformed(evt);
            }
        });

        jLabel10.setText("Answer");
        jScrollPane5 = new javax.swing.JScrollPane();
        tpAnswerAA = new javax.swing.JTextArea();
        tpAnswerAA.setFont(new Font("Tahoma", Font.PLAIN, 11));
        
                tpAnswerAA.setColumns(20);
                tpAnswerAA.setRows(5);
                jScrollPane5.setViewportView(tpAnswerAA);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jScrollPane5, Alignment.LEADING)
        				.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(tfAnswerKeyAA, GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        						.addComponent(tfRequestKeyAA)
        						.addComponent(tfMerchantAA)
        						.addComponent(tfSecurityAA)))
        				.addComponent(AA, Alignment.LEADING)
        				.addComponent(jScrollPane6, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel10, Alignment.LEADING))
        			.addContainerGap(560, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(tfSecurityAA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(tfMerchantAA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7)
        				.addComponent(tfRequestKeyAA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8)
        				.addComponent(tfAnswerKeyAA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(AA)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel10)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane5, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        jTabbedPane1.addTab("getAuthorizeAnswer", jPanel1);

        jLabel21.setText("Merchant");

        tfMerchantS.setText("305");

        status.setText("getStatus");
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        jLabel23.setText("Answer");

        jLabel24.setText("OperationID");

        tfOperationIdS.setText("01");

        tpAnswerStatus.setColumns(20);
        tpAnswerStatus.setRows(5);
        jScrollPane11.setViewportView(tpAnswerStatus);

        jScrollPane1.setViewportView(jScrollPane11);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5Layout.setHorizontalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jScrollPane1, Alignment.LEADING)
        				.addComponent(status, Alignment.LEADING)
        				.addGroup(Alignment.LEADING, jPanel5Layout.createSequentialGroup()
        					.addComponent(jLabel21, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(tfMerchantS, GroupLayout.PREFERRED_SIZE, 429, GroupLayout.PREFERRED_SIZE))
        				.addGroup(Alignment.LEADING, jPanel5Layout.createSequentialGroup()
        					.addComponent(jLabel24, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(tfOperationIdS, GroupLayout.PREFERRED_SIZE, 429, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jLabel23, Alignment.LEADING))
        			.addContainerGap(635, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel21)
        				.addComponent(tfMerchantS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(4)
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel24)
        				.addComponent(tfOperationIdS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(status)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel23)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel5.setLayout(jPanel5Layout);

        jTabbedPane1.addTab("getStatus", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }
    
    
    
    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("Merchant", tfMerchantS.getText());
        parameters.put("OperationID", tfOperationIdS.getText());
        if(tpc !=null){
            Map<String, Object> a = tpc.getStatus(parameters);
            tpAnswerStatus.setText(printMap(a, ""));
        }else{
            tpAnswerStatus.setText("Run Config");
        }
    }//GEN-LAST:event_statusActionPerformed

    private void AAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AAActionPerformed
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("Security", tfSecurityAA.getText());
        parameters.put("Merchant", tfMerchantAA.getText());
        parameters.put("RequestKey", tfRequestKeyAA.getText());
        parameters.put("AnswerKey", tfAnswerKeyAA.getText());

        if(tpc !=null){
            Map<String, Object> a = tpc.getAuthorizeAnswer(parameters);
            tpAnswerAA.setText(printMap(a, ""));
        }else{
            tpAnswerAA.setText("Run Config");
        }
    }//GEN-LAST:event_AAActionPerformed
    
    private void btSARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSARActionPerformed

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("Session", tfSession.getText());
        parameters.put("Security", tfSecurity.getText());
        parameters.put("EncodingMethod", tfEncoding.getText());
        parameters.put("Merchant", tfMerchant.getText());
        parameters.put("OperationId", tfOperationId.getText());
        parameters.put("CurrencyCode", tfCurrencyCode.getText());
        parameters.put("AMOUNT", tfAmmount.getText());
        parameters.put("URL_OK", tfURLOk.getText());
        parameters.put("URL_ERROR", tfURLError.getText());
        parameters.put("EMAILCLIENTE", tfEMAILCLIENTE.getText());

        if(tpc !=null){
            Map<String, Object> a = tpc.sendAuthorizeRequest(parameters);
            tpResponse.setText(printMap(a, ""));
        }else{
            tpResponse.setText("Run Config");
        }

    }//GEN-LAST:event_btSARActionPerformed

    
    private void jBConfigureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfigureActionPerformed
        Map<String, String> wsdls = new HashMap<String, String>();
        wsdls.put(ElementNames.AuthorizeWSDL, tfAuthorizeWSDL.getText());
        wsdls.put(ElementNames.OperationsWSDL, tfOperationsWSDL.getText());
        
        Map<String, String> endpoints = new HashMap<String, String>();
        endpoints.put(ElementNames.AuthorizeWSDL, tfAuthorizeEndpoint.getText());
        endpoints.put(ElementNames.OperationsWSDL, tfOperationsEndpoiint.getText());
        
        Map<String, List<String>> auth = new HashMap<String, List<String>>();
        auth.put("Authorization", Collections.singletonList(tfAuthorization.getText()));
        auth.put("Username", Collections.singletonList(tfUser.getText()));
        try {
            tpc = new TodoPagoConector(wsdls, endpoints, auth, true);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SampleUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBConfigureActionPerformed

    
    private static String printMap(Map<String, Object> pr, String tab){
    	
    	String output="";
    	
		List<String> keys = new ArrayList<String>();
		keys.addAll(pr.keySet());
		
		for(int i = 0; i<keys.size();i++){
			Map<String, Object> aux = new HashMap<String, Object>();
			Object tmp = pr.get(keys.get(i));
			
			if(tmp!=null && tmp.getClass().isInstance(aux)){
				output += (tab + "- " + keys.get(i)) + "\n\r";
				aux = (Map<String, Object>)(tmp);
				tab+="  ";
				output += printMap(aux, tab);
				
			}else{
				output += (tab + "- " + keys.get(i) + " : " + pr.get(keys.get(i))) + "\n\r";
			}		
		}
		return output;
	}
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SampleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SampleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SampleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SampleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SampleUI().setVisible(true);
            }
        });
    }


}
