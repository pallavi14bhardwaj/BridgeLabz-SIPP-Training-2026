-- session 4 assignment: sub-queries and advanced queries stuff

-- use case 16: finding countries with deaths above the global average
-- basically we need to get the avg first in a subquery, then filter 
select country, total_deaths
from covid_deaths
where total_deaths > (
    select avg(total_deaths) from covid_deaths
);

-- use case 17: finding countries where max cases crossed 1M
-- checking if the country is IN the list of countries with > 1M cases
select country, max_confirmed_cases
from covid_cases
where country in (
    select country 
    from covid_cases 
    where max_confirmed_cases > 1000000
);

-- use case 18: state-wise analysis to see if a day is a peak (e.g. Mumbai)
-- this one uses a correlated subquery to compare current day with all previous days
select 
    date,
    state,
    confirmed_cases,
    case 
        when confirmed_cases >= (
            -- get the max cases up to this date for the same state
            select max(confirmed_cases) 
            from covid_daily_cases c2 
            where c2.state = c1.state 
              and c2.date <= c1.date
        ) then 'Peak'
        else 'Not Peak'
    end as wave_status
from covid_daily_cases c1
where state = 'Mumbai'
order by date;

-- use case 19: comparing vaccination coverage
-- using UNION to just stack the vaccinated and unvaccinated counts together
select country, 'Vaccinated' as status, vaccinated_population as count
from vaccination_data
union
-- calculating the remaining unvaccinated folks
select country, 'Unvaccinated' as status, (total_population - vaccinated_population) as count
from vaccination_data;

-- use case 20: finding countries that are in the deaths table but missing from the cases table
-- gotta find the inconsistencies using NOT IN
select distinct country
from covid_deaths
where country not in (
    select distinct country 
    from covid_cases
    where country is not null -- just to be safe with NOT IN
);
