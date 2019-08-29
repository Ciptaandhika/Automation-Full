<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>1. Select product non-digital where total product weight > admin weight limit
2. On order confirm buyer select Jasa Pengiriman = Go-send - Same Day Delivery
3. Order confirm showing &quot;Berat produk melebihi batas yang ditentukan oleh Go-Send Same Day Delivery yaitu (admin setting) kg&quot;
4. Shipping fee &quot;-&quot;
5. Buyer should not be able to checkout</description>
   <name>TCL-ICBUY047</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>7305cd26-8a2e-49e3-8821-28db2f6763bd</testSuiteGuid>
   <testCaseLink>
      <guid>473bb3ad-a28f-4310-bf02-176882265bb3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010201_LoginPage/LoginBuyer</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>3a25e166-5c89-4fd2-be21-d2de5a7b40a8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0103_Product/010301_PDP/ProductWeightSameDay7kg</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>0e6912c9-4d60-452f-a2ae-a5a971fab5aa</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0104_Trade/010402_OrderConfirm/InstantCourierBeratProdukMelebihi</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
