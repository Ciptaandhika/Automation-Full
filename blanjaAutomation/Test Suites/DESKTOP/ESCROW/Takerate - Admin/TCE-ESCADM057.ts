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
   <name>TCE-ESCADM057</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>570e04f5-5371-4ede-a5b7-76c6d0fb6c0e</testSuiteGuid>
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
      <guid>c94fafd1-847f-44e3-867d-20d59e217640</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/TakeRateSettingProductFlatAllPeriod8Percent</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>55982a0e-d44d-4855-89c7-90aa9a80a157</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/LTD Promotion Direct Url</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>196dc50d-7d27-4eaf-aae3-0d7c8ee67e76</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/LTD Promotion Create</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>2a3f1d51-306d-4a79-af46-8135ff9e36a8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/LTD Create Partial Type</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>d9ab6b66-a690-4e26-82f4-61f40599a979</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/TakeRateSettingDirectSetTakeRate</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>229ace81-f5e0-4f5f-af41-85f597fe9ff0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/TakeRateSettingProductDiscountSpesificTime30Percent</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
