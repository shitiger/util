package mybatis;

import com.alibaba.fastjson.JSON;
import mybatis.mapper.IChanceMapper;
import mybatis.mapper.IChanceMapper2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.Reflector;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.reflection.wrapper.BeanWrapper;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapper;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.type.Alias;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author stone tiger
 * @Description: ${todo}
 * @date 2019/6/19
 */
public abstract class Test {
    public static void main(String[] args) throws IOException {
        String mybatis = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(mybatis);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession =  sessionFactory.openSession();
        IChanceMapper chanceMapper = sqlSession.getMapper(IChanceMapper.class);
        ChanceDO chanceDOQ =  new ChanceDO();
        chanceDOQ.setChanceId(Arrays.asList(4542677L,45426778L));
        chanceDOQ.setUserName("叮叮猫");
        chanceDOQ.setUserId(12l);
        List<ChanceDO> chanceDO2 = chanceMapper.getChanceByChanceId2("mk_chance",chanceDOQ,null);
        List<ChanceDO> chanceDO3 = chanceMapper.getChanceByChanceId2("mk_chance",chanceDOQ,null);


    }

    public abstract void as();
}


