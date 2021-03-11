insert into play_ball.player (id, team, year)
values ('noVDH', 'xxx', 1982);

insert into play_ball.player (id, team, year)
values ('noHDH', 'xxx', 1982);

select count(*)
from play_ball.game;

select *
from play_ball.game_player;

select count(distinct(game_id) )
from play_ball.game_player;

select distinct(game_id), count(player_id)
from play_ball.game_player
group by game_id;


select *
from play_ball.game_player
where game_id = 'CHN198207102'
order by visit_home, field_position;