<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>1. Buyer create order dengan memilih jasa pengiriman Kurir Standar (matikan semua kurir)
2. Buyer melakukan pembayaran sampai Paid.
logout Buyer
3.login seller; Lakukan pengecekan menu Ship di Transaksi Penjualan (for Subaccount)
4. logout Seller, login seller subaccount, masuk menu Transaksi Penjualan
5. Pastikan menu ship muncul  di OrderNumber</description>
   <name>TCL-RLSEL064</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>5c672238-24a4-4099-a168-3b9ff253cc18</testSuiteGuid>
   <testCaseLink>
      <guid>6fbd3d14-3efb-44bb-90f0-b589669a6604</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010201_LoginPage/LoginBuyer1</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>083b4bce-844f-49fd-ab26-d05c92392850</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0103_Product/010301_PDP/GoToPDPURL_AddQty_ClickBlanjaSekarang_50K</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>319c1a35-0a96-4385-a950-0ef6734dbd53</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0104_Trade/010402_OrderConfirm/BuyerBlanjaKurirStandar</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>d1f42172-e500-4f32-a8b6-9ff2dd9dbaf8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0104_Trade/010403_MethodPayment/ChoosePayment_BCAVirtualAccount</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>6d04fa9c-a042-4bb6-8539-b93c706b297d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0104_Trade/010404_ThankYouPage/ThankYouPage_BCAVirtualAccount</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>5cb0fad4-bb73-4b22-b944-d869dc26eda4</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010201_LoginPage/LoginAdmin</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>8662bc85-bb44-4931-ba59-b307a44c191e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/OrderManagement</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>b0c3866f-8cf0-4759-9e51-bfb29a7204d5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010502_TransactionManagement/01050204_PayManually/PayManually</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>98f0b8c7-a7c6-4376-9ecf-84a443578738</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010201_LoginPage/LoginSellerSubAccount</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>92aff2a3-d958-40a2-a9c2-b8df62988116</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/KirimTransaksiPenjualanJneByKurirStandar</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>ba9da1f8-7301-470c-9cfb-b348003ef403</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/VerifyBarangTerkirim</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
