<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>Case 1 :
 1. Admin create default product TR
 - periode = all
 - take rate = 8% (flat)
 - product id = 13295579
 2. Admin create LTD admin
 - periode = 1 mei 2017 - 15 mei 2017
 - product id = 13295579 is on LTD admin
 3. Admin create specific periode product TR 
 - periode = 3 mei 2017 - 5 mei 2017
 - take rate discount = 30%
 - product id = 13295579
 
 Case 2 :
 1. Admin create default product TR
 - periode = all
 - take rate = 8% (flat)
 - product id = 13295579
 2. Admin create LTD admin
 - periode = 1 mei 2017 - 15 mei 2017
 - product id = 13295579 is on LTD admin
 3. Admin create specific periode product TR 
 - periode = 3 mei 2017 - 30 juni 2017
 - take rate discount = 30%
 - product id = 13295579

1. Admin will show error message &quot;Sorry, this product has been locked with take rate X% in a campaign during [start time] - [end time]&quot;</description>
   <name>TCE-ESCADM056</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>7e6bd299-d633-415f-a660-926ed99172ea</testSuiteGuid>
   <testCaseLink>
      <guid>2322c177-21ab-4733-8f68-1307f2f1b8e5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0102_Member/010201_LoginPage/LoginAdmin</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>054f7241-d8c2-4d2a-b5c4-83d1d5556446</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/TakeRateSettingDirectSetTakeRate</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>6891d6f1-ec7f-4175-8558-04d5d0a873ad</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/TakeRateSettingProductFlatAllPeriod8Percent</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>c94121da-442d-43b2-acf9-b681cfe6a435</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/LTD Promotion Direct Url</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>3173e389-1720-45fe-be7e-a2395b48f83f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/LTD Promotion Create</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>4904a7a8-713d-4d42-9372-487976a1ece1</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/LTD Create Partial Type</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>26cae73f-34b4-4130-ae09-7bf1c469ef9a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/TakeRateSettingDirectSetTakeRate</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>7ad1e314-aaa1-4db5-acf8-9661bb97e1eb</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/TakeRateSettingProductDiscountSpesificTime30PercentLTDProduct</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
