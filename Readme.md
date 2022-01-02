## Weather service

REST service with a single endpoint /weather.

When called, this service query a database for today's weather (temperature) in the table "weather_history". If no record is found in the database for the current date, then it read the current temperature value from page "API Яндекс.Погоды".
After reading temperature, it service insert a new record in "weather_history". In the end, it return the temperature value back to the user.

The attached screenshot from Postman shows an example of a request and response:
