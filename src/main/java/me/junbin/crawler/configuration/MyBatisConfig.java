package me.junbin.crawler.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import me.junbin.commons.converter.mybatis.LocalDateTimeTypeHandler;
import me.junbin.crawler.domain.Album;
import me.junbin.crawler.repository.AlbumRepo;
import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.util.concurrent.TimeUnit;

/**
 * @author : Zhong Junbin
 * @email : <a href="mailto:rekadowney@gmail.com">发送邮件</a>
 * @createDate : 2018/6/30 23:05
 * @description :
 */
@Import(DataSourceConfig.class)
@org.springframework.context.annotation.Configuration
public class MyBatisConfig {

    @Bean
    public Configuration configuration() {
        Configuration configuration = new Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setDefaultStatementTimeout((int) TimeUnit.SECONDS.toMillis(3));
        return configuration;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory(DruidDataSource dataSource,
                                                   Configuration configuration) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
//        factoryBean.setTypeAliasesPackage("me.junbin.crawler.laosiji.domain");
//        factoryBean.setTypeHandlersPackage("me.junbin.commons.converter.mybatis");
        factoryBean.setTypeAliasesPackage(Album.class.getPackage().getName());
        factoryBean.setTypeHandlersPackage(LocalDateTimeTypeHandler.class.getPackage().getName());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factoryBean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
        factoryBean.setConfiguration(configuration);
        return factoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setBasePackage(AlbumRepo.class.getPackage().getName());
        configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return configurer;
    }

}
