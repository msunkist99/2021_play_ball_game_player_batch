package org.launchcode.play_ball_game_player_batch;

import org.launchcode.play_ball_game_player_batch.fieldSetMappers.GameFieldSetMapper;
import org.launchcode.play_ball_game_player_batch.listeners.JobCompletionNotificationListener;
import org.launchcode.play_ball_game_player_batch.models.Game;
import org.launchcode.play_ball_game_player_batch.skipPolicies.InsertIgnoreVerificationSkipper;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.support.CompositeItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.dao.EmptyResultDataAccessException;

import javax.sql.DataSource;
import java.util.Arrays;

@Configuration
@EnableBatchProcessing              // adds many critical beans that support jobs
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    // create an ItemReader that reads in a flat file
    // https://www.programcreek.com/java-api-examples/?api=org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder
    // https://docs.spring.io/spring-batch/docs/current/reference/html/readersAndWriters.html#flatFiles
    public FlatFileItemReader<Game> reader() {
        DefaultLineMapper<Game> lineMapper = new DefaultLineMapper<>();
        lineMapper.setLineTokenizer(new DelimitedLineTokenizer(","));
        lineMapper.setFieldSetMapper(new GameFieldSetMapper());

        return new FlatFileItemReaderBuilder<Game>()
                .name("gameItemReader")
                .resource(new ClassPathResource("/1982/Regular/bgameEvent.txt"))
                .lineMapper(lineMapper)
                .build();
    }

    private static final int STARTING_PLAYER = 0;
    private static final int SUBSTITUTE_PLAYER = 1;
    private static final int VISITING_PLAYER = 0;
    private static final int HOME_PLAYER = 1;

    @Bean
    public JdbcBatchItemWriter<Game> writeGame(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql("INSERT INTO game (id, site, home_team, visiting_team, date, day_night, game_num, year, game_type) VALUES " +
                        "(:id, :site, :homeTeam, :visitingTeam, :date, :dayNight, :gameNum, 1982, 'R'); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameVisitingPlayer1(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdVisit1, " + STARTING_PLAYER + ", " + VISITING_PLAYER + ", 1, :playerPositionVisit1); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameVisitingPlayer2(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdVisit2, " + STARTING_PLAYER + ", " + VISITING_PLAYER + ", 2, :playerPositionVisit2); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameVisitingPlayer3(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdVisit3, " + STARTING_PLAYER + ", " + VISITING_PLAYER + ", 3, :playerPositionVisit3); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameVisitingPlayer4(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdVisit4, " + STARTING_PLAYER + ", " + VISITING_PLAYER + ", 4, :playerPositionVisit4); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameVisitingPlayer5(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdVisit5, " + STARTING_PLAYER + ", " + VISITING_PLAYER + ", 5, :playerPositionVisit5); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameVisitingPlayer6(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdVisit6, " + STARTING_PLAYER + ", " + VISITING_PLAYER + ", 6, :playerPositionVisit6); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameVisitingPlayer7(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdVisit7, " + STARTING_PLAYER + ", " + VISITING_PLAYER + ", 7, :playerPositionVisit7); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameVisitingPlayer8(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdVisit8, " + STARTING_PLAYER + ", " + VISITING_PLAYER + ", 8, :playerPositionVisit8); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameVisitingPlayer9(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdVisit9, " + STARTING_PLAYER + ", " + VISITING_PLAYER + ", 9, :playerPositionVisit9); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameVisitingPlayer10(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdVisit10, " + STARTING_PLAYER + ", " + VISITING_PLAYER + ", 10, :playerPositionVisit10); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameHomePlayer1(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdHome1, " + STARTING_PLAYER + ", " + HOME_PLAYER + ", 1, :playerPositionHome1); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameHomePlayer2(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdHome2, " + STARTING_PLAYER + ", " + HOME_PLAYER + ", 2, :playerPositionHome2); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameHomePlayer3(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdHome3, " + STARTING_PLAYER + ", " + HOME_PLAYER + ", 3, :playerPositionHome3); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameHomePlayer4(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdHome4, " + STARTING_PLAYER + ", " + HOME_PLAYER + ", 4, :playerPositionHome4); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameHomePlayer5(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdHome5, " + STARTING_PLAYER + ", " + HOME_PLAYER + ", 5, :playerPositionHome5); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameHomePlayer6(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdHome6, " + STARTING_PLAYER + ", " + HOME_PLAYER + ", 6, :playerPositionHome6); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameHomePlayer7(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdHome7, " + STARTING_PLAYER + ", " + HOME_PLAYER + ", 7, :playerPositionHome7); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameHomePlayer8(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdHome8, " + STARTING_PLAYER + ", " + HOME_PLAYER + ", 8, :playerPositionHome8); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameHomePlayer9(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdHome9, " + STARTING_PLAYER + ", " + HOME_PLAYER + ", 9, :playerPositionHome9); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Game> writeGameHomePlayer10(DataSource dataSource){
        return new JdbcBatchItemWriterBuilder<Game>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql( "INSERT INTO game_player (game_id, player_id, start_sub, visit_home, batting_order, field_position) VALUES " +
                        "(:id, :playerIdHome10, " + STARTING_PLAYER + ", " + HOME_PLAYER + ", 10, :playerPositionHome10); ")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public CompositeItemWriter<Game> compositeItemWriter(DataSource dataSource){
        CompositeItemWriter<Game> compositeItemWriter = new CompositeItemWriter<>();
        compositeItemWriter.setDelegates(Arrays.asList(
                writeGame(dataSource),
                writeGameVisitingPlayer1(dataSource),
                writeGameVisitingPlayer2(dataSource),
                writeGameVisitingPlayer3(dataSource),
                writeGameVisitingPlayer4(dataSource),
                writeGameVisitingPlayer5(dataSource),
                writeGameVisitingPlayer6(dataSource),
                writeGameVisitingPlayer7(dataSource),
                writeGameVisitingPlayer8(dataSource),
                writeGameVisitingPlayer9(dataSource),
                writeGameVisitingPlayer10(dataSource),

                writeGameHomePlayer1(dataSource),
                writeGameHomePlayer2(dataSource),
                writeGameHomePlayer3(dataSource),
                writeGameHomePlayer4(dataSource),
                writeGameHomePlayer5(dataSource),
                writeGameHomePlayer6(dataSource),
                writeGameHomePlayer7(dataSource),
                writeGameHomePlayer8(dataSource),
                writeGameHomePlayer9(dataSource),
                writeGameHomePlayer10(dataSource)));

        return compositeItemWriter;
    }

    @Bean
    public Step step1(DataSource dataSource) {
        return stepBuilderFactory.get("step1")
                .<Game, Game> chunk(10)
                .reader(reader())
                .faultTolerant()
                .skipPolicy(new InsertIgnoreVerificationSkipper())
                .writer(compositeItemWriter(dataSource))
                .build();
    }

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1)
                .end()
                .build();
    }
}
