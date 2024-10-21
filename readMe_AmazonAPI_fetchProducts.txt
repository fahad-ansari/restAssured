/**Query Params**/
query*
Phone
String
Search query (supports both free-form text queries or a product asin).
-x-x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-

page(optional)
1
Number
Results page to return.
Default: 1
-x-x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-

country(optional)
US
String
Sets the Amazon domain, marketplace country, language and currency.
Default: US
Allowed values: US, AU, BR, CA, CN, FR, DE, IN, IT, MX, NL, SG, ES, TR, AE, GB, JP, SA, PL, SE, BE, EG

-x-x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-

sort_by(optional)
Enum
Return the results in a specific sort order.

Default: RELEVANCE
Allowed values: RELEVANCE, LOWEST_PRICE, HIGHEST_PRICE, REVIEWS, NEWEST, BEST_SELLERS

-x-x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-

category_id(optional)
String
Find products in a specific category / department. Use the Product Category List endpoint to get a list of valid categories and their ids for the country specified in the request.
Default: aps (All Departments)

-x-x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-

min_price
(optional)
Number
Only return product offers with price greater than a certain value. Specified in the currency of the selected country. For example, in case country=US, a value of 105.34 means $105.34.

-x-x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-

max_price
(optional)
Number
Only return product offers with price lower than a certain value. Specified in the currency of the selected country. For example, in case country=US, a value of 105.34 means $105.34.

-x-x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-

product_condition(optional)
Enum
Return products in a specific condition.
Default: ALL
Allowed values: ALL, NEW, USED, RENEWED, COLLECTIBLE

-x-x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-
brand(optional)
String
Find products with a specific brand. Multiple brands can be specified as a comma (,) separated list. The brand values can be seen from Amazon's search left filters panel, as seen here.

Examples:SAMSUNG,Google,Apple

-x-x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-

seller_id(optional)
String
Find products sold by specific seller (merchant). Multiple sellers can be specified as a comma (,) separated list.

Examples:
A02211013Q5HP3OMSZC7W
AM7YCCDZROLB2,A1D09S7Q0OD6TH

-x-x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-

is_prime(optional)
Boolean
Only return prime products.
Default: false

-x-x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-

deals_and_discounts (optional)
Enum
Return deals and discounts in a specific condition.
Default: NONE
Allowed values: NONE, ALL_DISCOUNTS, TODAYS_DEALS

-x-x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-

fields(optional)
String
A comma separated list of product fields to include in the response (field projection).
By default all fields are returned.
Example: product_price,product_url,is_best_seller,sales_volume