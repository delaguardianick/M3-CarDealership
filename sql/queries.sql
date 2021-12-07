use cardealership;

-- home/index
select * 
from vehicle
where featured = true;

-- inventory/new
-- REPLACE: 'd' with ?
select *
from vehicle
where ( (make LIKE '%d%') or (model LIKE '%d%') or (`year` LIKE '%d%') ) and type = 1
limit 20;

-- Helper in case of no filte - return vehicles with highest MSRP
select *
from vehicle
order by MSRP DESC
limit 20;

-- invetory/used
select *
from vehicle
where ( (make LIKE '%d%') or (model LIKE '%d%') or (`year` LIKE '%d%') ) and type = 2
limit 20;

-- inventory/details/id
-- REPLACE: vin string with ?
select *
from vehicle
where vin = '1GNSKKE77DR377809';

-- Home/contact
