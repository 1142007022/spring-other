package com.kaishengit.entitys;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TicketSale implements Serializable {
    private Integer id;

    private Date ceateTime;

    private String customerId;

    private String customerName;

    private String ticketofficeName;

    private Integer ticketofficeId;

    public static final String default_state = "正常";

    private String ticketNum;

    private String state;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCeateTime() {
        return ceateTime;
    }

    public void setCeateTime(Date ceateTime) {
        this.ceateTime = ceateTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTicketofficeName() {
        return ticketofficeName;
    }

    public void setTicketofficeName(String ticketofficeName) {
        this.ticketofficeName = ticketofficeName;
    }

    public Integer getTicketofficeId() {
        return ticketofficeId;
    }

    public void setTicketofficeId(Integer ticketofficeId) {
        this.ticketofficeId = ticketofficeId;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
        TicketSale other = (TicketSale) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCeateTime() == null ? other.getCeateTime() == null : this.getCeateTime().equals(other.getCeateTime()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getTicketofficeName() == null ? other.getTicketofficeName() == null : this.getTicketofficeName().equals(other.getTicketofficeName()))
            && (this.getTicketofficeId() == null ? other.getTicketofficeId() == null : this.getTicketofficeId().equals(other.getTicketofficeId()))
            && (this.getTicketNum() == null ? other.getTicketNum() == null : this.getTicketNum().equals(other.getTicketNum()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCeateTime() == null) ? 0 : getCeateTime().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getTicketofficeName() == null) ? 0 : getTicketofficeName().hashCode());
        result = prime * result + ((getTicketofficeId() == null) ? 0 : getTicketofficeId().hashCode());
        result = prime * result + ((getTicketNum() == null) ? 0 : getTicketNum().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ceateTime=").append(ceateTime);
        sb.append(", customerId=").append(customerId);
        sb.append(", customerName=").append(customerName);
        sb.append(", ticketofficeName=").append(ticketofficeName);
        sb.append(", ticketofficeId=").append(ticketofficeId);
        sb.append(", ticketNum=").append(ticketNum);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}