use cardealership;

-- home/index
select * 
from vehicle
where featured = true;

-- inventory/new
-- REPLACE: '_' with ?
select *
from vehicle
where ( (make LIKE '%_%') or (model LIKE '%_%') or (`year` LIKE '%_%') ) and type = 1
limit 20;

-- Helper in case of no filte - return vehicles with highest MSRP
select *
from vehicle
order by MSRP DESC
limit 20;

-- invetory/used
select *
from vehicle
where ( (make LIKE '%_%') or (model LIKE '%_%') or (`year` LIKE '%_%') ) and type = 2
limit 20;

-- inventory/details/id
-- REPLACE: vin string with ?
select *
from vehicle
where vin = '1GNSKKE77DR377809';

-- Home/contact
-- REPLACE: all fields with ?
-- Validation: email address should be proper email format
-- Validation: email and address shouldnt be both null, needs to be validated in code
insert into contact (firstname, lastname, emailaddress, address, zipcode, message)
values ('Giovanna', 'Ribeiro', null, '123 Random Street', '15242');

-- Sales/index
select *
from vehicle
where ( (make LIKE '%_%') or (model LIKE '%_%') or (`year` LIKE '%_%') ) and available = true
limit 20;

-- sales/purchase/id
-- contact to be created before ex. contactid = 1
-- REPLACE: all values()
-- VALIDATE: purchasePrice < MSRP (in vehicle table)
-- SIDE EFFECTS: Makes vehicle sold unavailable 
-- Clarification: ContactID is the buyer, userID is the seller
insert into sale (contactID, vehicleID, salePrice, purchaseType, userID)
values (1, '1GNSKKE77DR377809', 22000.00, 1, 1);

-- Update vehicle to be unavailable (when sale inserted)
update vehicle
set available = false
where vehicleID = '_';
