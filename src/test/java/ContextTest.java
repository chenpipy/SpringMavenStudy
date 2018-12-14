import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 手动加载applicationContext
 *
 * @author chenjun on 2018/11/23
 */
public class ContextTest {
    public static ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    public static Object getBean(String serviceName){
        return context.getBean(serviceName);
    }

    public static void main(String[] args) {
      Object studentMapper= getBean("StudentMapper");
        System.out.println("begin");
        System.out.println(studentMapper.toString());
    }
}
