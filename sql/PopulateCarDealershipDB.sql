-- SAMPLE DATA CARDEALERSHIP

Insert into vehicle (vin, make, model, `year`, transmission, color, interiorColor, `type`, bodystyle, msrp, imageurl, featured)
values ('KMHEC4A48DA099278', 'ASTON MARTIN', 'DB9', '2007', 1, 2, 4, 2, 1, 387860.00, 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.caranddriver.com%2Faston-martin%2Fdb9-gt&psig=AOvVaw1qSZqh5KDopWD5o16cNMkT&ust=1638981230459000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCLDUv4KP0vQCFQAAAAAdAAAAABAD', 1);

Insert into vehicle (vin, make, model, `year`, transmission, color, interiorColor, `type`, bodystyle, msrp, imageurl, featured)
values ('1GNSKKE77DR377809', 'CHRYSLER', 'SEBRING', '2010', 2, 2, 3, 1, 2, 21000.00, 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.kbb.com%2Fchrysler%2Fsebring%2F&psig=AOvVaw1SJXa26Pawuy3P8kPgkBAL&ust=1638981692405000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCPCjwd6Q0vQCFQAAAAAdAAAAABAD', 0);

Insert into `user` (firstname, lastname, role)
values ('Alice ', 'Frye', 3);

Insert into `user` (firstname, lastname, role)
values ('April', 'Martin', 2);

Insert into `user` (firstname, lastname, role)
values ('David', 'Creger', 2);

Insert into `user` (firstname, lastname, role)
values ('Anna', 'Khan', 1);

insert into contact(firstname, lastname, emailAddress, address, zipcode)
values ('John', 'Smith', "SonjaVGreen@armyspy.com", null, '42145');

insert into contact(firstname, lastname, emailAddress, address, zipcode)
values ('Giovanna', 'Ribeiro', null, '123 Random Street', '15242');

insert into sale (vehicleid, saleprice, purchasetype, available, userID)
values ('1GNSKKE77DR377809', 22000.00, 1, 1, 1);

insert into sale (vehicleid, saleprice, purchasetype, available, userID)
values ( '1GNSKKE77DR377809', 22000.00, 1, 1, 1);