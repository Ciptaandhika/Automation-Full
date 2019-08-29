<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>Pastikan buyer akan memperoleh extra koin dari produk, voucher cashback dan payment method ketika :
 - total payment > threshold
 - admin create campaign dengan applies multiply : Yes
 - admin set extra koin untuk produk id, voucher cashback, payment method finpay atm
 - buyer memilih metode pembayaran atm transfer bni VA di halaman pembayaran</description>
   <name>TCC-KOIBUYM040</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>d180271c-e336-4e40-bb69-4edfa47c3065</testSuiteGuid>
   <testCaseLink>
      <guid>e19fe403-7bb3-41e7-9d6b-8d1900761b16</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0202_Member/020201_LoginPage/BuyerLogin13</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>06509b27-f543-4ef1-a2c1-f7509e2d1355</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0203_Product/020301_PDP/GoToPDPURLProdukReguler5KMainsiteWarungKita_Qty20_AddToCart</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>2105b2ad-2be4-439b-a181-3fd500248e1b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0203_Product/020301_PDP/GoToPDPURLProdukLTD50KMainsiteWarungKita_Qty3_AddToCart</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>aa21fe6f-c472-48ae-ae31-1ce1c0d63be5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0204_Trade/020401_Cart/GoToShoppingCart_KlikPembayaran</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>4b16549d-a0de-4e08-896f-6eaf381bfb0b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0204_Trade/020402_OrderConfirm/ChooseJasaPengirimanMultipleProducts_BNIVirtualAccount_KlikBayar_VerifyCoin</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
