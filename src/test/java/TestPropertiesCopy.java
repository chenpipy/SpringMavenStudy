import com.tmall.model.Student;
import com.tmall.vo.StudentVo;
import org.springframework.beans.BeanUtils;

import java.util.*;

/**
 * 测试子类父类属性的传递
 *
 * @author chenjun on 2018/11/14
 */
public class TestPropertiesCopy {
    public static void main(String[] args) {
        Student student = new Student("12", "张三", 20, true);
        StudentVo studentVo=new StudentVo();
        BeanUtils.copyProperties(student,studentVo);
        System.out.println(studentVo.getName());

        //数组
        String[] s = new String[]{"A", "B", "C", "D","E","A"};
        //数组转list
        List<String> list=Arrays.asList(s);
        System.out.println(list);
        //list转set
        Set<String> set=new HashSet<String>(list);
        System.out.println(set);
        //map的遍历
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for (int i = 0; i <20 ; i++) {
            map.put(i,i);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey());
        }

    }

}
