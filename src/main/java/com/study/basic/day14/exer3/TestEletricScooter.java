package com.study.basic.day14.exer3;/**
 * ClassName: TestEletricScooter
 * Package: com.study.basic.day14.exer3
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/16 12:18
 * @Version 1.0
 */

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>创建时间: 2025/11/16 12:18</p>
 * <p>作者：王贤 </p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>
 */
public class TestEletricScooter {
    public static void main(String[] args) {
//        无参构造
        EletricScooter e1 = new EletricScooter();
        e1.setScooterId("121");
        e1.setBrand("xiaomi");
        e1.setBrand("14.5");
        e1.setAvailable(true);
        System.out.println("id: " + e1.getScooterId());
        System.out.println("brand: " + e1.getBrand());
        System.out.println("battery: " + e1.getBatteryLevel());
        System.out.println("available: " + e1.isAvailable());
//用无参构造
        EletricScooter e2 = new EletricScooter("1002", "huawei", 96.5, true);
        System.out.println("id: " + e2.getScooterId());
        System.out.println("brand: " + e2.getBrand());
        System.out.println("battery: " + e2.getBatteryLevel());
        System.out.println("available: " + e2.isAvailable());

    }
}
