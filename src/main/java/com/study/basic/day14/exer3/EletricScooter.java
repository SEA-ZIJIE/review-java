package com.study.basic.day14.exer3;/**
 * ClassName: EletricScooter
 * Package: com.study.basic.day14.exer3
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/16 10:45
 * @Version 1.0
 */

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>创建时间: 2025/11/16 10:45</p>
 * <p>作者：王贤 </p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>
 */
public class EletricScooter {
    private String scooterId;
    private String brand;
    private Double batteryLevel;
    private boolean isAvailable;

    public void setScooterId(String scooterId) {
        this.scooterId = scooterId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBatteryLevel(Double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getScooterId() {
        return scooterId;
    }

    public String getBrand() {
        return brand;
    }

    public Double getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    //无参构造
    public EletricScooter() {
    }

    //有参构造
    public EletricScooter(String scooterId, String brand, Double batteryLevel, boolean isAvailable) {
        this.scooterId = scooterId;
        this.brand = brand;
        this.batteryLevel = batteryLevel;
        this.isAvailable = isAvailable;
    }
}
