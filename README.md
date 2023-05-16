To call the end point /v1/billing from localhost follow the steps :
1) execute : mvn clean install
2) launch the API from BillingApplication.java
3) Call the end point POST /v1/billing from Swagger http://localhost:8080/swagger-ui.html or from SoapUI
Request example :
{
	"priceCategory": "PRO",
	"consumedElectricity": 10,
	"consumedGaz": 10
}

Expected result :
{
   "priceCategory": "PRO",
   "electricityPriceForKWh": 0.114,
   "consumedElectricity": 10,
   "totalElectricityPrice": 1.14,
   "gazPriceForKWh": 0.111,
   "consumedGaz": 10,
   "totalGazPrice": 1.11,
   "totalPrice": 2.25
}