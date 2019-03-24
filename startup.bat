cd D:\Eclipse\TracFoneSampleApp\ConfigService\target
start "Config Service" java -jar ConfigService-1.0.jar

cd D:\Eclipse\TracFoneSampleApp\DiscoveryService\target
start "Discovery Service" java -jar DiscoveryService-1.0.jar

cd D:\Eclipse\TracFoneSampleApp
start "Zipkin Service" java -jar zipkin-server-2.5.3-exec.jar

cd D:\Eclipse\TracFoneSampleApp\AccountManagement\target
start "Account Service" java -jar Account-Management-1.0.jar

cd D:\Eclipse\TracFoneSampleApp\EXTRA_IINSTANCES
start "Account Service Instance 2" java -jar Account-Management-1.1.jar

cd D:\Eclipse\TracFoneSampleApp\CustomerManagement\target
start "Customer Service" java -jar Customer-Management-1.0.jar

cd D:\Eclipse\TracFoneSampleApp\EXTRA_IINSTANCES
start "Customer Service Instance 2" java -jar Customer-Management-1.1.jar

cd D:\Eclipse\TracFoneSampleApp\CustomerAccountManagement\target
start "Customer Account Composite Service" java -jar Customer-Account-Management-1.0.jar

cd D:\Eclipse\TracFoneSampleApp\ZuulGatewayService\target
start "Zuul Gateway Service" java -jar GatewayService-1.0.jar