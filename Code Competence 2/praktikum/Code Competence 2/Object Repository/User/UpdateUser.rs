<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Update Existing User Data</description>
   <name>UpdateUser</name>
   <tag></tag>
   <elementGuidId>81ac6c3f-edd0-4530-8740-285ff1e0c910</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \t\&quot;id\&quot;: \&quot;7\&quot;,\n    \&quot;email\&quot;: \&quot;John@gmail.com\&quot;,\n    \&quot;username\&quot;: \&quot;johnd\&quot;,\n    \&quot;password\&quot;: \&quot;m38rmF$\&quot;,\n    \&quot;name\&quot;: {\n        \&quot;firstname\&quot;: \&quot;John\&quot;,\n        \&quot;lastname\&quot;: \&quot;Doe\&quot;\n    },\n    \&quot;address\&quot;: {\n        \&quot;city\&quot;: \&quot;kilcoole\&quot;,\n        \&quot;street\&quot;: \&quot;7835 new road\&quot;,\n        \&quot;number\&quot;: 3,\n        \&quot;zipcode\&quot;: \&quot;12926-3874\&quot;,\n        \&quot;geolocation\&quot;: {\n            \&quot;lat\&quot;: \&quot;-37.3159\&quot;,\n            \&quot;long\&quot;: \&quot;81.1496\&quot;\n        }\n    },\n    \&quot;phone\&quot;: \&quot;1-570-236-7033\&quot;\n}\n&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>5db9551a-b214-4cff-bf5d-6bff17ec0171</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.8</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://fakestoreapi.com/users/7</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
