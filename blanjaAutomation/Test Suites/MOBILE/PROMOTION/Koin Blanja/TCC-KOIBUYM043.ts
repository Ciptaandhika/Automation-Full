<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>Pastikan buyer akan memperoleh extra koin dari produk, voucher cashback dan payment method ketika :
 - total payment > threshold
 - admin create campaign dengan applies multiply : Yes
 - admin set extra koin untuk produk id, voucher cashback, payment method finpay atm
 - buyer memilih metode pembayaran atm transfer bni VA di halaman pembayaran</description>
   <name>TCC-KOIBUYM043</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>1d2acf17-1455-4007-9e33-62fbbc1bcc51</testSuiteGuid>
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
      <guid>6a62ecb6-a788-4661-badf-13e471df77d3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0204_Trade/020402_OrderConfirm/ChooseJasaPengiriman_FinpayATM_KlikBayar_VerifyCoin</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>7970de8f-790a-419f-8e83-1dc7c3067ee6</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02_MOBILE/0202_Member/020203_KoinBlanja/KoinBlanjaVerifyKupon</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
