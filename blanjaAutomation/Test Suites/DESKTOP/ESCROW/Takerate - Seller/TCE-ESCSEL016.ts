<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>1. Buyer placed order :
 - 1st product qty = 3, seller update sales price
 - 2nd product qty = 2, seller update shipping fee
 2. Buyer paid and seller ship order
 3. Buyer do partial qty for both product :
 - 1st product, buyer refund qty = 1
 - 2nd product, buyer refund qty = 1

1. Ensure TR amount for 1st product calculate correctly
 2. Ensure TR amount for 2nd product is not change and calculate correctly
 3. Ensure settlement to seller calculate correctly</description>
   <name>TCE-ESCSEL016</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>16262666-92ec-498d-b429-9da1f465409f</testSuiteGuid>
   <testCaseLink>
      <guid>1ad1a8ec-597d-4562-a4db-783682aee23e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010201_LoginPage/LoginBuyerPayment</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>ba8292e2-ac37-4428-8707-4fc943f55276</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0103_Product/PDPFullCycle/PDP50K_Qty1_ToCart_WARUNGKAMI</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>58e6ee72-88d0-4a4b-a358-59eb165b9590</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0103_Product/PDPFullCycle/PDP5K_Qty1_ToCart_WARUNGKAMI</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>f7053cb6-dac3-40f3-9522-9cd9e6ea7a4a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0104_Trade/010401_Cart/TroliIsiDirectLanjutkanPembayaran</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>1f5c0ef8-361e-4695-a96b-72d44b0afb6d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0104_Trade/010402_OrderConfirm/OrderConfirmPageDirectChoosePayment</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>e23cfcee-9b40-4814-be62-043ebda62065</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0104_Trade/010403_MethodPayment/ChoosePaymentGetOrderNumber</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>59f04fdd-3d04-419b-bf4f-de4dea601010</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010201_LoginPage/LoginSeller(Seller01)</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>e939b8ee-0b36-4e42-a6ca-f40342e574e8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/TransaksiPenjualanUpdateSeller2ItemAndShippingPrice</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>9f2e7329-72a3-4cf6-8b90-1b0461c95512</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010201_LoginPage/LoginBuyerPayment</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>54a4df1b-27a0-477d-bee1-4f02211ac416</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010203_BlanjaanSaya/BlanjaanSayaOrderListDirectChoosePayment</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>c097ef81-e1d8-47aa-a82d-76428e8c32d4</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0104_Trade/010403_MethodPayment/ChoosePayment_BNIVirtualAccount</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>6b89d095-dc19-4c22-b4ce-46e834d0b25d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010201_LoginPage/LoginAdmin</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>b0528993-3935-4cc7-9dae-7e3743ca9aea</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/OrderManagement</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>f619b039-3b87-469f-8e33-17d93088e870</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010502_TransactionManagement/01050204_PayManually/PayManually</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>dca2ddb7-1685-414a-89ee-50dca282bfce</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010201_LoginPage/LoginSeller(Seller01)</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>17d97dbf-7f60-4667-b3d9-823d5aa18f83</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/KirimTransaksiPenjualanJneByKurirStandar</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>9d7099c8-4866-46ff-bec2-747269194d0b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010201_LoginPage/LoginBuyerPayment</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>17e59373-e1b9-4d7b-bcf7-284430ba9cd4</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010203_BlanjaanSaya/BlanjaanSayaOrderListRefund</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>2aa3cfa6-2c7b-4173-aed8-203df956c158</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/PengajuanRefund</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>a70ca35f-0b4b-4d6d-b935-2557c70a2149</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010203_BlanjaanSaya/BlanjaanSayaOrderListRefund2Item</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>a04ce8ae-556f-442f-a89f-2d4fe2c71ad8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020303_ApplyRefund/PengajuanRefund</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
