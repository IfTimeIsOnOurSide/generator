# MyBatis_Generator 逆向工程

> 官方URL: http://www.mybatis.org/generator

必需jar包：
    mysql 8.0.11 : https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.11
    mybatis-generator-core : https://mvnrepository.com/artifact/org.mybatis.generator/mybatis-generator-core/1.3.7
    
generator.xml文件配置及详解：
```$xslt
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration
        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">
<generatorConfiguration>
    <!-- context:指定generator运行环境-->
    <context id="db0Tables" targetRuntime="MyBatis3Simple">
        <!-- 数据库连接 -->
        <jdbcConnection
                driverClass="com.mysql.cj.jdbc.Driver"
                connectionURL="jdbc:mysql://localhost:3306/ykb_area?serverTimezone=GMT%2B8&amp;useSSL=false"
                userId="root"
                password="000000">
        </jdbcConnection>

        <!-- 类型解析器 -->
        <javaTypeResolver>
            <property name="forceBigDecimals" value="true" />
        </javaTypeResolver>

        <!-- javaBean生成策略 targetPackage： javaBean生成路径； targetProject: 目标工程 -->
        <javaModelGenerator targetPackage="com.Entity" targetProject=".\src">
            <property name="enableSubPackages" value="true"></property>
            <property name="trimStrings" value="true"></property>
        </javaModelGenerator>

        <!-- mapper 映射文件生成地址 -->
        <sqlMapGenerator targetPackage="com.Dao" targetProject=".\src">
            <property name="enableSubPackages" value="true"></property>
        </sqlMapGenerator>

        <!-- javaClientGenerator 客户端代码生成器位置，指定Mapper接口所在位置 -->
        <javaClientGenerator type="XMLMAPPER" targetPackage="com.Dao" targetProject=".\src">
            <property name="enableSubPackages" value="true"></property>
        </javaClientGenerator>

        <!-- 指定数据库中的表 -->
        <table tableName="base_country" domainObjectName="Country"></table>
        <table tableName="base_state" domainObjectName="State"></table>
        <table tableName="base_city" domainObjectName="City"></table>
    </context>
</generatorConfiguration>
```
### 启动
 ```$xslt
public class MBG_Test {
    public static void main(String[] args) {
        List<String> warings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("generator.xml");
        ConfigurationParser cp = new ConfigurationParser(warings);
        try {
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator mbg = new MyBatisGenerator(config, callback, warings);
            mbg.generate(null);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }
    }
}
```