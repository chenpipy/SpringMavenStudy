package com.tmall.constant;

/**
 * 车辆种类枚举
 *
 * @author chenjun on 2018/11/14
 */
public enum CarType {

    AUDO("0", "奥迪"),
    BAOMA("1", "宝马"),
    HAFU("3", "哈佛");

    private String code;
    private String desc;

    CarType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


    /**
     * 根据code的取得枚举值
     */
    public static CarType getByCode(String code) {
        for (CarType car : CarType.values()) {
            if (code.equals(car.getCode())) {
                return car;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String s2 = "test";
        StringBuilder s1 = new StringBuilder("test");
        StringBuilder s3 = new StringBuilder();
        s3.append("test");
        System.out.println(s1.append(s3));

    }

}
