<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>Pastikan buyer akan memperoleh extra koin dari produk, voucher cashback dan payment method ketika :
 - total payment > threshold
 - admin create campaign dengan applies multiply : Yes
 - admin set extra koin untuk produk id, voucher cashback, payment method finpay atm
 - buyer memilih metode pembayaran atm transfer bni VA di halaman pembayaran</description>
   <name>TCC-IKBBUYM028</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <lastRun>2019-05-15T11:33:09</lastRun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>5c6914db-f09f-48bb-8ecb-0cf6a34c8a37</testSuiteGuid>
   <testCaseLink>
      <guid>e19fe403-7bb3-41e7-9d6b-8d1900761b16</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0202_Member/020201_LoginPage/BuyerLogin13</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>6c4ff167-0705-4a90-8f9e-0a1d78b925ba</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0203_Product/020301_PDP/GoToPDPURLProdukReguler10KMainsiteWarungKami_AddToCart</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>700bcc01-c112-4973-80e6-152ea13ce8c3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0203_Product/020301_PDP/GoToPDPURLProdukReguler10KMainsiteWarungKita_AddToCart</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>aa21fe6f-c472-48ae-ae31-1ce1c0d63be5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0204_Trade/020401_Cart/GoToShoppingCart_KlikPembayaran</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>8c677da0-25ef-48c2-9c6c-b8e8b85f98ec</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0204_Trade/020402_OrderConfirm/ChooseJasaPengirimanMultipleProducts_FinpayATM_MultipleVoucherNonCashback_VerifyCoin</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
