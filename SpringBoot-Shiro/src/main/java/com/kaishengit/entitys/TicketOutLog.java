package com.kaishengit.entitys;

import javax.print.attribute.standard.RequestingUserName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class TicketOutLog implements Serializable {

    public static final String default_pay_status = "Î´Ö§¸¶";


    private Integer id;

    private String startNum;

    private String endNum;

    private Integer totalNum;

    private BigDecimal price;

    private BigDecimal toatlPrice;

    private String payType;

    private Integer ticketofficeId;

    private Date createTime;

    private String outAccountName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartNum() {
        return startNum;
    }

    public void setStartNum(String startNum) {
        this.startNum = startNum;
    }

    public String getEndNum() {
        return endNum;
    }

    public void setEndNum(String endNum) {
        this.endNum = endNum;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getToatlPrice() {
        return toatlPrice;
    }

    public void setToatlPrice(BigDecimal toatlPrice) {
        this.toatlPrice = toatlPrice;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Integer getTicketofficeId() {
        return ticketofficeId;
    }

    public void setTicketofficeId(Integer ticketofficeId) {
        this.ticketofficeId = ticketofficeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOutAccountName() {
        return outAccountName;
    }

    public void setOutAccountName(String outAccountName) {
        this.outAccountName = outAccountName;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TicketOutLog other = (TicketOutLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStartNum() == null ? other.getStartNum() == null : this.getStartNum().equals(other.getStartNum()))
            && (this.getEndNum() == null ? other.getEndNum() == null : this.getEndNum().equals(other.getEndNum()))
            && (this.getTotalNum() == null ? other.getTotalNum() == null : this.getTotalNum().equals(other.getTotalNum()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getToatlPrice() == null ? other.getToatlPrice() == null : this.getToatlPrice().equals(other.getToatlPrice()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getTicketofficeId() == null ? other.getTicketofficeId() == null : this.getTicketofficeId().equals(other.getTicketofficeId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getOutAccountName() == null ? other.getOutAccountName() == null : this.getOutAccountName().equals(other.getOutAccountName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStartNum() == null) ? 0 : getStartNum().hashCode());
        result = prime * result + ((getEndNum() == null) ? 0 : getEndNum().hashCode());
        result = prime * result + ((getTotalNum() == null) ? 0 : getTotalNum().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getToatlPrice() == null) ? 0 : getToatlPrice().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getTicketofficeId() == null) ? 0 : getTicketofficeId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getOutAccountName() == null) ? 0 : getOutAccountName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", startNum=").append(startNum);
        sb.append(", endNum=").append(endNum);
        sb.append(", totalNum=").append(totalNum);
        sb.append(", price=").append(price);
        sb.append(", toatlPrice=").append(toatlPrice);
        sb.append(", payType=").append(payType);
        sb.append(", ticketofficeId=").append(ticketofficeId);
        sb.append(", createTime=").append(createTime);
        sb.append(", outAccountName=").append(outAccountName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}