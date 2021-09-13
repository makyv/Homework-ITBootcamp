

select food_name
from food
where food_kcal > 980;

-------------

select meal_name, meal_desc
from meal
where meal_difficulty = '1' or meal_difficulty = '2'

--------------------

select * 
from users
where user_admin = true

------------------

select food_name 
from food
where food_proteins > (food_carbs + food_fat)

-------------------


insert into food(food_id, food_name, food_kcal, food_proteins, food_carbs, food_fat)
values (1001, 'Chicken with onion', 256.5, 25.3, 5.3, 25.56)


---------


delete  
from users
where email = 'deckh6@multiply.com'

------------------

delete 
from users
where username = 'snoades1'


-----------------------


insert into usermeal (user_id, meal_id, grade)
values (25, 1, 5)
insert into usermeal (user_id, meal_id, grade)
values (5, 2, 4)

select s.username
from usermeal u join users s on u.user_id = s.user_id
where meal_id = 1

select u.grade
from meal ml join usermeal u on ml.meal_id = u.meal_id
where ml.meal_id = 1

-------------------


select username, email
from users
where email like '%google.com'


---------------


insert into fridgefood (fridge_id, food_id, mass)
values (1, 5, 2.4)
insert into fridgefood (fridge_id, food_id, mass)
values (2, 10, 25.4)

select f.food_name
from food f join fridgefood fd on f.food_id = fd.food_id
where fd.fridge_id = 1


-----------------------

select f.food_name, mf.mass
from food f join mealfood mf on f.food_id = mf.food_id
join meal ml on ml.meal_id = mf.meal_id
where ml.meal_name = 'Waydowntown'
