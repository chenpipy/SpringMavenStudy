import com.tmall.constant.InsufficientFundsException;
import com.tmall.model.CheckingAccount;

/**
 * 测试异常类
 *
 * @author chenjun on 2018/11/14
 */
public class TestException {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(500);
        checkingAccount.dposit(200);
        System.out.println(checkingAccount.getBalance());

        try {
            checkingAccount.withdraw(1000);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
            System.out.println("余额不足,请至少充值："+e.getAmount()+"元");
        }

    }
}
