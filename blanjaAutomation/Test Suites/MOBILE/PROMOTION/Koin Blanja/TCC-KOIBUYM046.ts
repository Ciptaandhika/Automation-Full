<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>Pastikan buyer akan memperoleh extra koin dari produk, voucher cashback dan payment method ketika :
 - total payment > threshold
 - admin create campaign dengan applies multiply : Yes
 - admin set extra koin untuk produk id, voucher cashback, payment method finpay atm
 - buyer memilih metode pembayaran atm transfer bni VA di halaman pembayaran</description>
   <name>TCC-KOIBUYM046</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>4e361aa7-8ace-434c-9c0f-1f55c62a5ee3</testSuiteGuid>
   <testCaseLink>
      <guid>e19fe403-7bb3-41e7-9d6b-8d1900761b16</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0202_Member/020201_LoginPage/BuyerLogin13</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>1deafe8f-23e1-4bce-9332-48474bc6bf13</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0203_Product/020301_PDP/GoToPDPURLProdukReguler10KMainsiteWarungKami_Qty1_AddToCart</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>aa21fe6f-c472-48ae-ae31-1ce1c0d63be5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0204_Trade/020401_Cart/GoToShoppingCart_KlikPembayaran</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>155f5347-ce7f-43dc-aafc-5164cb8d8393</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0204_Trade/020402_OrderConfirm/ChooseJasaPengiriman_FinpayATM_KlikBayar_VerifyCoin</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>8b176f88-725a-404b-947a-257c2434747d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0202_Member/020203_KoinBlanja/KoinBlanjaVerifyKuponSaya</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
