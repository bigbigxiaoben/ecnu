package com.feng.lan.map;
/**为了更加方便的复用MyBatis
 * 实现数据访问不需要频繁的创建
 * SQLSessionFactory和SQLSession对象，
 * 封装一个MyBatisUtil工具类*/
import java.io.InputStream;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public abstract class MyBatisUtil {
  //GC不理static
  private static SqlSessionFactory factory=null;
  public static SqlSessionFactory getSqlSessionFactory(){
    if(factory==null){
    // 获得环境配置文件流
    InputStream config = MyBatisUtil.class.getClassLoader().getResourceAsStream("myBatisCfg.xml");
    // 创建sql会话工厂
    factory = new SqlSessionFactoryBuilder().build(config);
    }
    return factory;
  }
  //获得会话
  public static SqlSession getSession(){
    return getSqlSessionFactory().openSession(true);
  }
  /**
   * 获得得sql会话
   * @param isAutoCommit 是否自动提交，如果为false则需要sqlSession.commit();rollback();
   * @return sql会话
   */
  public static SqlSession getSession(boolean isAutoCommit){
    return getSqlSessionFactory().openSession(isAutoCommit);
  }
}
