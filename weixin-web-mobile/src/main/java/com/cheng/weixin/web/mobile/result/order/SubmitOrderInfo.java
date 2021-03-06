package com.cheng.weixin.web.mobile.result.order;

import java.util.List;

/**
 * Desc:
 * Author: 光灿
 * Date: 2016/9/15
 */
public class SubmitOrderInfo {
    private String consignee;
    private String address;
    private String mobile;
    private List<OrderDeliveryTime> deliveryTimes;
    private OrderPay recPay;
    private List<OrderPay> pays;
    private int availableCoupon;
    private String availableBalance;
    private List<String> productImgs;
    private int totalProductNums;
    private String totalProductPrice;
    private String freight;
    private String couponAmount;
    private String totalPrice;
    private Boolean since;
    private String addrId;
    private String ticketId;
    private String amount;
    //private String timeId;
    //private String payId;
    //private Boolean isBalance;
    //private String remark;
    //private OrderDeliveryTime deliveryTime;

    public OrderPay getRecPay() {
        return recPay;
    }

    public void setRecPay(OrderPay recPay) {
        this.recPay = recPay;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<OrderDeliveryTime> getDeliveryTimes() {
        return deliveryTimes;
    }

    public void setDeliveryTimes(List<OrderDeliveryTime> deliveryTimes) {
        this.deliveryTimes = deliveryTimes;
    }

    public List<OrderPay> getPays() {
        return pays;
    }

    public void setPays(List<OrderPay> pays) {
        this.pays = pays;
    }

    public int getAvailableCoupon() {
        return availableCoupon;
    }

    public void setAvailableCoupon(int availableCoupon) {
        this.availableCoupon = availableCoupon;
    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public List<String> getProductImgs() {
        return productImgs;
    }

    public void setProductImgs(List<String> productImgs) {
        this.productImgs = productImgs;
    }

    public int getTotalProductNums() {
        return totalProductNums;
    }

    public void setTotalProductNums(int totalProductNums) {
        this.totalProductNums = totalProductNums;
    }

    public String getTotalProductPrice() {
        return totalProductPrice;
    }

    public void setTotalProductPrice(String totalProductPrice) {
        this.totalProductPrice = totalProductPrice;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public String getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getAddrId() {
        return addrId;
    }

    public void setAddrId(String addrId) {
        this.addrId = addrId;
    }

    public Boolean getSince() {
        return since;
    }

    public void setSince(Boolean since) {
        this.since = since;
    }
    /*public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getTimeId() {
        return timeId;
    }

    public void setTimeId(String timeId) {
        this.timeId = timeId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public Boolean getBalance() {
        return isBalance;
    }

    public void setBalance(Boolean balance) {
        isBalance = balance;
    }

    public OrderDeliveryTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(OrderDeliveryTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }*/

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
