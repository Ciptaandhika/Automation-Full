<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>1. Select product non-digital where total product weight > admin weight limit
2. On order confirm buyer select Jasa Pengiriman = Go-send - Instant Delivery
3. Order confirm showing &quot;Berat produk melebihi batas yang ditentukan oleh Go-SEND Instant Delivery yaitu (admin setting) kg.&quot;
4. Shipping fee &quot;-&quot;
5. Buyer should not be able to checkout</description>
   <name>TCL-ICBUY048</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>0a65d1cf-b71d-4690-a9b9-79ef38a37924</testSuiteGuid>
   <testCaseLink>
      <guid>a9eaff6d-3002-4716-b69b-0e9e0c2a640e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010201_LoginPage/LoginBuyer</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>e7a622e5-7c69-4874-8d19-4a5e11939401</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0103_Product/010301_PDP/ProductWeightInstant20kg</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>eb160ec8-f9a1-4d35-ae02-64463495341f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0104_Trade/010402_OrderConfirm/InstantCourierFromOrderConfirm40KMBerat</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
